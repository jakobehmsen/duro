package duro.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import duro.debugging.Debug;
import duro.reflang.Compiler;
import duro.reflang.SymbolTable;

public class CustomProcess extends Process {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FrameInfo behavior;

	public CustomProcess(FrameInfo behavior) {
		this.behavior = behavior;
	}
	
//	private static final Instruction[] FORWARD_CALL_INSTRUCTIONS = new Instruction[] {
//		new Instruction(Instruction.OPCODE_FORWARD_CALL)/*,
//		new Instruction(Instruction.OPCODE_RET_FORWARD)*/
//	};
//
//	public static class Frame implements Serializable {
//		private static class InterfaceIdPart implements Serializable {
//			/**
//			 * 
//			 */
//			private static final long serialVersionUID = 1L;
//
//			public final InterfaceIdPart parent;
//			
//			private final String id;
//			private String composedId;
//			
//			public InterfaceIdPart(String id) {
//				this.parent = null;
//				this.id = id;
//			}
//			
//			public InterfaceIdPart(InterfaceIdPart parent, String id) {
//				this.parent = parent;
//				this.id = id;
//			}
//			
//			public InterfaceIdPart extend(String id) {
//				return new InterfaceIdPart(this, id);
//			}
//			
//			public String build() {
//				if(composedId == null) {
//					if(parent != null)
//						composedId = parent.build() + ";" + id;
//					else
//						composedId = id;
//				}
//				
//				return composedId;
//			}
//		}
//		
//		/**
//		 * 
//		 */
//		private static final long serialVersionUID = 1L;
//		public Frame sender;
//		public Process[] locals;
//		
//		public final Instruction[] instructions;
//		public int instructionPointer;
//		public Object reificationHandle; 
//		
//		public InterfaceIdPart interfaceId;
//		private Process[] stack;
//		private int stackSize;
//		
//		public Frame(Frame sender, Process[] locals, Instruction[] instructions, InterfaceIdPart interfaceId, int maxStackSize) {
//			this.sender = sender;
//			this.locals = locals;
//			this.instructions = instructions;
//			this.interfaceId = interfaceId;
//			stackSize = 0;
//			stack = new Process[maxStackSize];
//		}
//		
//		public final FrameProcess getReifiedFrame(Process protoFrame) {
//			if(reificationHandle instanceof FrameProcess) {
//				return (FrameProcess)reificationHandle;
//			} else if(reificationHandle == null) {
//				FrameProcess reification = new FrameProcess(protoFrame, this);
//				reificationHandle = reification;
//				
//				return reification;
//			}
//			
//			return null;
//		}
//		
//		public final void extendInterfaceId(String id) {
//			interfaceId = interfaceId.extend(id);
//		}
//		
//		public final void shrinkInterfaceId() {
//			interfaceId = interfaceId.parent;
//		}
//		
//		public final String getInterfaceId() {
//			return interfaceId.build();
//		}
//		
//		public final Process pop() {
//			stackSize--;
//			Process p = stack[stackSize];
//			stack[stackSize] = null;
//			return p;
//		}
//
//		public final void copy1Into(int i, Process[] a) {
//			a[i] = stack[stackSize - 1];
//		}
//
//		public final void copy2Into(int i, Process[] a) {
//			System.arraycopy(stack, stackSize - 2, a, i, 2);
//		}
//
//		public final void copy3Into(int i, Process[] a) {
//			System.arraycopy(stack, stackSize - 3, a, i, 3);
//		}
//
//		public final void copyNInto(int i, Process[] a, int n) {
//			System.arraycopy(stack, stackSize - n, a, i, n);
//		}
//
//		public final void copyNInto(int i, Process[] a, int n, int m) {
//			System.arraycopy(stack, stackSize - n - m, a, i, n);
//		}
//
//		public final void set0(Process p) {
//			stack[stackSize - 1] = p;
//		}
//		
//		public final void set1(Process p) {
//			stack[stackSize - 2] = p;
//		}
//
//		public final void pop1() {
//			stackSize--;
//			stack[stackSize] = null;
//		}
//
//		public final void pop2() {
//			int newSize = stackSize - 2;
//			Arrays.fill(stack, newSize, stackSize, null);
//			stackSize = newSize;
//		}
//
//		public final void pop3() {
//			int newSize = stackSize - 3;
//			Arrays.fill(stack, newSize, stackSize, null);
//			stackSize = newSize;
//		}
//
//		public final void pop4() {
//			int newSize = stackSize - 4;
//			Arrays.fill(stack, newSize, stackSize, null);
//			stackSize = newSize;
//		}
//
//		public final void popN(int n) {
//			int newSize = stackSize - n;
//			Arrays.fill(stack, newSize, stackSize, null);
//			stackSize = newSize;
//		}
//		
//		public final void push(Process p) {
//			stack[stackSize] = p;
//			stackSize++;
//		}
//
//		public final void stackAdd(int index, Process p) {
//			for(int i = stackSize - 1; i >= index; i--)
//				stack[i + 1] = stack[i];
//			stack[index] = p;
//			stackSize++;
//		}
//
//		public final String stackToString() {
//			return Arrays.toString(stack);
//		}
//
//		public final int stackSize() {
//			return stackSize;
//		}
//
//		public final Process peek() {
//			return stack[stackSize - 1];
//		}
//		
//		public final void dup() {
//			stack[stackSize] = stack[stackSize - 1];
//			stackSize++;
//		}
//		
//		public final void dup1() {
//			stack[stackSize] = stack[stackSize - 1];
//			stack[stackSize - 1] = stack[stackSize - 2];
//			stack[stackSize - 2] = stack[stackSize];
//			stackSize++;
//		}
//
//		public final Process peek1() {
//			return stack[stackSize - 2];
//		}
//
//		public final Process peek2() {
//			return stack[stackSize - 3];
//		}
//
//		public final Process stackGet(int i) {
//			return stack[i];
//		}
//
//		public final void stackSet(int i, Process p) {
//			stack[i] = p;
//		}
//	}
//	
//	private Frame currentFrame;
//	private DictionaryProcess protoAny;
//	private DictionaryProcess singletonNil;
//	private BooleanProcess singletonTrue;
//	private BooleanProcess singletonFalse;
//	private DictionaryProcess protoInteger;
//	private DictionaryProcess protoArray;
//	private DictionaryProcess protoString;
//	private DictionaryProcess protoFrame;
//	private DictionaryProcess protoBehavior;
//	private DictionaryProcess closureBehavior;
//
//	public CustomProcess(int parameterCount, int variableCount, int maxStackSize, Instruction[] instructions) {
//		// TODO: Consider: Should the Any prototype be this? Should CustomProcess be a DictionaryProcess?
//		// Should CustomProcess not be a process at all? Should CustomProcess hold any and push it instead this?  - Also at other locations, e.g. when loading.
//		// Add Any prototype
//		protoAny = new DictionaryProcess();
//		protoAny.defineShared(SymbolTable.Codes.Any, protoAny);
//		// Add Null singleton
//		singletonNil = protoAny.clone();
//		protoAny.defineShared(SymbolTable.Codes.Null, singletonNil);
//		// Add boolean True singleton
//		singletonTrue = new BooleanProcess(true);
//		singletonTrue.defineProto(SymbolTable.Codes.prototype, protoAny);
//		protoAny.defineShared(SymbolTable.Codes.True, singletonTrue);
//		// Add boolean False singleton
//		singletonFalse = new BooleanProcess(false);
//		singletonFalse.defineProto(SymbolTable.Codes.prototype, protoAny);
//		protoAny.defineShared(SymbolTable.Codes.False, singletonFalse);
//		// Add Array prototype
//		protoArray = protoAny.clone();
//		protoAny.defineShared(SymbolTable.Codes.Array, protoArray);
//		// Add String prototype
//		protoString = protoAny.clone();
//		protoAny.defineShared(SymbolTable.Codes.String, protoString);
//		// Add Integer prototype
//		protoInteger = protoAny.clone();
//		protoAny.defineShared(SymbolTable.Codes.Integer, protoInteger);
//		// Add Frame prototype
//		protoFrame = protoAny.clone();
//		protoAny.defineShared(SymbolTable.Codes.Frame, protoFrame);
//		// Add Behavior prototype
//		protoBehavior = protoAny.clone();
//		protoAny.defineShared(SymbolTable.Codes.Behavior, protoBehavior);
//		// Add Closure prototype
//		closureBehavior = protoAny.clone();
//		protoAny.defineShared(SymbolTable.Codes.Closure, closureBehavior);
//		
//		Process[] locals = new Process[1 + parameterCount + variableCount];
//		locals[0] = protoAny;
//		currentFrame = new Frame(null, /*protoAny, */locals, instructions, new Frame.InterfaceIdPart("default"), maxStackSize);
//	}
//	
//	private transient SymbolTable symbolTable;
//	private transient String commonsPath;
//	private transient String currentPath;
//	
//	public void setup(SymbolTable symbolTable, String commonsPath, String currentPath) {
//		this.symbolTable = symbolTable;
//		this.commonsPath = commonsPath;
//		this.currentPath = currentPath;
//	}
//
//	@SuppressWarnings("unused")
//	public void replay(InteractionHistory interactionHistory) {
//		Debug.println(Debug.LEVEL_HIGH, "replay");
//		
//		if(currentFrame != null) {
//			while(!stopRequested) {
//				Instruction instruction = currentFrame.instructions[currentFrame.instructionPointer];
//				
//				if(Debug.maxLevel >= Debug.LEVEL_HIGH) {
//					Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stackToString());
//					Debug.println(Debug.LEVEL_HIGH, "play: " + instruction);
//				}
//				
//				next(instruction, interactionHistory);
//			}
//		}
//		
//		if(currentFrame != null)
//			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stackToString());
//		
//		Debug.println(Debug.LEVEL_HIGH, "/replay");
//	}
//	
//	private boolean stopRequested;
//	
//	private final void next(Instruction instruction, InteractionHistory interactionHistory) {
//		switch(instruction.opcode) {
//		case Instruction.OPCODE_PAUSE: {
//			Object output = interactionHistory.nextOutputFor(currentFrame.getInterfaceId(), Instruction.OPCODE_PAUSE);
//			if(output == null) {
//				stopRequested = true;
//				interactionHistory.append(currentFrame.getInterfaceId(), instruction, instruction);
//			} else {
//			}
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_INC_IP: {
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_FINISH: {
//			if(currentFrame.stackSize() > 0)
//				Debug.println(Debug.LEVEL_LOW, "stack isn't empty: " + currentFrame.stackToString());
//			
//			stopRequested = true;
//			currentFrame = null;
//			
//			break;
//		} case Instruction.OPCODE_DUP: {
//			currentFrame.dup();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_DUP1: {
//			currentFrame.dup1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_STORE_LOC: {
//			int ordinal = (int)instruction.operand1;
//			Process value = currentFrame.pop();
//			currentFrame.locals[ordinal] = value;
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_POP: {
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SEND: {
//			String id = (String)instruction.operand1;
//			int argumentCount = (int)instruction.operand2;
//			int code = symbolTable.getSymbolCodeFromId(Selector.get(id, argumentCount));
//			
//			switch(argumentCount) {
//			case 0: 
//				currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SEND_CODE_0, code, argumentCount);
//				break;
//			case 1: 
//				currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SEND_CODE_1, code, argumentCount);
//				break;
//			case 2: 
//				currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SEND_CODE_2, code, argumentCount);
//				break;
//			case 3: 
//				currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SEND_CODE_3, code, argumentCount);
//				break;
//			default:
//				currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SEND_CODE, code, argumentCount);
//				break;
//			}
//			
//			break;
//		} case Instruction.OPCODE_SEND_CODE: {
//			int code = (int)instruction.operand1;
//			int argumentCount = (int)instruction.operand2;
//			
//			Process receiver = (Process)currentFrame.stackGet(currentFrame.stackSize() - argumentCount - 1);
//			
//			Object callable = receiver.getCallable(code);
//
//			if(callable instanceof BehaviorProcess) {
//				BehaviorProcess behavior = (BehaviorProcess)callable;
//				
//				Process[] locals = new Process[behavior.localCount];
//				
//				locals[0] = receiver;
//				currentFrame.copyNInto(1, locals, argumentCount);
//				currentFrame.popN(argumentCount + 1); // Pop arguments and receiver
//				
//				currentFrame = new Frame(currentFrame, locals, behavior.instructions, currentFrame.interfaceId, behavior.maxStackSize);
//			} else if(callable != null) {
//				// Send some kind of generic call message?
//				Process[] locals = new Process[1 + argumentCount];
//
//				// Perhaps arguments should be pushed in reverse order?
//				// This way, System.arraycopy could probably be used when Frame.locals also represents stack
//				for(int i = argumentCount - 1; i > 0; i--)
//					locals[i + 1] = currentFrame.pop();
//				currentFrame.pop(); // Pop receiver
//				
//				Process process = (Process)callable;
//				locals[0] = process;
//				
//				currentFrame = new Frame(currentFrame, locals, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
//			} else {
//				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(code) + "'.");
//			}
//			
//			break;
//		} case Instruction.OPCODE_SEND_CODE_0: {
//			int code = (int)instruction.operand1;
//			
//			Process receiver = currentFrame.pop();
//			
//			Object callable = receiver.getCallable(code);
//
//			if(callable instanceof BehaviorProcess) {
//				BehaviorProcess behavior = (BehaviorProcess)callable;
//				Process[] locals = new Process[behavior.localCount];
//				locals[0] = receiver;
//				
//				currentFrame = new Frame(currentFrame, locals, behavior.instructions, currentFrame.interfaceId, behavior.maxStackSize);
//			} else if(callable != null) {
//				// Send some kind of generic call message?
//				Process[] locals = new Process[1];
//				
//				Process process = (Process)callable;
//				locals[0] = process;
//				
//				currentFrame = new Frame(currentFrame, locals, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
//			} else {
//				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(code) + "'.");
//			}
//			
//			break;
//		} case Instruction.OPCODE_SEND_CODE_1: {
//			int code = (int)instruction.operand1;
//			
//			Process receiver = (Process)currentFrame.stackGet(currentFrame.stackSize() - 2);
//			
//			Object callable = receiver.getCallable(code);
//
//			if(callable instanceof BehaviorProcess) {
//				BehaviorProcess behavior = (BehaviorProcess)callable;
//				Process[] locals = new Process[behavior.localCount];
//				locals[0] = receiver;
//				currentFrame.copy1Into(1, locals);
//				currentFrame.pop2(); // Pop arguments and receiver
//				
//				currentFrame = new Frame(currentFrame, locals, behavior.instructions, currentFrame.interfaceId, behavior.maxStackSize);
//			} else if(callable != null) {
//				// Send some kind of generic call message?
//				Process[] locals = new Process[2];
//				locals[1] = currentFrame.pop();
//				currentFrame.pop();
//				
//				Process process = (Process)callable;
//				locals[0] = process;
//				
//				currentFrame = new Frame(currentFrame, locals, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
//			} else {
//				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(code) + "'.");
//			}
//			
//			break;
//		} case Instruction.OPCODE_SEND_CODE_2: {
//			int code = (int)instruction.operand1;
//			
//			Process receiver = (Process)currentFrame.stackGet(currentFrame.stackSize() - 3);
//			
//			Object callable = receiver.getCallable(code);
//
//			if(callable instanceof BehaviorProcess) {
//				BehaviorProcess behavior = (BehaviorProcess)callable;
//				Process[] locals = new Process[behavior.localCount];
//				locals[0] = receiver;
//				currentFrame.copy2Into(1, locals);
//				currentFrame.pop3(); // Pop arguments and receiver
//				
//				currentFrame = new Frame(currentFrame, locals, behavior.instructions, currentFrame.interfaceId, behavior.maxStackSize);
//			} else if(callable != null) {
//				// Send some kind of generic call message?
//				Process[] locals = new Process[3];
//				locals[2] = currentFrame.pop();
//				locals[1] = currentFrame.pop();
//				currentFrame.pop(); // Pop receiver
//				
//				Process process = (Process)callable;
//				locals[0] = process;
//				
//				currentFrame = new Frame(currentFrame, locals, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
//			} else {
//				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(code) + "'.");
//			}
//			
//			break;
//		} case Instruction.OPCODE_SEND_CODE_3: {
//			int code = (int)instruction.operand1;
//			
//			Process receiver = (Process)currentFrame.stackGet(currentFrame.stackSize() - 4);
//			
//			Object callable = receiver.getCallable(code);
//
//			if(callable instanceof BehaviorProcess) {
//				BehaviorProcess behavior = (BehaviorProcess)callable;
//				Process[] locals = new Process[behavior.localCount];
//				locals[0] = receiver;
//				currentFrame.copy3Into(1, locals);
//				currentFrame.pop4(); // Pop arguments and receiver
//				
//				currentFrame = new Frame(currentFrame, locals, behavior.instructions, currentFrame.interfaceId, behavior.maxStackSize);
//			} else if(callable != null) {
//				// Send some kind of generic call message?
//				Process[] locals = new Process[4];
//				locals[3] = currentFrame.pop();
//				locals[2] = currentFrame.pop();
//				locals[1] = currentFrame.pop();
//				currentFrame.pop(); // Pop receiver
//				
//				Process process = (Process)callable;
//				locals[0] = process;
//				
//				currentFrame = new Frame(currentFrame, locals, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
//			} else {
//				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(code) + "'.");
//			}
//			
//			break;
//		} case Instruction.OPCODE_RET: {
//			Frame returnFrame = currentFrame.sender;
//			returnFrame.push(currentFrame.peek());
//			currentFrame = returnFrame;
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_RET_NONE: {
//			currentFrame = currentFrame.sender;
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_IF_TRUE: {
//			BooleanProcess value = (BooleanProcess)currentFrame.pop();
//			if(value.value) {
//				int jump = (int)instruction.operand1;
//				currentFrame.instructionPointer += jump;
//			} else
//				currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_IF_FALSE: {
//			BooleanProcess value = (BooleanProcess)currentFrame.pop();
//			if(!value.value) {
//				int jump = (int)instruction.operand1;
//				currentFrame.instructionPointer += jump;
//			} else
//				currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_JUMP: {
//			int jump = (int)instruction.operand1;
//			currentFrame.instructionPointer += jump;
//			
//			break;
//		} case Instruction.OPCODE_SET: {
//			String id = (String)instruction.operand1;
//			int parameterCount = (int)instruction.operand2;
//			int code = symbolTable.getSymbolCodeFromId(Selector.get(id, parameterCount));
//			currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SET_CODE, code);
//			
//			break;
//		} case Instruction.OPCODE_SET_CODE: {
//			int code = (int)instruction.operand1;
//			Process value = currentFrame.peek();
//			Process receiver = (Process)currentFrame.peek1();
//			currentFrame.pop2();
//			receiver.define(code, value);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SET_PROTO: {
//			String id = (String)instruction.operand1;
//			int parameterCount = (int)instruction.operand2;
//			int code = symbolTable.getSymbolCodeFromId(Selector.get(id, parameterCount));
//			currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SET_PROTO_CODE, code);
//			
//			break;
//		} case Instruction.OPCODE_SET_PROTO_CODE: {
//			int code = (int)instruction.operand1;
//			Process value = currentFrame.peek();
//			Process receiver = (Process)currentFrame.peek1();
//			currentFrame.pop2();
//			receiver.defineProto(code, value);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_GET: {
//			String id = (String)instruction.operand1;
//			int parameterCount = (int)instruction.operand2;
//			int code = symbolTable.getSymbolCodeFromId(Selector.get(id, parameterCount));
//			currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_GET_CODE, code);
//			
//			break;
//		} case Instruction.OPCODE_GET_CODE: {
//			int code = (int)instruction.operand1;
//			Process receiver = (Process)currentFrame.peek();
//			Process value = receiver.lookup(code);
//			currentFrame.set0(value);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SLOTS_SET: {
//			Process value = currentFrame.peek();
//			StringProcess key = (StringProcess)currentFrame.peek1();
//			Process receiver = (Process)currentFrame.peek2();
//			currentFrame.pop3();
//			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
//			receiver.define(code, value);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SLOTS_SET_PROTO: {
//			Process value = currentFrame.peek();
//			StringProcess key = (StringProcess)currentFrame.peek1();
//			Process receiver = (Process)currentFrame.peek2();
//			currentFrame.pop3();
//			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
//			receiver.defineProto(code, value);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SLOTS_GET: {
//			StringProcess key = (StringProcess)currentFrame.peek();
//			Process receiver = (Process)currentFrame.peek1();
//			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
//			Process value = receiver.lookup(code);
//			currentFrame.set1(value);
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SLOTS_IS_DEFINED: {
//			StringProcess key = (StringProcess)currentFrame.peek();
//			Process receiver = (Process)currentFrame.peek1();
//			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
//			Process value = receiver.lookup(code);
//			currentFrame.set1(getBoolean(value != null));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SLOTS_NAMES: {
//			Process receiver = (Process)currentFrame.peek();
//			String[] rawNames = receiver.getNames();
//			Process[] names = new Process[rawNames.length];
//			for(int i = 0; i < names.length; i++)
//				names[i] = createString(rawNames[i]);
//			ArrayProcess namesArray = new ArrayProcess(names);
//			namesArray.defineProto(SymbolTable.Codes.prototype, protoArray);
//			currentFrame.set0(namesArray);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_CALL_CLOSURE: {
//			ClosureProcess closure = (ClosureProcess)currentFrame.peek();
//			BehaviorProcess behavior = closure.behavior;
//			FrameProcess frame = closure.frame;
//			currentFrame.copyNInto(closure.argumentOffset, frame.frame.locals, closure.parameterCount, 1);
//			currentFrame.popN(closure.parameterCount);
//			currentFrame = new Frame(currentFrame, frame.frame.locals, behavior.instructions, frame.frame.interfaceId, behavior.maxStackSize);
//			
//			break;
//		} case Instruction.OPCODE_CALL_CLOSURE_0: {
//			ClosureProcess closure = (ClosureProcess)currentFrame.pop();
//			BehaviorProcess behavior = closure.behavior;
//			FrameProcess frame = closure.frame;
//			currentFrame = new Frame(currentFrame, frame.frame.locals, behavior.instructions, frame.frame.interfaceId, behavior.maxStackSize);
//			
//			break;
//		} case Instruction.OPCODE_CALL_CLOSURE_1: {
//			ClosureProcess closure = (ClosureProcess)currentFrame.peek();
//			BehaviorProcess behavior = closure.behavior;
//			FrameProcess frame = closure.frame;
//			frame.frame.locals[closure.argumentOffset] = currentFrame.peek1();
//			currentFrame.pop2();
//			currentFrame = new Frame(currentFrame, frame.frame.locals, behavior.instructions, frame.frame.interfaceId, behavior.maxStackSize);
//			
//			break;
//		} case Instruction.OPCODE_CALL_CLOSURE_2: {
//			ClosureProcess closure = (ClosureProcess)currentFrame.peek();
//			BehaviorProcess behavior = closure.behavior;
//			FrameProcess frame = closure.frame;
//			currentFrame.copyNInto(closure.argumentOffset, frame.frame.locals, 2, 1);
//			currentFrame.pop3();
//			currentFrame = new Frame(currentFrame, frame.frame.locals, behavior.instructions, frame.frame.interfaceId, behavior.maxStackSize);
//			
//			break;
//		} case Instruction.OPCODE_CALL_CLOSURE_3: {
//			ClosureProcess closure = (ClosureProcess)currentFrame.peek();
//			BehaviorProcess behavior = closure.behavior;
//			FrameProcess frame = closure.frame;
//			currentFrame.copyNInto(closure.argumentOffset, frame.frame.locals, 3, 1);
//			currentFrame.pop4();
//			currentFrame = new Frame(currentFrame, frame.frame.locals, behavior.instructions, frame.frame.interfaceId, behavior.maxStackSize);
//			
//			break;
//		} case Instruction.OPCODE_EXTEND_INTER_ID: {
//			String id = (String)instruction.operand1;
//			currentFrame.extendInterfaceId(id);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SHRINK_INTER_ID: {
//			currentFrame.shrinkInterfaceId();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_LOAD_THIS: {
//			currentFrame.push(currentFrame.locals[0]);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_LOAD_NULL: {
//			currentFrame.push(singletonNil);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_LOAD_LOC: {
//			int ordinal = (int)instruction.operand1;
//			Process value = currentFrame.locals[ordinal];
//			currentFrame.push(value);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_LOAD_INT: {
//			int intValue = (int)instruction.operand1;
//			currentFrame.push(new IntegerProcess(protoInteger, intValue));
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_LOAD_TRUE: {
//			currentFrame.push(singletonTrue);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_LOAD_FALSE: {
//			currentFrame.push(singletonFalse);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_LOAD_STRING: {
//			String str = (String)instruction.operand1;
//			StringProcess string = createString(str);
//			currentFrame.push(string);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_LOAD_THIS_FRAME: {
//			currentFrame.push(currentFrame.getReifiedFrame(protoFrame));
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_LOAD_BEHAVIOR: {
//			BehaviorProcess behavior = (BehaviorProcess)instruction.operand1;
//			currentFrame.push(behavior);
//			currentFrame.instructionPointer++;
//			
//			break;
//		}
//		
//		// Special opcodes
//		case Instruction.OPCODE_SP_BOOLEAN_OR: {
//			BooleanProcess rhs = (BooleanProcess)currentFrame.peek();
//			BooleanProcess lhs = (BooleanProcess)currentFrame.peek1();
//			currentFrame.set1(getBoolean(lhs.value || rhs.value));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_BOOLEAN_AND: {
//			BooleanProcess rhs = (BooleanProcess)currentFrame.peek();
//			BooleanProcess lhs = (BooleanProcess)currentFrame.peek1();
//			currentFrame.set1(getBoolean(lhs.value && rhs.value));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_BOOLEAN_NOT: {
//			BooleanProcess b = (BooleanProcess)currentFrame.peek();
//			currentFrame.set0(getBoolean(!b.value));
//			currentFrame.instructionPointer++;
//			
//			break;
//		}  case Instruction.OPCODE_SP_ARRAY_GET: {
//			IntegerProcess index = (IntegerProcess)currentFrame.peek();
//			ArrayProcess array = (ArrayProcess)currentFrame.peek1();
//			currentFrame.set1(array.get(index.intValue));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_ARRAY_SET: {
//			Process value = currentFrame.peek();
//			IntegerProcess index = (IntegerProcess)currentFrame.peek1();
//			ArrayProcess array = (ArrayProcess)currentFrame.peek2();
//			currentFrame.pop3();
//			array.set(index.intValue, value);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_STRING_CONCAT: {
//			StringProcess rhs = (StringProcess)currentFrame.peek();
//			StringProcess lhs = (StringProcess)currentFrame.peek1();
//			currentFrame.set1(createString(lhs.str + rhs.str));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_STRING_EQUAL: {
//			StringProcess rhs = (StringProcess)currentFrame.peek();
//			StringProcess lhs = (StringProcess)currentFrame.peek1();
//			currentFrame.set1(getBoolean(lhs.str.equals(rhs.str)));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_INT_ADD: {
//			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
//			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
//			currentFrame.set1(new IntegerProcess(protoInteger, lhs.intValue + rhs.intValue));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		}case Instruction.OPCODE_SP_INT_SUB: {
//			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
//			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
//			currentFrame.set1(new IntegerProcess(protoInteger, lhs.intValue - rhs.intValue));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_INT_MULT: {
//			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
//			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
//			currentFrame.set1(new IntegerProcess(protoInteger, lhs.intValue * rhs.intValue));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_INT_DIV: {
//			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
//			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
//			currentFrame.set1(new IntegerProcess(protoInteger, lhs.intValue / rhs.intValue));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_INT_REM: {
//			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
//			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
//			currentFrame.set1(new IntegerProcess(protoInteger, lhs.intValue % rhs.intValue));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_INT_EQUAL: {
//			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
//			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
//			currentFrame.set1(getBoolean(lhs.intValue == rhs.intValue));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_INT_GREATER: {
//			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
//			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
//			currentFrame.set1(getBoolean(lhs.intValue > rhs.intValue));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_INT_LESS: {
//			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
//			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
//			currentFrame.set1(getBoolean(lhs.intValue < rhs.intValue));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_INT_TO_STRING: {
//			IntegerProcess integer = (IntegerProcess)currentFrame.peek();
//			currentFrame.set0(createString(Integer.toString(integer.intValue)));
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_FRAME_SENDER: {
//			FrameProcess frame = (FrameProcess)currentFrame.peek();
//			currentFrame.set0(frame.frame.sender.getReifiedFrame(protoFrame));
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_FRAME_SET_SENDER: {
//			FrameProcess newSender = (FrameProcess)currentFrame.peek();
//			FrameProcess frame = (FrameProcess)currentFrame.peek1();
//			currentFrame.pop2();
//			frame.frame.sender = newSender.frame;
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_FRAME_RESUME: {
//			Process value = currentFrame.peek();
//			FrameProcess frame = (FrameProcess)currentFrame.peek1();
//			currentFrame.pop2();
//			currentFrame = frame.frame;
//			currentFrame.push(value);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_REF_EQUAL: {
//			Process rhs = currentFrame.peek();
//			Process lhs = currentFrame.peek1();
//			currentFrame.set1(getBoolean(lhs == rhs));
//			currentFrame.pop1();
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_WRITE: {
//			Object output = interactionHistory.nextOutputFor(currentFrame.getInterfaceId(), Instruction.OPCODE_SP_WRITE);
//			if(output == null) {
//				StringProcess value = (StringProcess)currentFrame.pop();
//				System.out.print(value.str);
//				interactionHistory.append(currentFrame.getInterfaceId(), instruction, instruction);
//			} else {
//				currentFrame.pop1();
//			}
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_NEXT_LINE: {
//			String line;
//
//			Object output = interactionHistory.nextOutputFor(currentFrame.getInterfaceId(), Instruction.OPCODE_SP_NEXT_LINE);
//			
//			if(output == null) {
//				try {
//					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//					line = br.readLine();
//					interactionHistory.append(currentFrame.getInterfaceId(), instruction, line);
//				} catch (IOException e) {
//					e.printStackTrace();
//					line = null;
//				}
//			} else {
//				line = (String)output;
//			}
//
//			StringProcess string = createString(line);
//			
//			currentFrame.push(string);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_NEW_DICT: {
//			DictionaryProcess newDict = new DictionaryProcess();
//			newDict.defineProto(SymbolTable.Codes.prototype, protoAny);
//			currentFrame.push(newDict);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_NEW_ARRAY: {
//			IntegerProcess length = (IntegerProcess)currentFrame.peek();
//			ArrayProcess newArray = new ArrayProcess(length.intValue, singletonNil);
//			newArray.defineProto(SymbolTable.Codes.prototype, protoArray);
//			currentFrame.set0(newArray);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_ARRAY_LENGTH: {
//			ArrayProcess newArray = (ArrayProcess)currentFrame.peek();
//			currentFrame.set0(new IntegerProcess(protoInteger, newArray.length()));
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_LOAD: {
//			StringProcess pathSource = (StringProcess)currentFrame.pop();
//			String path = pathSource.str;
//			try {
//				String sourcePath;
//				String codePath;
//				
//				if(path.startsWith("/")) {
//					sourcePath = currentPath + path + ".drs";
//					codePath = currentPath + path + ".drr";
//				} else {
//					sourcePath = commonsPath + "/" + path + ".drs";
//					codePath = commonsPath + "/" + path + ".drr";
//				}
//				
//				Compiler compiler = new Compiler();
//				CustomProcess customProcess = compiler.load(sourcePath, codePath);
//				// Assumed to end with finish instruction. Replace finish with pop_frame.
//				customProcess.currentFrame.instructions[customProcess.currentFrame.instructions.length - 1] = new Instruction(Instruction.OPCODE_RET_NONE);
//				customProcess.currentFrame.locals = new Process[]{protoAny};
//				currentFrame = new Frame(
//					currentFrame, customProcess.currentFrame.locals, customProcess.currentFrame.instructions, customProcess.currentFrame.interfaceId, customProcess.currentFrame.stack.length);
//			} catch (ClassNotFoundException | IOException e) {
//				e.printStackTrace();
//			}
//			
//			break;
//		} case Instruction.OPCODE_SP_NEW_CLOSURE: {
//			int argumentOffset = (int)instruction.operand1;
//			int parameterCount = (int)instruction.operand2;
//			
//			BehaviorProcess behavior = (BehaviorProcess)currentFrame.peek();
//			ClosureProcess closure = new ClosureProcess(closureBehavior, currentFrame.getReifiedFrame(protoFrame), behavior, argumentOffset, parameterCount);
//			currentFrame.set0(closure);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_NEW_BEHAVIOR: {
//			int localCount = (int)instruction.operand1;
//			int maxStackSize = (int)instruction.operand2;
//			Instruction[] instructions = (Instruction[])instruction.operand3;
//			BehaviorProcess behavior = new BehaviorProcess(protoBehavior, localCount, maxStackSize, instructions);
//			currentFrame.push(behavior);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_SP_CLONE: {
//			DictionaryProcess dict = (DictionaryProcess)currentFrame.peek();
//			DictionaryProcess clone = dict.clone();
//			currentFrame.set0(clone);
//			currentFrame.instructionPointer++;
//			
//			break;
//		} case Instruction.OPCODE_NONE: {
//			currentFrame.instructionPointer++;
//			break;
//		} case Instruction.OPCODE_BREAK_POINT: {
//			currentFrame.instructionPointer++;
//			break;
//		}
//		}
//	}

	@Override
	public void resume(List<InteractionHistory.Interaction> playedInstructions) {
//		InteractionHistory interactionHistory = new InteractionHistory(playedInstructions);
//		Debug.println(Debug.LEVEL_HIGH, "play");
//		
//		if(currentFrame != null) {
//			while(!stopRequested) {
//				Instruction instruction = currentFrame.instructions[currentFrame.instructionPointer];
//				
//				Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stackToString());
//				Debug.println(Debug.LEVEL_HIGH, "play: " + instruction);
//				
//				next(instruction, interactionHistory);
//			}
//		}
//
//		if(currentFrame != null && currentFrame.stackSize() > 0)
//			Debug.println(Debug.LEVEL_LOW, "stack isn't empty: " + currentFrame.stackToString());
//		
//		if(currentFrame != null)
//			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stackToString());
//
//		Debug.println(Debug.LEVEL_HIGH, "/play");
	}
	
	@Override
	public Object getCallable(int selectorCode) {
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
	
//	@Override
//	public BehaviorProcess createBehavior(int parameterCount, int variableCount, Instruction[] instructions) {
//		BehaviorProcess behavior = new BehaviorProcess(parameterCount, variableCount, instructions);
//		behavior.defineProto(SymbolTable.Codes.prototype, protoBehavior);
//		return behavior;
//	}
	
//	public final BooleanProcess getBoolean(boolean value) {
//		return value ? singletonTrue : singletonFalse;
//	}
//
//	public final StringProcess createString(String str) {
//		return new StringProcess(protoString, str);
////		StringProcess string = new StringProcess(protoString, str);
////		string.defineProto(SymbolTable.Codes.prototype, protoAny.lookup(SymbolTable.Codes.String));
////		return string;
//	}

	@Override
	public String[] getNames() {
		// TODO Auto-generated method stub
		return null;
	}
}
