package duro.runtime;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import duro.debugging.Debug;
import duro.reflang.SymbolTable;

public class CustomProcess extends Process implements Iterable<Object>, ProcessFactory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final Instruction[] FORWARD_CALL_INSTRUCTIONS = new Instruction[] {
		new Instruction(Instruction.OPCODE_FORWARD_CALL),
		new Instruction(Instruction.OPCODE_RET_FORWARD)
	};

	public static class Frame implements Serializable {
		private static class Handle implements Serializable {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			public FrameProcess value;
		}
		
		private static class InterfaceIdPart implements Serializable {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public final InterfaceIdPart parent;
			
			private final String id;
			private String composedId;
			
			public InterfaceIdPart(String id) {
				this.parent = null;
				this.id = id;
			}
			
			public InterfaceIdPart(InterfaceIdPart parent, String id) {
				this.parent = parent;
				this.id = id;
			}
			
			public InterfaceIdPart extend(String id) {
				return new InterfaceIdPart(this, id);
			}
			
			public String build() {
				if(composedId == null) {
					if(parent != null)
						composedId = parent.build() + ";" + id;
					else
						composedId = id;
				}
				
				return composedId;
			}
		}
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public Frame sender;
		public final Process self;
		public Process[] arguments;
		public Process[] variables;
		public final Instruction[] instructions;
		public int instructionPointer;
		public Stack<Process> stack = new Stack<Process>();
		public Handle reificationHandle;
		public InterfaceIdPart interfaceId;
		
		public Frame(Frame sender, Process self, Process[] arguments, int variableCount, Instruction[] instructions, InterfaceIdPart interfaceId) {
			this.sender = sender;
			this.self = self;
			this.arguments = arguments;
			variables = new Process[variableCount];
			this.instructions = instructions;
			reificationHandle = new Handle();
			this.interfaceId = interfaceId;
		}
		
		public Frame(Frame sender, Process self, Process[] arguments, Process[] variables, Instruction[] instructions, InterfaceIdPart interfaceId) {
			this.sender = sender;
			this.self = self;
			this.arguments = arguments;
			this.variables = variables;
			this.instructions = instructions;
			reificationHandle = new Handle();
			this.interfaceId = interfaceId;
		}
		
		public final FrameProcess getReifiedFrame(Process any) {
			if(reificationHandle.value == null) {
				reificationHandle.value = new FrameProcess(this);
				reificationHandle.value.defineProto(SymbolTable.Codes.prototype, any.lookup(SymbolTable.Codes.Frame));
			}
			
			return reificationHandle.value;
		}
		
		public void extendInterfaceId(String id) {
			interfaceId = interfaceId.extend(id);
		}
		
		public void shrinkInterfaceId() {
			interfaceId = interfaceId.parent;
		}
		
		public String getInterfaceId() {
//			return interfaceIdStack.stream().collect(Collectors.joining(";"));
			return interfaceId.build();
		}
	}
	
	private Frame currentFrame;
	private DictionaryProcess protoAny;
	private DictionaryProcess singletonNil;
	private BooleanProcess singletonTrue;
	private BooleanProcess singletonFalse;
	private DictionaryProcess protoInteger;
	private DictionaryProcess protoArray;
	private DictionaryProcess protoString;

	public CustomProcess(int parameterCount, int variableCount, Instruction[] instructions) {
		// TODO: Consider: Should the Any prototype be this? Should CustomProcess be a DictionaryProcess?
		// Should CustomProcess not be a process at all? Should CustomProcess hold any and push it instead this?  - Also at other locations, e.g. when loading.
		// Add Any prototype
		protoAny = new DictionaryProcess();
		protoAny.defineShared(SymbolTable.Codes.Any, protoAny);
		// Add Null singleton
		singletonNil = protoAny.clone();
		protoAny.defineShared(SymbolTable.Codes.Null, singletonNil);
		// Add boolean True singleton
		singletonTrue = new BooleanProcess(true);
		singletonTrue.defineProto(SymbolTable.Codes.prototype, protoAny);
		protoAny.defineShared(SymbolTable.Codes.True, singletonTrue);
		// Add boolean False singleton
		singletonFalse = new BooleanProcess(false);
		singletonFalse.defineProto(SymbolTable.Codes.prototype, protoAny);
		protoAny.defineShared(SymbolTable.Codes.False, singletonFalse);
		// Add Array prototype
		protoArray = protoAny.clone();
		protoAny.defineShared(SymbolTable.Codes.Array, protoArray);
		// Add String prototype
		protoString = protoAny.clone();
		protoAny.defineShared(SymbolTable.Codes.String, protoString);
		// Add Integer prototype
		protoInteger = protoAny.clone();
		protoAny.defineShared(SymbolTable.Codes.Integer, protoInteger);
		// Add Frame prototype
		protoAny.defineShared(SymbolTable.Codes.Frame, protoAny.clone());
		// Add Behavior prototype
		protoAny.defineShared(SymbolTable.Codes.Behavior, protoAny.clone());
		// Add Closure prototype
		protoAny.defineShared(SymbolTable.Codes.Closure, protoAny.clone());
		
		currentFrame = new Frame(null, protoAny, new Process[parameterCount], variableCount, instructions, new Frame.InterfaceIdPart("default"));
	}
	
	private SymbolTable symbolTable;
	
	public void setSymbolTable(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}

	public void replay(InteractionHistory interactionHistory) {
		Debug.println(Debug.LEVEL_HIGH, "replay");
		
		if(currentFrame != null) {
			while(!stopRequested) {
				Instruction instruction = currentFrame.instructions[currentFrame.instructionPointer];
				
				if(Debug.maxLevel >= Debug.LEVEL_HIGH) {
					Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);
					Debug.println(Debug.LEVEL_HIGH, "play: " + instruction);
				}
				
				next(instruction, interactionHistory);
			}
		}
		
		if(currentFrame != null)
			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);
		
		Debug.println(Debug.LEVEL_HIGH, "/replay");
	}
	
	private boolean stopRequested;
	
	private void next(Instruction instruction, InteractionHistory interactionHistory) {
		switch(instruction.opcode) {
		case Instruction.OPCODE_PAUSE: {
			Object output = interactionHistory.nextOutputFor(currentFrame.getInterfaceId(), Instruction.OPCODE_PAUSE);
			if(output == null) {
				stopRequested = true;
				interactionHistory.append(currentFrame.getInterfaceId(), instruction, instruction);
			} else {
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_INC_IP: {
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_FINISH: {
			if(currentFrame.stack.size() > 0)
				Debug.println(Debug.LEVEL_LOW, "stack isn't empty: " + currentFrame.stack);
			
			stopRequested = true;
			currentFrame = null;
			
			break;
		} case Instruction.OPCODE_DUP: {
			currentFrame.stack.push(currentFrame.stack.peek());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_DUP1: {
			int index = currentFrame.stack.size() - 2;
			currentFrame.stack.add(index, currentFrame.stack.peek());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_DUP2: {
			int index = currentFrame.stack.size() - 3;
			currentFrame.stack.add(index, currentFrame.stack.peek());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_DUP_ANY: {
			int sourceOffset = (int)instruction.operand1;
			int insertionOffset = (int)instruction.operand2;
			int top = currentFrame.stack.size() - 1;
			
			Process sourceValue = currentFrame.stack.get(top - sourceOffset);
			currentFrame.stack.add(top - insertionOffset, sourceValue);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_STORE_LOC: {
			int ordinal = (int)instruction.operand1;
			Process value = currentFrame.stack.pop();
			currentFrame.variables[ordinal] = value;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_POP: {
			currentFrame.stack.pop();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SWAP: {
			Process tmp = currentFrame.stack.get(currentFrame.stack.size() - 1);
			currentFrame.stack.set(currentFrame.stack.size() - 1, currentFrame.stack.get(currentFrame.stack.size() - 2));
			currentFrame.stack.set(currentFrame.stack.size() - 2, tmp);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SWAP1: {
			Process tmp = currentFrame.stack.get(currentFrame.stack.size() - 2);
			currentFrame.stack.set(currentFrame.stack.size() - 2, currentFrame.stack.get(currentFrame.stack.size() - 3));
			currentFrame.stack.set(currentFrame.stack.size() - 3, tmp);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SWAP_ANY: {
			int top = currentFrame.stack.size() - 1;
			int index1 = top - (int)instruction.operand1; // operand1: offsetFromTop0 for first index
			int index2 = top - (int)instruction.operand2; // operand2: offsetFromTop0 for second index
			Process tmp = currentFrame.stack.get(index1);
			currentFrame.stack.set(index1, currentFrame.stack.get(index2));
			currentFrame.stack.set(index2, tmp);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SEND: {
			String id = (String)instruction.operand1;
			int argumentCount = (int)instruction.operand2;
			int code = symbolTable.getSymbolCodeFromId(Selector.get(id, argumentCount));
			currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SEND_CODE, code, argumentCount);
			
			break;
		} case Instruction.OPCODE_SEND_CODE: {
			int code = (int)instruction.operand1;
			int argumentCount = (int)instruction.operand2;
			
			Process receiver = (Process)currentFrame.stack.get(currentFrame.stack.size() - argumentCount - 1);
			
			Object callable = receiver.getCallable(this, code);

			if(callable instanceof BehaviorProcess) {
				BehaviorProcess behavior = (BehaviorProcess)callable;
				
				Process[] arguments = new Process[behavior.parameterCount];
				
				if(argumentCount < behavior.parameterCount) {
					for(int i = argumentCount - 1; i >= 0; i--)
						arguments[i] = currentFrame.stack.pop();
					for(int i = behavior.parameterCount - 1; i >= argumentCount; i--)
						arguments[i] = singletonNil;
				} else {
					for(int i = behavior.parameterCount - 1; i >= 0; i--)
						arguments[i] = currentFrame.stack.pop();
				}
				
				currentFrame.stack.pop(); // Pop receiver
				
				currentFrame = new Frame(currentFrame, receiver, arguments, behavior.variableCount, behavior.instructions, currentFrame.interfaceId);
			} else if(callable != null) {
				Process[] arguments = new Process[argumentCount];
				
				for(int i = argumentCount - 1; i >= 0; i--)
					arguments[i] = currentFrame.stack.pop();
				currentFrame.stack.pop(); // Pop receiver
				
				Process process = (Process)callable;
				
				currentFrame = new Frame(currentFrame, process, arguments, 0, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId);
			} else {
				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(code) + "'.");
			}
			
			break;
		} case Instruction.OPCODE_CALL: {
			int argumentCount = (int)instruction.operand1;
			
			Object callable = currentFrame.stack.get(currentFrame.stack.size() - argumentCount - 1);

			if(callable instanceof BehaviorProcess) {
				BehaviorProcess behavior = (BehaviorProcess)callable;
				
				Process[] arguments = new Process[behavior.parameterCount];
				
				if(argumentCount < behavior.parameterCount) {
					for(int i = argumentCount - 1; i >= 0; i--)
						arguments[i] = currentFrame.stack.pop();
					for(int i = behavior.parameterCount - 1; i >= argumentCount; i--)
						arguments[i] = singletonNil;
				} else {
					for(int i = behavior.parameterCount - 1; i >= 0; i--)
						arguments[i] = currentFrame.stack.pop();
				}
				
				currentFrame.stack.pop(); // Pop receiver
				
				currentFrame = new Frame(currentFrame, currentFrame.self, arguments, behavior.variableCount, behavior.instructions, currentFrame.interfaceId);
			} else {
				Process[] arguments = new Process[argumentCount];
				
				for(int i = argumentCount - 1; i >= 0; i--)
					arguments[i] = currentFrame.stack.pop();
				currentFrame.stack.pop(); // Pop receiver
				
				Process process = (Process)callable;
				
				currentFrame = new Frame(currentFrame, process, arguments, 0, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId);
			}
			
			break;
		} case Instruction.OPCODE_FORWARD_CALL: {
			Process[] arguments = currentFrame.arguments;
			Process proxyCallable = currentFrame.self;
			
			Object callable = proxyCallable.getCallable(this, SymbolTable.Codes.call);

			if(callable instanceof BehaviorProcess) {
				BehaviorProcess behavior = (BehaviorProcess)callable;
				Process[] callArguments;
				if(arguments.length < behavior.parameterCount) {
					callArguments = new Process[behavior.parameterCount];
					System.arraycopy(arguments, 0, behavior.parameterCount, 0, arguments.length);
				} else
					callArguments = arguments;

				currentFrame = new Frame(currentFrame, currentFrame.self, callArguments, behavior.variableCount, behavior.instructions, currentFrame.interfaceId);
			} else {
				Process process = (Process)callable;
				
				currentFrame = new Frame(currentFrame, process, arguments, 0, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId);
			}
			break;
		} case Instruction.OPCODE_RET: {
			Frame returnFrame = currentFrame.sender;
			returnFrame.stack.push(currentFrame.stack.peek());
			currentFrame = returnFrame;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_RET_THIS: {
			Process result = currentFrame.self;
			currentFrame = currentFrame.sender;
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_RET_FORWARD: {
			Frame returnFrame = currentFrame.sender;
			returnFrame.stack.addAll(currentFrame.stack);
			currentFrame = returnFrame;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_IF_TRUE: {
			BooleanProcess value = (BooleanProcess)currentFrame.stack.pop();
			if(value.value) {
				int jump = (int)instruction.operand1;
				currentFrame.instructionPointer += jump;
			} else
				currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_IF_FALSE: {
			BooleanProcess value = (BooleanProcess)currentFrame.stack.pop();
			if(!value.value) {
				int jump = (int)instruction.operand1;
				currentFrame.instructionPointer += jump;
			} else
				currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_JUMP: {
			int jump = (int)instruction.operand1;
			currentFrame.instructionPointer += jump;
			
			break;
		} case Instruction.OPCODE_SET: {
			String id = (String)instruction.operand1;
			int parameterCount = (int)instruction.operand2;
			int code = symbolTable.getSymbolCodeFromId(Selector.get(id, parameterCount));
			currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SET_CODE, code);
			
			break;
		} case Instruction.OPCODE_SET_CODE: {
			int code = (int)instruction.operand1;
			Process value = currentFrame.stack.pop();
			Process receiver = (Process)currentFrame.stack.pop();
			receiver.define(code, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SET_PROTO: {
			String id = (String)instruction.operand1;
			int parameterCount = (int)instruction.operand2;
			int code = symbolTable.getSymbolCodeFromId(Selector.get(id, parameterCount));
			currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SET_PROTO_CODE, code);
			
			break;
		} case Instruction.OPCODE_SET_PROTO_CODE: {
			int code = (int)instruction.operand1;
			Process value = currentFrame.stack.pop();
			Process receiver = (Process)currentFrame.stack.pop();
			receiver.defineProto(code, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_GET: {
			String id = (String)instruction.operand1;
			int parameterCount = (int)instruction.operand2;
			int code = symbolTable.getSymbolCodeFromId(Selector.get(id, parameterCount));
			currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_GET_CODE, code);
			
			break;
		} case Instruction.OPCODE_GET_CODE: {
			int code = (int)instruction.operand1;
			Process receiver = (Process)currentFrame.stack.pop();
			Process value = receiver.lookup(code);
			currentFrame.stack.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_SET: {
			Process value = currentFrame.stack.pop();
			StringProcess key = (StringProcess)currentFrame.stack.pop();
			Process receiver = (Process)currentFrame.stack.pop();
			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
			receiver.define(code, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_SET_PROTO: {
			Process value = currentFrame.stack.pop();
			StringProcess key = (StringProcess)currentFrame.stack.pop();
			Process receiver = (Process)currentFrame.stack.pop();
			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
			receiver.defineProto(code, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_GET: {
			StringProcess key = (StringProcess)currentFrame.stack.pop();
			Process receiver = (Process)currentFrame.stack.pop();
			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
			Process value = receiver.lookup(code);
			currentFrame.stack.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_IS_DEFINED: {
			StringProcess key = (StringProcess)currentFrame.stack.pop();
			Process receiver = (Process)currentFrame.stack.pop();
			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
			Process value = receiver.lookup(code);
			currentFrame.stack.push(getBoolean(value != null));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_NAMES: {
			Process receiver = (Process)currentFrame.stack.pop();
			String[] rawNames = receiver.getNames();
			Process[] names = new Process[rawNames.length];
			for(int i = 0; i < names.length; i++)
				names[i] = createString(rawNames[i]);
			ArrayProcess namesArray = new ArrayProcess(names);
			namesArray.defineProto(SymbolTable.Codes.prototype, protoArray);
			currentFrame.stack.push(namesArray);
			currentFrame.instructionPointer++;
			
			break;
		}
		
		
		case Instruction.OPCODE_CALL_CLOSURE: {
			ClosureProcess closure = (ClosureProcess)currentFrame.stack.pop();
			BehaviorProcess behavior = closure.behavior;
			FrameProcess frame = closure.frame;
			int argumentOffset = closure.argumentOffset;
			int argumentCount = closure.parameterCount;
			
			// Move forward arguments
			if(currentFrame.arguments.length < argumentCount) {
				System.arraycopy(currentFrame.arguments, 0, frame.frame.arguments, argumentOffset, currentFrame.arguments.length);
//				for(int i = 0; i < currentFrame.arguments.length; i++) {
//					int ordinal = ordinals[i];
//					Process argument = currentFrame.arguments[i];
//					frame.frame.arguments[ordinal] = argument;
//				}
			} else {
				System.arraycopy(currentFrame.arguments, 0, frame.frame.arguments, argumentOffset, argumentCount);
//				for(int i = 0; i < ordinals.length; i++) {
//					int ordinal = ordinals[i];
//					Process argument = currentFrame.arguments[i];
//					frame.frame.arguments[ordinal] = argument;
//				}
			}
			currentFrame = new Frame(currentFrame, frame.frame.self, frame.frame.arguments, frame.frame.variables, behavior.instructions, frame.frame.interfaceId);
			
			break;
		}
		
		case Instruction.OPCODE_EXTEND_INTER_ID: {
			String id = (String)instruction.operand1;
			currentFrame.extendInterfaceId(id);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SHRINK_INTER_ID: {
			currentFrame.shrinkInterfaceId();
			currentFrame.instructionPointer++;
			
			break;
		} 
		
		case Instruction.OPCODE_LOAD_THIS: {
			currentFrame.stack.push(currentFrame.self);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_NULL: {
			currentFrame.stack.push(singletonNil);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_LOC: {
			int ordinal = (int)instruction.operand1;
			Process value = currentFrame.variables[ordinal];
			currentFrame.stack.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_ARG: {
			int ordinal = (int)instruction.operand1;
			Process value = currentFrame.arguments[ordinal];
			currentFrame.stack.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_INT: {
			int intValue = (int)instruction.operand1;
			currentFrame.stack.push(new IntegerProcess(protoInteger, intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_TRUE: {
			currentFrame.stack.push(singletonTrue);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_FALSE: {
			currentFrame.stack.push(singletonFalse);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_STRING: {
			String str = (String)instruction.operand1;
			StringProcess string = createString(str);
			currentFrame.stack.push(string);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_THIS_FRAME: {
			currentFrame.stack.push(currentFrame.getReifiedFrame(protoAny));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_FRAME: {
			// May be unused
			FrameProcess frame = (FrameProcess)instruction.operand1;
			currentFrame.stack.push(frame);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_BEHAVIOR: {
			BehaviorProcess behavior = (BehaviorProcess)instruction.operand1;
			currentFrame.stack.push(behavior);
			currentFrame.instructionPointer++;
			
			break;
		}
		
		// Special opcodes
		case Instruction.OPCODE_SP_BOOLEAN_OR: {
			BooleanProcess rhs = (BooleanProcess)currentFrame.stack.pop();
			BooleanProcess lhs = (BooleanProcess)currentFrame.stack.pop();
			currentFrame.stack.push(getBoolean(lhs.value || rhs.value));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_BOOLEAN_AND: {
			BooleanProcess rhs = (BooleanProcess)currentFrame.stack.pop();
			BooleanProcess lhs = (BooleanProcess)currentFrame.stack.pop();
			currentFrame.stack.push(getBoolean(lhs.value && rhs.value));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_BOOLEAN_NOT: {
			BooleanProcess b = (BooleanProcess)currentFrame.stack.pop();
			currentFrame.stack.push(getBoolean(!b.value));
			currentFrame.instructionPointer++;
			
			break;
		}  case Instruction.OPCODE_SP_ARRAY_GET: {
			IntegerProcess index = (IntegerProcess)currentFrame.stack.pop();
			ArrayProcess array = (ArrayProcess)currentFrame.stack.pop();
			currentFrame.stack.push(array.get(index.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_ARRAY_SET: {
			Process value = currentFrame.stack.pop();
			IntegerProcess index = (IntegerProcess)currentFrame.stack.pop();
			ArrayProcess array = (ArrayProcess)currentFrame.stack.pop();
			array.set(index.intValue, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_STRING_CONCAT: {
			StringProcess rhs = (StringProcess)currentFrame.stack.pop();
			StringProcess lhs = (StringProcess)currentFrame.stack.pop();
			StringProcess result = createString(lhs.str + rhs.str);
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_STRING_EQUAL: {
			StringProcess rhs = (StringProcess)currentFrame.stack.pop();
			StringProcess lhs = (StringProcess)currentFrame.stack.pop();
			currentFrame.stack.push(getBoolean(lhs.str.equals(rhs.str)));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_ADD: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			currentFrame.stack.push(new IntegerProcess(protoInteger, lhs.intValue + rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		}case Instruction.OPCODE_SP_INT_SUB: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			currentFrame.stack.push(new IntegerProcess(protoInteger, lhs.intValue - rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_MULT: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			currentFrame.stack.push(new IntegerProcess(protoInteger, lhs.intValue * rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_DIV: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			currentFrame.stack.push(new IntegerProcess(protoInteger, lhs.intValue / rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_REM: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			currentFrame.stack.push(new IntegerProcess(protoInteger, lhs.intValue % rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_EQUAL: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			currentFrame.stack.push(getBoolean(lhs.intValue == rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_GREATER: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			currentFrame.stack.push(getBoolean(lhs.intValue > rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_LESS: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			currentFrame.stack.push(getBoolean(lhs.intValue < rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_TO_STRING: {
			IntegerProcess integer = (IntegerProcess)currentFrame.stack.pop();
			StringProcess result = createString(Integer.toString(integer.intValue));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_FRAME_SENDER: {
			FrameProcess frame = (FrameProcess)currentFrame.stack.pop();
			currentFrame.stack.push(frame.frame.sender.getReifiedFrame(protoAny));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_FRAME_SET_SENDER: {
			FrameProcess newSender = (FrameProcess)currentFrame.stack.pop();
			FrameProcess frame = (FrameProcess)currentFrame.stack.pop();
			frame.frame.sender = newSender.frame;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_FRAME_RESUME: {
			Process value = currentFrame.stack.pop();
			FrameProcess frame = (FrameProcess)currentFrame.stack.pop();

			currentFrame = frame.frame;
			currentFrame.stack.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_REF_EQUAL: {
			Process rhs = currentFrame.stack.pop();
			Process lhs = currentFrame.stack.pop();
			currentFrame.stack.push(getBoolean(lhs == rhs));
			currentFrame.instructionPointer++;
			
			break;
		}
		
		case Instruction.OPCODE_SP_WRITE: {
			Object output = interactionHistory.nextOutputFor(currentFrame.getInterfaceId(), Instruction.OPCODE_SP_WRITE);
			if(output == null) {
				StringProcess value = (StringProcess)currentFrame.stack.pop();
				System.out.print(value.str);
				interactionHistory.append(currentFrame.getInterfaceId(), instruction, instruction);
			} else {
				currentFrame.stack.pop();
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEXT_LINE: {
			String line;

			Object output = interactionHistory.nextOutputFor(currentFrame.getInterfaceId(), Instruction.OPCODE_SP_NEXT_LINE);
			
			if(output == null) {
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					line = br.readLine();
					interactionHistory.append(currentFrame.getInterfaceId(), instruction, line);
				} catch (IOException e) {
					e.printStackTrace();
					line = null;
				}
			} else {
				line = (String)output;
			}

			StringProcess string = createString(line);
			
			currentFrame.stack.push(string);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_DICT: {
			DictionaryProcess newDict = new DictionaryProcess();
			newDict.defineProto(SymbolTable.Codes.prototype, protoAny);
			currentFrame.stack.push(newDict);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_ARRAY: {
			IntegerProcess length = (IntegerProcess)currentFrame.stack.pop();
			ArrayProcess newArray = new ArrayProcess(length.intValue, singletonNil);
			newArray.defineProto(SymbolTable.Codes.prototype, protoArray);
			currentFrame.stack.push(newArray);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_ARRAY_LENGTH: {
			ArrayProcess newArray = (ArrayProcess)currentFrame.stack.pop();
			currentFrame.stack.push(new IntegerProcess(protoInteger, newArray.length()));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_LOAD: {
			StringProcess pathSource = (StringProcess)currentFrame.stack.pop();
			String path = pathSource.str;
			try {
				// What to do here during replay?
				// or rather, what to replace this instruction with for replay?
				path = "commons/gens/" + path + ".drr";
				CustomProcess customProcess;
				
				try (ObjectInput oo = new ObjectInputStream(new FileInputStream(path))) {
					customProcess = (CustomProcess) oo.readObject();
			    }
				
				// Assumed to end with finish instruction. Replace finish with pop_frame.
				customProcess.currentFrame.instructions[customProcess.currentFrame.instructions.length - 1] = new Instruction(Instruction.OPCODE_RET_THIS);
				currentFrame = new Frame(
					currentFrame, protoAny, customProcess.currentFrame.arguments, customProcess.currentFrame.variables.length, customProcess.currentFrame.instructions, customProcess.currentFrame.interfaceId);
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
			
			break;
		} case Instruction.OPCODE_SP_NEW_CLOSURE: {
			int argumentOffset = (int)instruction.operand1;
			int parameterCount = (int)instruction.operand2;
			BehaviorProcess behavior = (BehaviorProcess)currentFrame.stack.pop();
			ClosureProcess closure = new ClosureProcess(currentFrame.getReifiedFrame(protoAny), behavior, argumentOffset, parameterCount);
			closure.defineProto(SymbolTable.Codes.prototype, protoAny.lookup(SymbolTable.Codes.Closure));
			currentFrame.stack.push(closure);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_BEHAVIOR: {
			int parameterCount = (int)instruction.operand1;
			int variableCount = (int)instruction.operand2;
			Instruction[] instructions = (Instruction[])instruction.operand3;
			BehaviorProcess behavior = new BehaviorProcess(parameterCount, variableCount, instructions);
			behavior.defineProto(SymbolTable.Codes.prototype, protoAny.lookup(SymbolTable.Codes.Behavior));
			currentFrame.stack.push(behavior);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_CLONE: {
			DictionaryProcess dict = (DictionaryProcess)currentFrame.stack.pop();
			DictionaryProcess clone = dict.clone();
			currentFrame.stack.push(clone);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_BREAK_POINT: {
			currentFrame.instructionPointer++;
			break;
		}
		}
	}

	@Override
	public void resume(List<InteractionHistory.Interaction> playedInstructions) {
		InteractionHistory interactionHistory = new InteractionHistory(playedInstructions);
		Debug.println(Debug.LEVEL_HIGH, "play");
		
		if(currentFrame != null) {
			while(!stopRequested) {
				Instruction instruction = currentFrame.instructions[currentFrame.instructionPointer];
				
				Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);
				Debug.println(Debug.LEVEL_HIGH, "play: " + instruction);
				
				next(instruction, interactionHistory);
			}
		}

		if(currentFrame != null && currentFrame.stack.size() > 0)
			Debug.println(Debug.LEVEL_LOW, "stack isn't empty: " + currentFrame.stack);
		
		if(currentFrame != null)
			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);

		Debug.println(Debug.LEVEL_HIGH, "/play");
	}
	
	@Override
	public Object getCallable(ProcessFactory factory, int selectorCode) {
		return null;
	}
	
	@Override
	public void define(int selectorCode, Process value) {

	}
	
	@Override
	public void defineProto(int selectorCode, Process value) {

	}

	@Override
	public Process lookup(int selectorCode) {
		return null;
	}

	@Override
	public Iterator<Object> iterator() {
		return null;
	}
	
	@Override
	public BehaviorProcess createBehavior(int parameterCount, int variableCount, Instruction[] instructions) {
		BehaviorProcess behavior = new BehaviorProcess(parameterCount, variableCount, instructions);
		behavior.defineProto(SymbolTable.Codes.prototype, protoAny.lookup(SymbolTable.Codes.Behavior));
		return behavior;
	}
	
	public final BooleanProcess getBoolean(boolean value) {
		return value ? singletonTrue : singletonFalse;
	}

	public final StringProcess createString(String str) {
		return new StringProcess(protoString, str);
//		StringProcess string = new StringProcess(protoString, str);
//		string.defineProto(SymbolTable.Codes.prototype, protoAny.lookup(SymbolTable.Codes.String));
//		return string;
	}

	@Override
	public String[] getNames() {
		// TODO Auto-generated method stub
		return null;
	}
}
