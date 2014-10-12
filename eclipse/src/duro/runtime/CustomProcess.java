package duro.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import duro.debugging.Debug;
import duro.reflang.Compiler_NEW;
import duro.reflang.SymbolTable;

public class CustomProcess extends Process implements Iterable<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final Instruction[] FORWARD_CALL_INSTRUCTIONS = new Instruction[] {
		new Instruction(Instruction.OPCODE_FORWARD_CALL)/*,
		new Instruction(Instruction.OPCODE_RET_FORWARD)*/
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
//		public final Process self;
		
		// Arguments and locals can be joined into a single locals array.
		// The locals array should contain arguments, variables, and stack. This requires a max stack size to be supplied
//		public Process[] arguments;
//		public Process[] variables;
		public Process[] locals;
		
		public final Instruction[] instructions;
		public int instructionPointer;
//		private Stack<Process> stack = new Stack<Process>(); // Could be replaced by a pointer to locals
		
		// Could probably be improved by referring to either null, a FrameProcess or a Frame
		// If referring to null, then a FrameProcess hasn't been created yet but will be created lazily
		// If referring to a FrameProcess, a FrameProcess has been created
		// If referring to a Frame, then that frame behaves as reification handle does now
//		public Handle reificationHandle;
		public Object reificationHandle; 
		
		public InterfaceIdPart interfaceId;
		private Process[] stack;
//		private int stackIndex;
		private int stackSize;
		
		public Frame(Frame sender, /*Process self, Process[] arguments, int variableCount,*/ Process[] locals, Instruction[] instructions, InterfaceIdPart interfaceId, int maxStackSize) {
			this.sender = sender;
//			this.self = self;
//			this.arguments = arguments;
//			variables = new Process[variableCount];
			this.locals = locals;
			this.instructions = instructions;
//			this.reificationHandle = new Handle();
			this.interfaceId = interfaceId;
//			stackIndex = locals.length;
			stackSize = 0;
			stack = new Process[maxStackSize];
		}
		
//		public Frame(Frame sender, /*Process self, Process[] arguments, Process[] variables, */ Process[] locals, Instruction[] instructions, InterfaceIdPart interfaceId) {
//			this.sender = sender;
////			this.self = self;
////			this.arguments = arguments;
////			this.variables = variables;
//			this.locals = locals;
//			this.instructions = instructions;
////			this.reificationHandle = reificationHandle;
////			this.reificationHandle = new Handle();
//			this.interfaceId = interfaceId;
//		}
		
		public final FrameProcess getReifiedFrame(Process protoFrame) {
			if(reificationHandle instanceof FrameProcess) {
				return (FrameProcess)reificationHandle;
			} else if(reificationHandle == null) {
				FrameProcess reification = new FrameProcess(this);
				// Can this be supplied as a argument to FrameProcess?
				reification.defineProto(SymbolTable.Codes.prototype, protoFrame);
				reificationHandle = reification;
				
				return reification;
			}
			
			return null;
			
//			if(((Handle)reificationHandle).value == null) {
//				((Handle)reificationHandle).value = new FrameProcess(this);
//				((Handle)reificationHandle).value.defineProto(SymbolTable.Codes.prototype, protoFrame);
//			}
//			
//			return ((Handle)reificationHandle).value;
		}
		
		public final void extendInterfaceId(String id) {
			interfaceId = interfaceId.extend(id);
		}
		
		public final void shrinkInterfaceId() {
			interfaceId = interfaceId.parent;
		}
		
		public final String getInterfaceId() {
//			return interfaceIdStack.stream().collect(Collectors.joining(";"));
			return interfaceId.build();
		}
		
		public final Process pop() {
//			return stack.pop();
//			Process p = locals[stackIndex];
//			locals[stackIndex] = null;
//			stackIndex++;
//			return p;
			stackSize--;
			Process p = stack[stackSize];
			stack[stackSize] = null;
			return p;
		}

		public final void copy1Into(int i, Process[] a) {
			a[i] = stack[stackSize - 1];
		}

		public final void copy2Into(int i, Process[] a) {
			System.arraycopy(stack, stackSize - 2, a, i, 2);
		}

		public final void copy3Into(int i, Process[] a) {
			System.arraycopy(stack, stackSize - 3, a, i, 3);
		}

		public final void copyNInto(int i, Process[] a, int n) {
			System.arraycopy(stack, stackSize - n, a, i, n);
		}

		public final void copyNInto(int i, Process[] a, int n, int m) {
			System.arraycopy(stack, stackSize - n - m, a, i, n);
		}

		public final void set0(Process p) {
			stack[stackSize - 1] = p;
		}
		
		public final void set1(Process p) {
			stack[stackSize - 2] = p;
		}

		public final void pop1() {
			stackSize--;
			stack[stackSize] = null;
		}

		public final void pop2() {
			int newSize = stackSize - 2;
			Arrays.fill(stack, newSize, stackSize, null);
			stackSize = newSize;
		}

		public final void pop3() {
			int newSize = stackSize - 3;
			Arrays.fill(stack, newSize, stackSize, null);
			stackSize = newSize;
		}

		public final void pop4() {
			int newSize = stackSize - 4;
			Arrays.fill(stack, newSize, stackSize, null);
			stackSize = newSize;
		}

		public final void popN(int n) {
			int newSize = stackSize - n;
			Arrays.fill(stack, newSize, stackSize, null);
			stackSize = newSize;
		}
		
		public final void push(Process p) {
//			stackIndex--;
//			locals[stackIndex] = p;
			stack[stackSize] = p;
			stackSize++;
		}

		public final void stackAdd(int index, Process p) {
//			stack.add(index, p);
			/*
			top to bottom
			[x, y, z]
			add 1 i
			[x, y, i, z]
			
			top to bottom
			[x, y, z]
			add 2 i
			[x, i, y, z]
			
			top to bottom
			[x, y, z]
			add 3 i
			[i, x, y, z]
			*/
//			for(int i = index; i > stackIndex; i--)
//				locals[i - 1] = locals[i];
//			locals[index] = p;
			
			for(int i = stackSize - 1; i >= index; i--)
				stack[i + 1] = stack[i];
			stack[index] = p;
			stackSize++;
		}

		public final String stackToString() {
//			return stack.toString();
//			return IntStream.range(stackIndex, locals.length).mapToObj(i -> i).sorted((x, y) -> y.compareTo(x)).map(i -> locals[i].toString()).collect(Collectors.joining());
			return Arrays.toString(stack);
		}

		public final int stackSize() {
//			return stack.size();
//			return locals.length - stackIndex;
			return stackSize;
		}

		public final Process peek() {
//			return stack.peek();
//			return locals[stackIndex];
			return stack[stackSize - 1];
		}
		
		public final void dup() {
			stack[stackSize] = stack[stackSize - 1];
			stackSize++;
		}

		public final Process peek1() {
			return stack[stackSize - 2];
		}

		public final Process stackGet(int i) {
//			return stack.get(i);
//			return locals[locals.length - i - 1];
			return stack[i];
		}

		public final void stackSet(int i, Process p) {
//			stack.set(i, p);
//			locals[i] = p;
			stack[i] = p;
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
	private DictionaryProcess protoFrame;
	private DictionaryProcess protoBehavior;
	private DictionaryProcess closureBehavior;

	public CustomProcess(int parameterCount, int variableCount, int maxStackSize, Instruction[] instructions) {
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
		protoFrame = protoAny.clone();
		protoAny.defineShared(SymbolTable.Codes.Frame, protoFrame);
		// Add Behavior prototype
		protoBehavior = protoAny.clone();
		protoAny.defineShared(SymbolTable.Codes.Behavior, protoBehavior);
		// Add Closure prototype
		closureBehavior = protoAny.clone();
		protoAny.defineShared(SymbolTable.Codes.Closure, closureBehavior);
		
		Process[] locals = new Process[1 + parameterCount + variableCount];
		locals[0] = protoAny;
		currentFrame = new Frame(null, /*protoAny, */locals, instructions, new Frame.InterfaceIdPart("default"), maxStackSize);
	}
	
	private transient SymbolTable symbolTable;
	private transient String commonsPath;
	private transient String currentPath;
	
	public void setup(SymbolTable symbolTable, String commonsPath, String currentPath) {
		this.symbolTable = symbolTable;
		this.commonsPath = commonsPath;
		this.currentPath = currentPath;
	}

	@SuppressWarnings("unused")
	public void replay(InteractionHistory interactionHistory) {
		Debug.println(Debug.LEVEL_HIGH, "replay");
		
		if(currentFrame != null) {
			while(!stopRequested) {
				Instruction instruction = currentFrame.instructions[currentFrame.instructionPointer];
				
				if(Debug.maxLevel >= Debug.LEVEL_HIGH) {
					Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stackToString());
					Debug.println(Debug.LEVEL_HIGH, "play: " + instruction);
				}
				
				next(instruction, interactionHistory);
			}
		}
		
		if(currentFrame != null)
			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stackToString());
		
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
			if(currentFrame.stackSize() > 0)
				Debug.println(Debug.LEVEL_LOW, "stack isn't empty: " + currentFrame.stackToString());
			
			stopRequested = true;
			currentFrame = null;
			
			break;
		} case Instruction.OPCODE_DUP: {
			currentFrame.dup();
//			currentFrame.push(currentFrame.peek());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_DUP1: {
			int index = currentFrame.stackSize() - 2;
			currentFrame.stackAdd(index, currentFrame.peek());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_DUP2: {
			int index = currentFrame.stackSize() - 3;
			currentFrame.stackAdd(index, currentFrame.peek());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_DUP_ANY: {
			int sourceOffset = (int)instruction.operand1;
			int insertionOffset = (int)instruction.operand2;
			int top = currentFrame.stackSize() - 1;
			
			Process sourceValue = currentFrame.stackGet(top - sourceOffset);
			currentFrame.stackAdd(top - insertionOffset, sourceValue);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_STORE_LOC: {
			int ordinal = (int)instruction.operand1;
			Process value = currentFrame.pop();
			currentFrame.locals[ordinal] = value;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_POP: {
			currentFrame.pop();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SWAP: {
			Process tmp = currentFrame.stackGet(currentFrame.stackSize() - 1);
			currentFrame.stackSet(currentFrame.stackSize() - 1, currentFrame.stackGet(currentFrame.stackSize() - 2));
			currentFrame.stackSet(currentFrame.stackSize() - 2, tmp);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SWAP1: {
			Process tmp = currentFrame.stackGet(currentFrame.stackSize() - 2);
			currentFrame.stackSet(currentFrame.stackSize() - 2, currentFrame.stackGet(currentFrame.stackSize() - 3));
			currentFrame.stackSet(currentFrame.stackSize() - 3, tmp);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SWAP_ANY: {
			int top = currentFrame.stackSize() - 1;
			int index1 = top - (int)instruction.operand1; // operand1: offsetFromTop0 for first index
			int index2 = top - (int)instruction.operand2; // operand2: offsetFromTop0 for second index
			Process tmp = currentFrame.stackGet(index1);
			currentFrame.stackSet(index1, currentFrame.stackGet(index2));
			currentFrame.stackSet(index2, tmp);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SEND: {
			String id = (String)instruction.operand1;
			int argumentCount = (int)instruction.operand2;
			int code = symbolTable.getSymbolCodeFromId(Selector.get(id, argumentCount));
			
			switch(argumentCount) {
			case 0: 
				currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SEND_CODE_0, code, argumentCount);
				break;
			case 1: 
				currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SEND_CODE_1, code, argumentCount);
				break;
			case 2: 
				currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SEND_CODE_2, code, argumentCount);
				break;
			case 3: 
				currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SEND_CODE_3, code, argumentCount);
				break;
			default:
				currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_SEND_CODE, code, argumentCount);
				break;
			}
			
			break;
		} case Instruction.OPCODE_SEND_CODE: {
			int code = (int)instruction.operand1;
			int argumentCount = (int)instruction.operand2;
			
			Process receiver = (Process)currentFrame.stackGet(currentFrame.stackSize() - argumentCount - 1);
			
			Object callable = receiver.getCallable(code);

			if(callable instanceof BehaviorProcess) {
				BehaviorProcess behavior = (BehaviorProcess)callable;
				
				Process[] locals = new Process[behavior.localCount];
				
				locals[0] = receiver;
				currentFrame.copyNInto(1, locals, argumentCount);
				currentFrame.popN(argumentCount + 1); // Pop arguments and receiver

//				locals[0] = receiver;
//				for(int i = argumentCount - 1; i >= 0; i--)
//					locals[i + 1] = currentFrame.pop();
//				
//				currentFrame.pop(); // Pop receiver
				
				currentFrame = new Frame(currentFrame, /*receiver, */locals, /*behavior.variableCount,*/ behavior.instructions, currentFrame.interfaceId, behavior.maxStackSize);
			} else if(callable != null) {
				// Send some kind of generic call message?
				Process[] locals = new Process[1 + argumentCount];

				// Perhaps arguments should be pushed in reverse order?
				// This way, System.arraycopy could probably be used when Frame.locals also represents stack
				for(int i = argumentCount - 1; i > 0; i--)
					locals[i + 1] = currentFrame.pop();
				currentFrame.pop(); // Pop receiver
				
				Process process = (Process)callable;
				locals[0] = process;
				
				currentFrame = new Frame(currentFrame, /*process, */locals, /*0, */FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
			} else {
				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(code) + "'.");
			}
			
			break;
		} case Instruction.OPCODE_SEND_CODE_0: {
			int code = (int)instruction.operand1;
			
			Process receiver = currentFrame.pop();
			
			Object callable = receiver.getCallable(code);

			if(callable instanceof BehaviorProcess) {
				BehaviorProcess behavior = (BehaviorProcess)callable;
				Process[] locals = new Process[behavior.localCount];
				locals[0] = receiver;
				
				currentFrame = new Frame(currentFrame, /*receiver, */locals, /*behavior.variableCount, */behavior.instructions, currentFrame.interfaceId, behavior.maxStackSize);
			} else if(callable != null) {
				// Send some kind of generic call message?
				Process[] locals = new Process[1];
				
				Process process = (Process)callable;
				locals[0] = process;
				
				currentFrame = new Frame(currentFrame, /*process, */locals, /*0, */FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
			} else {
				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(code) + "'.");
			}
			
			break;
		} case Instruction.OPCODE_SEND_CODE_1: {
			int code = (int)instruction.operand1;
			
			Process receiver = (Process)currentFrame.stackGet(currentFrame.stackSize() - 2);
			
			Object callable = receiver.getCallable(code);

			if(callable instanceof BehaviorProcess) {
				BehaviorProcess behavior = (BehaviorProcess)callable;
				Process[] locals = new Process[behavior.localCount];
				locals[0] = receiver;
				currentFrame.copy1Into(1, locals);
				currentFrame.pop2(); // Pop arguments and receiver
//				locals[1] = currentFrame.pop();
//				currentFrame.pop(); // Pop receiver
				
				currentFrame = new Frame(currentFrame, /*receiver, */locals, /*behavior.variableCount, */behavior.instructions, currentFrame.interfaceId, behavior.maxStackSize);
			} else if(callable != null) {
				// Send some kind of generic call message?
				Process[] locals = new Process[2];
				locals[1] = currentFrame.pop();
				currentFrame.pop();
				
				Process process = (Process)callable;
				locals[0] = process;
				
				currentFrame = new Frame(currentFrame, /*process, */locals, /*0, */FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
			} else {
				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(code) + "'.");
			}
			
			break;
		} case Instruction.OPCODE_SEND_CODE_2: {
			int code = (int)instruction.operand1;
			
			Process receiver = (Process)currentFrame.stackGet(currentFrame.stackSize() - 3);
			
			Object callable = receiver.getCallable(code);

			if(callable instanceof BehaviorProcess) {
				BehaviorProcess behavior = (BehaviorProcess)callable;
				Process[] locals = new Process[behavior.localCount];
				locals[0] = receiver;
				currentFrame.copy2Into(1, locals);
				currentFrame.pop3(); // Pop arguments and receiver
//				locals[0] = receiver;
//				locals[2] = currentFrame.pop();
//				locals[1] = currentFrame.pop();
				
//				currentFrame.pop(); // Pop receiver
				
				currentFrame = new Frame(currentFrame, /*receiver, */locals, /*behavior.variableCount, */behavior.instructions, currentFrame.interfaceId, behavior.maxStackSize);
			} else if(callable != null) {
				// Send some kind of generic call message?
				Process[] locals = new Process[3];
				locals[2] = currentFrame.pop();
				locals[1] = currentFrame.pop();
				currentFrame.pop(); // Pop receiver
				
				Process process = (Process)callable;
				locals[0] = process;
				
				currentFrame = new Frame(currentFrame, /*process, */locals, /*0, */FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
			} else {
				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(code) + "'.");
			}
			
			break;
		} case Instruction.OPCODE_SEND_CODE_3: {
			int code = (int)instruction.operand1;
			
			Process receiver = (Process)currentFrame.stackGet(currentFrame.stackSize() - 4);
			
			Object callable = receiver.getCallable(code);

			if(callable instanceof BehaviorProcess) {
				BehaviorProcess behavior = (BehaviorProcess)callable;
				Process[] locals = new Process[behavior.localCount];
				locals[0] = receiver;
				currentFrame.copy3Into(1, locals);
				currentFrame.pop4(); // Pop arguments and receiver
//				locals[0] = receiver;
//				locals[3] = currentFrame.pop();
//				locals[2] = currentFrame.pop();
//				locals[1] = currentFrame.pop();
				
//				currentFrame.pop(); // Pop receiver
				
				currentFrame = new Frame(currentFrame, /*receiver, */locals, /*behavior.variableCount, */behavior.instructions, currentFrame.interfaceId, behavior.maxStackSize);
			} else if(callable != null) {
				// Send some kind of generic call message?
				Process[] locals = new Process[4];
				locals[3] = currentFrame.pop();
				locals[2] = currentFrame.pop();
				locals[1] = currentFrame.pop();
				currentFrame.pop(); // Pop receiver
				
				Process process = (Process)callable;
				locals[0] = process;
				
				currentFrame = new Frame(currentFrame, /*process, */locals, /*0, */FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
			} else {
				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(code) + "'.");
			}
			
			break;
		}/* case Instruction.OPCODE_CALL: {
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
		}*/ case Instruction.OPCODE_RET: {
			Frame returnFrame = currentFrame.sender;
			returnFrame.push(currentFrame.peek());
			currentFrame = returnFrame;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_RET_NONE: {
//			Process result = currentFrame.self;
			currentFrame = currentFrame.sender;
//			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		}/* case Instruction.OPCODE_RET_FORWARD: {
			Frame returnFrame = currentFrame.sender;
			returnFrame.stack.addAll(currentFrame.stack);
			currentFrame = returnFrame;
			currentFrame.instructionPointer++;
			
			break;
		} */case Instruction.OPCODE_IF_TRUE: {
			BooleanProcess value = (BooleanProcess)currentFrame.pop();
			if(value.value) {
				int jump = (int)instruction.operand1;
				currentFrame.instructionPointer += jump;
			} else
				currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_IF_FALSE: {
			BooleanProcess value = (BooleanProcess)currentFrame.pop();
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
			Process value = currentFrame.peek();
			Process receiver = (Process)currentFrame.peek1();
			currentFrame.pop2();
//			int code = (int)instruction.operand1;
//			Process value = currentFrame.pop();
//			Process receiver = (Process)currentFrame.pop();
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
			Process value = currentFrame.pop();
			Process receiver = (Process)currentFrame.pop();
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
			Process receiver = (Process)currentFrame.peek();
			Process value = receiver.lookup(code);
			currentFrame.set0(value);
//			int code = (int)instruction.operand1;
//			Process receiver = (Process)currentFrame.pop();
//			Process value = receiver.lookup(code);
//			currentFrame.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_SET: {
			Process value = currentFrame.pop();
			StringProcess key = (StringProcess)currentFrame.pop();
			Process receiver = (Process)currentFrame.pop();
			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
			receiver.define(code, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_SET_PROTO: {
			Process value = currentFrame.pop();
			StringProcess key = (StringProcess)currentFrame.pop();
			Process receiver = (Process)currentFrame.pop();
			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
			receiver.defineProto(code, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_GET: {
			StringProcess key = (StringProcess)currentFrame.pop();
			Process receiver = (Process)currentFrame.pop();
			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
			Process value = receiver.lookup(code);
			currentFrame.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_IS_DEFINED: {
			StringProcess key = (StringProcess)currentFrame.pop();
			Process receiver = (Process)currentFrame.pop();
			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
			Process value = receiver.lookup(code);
			currentFrame.push(getBoolean(value != null));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_NAMES: {
			Process receiver = (Process)currentFrame.pop();
			String[] rawNames = receiver.getNames();
			Process[] names = new Process[rawNames.length];
			for(int i = 0; i < names.length; i++)
				names[i] = createString(rawNames[i]);
			ArrayProcess namesArray = new ArrayProcess(names);
			namesArray.defineProto(SymbolTable.Codes.prototype, protoArray);
			currentFrame.push(namesArray);
			currentFrame.instructionPointer++;
			
			break;
		}
		
		
		case Instruction.OPCODE_CALL_CLOSURE: {
			ClosureProcess closure = (ClosureProcess)currentFrame.peek();
			BehaviorProcess behavior = closure.behavior;
			FrameProcess frame = closure.frame;
			currentFrame.copyNInto(closure.argumentOffset, frame.frame.locals, closure.parameterCount, 1);
			currentFrame.popN(closure.parameterCount);
			
//			ClosureProcess closure = (ClosureProcess)currentFrame.pop();
//			BehaviorProcess behavior = closure.behavior;
//			FrameProcess frame = closure.frame;
////			System.arraycopy(currentFrame.locals, 1 /*Ignore self*/, frame.frame.locals, closure.argumentOffset, closure.parameterCount);
//			for(int i = closure.parameterCount - 1; i >= 0; i--)
//				frame.frame.locals[closure.argumentOffset + i] = currentFrame.pop();
			currentFrame = new Frame(currentFrame, /*frame.frame.self,*/ frame.frame.locals, /*frame.frame.variables,*/ behavior.instructions, frame.frame.interfaceId, behavior.maxStackSize);
			
			break;
		} case Instruction.OPCODE_CALL_CLOSURE_0: {
			ClosureProcess closure = (ClosureProcess)currentFrame.pop();
			BehaviorProcess behavior = closure.behavior;
			FrameProcess frame = closure.frame;
			currentFrame = new Frame(currentFrame, /*frame.frame.self,*/ frame.frame.locals, /*frame.frame.variables,*/ behavior.instructions, frame.frame.interfaceId, behavior.maxStackSize);
			
			break;
		} case Instruction.OPCODE_CALL_CLOSURE_1: {
			ClosureProcess closure = (ClosureProcess)currentFrame.peek();
			BehaviorProcess behavior = closure.behavior;
			FrameProcess frame = closure.frame;
			frame.frame.locals[closure.argumentOffset] = currentFrame.peek1();
			currentFrame.pop2();
			
//			ClosureProcess closure = (ClosureProcess)currentFrame.pop();
//			BehaviorProcess behavior = closure.behavior;
//			FrameProcess frame = closure.frame;
//			frame.frame.locals[closure.argumentOffset] = currentFrame.locals[1];
//			frame.frame.locals[closure.argumentOffset] = currentFrame.pop();
			currentFrame = new Frame(currentFrame, /*frame.frame.self,*/ frame.frame.locals, /*frame.frame.variables,*/ behavior.instructions, frame.frame.interfaceId, behavior.maxStackSize);
			
			break;
		} case Instruction.OPCODE_CALL_CLOSURE_2: {
			ClosureProcess closure = (ClosureProcess)currentFrame.peek();
			BehaviorProcess behavior = closure.behavior;
			FrameProcess frame = closure.frame;
			currentFrame.copyNInto(closure.argumentOffset, frame.frame.locals, 2, 1);
			currentFrame.pop3();
			
//			ClosureProcess closure = (ClosureProcess)currentFrame.pop();
//			BehaviorProcess behavior = closure.behavior;
//			FrameProcess frame = closure.frame;
//			frame.frame.locals[closure.argumentOffset + 1] = currentFrame.pop();
//			frame.frame.locals[closure.argumentOffset] = currentFrame.pop();
//			System.arraycopy(currentFrame.locals, 1 /*Ignore self*/, frame.frame.locals, closure.argumentOffset, 2);
			currentFrame = new Frame(currentFrame, /*frame.frame.self,*/ frame.frame.locals, /*frame.frame.variables,*/ behavior.instructions, frame.frame.interfaceId, behavior.maxStackSize);
			
			break;
		} case Instruction.OPCODE_CALL_CLOSURE_3: {
			ClosureProcess closure = (ClosureProcess)currentFrame.peek();
			BehaviorProcess behavior = closure.behavior;
			FrameProcess frame = closure.frame;
			currentFrame.copyNInto(closure.argumentOffset, frame.frame.locals, 3, 1);
			currentFrame.pop4();
			
//			ClosureProcess closure = (ClosureProcess)currentFrame.pop();
//			BehaviorProcess behavior = closure.behavior;
//			FrameProcess frame = closure.frame;
//			frame.frame.locals[closure.argumentOffset + 2] = currentFrame.pop();
//			frame.frame.locals[closure.argumentOffset + 1] = currentFrame.pop();
//			frame.frame.locals[closure.argumentOffset] = currentFrame.pop();
//			System.arraycopy(currentFrame.locals, 1 /*Ignore self*/, frame.frame.locals, closure.argumentOffset, 3);
			currentFrame = new Frame(currentFrame, /*frame.frame.self,*/ frame.frame.locals, /*frame.frame.variables,*/ behavior.instructions, frame.frame.interfaceId, behavior.maxStackSize);
			
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
//			currentFrame.stack.push(currentFrame.self);
			currentFrame.push(currentFrame.locals[0]);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_NULL: {
			currentFrame.push(singletonNil);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_LOC: {
			int ordinal = (int)instruction.operand1;
			Process value = currentFrame.locals[ordinal];
			currentFrame.push(value);
			currentFrame.instructionPointer++;
			
			break;
		}/* case Instruction.OPCODE_LOAD_ARG: {
			int ordinal = (int)instruction.operand1;
			Process value = currentFrame.arguments[ordinal];
			currentFrame.stack.push(value);
			currentFrame.instructionPointer++;
			
			break;
		}*/ case Instruction.OPCODE_LOAD_INT: {
			int intValue = (int)instruction.operand1;
			currentFrame.push(new IntegerProcess(protoInteger, intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_TRUE: {
			currentFrame.push(singletonTrue);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_FALSE: {
			currentFrame.push(singletonFalse);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_STRING: {
			String str = (String)instruction.operand1;
			StringProcess string = createString(str);
			currentFrame.push(string);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_THIS_FRAME: {
			currentFrame.push(currentFrame.getReifiedFrame(protoFrame));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_FRAME: {
			// May be unused
			FrameProcess frame = (FrameProcess)instruction.operand1;
			currentFrame.push(frame);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_BEHAVIOR: {
			BehaviorProcess behavior = (BehaviorProcess)instruction.operand1;
			currentFrame.push(behavior);
			currentFrame.instructionPointer++;
			
			break;
		}
		
		// Special opcodes
		case Instruction.OPCODE_SP_BOOLEAN_OR: {
			BooleanProcess rhs = (BooleanProcess)currentFrame.pop();
			BooleanProcess lhs = (BooleanProcess)currentFrame.pop();
			currentFrame.push(getBoolean(lhs.value || rhs.value));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_BOOLEAN_AND: {
			BooleanProcess rhs = (BooleanProcess)currentFrame.pop();
			BooleanProcess lhs = (BooleanProcess)currentFrame.pop();
			currentFrame.push(getBoolean(lhs.value && rhs.value));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_BOOLEAN_NOT: {
			BooleanProcess b = (BooleanProcess)currentFrame.peek();
			currentFrame.set0(getBoolean(!b.value));
			
//			BooleanProcess b = (BooleanProcess)currentFrame.pop();
//			currentFrame.push(getBoolean(!b.value));
			currentFrame.instructionPointer++;
			
			break;
		}  case Instruction.OPCODE_SP_ARRAY_GET: {
			IntegerProcess index = (IntegerProcess)currentFrame.pop();
			ArrayProcess array = (ArrayProcess)currentFrame.pop();
			currentFrame.push(array.get(index.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_ARRAY_SET: {
			Process value = currentFrame.pop();
			IntegerProcess index = (IntegerProcess)currentFrame.pop();
			ArrayProcess array = (ArrayProcess)currentFrame.pop();
			array.set(index.intValue, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_STRING_CONCAT: {
			StringProcess rhs = (StringProcess)currentFrame.peek();
			StringProcess lhs = (StringProcess)currentFrame.peek1();
			currentFrame.set1(createString(lhs.str + rhs.str));
			currentFrame.pop1();
			
//			StringProcess rhs = (StringProcess)currentFrame.pop();
//			StringProcess lhs = (StringProcess)currentFrame.pop();
//			StringProcess result = createString(lhs.str + rhs.str);
//			currentFrame.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_STRING_EQUAL: {
			StringProcess rhs = (StringProcess)currentFrame.pop();
			StringProcess lhs = (StringProcess)currentFrame.pop();
			currentFrame.push(getBoolean(lhs.str.equals(rhs.str)));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_ADD: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
			currentFrame.set1(new IntegerProcess(protoInteger, lhs.intValue + rhs.intValue));
			currentFrame.pop1();
			
//			IntegerProcess rhs = (IntegerProcess)currentFrame.pop();
//			IntegerProcess lhs = (IntegerProcess)currentFrame.pop();
//			currentFrame.push(new IntegerProcess(protoInteger, lhs.intValue + rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		}case Instruction.OPCODE_SP_INT_SUB: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.pop();
			currentFrame.push(new IntegerProcess(protoInteger, lhs.intValue - rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_MULT: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.pop();
			currentFrame.push(new IntegerProcess(protoInteger, lhs.intValue * rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_DIV: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.pop();
			currentFrame.push(new IntegerProcess(protoInteger, lhs.intValue / rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_REM: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.pop();
			currentFrame.push(new IntegerProcess(protoInteger, lhs.intValue % rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_EQUAL: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.pop();
			currentFrame.push(getBoolean(lhs.intValue == rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_GREATER: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.pop();
			currentFrame.push(getBoolean(lhs.intValue > rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_LESS: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
			currentFrame.set1(getBoolean(lhs.intValue < rhs.intValue));
			currentFrame.pop1();
			
//			IntegerProcess rhs = (IntegerProcess)currentFrame.pop();
//			IntegerProcess lhs = (IntegerProcess)currentFrame.pop();
//			currentFrame.push(getBoolean(lhs.intValue < rhs.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_TO_STRING: {
			IntegerProcess integer = (IntegerProcess)currentFrame.peek();
			currentFrame.set0(createString(Integer.toString(integer.intValue)));
			
//			IntegerProcess integer = (IntegerProcess)currentFrame.pop();
//			StringProcess result = createString(Integer.toString(integer.intValue));
//			currentFrame.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_FRAME_SENDER: {
			FrameProcess frame = (FrameProcess)currentFrame.peek();
			currentFrame.set0(frame.frame.sender.getReifiedFrame(protoFrame));
			
//			FrameProcess frame = (FrameProcess)currentFrame.pop();
//			currentFrame.push(frame.frame.sender.getReifiedFrame(protoFrame));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_FRAME_SET_SENDER: {
			FrameProcess newSender = (FrameProcess)currentFrame.pop();
			FrameProcess frame = (FrameProcess)currentFrame.pop();
			frame.frame.sender = newSender.frame;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_FRAME_RESUME: {
			Process value = currentFrame.peek();
			FrameProcess frame = (FrameProcess)currentFrame.peek1();
			currentFrame.pop2();
//			Process value = currentFrame.pop();
//			FrameProcess frame = (FrameProcess)currentFrame.pop();

			currentFrame = frame.frame;
			currentFrame.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_REF_EQUAL: {
			Process rhs = currentFrame.pop();
			Process lhs = currentFrame.pop();
			currentFrame.push(getBoolean(lhs == rhs));
			currentFrame.instructionPointer++;
			
			break;
		}
		
		case Instruction.OPCODE_SP_WRITE: {
			Object output = interactionHistory.nextOutputFor(currentFrame.getInterfaceId(), Instruction.OPCODE_SP_WRITE);
			if(output == null) {
				StringProcess value = (StringProcess)currentFrame.pop();
				System.out.print(value.str);
				interactionHistory.append(currentFrame.getInterfaceId(), instruction, instruction);
			} else {
				currentFrame.pop();
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
			
			currentFrame.push(string);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_DICT: {
			DictionaryProcess newDict = new DictionaryProcess();
			newDict.defineProto(SymbolTable.Codes.prototype, protoAny);
			currentFrame.push(newDict);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_ARRAY: {
			IntegerProcess length = (IntegerProcess)currentFrame.pop();
			ArrayProcess newArray = new ArrayProcess(length.intValue, singletonNil);
			newArray.defineProto(SymbolTable.Codes.prototype, protoArray);
			currentFrame.push(newArray);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_ARRAY_LENGTH: {
			ArrayProcess newArray = (ArrayProcess)currentFrame.pop();
			currentFrame.push(new IntegerProcess(protoInteger, newArray.length()));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_LOAD: {
			StringProcess pathSource = (StringProcess)currentFrame.pop();
			String path = pathSource.str;
			try {
				String sourcePath;
				String codePath;
				
				if(path.startsWith("/")) {
					sourcePath = currentPath + path + ".drs";
					codePath = currentPath + path + ".drr";
				} else {
					sourcePath = commonsPath + "/" + path + ".drs";
					codePath = commonsPath + "/" + path + ".drr";
				}
				
				Compiler_NEW compiler = new Compiler_NEW();
				CustomProcess customProcess = compiler.load(sourcePath, codePath);
				// Assumed to end with finish instruction. Replace finish with pop_frame.
				customProcess.currentFrame.instructions[customProcess.currentFrame.instructions.length - 1] = new Instruction(Instruction.OPCODE_RET_NONE);
				customProcess.currentFrame.locals = new Process[]{protoAny};
				currentFrame = new Frame(
					currentFrame, /*protoAny, */customProcess.currentFrame.locals, /*customProcess.currentFrame.variables.length, */customProcess.currentFrame.instructions, customProcess.currentFrame.interfaceId, customProcess.currentFrame.stack.length);
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
			
			break;
		} case Instruction.OPCODE_SP_NEW_CLOSURE: {
			int argumentOffset = (int)instruction.operand1;
			int parameterCount = (int)instruction.operand2;
			BehaviorProcess behavior = (BehaviorProcess)currentFrame.pop();
			ClosureProcess closure = new ClosureProcess(currentFrame.getReifiedFrame(protoFrame), behavior, argumentOffset, parameterCount);
			closure.defineProto(SymbolTable.Codes.prototype, closureBehavior);
			currentFrame.push(closure);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_BEHAVIOR: {
			int localCount = (int)instruction.operand1;
			int maxStackSize = (int)instruction.operand2;
			Instruction[] instructions = (Instruction[])instruction.operand3;
			BehaviorProcess behavior = new BehaviorProcess(localCount, maxStackSize, instructions);
			behavior.defineProto(SymbolTable.Codes.prototype, protoBehavior);
			currentFrame.push(behavior);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_CLONE: {
			DictionaryProcess dict = (DictionaryProcess)currentFrame.pop();
			DictionaryProcess clone = dict.clone();
			currentFrame.push(clone);
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
				
				Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stackToString());
				Debug.println(Debug.LEVEL_HIGH, "play: " + instruction);
				
				next(instruction, interactionHistory);
			}
		}

		if(currentFrame != null && currentFrame.stackSize() > 0)
			Debug.println(Debug.LEVEL_LOW, "stack isn't empty: " + currentFrame.stackToString());
		
		if(currentFrame != null)
			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stackToString());

		Debug.println(Debug.LEVEL_HIGH, "/play");
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

	@Override
	public Iterator<Object> iterator() {
		return null;
	}
	
//	@Override
//	public BehaviorProcess createBehavior(int parameterCount, int variableCount, Instruction[] instructions) {
//		BehaviorProcess behavior = new BehaviorProcess(parameterCount, variableCount, instructions);
//		behavior.defineProto(SymbolTable.Codes.prototype, protoBehavior);
//		return behavior;
//	}
	
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
