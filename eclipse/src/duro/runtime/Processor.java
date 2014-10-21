package duro.runtime;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import duro.debugging.Debug;
import duro.reflang.Compiler;
import duro.reflang.SymbolTable;

public class Processor {
	private static final Instruction[] FORWARD_CALL_INSTRUCTIONS = new Instruction[] {
		new Instruction(Instruction.OPCODE_FORWARD_CALL)/*,
		new Instruction(Instruction.OPCODE_RET_FORWARD)*/
	};

	public static class Frame implements Serializable {
		private static class InterfaceId implements Serializable {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private int depth;
			private String id;
			
			public InterfaceId() { }

			private InterfaceId(int depth, String id) {
				this.depth = depth;
				this.id = id;
			}

			public InterfaceId extend(String id) {
				String newId = depth == 0 ? id : this.id;
				return new InterfaceId(depth + 1, newId);
			}
			
			public InterfaceId shrink() {
				String newId = depth == 0 ? null : this.id;
				return new InterfaceId(depth - 1, newId);
			}
			
			public String build() {
				return id;
			}
			
			public boolean shouldMemorize() {
				return depth == 1;
			}
		}
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public Frame sender;
		public Process[] locals;
		
		public final Instruction[] instructions;
		public int instructionPointer;
		public FrameProcess reification; 
		
		public InterfaceId interfaceId;
		private Process[] stack;
		private int stackSize;
		private Process handler;
		
		public Frame(Frame sender, Process[] locals, Instruction[] instructions, InterfaceId interfaceId, int maxStackSize) {
			this.sender = sender;
			this.locals = locals;
			this.instructions = instructions;
			this.interfaceId = interfaceId;
			stackSize = 0;
			stack = new Process[maxStackSize];
		}
		
		public Frame(Frame sender, Process[] locals, Instruction[] instructions, InterfaceId interfaceId, int maxStackSize, Process handler) {
			this.sender = sender;
			this.locals = locals;
			this.instructions = instructions;
			this.interfaceId = interfaceId;
			stackSize = 0;
			stack = new Process[maxStackSize];
			this.handler = handler;
		}
		
		public final Frame getNearestFrameWithHandler() {
			return handler != null ? this : sender.getNearestFrameWithHandler();
		}
		
		public final FrameProcess getReifiedFrame(Process protoFrame) {
			if(reification == null)
				reification = new FrameProcess(protoFrame, this);
			
			return reification;
		}
		
		public final void extendInterfaceId(String id) {
			interfaceId = interfaceId.extend(id);
		}
		
		public final void shrinkInterfaceId() {
			interfaceId = interfaceId.shrink();
		}
		
		public final boolean shouldMemorize() {
			return interfaceId.shouldMemorize();
		}
		
		public final String getInterfaceId() {
			return interfaceId.build();
		}
		
		public final Process pop() {
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
			stack[stackSize] = p;
			stackSize++;
		}

		public final void stackAdd(int index, Process p) {
			for(int i = stackSize - 1; i >= index; i--)
				stack[i + 1] = stack[i];
			stack[index] = p;
			stackSize++;
		}

		public final String stackToString() {
			return Arrays.toString(stack);
		}

		public final int stackSize() {
			return stackSize;
		}

		public final Process peek() {
			return stack[stackSize - 1];
		}
		
		public final void dup() {
			stack[stackSize] = stack[stackSize - 1];
			stackSize++;
		}
		
		public final void dup1() {
			stack[stackSize] = stack[stackSize - 1];
			stack[stackSize - 1] = stack[stackSize - 2];
			stack[stackSize - 2] = stack[stackSize];
			stackSize++;
		}

		public final Process peek1() {
			return stack[stackSize - 2];
		}

		public final Process peek2() {
			return stack[stackSize - 3];
		}

		public final Process stackGet(int i) {
			return stack[i];
		}

		public final void stackSet(int i, Process p) {
			stack[i] = p;
		}
	}
	
	private Frame currentFrame;
	private DictionaryProcess protoAny;
	private NilProcess singletonNil;
	private BooleanProcess singletonTrue;
	private BooleanProcess singletonFalse;
	private DictionaryProcess protoInteger;
	private DictionaryProcess protoArray;
	private DictionaryProcess protoString;
	private DictionaryProcess protoFrame;
	private DictionaryProcess protoBehavior;
	private DictionaryProcess closureBehavior;

	public Processor(int localCount, int maxStackSize, Instruction[] instructions) {
		// TODO: Consider: Should the Any prototype be this? Should CustomProcess be a DictionaryProcess?
		// Should CustomProcess not be a process at all? Should CustomProcess hold any and push it instead this?  - Also at other locations, e.g. when loading.
		// Add Any prototype
		protoAny = new DictionaryProcess();
		protoAny.defineShared(SymbolTable.Codes.Any, protoAny);
		// Add Null singleton
		singletonNil = new NilProcess();
		singletonNil.defineProto(SymbolTable.Codes.prototype, protoAny);
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
		// Add Error handler
		DictionaryProcess singletonErrorHandler = protoAny.clone();
		singletonErrorHandler.define(SymbolTable.Codes.call_2, new BehaviorProcess(protoBehavior, new FrameInfo(3, 2, new Instruction[] {
			// Report uncaught signal as error
			new Instruction(Instruction.OPCODE_LOAD_LOC, 1), // Load signal
			new Instruction(Instruction.OPCODE_LOAD_LOC, 2), // Load frame
			new Instruction(Instruction.OPCODE_REPORT_ERROR),
			new Instruction(Instruction.OPCODE_FINISH)
		})));
		
		Process[] locals = new Process[localCount];
		locals[0] = protoAny;
		currentFrame = new Frame(null, /*protoAny, */locals, instructions, new Frame.InterfaceId(), maxStackSize, singletonErrorHandler);
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

		while(true) {
			try {
				if(currentFrame != null) {
					while(!stopRequested) {
						Instruction instruction = currentFrame.instructions[currentFrame.instructionPointer];
						
						if(Debug.maxLevel >= Debug.LEVEL_HIGH) {
							Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stackToString());
							Debug.println(Debug.LEVEL_HIGH, "play: " + instruction);
						}
						
						next(instruction, interactionHistory);
					}
					break;
				}
			} catch(Exception e) {
				DictionaryProcess signal = protoAny.clone();
				NativeObjectHolder eHolder = new NativeObjectHolder(e);
				signal.define(SymbolTable.Codes.cause, eHolder);
				signal.define(SymbolTable.Codes.message, new StringProcess(protoString, e.getMessage()));
				signal(signal, currentFrame.getReifiedFrame(protoFrame));
			}
		}
		
		if(currentFrame != null)
			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stackToString());
		
		Debug.println(Debug.LEVEL_HIGH, "/replay");
	}
	
	private final void signal(Process signal, FrameProcess frame) {
		Frame nearestFrameWithHandler = frame.frame.getNearestFrameWithHandler();
		Instruction[] signalInstructions = new Instruction[] {
			new Instruction(Instruction.OPCODE_LOAD_LOC, 0),
			new Instruction(Instruction.OPCODE_LOAD_LOC, 1),
			new Instruction(Instruction.OPCODE_LOAD_LOC, 2),
			new Instruction(Instruction.OPCODE_SEND_CODE_2, SymbolTable.Codes.call_2),
			new Instruction(Instruction.OPCODE_RET),
		};
		currentFrame = 
			new Frame(nearestFrameWithHandler.sender, new Process[] {nearestFrameWithHandler.handler, signal, frame}, signalInstructions, nearestFrameWithHandler.interfaceId, 3);
	}
	
	private boolean stopRequested;
	
	private final void next(Instruction instruction, InteractionHistory interactionHistory) {
		switch(instruction.opcode) {
		case Instruction.OPCODE_PAUSE: {
			if(currentFrame.shouldMemorize()) {
				Object output = interactionHistory.nextOutputFor(currentFrame.getInterfaceId(), Instruction.OPCODE_PAUSE);
				if(output == null) {
					stopRequested = true;
					interactionHistory.append(currentFrame.getInterfaceId(), instruction, singletonTrue.toSerializable());
				} else {
				}
			} else {
				throw new RuntimeException("Can only pause in memorize states.");
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
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_DUP1: {
			currentFrame.dup1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_STORE_LOC: {
			int ordinal = (int)instruction.operand1;
			Process value = currentFrame.pop();
			currentFrame.locals[ordinal] = value;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_POP: {
			currentFrame.pop1();
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
				
				Process[] locals = new Process[behavior.frameInfo.localCount];
				
				locals[0] = receiver;
				currentFrame.copyNInto(1, locals, argumentCount);
				currentFrame.popN(argumentCount + 1); // Pop arguments and receiver
				
				currentFrame = new Frame(currentFrame, locals, behavior.frameInfo.instructions, currentFrame.interfaceId, behavior.frameInfo.maxStackSize);
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
				
				currentFrame = new Frame(currentFrame, locals, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
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
				Process[] locals = new Process[behavior.frameInfo.localCount];
				locals[0] = receiver;
				
				currentFrame = new Frame(currentFrame, locals, behavior.frameInfo.instructions, currentFrame.interfaceId, behavior.frameInfo.maxStackSize);
			} else if(callable != null) {
				// Send some kind of generic call message?
				Process[] locals = new Process[1];
				
				Process process = (Process)callable;
				locals[0] = process;
				
				currentFrame = new Frame(currentFrame, locals, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
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
				Process[] locals = new Process[behavior.frameInfo.localCount];
				locals[0] = receiver;
				currentFrame.copy1Into(1, locals);
				currentFrame.pop2(); // Pop arguments and receiver
				
				currentFrame = new Frame(currentFrame, locals, behavior.frameInfo.instructions, currentFrame.interfaceId, behavior.frameInfo.maxStackSize);
			} else if(callable != null) {
				// Send some kind of generic call message?
				Process[] locals = new Process[2];
				locals[1] = currentFrame.pop();
				currentFrame.pop();
				
				Process process = (Process)callable;
				locals[0] = process;
				
				currentFrame = new Frame(currentFrame, locals, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
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
				Process[] locals = new Process[behavior.frameInfo.localCount];
				locals[0] = receiver;
				currentFrame.copy2Into(1, locals);
				currentFrame.pop3(); // Pop arguments and receiver
				
				currentFrame = new Frame(currentFrame, locals, behavior.frameInfo.instructions, currentFrame.interfaceId, behavior.frameInfo.maxStackSize);
			} else if(callable != null) {
				// Send some kind of generic call message?
				Process[] locals = new Process[3];
				locals[2] = currentFrame.pop();
				locals[1] = currentFrame.pop();
				currentFrame.pop(); // Pop receiver
				
				Process process = (Process)callable;
				locals[0] = process;
				
				currentFrame = new Frame(currentFrame, locals, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
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
				Process[] locals = new Process[behavior.frameInfo.localCount];
				locals[0] = receiver;
				currentFrame.copy3Into(1, locals);
				currentFrame.pop4(); // Pop arguments and receiver
				
				currentFrame = new Frame(currentFrame, locals, behavior.frameInfo.instructions, currentFrame.interfaceId, behavior.frameInfo.maxStackSize);
			} else if(callable != null) {
				// Send some kind of generic call message?
				Process[] locals = new Process[4];
				locals[3] = currentFrame.pop();
				locals[2] = currentFrame.pop();
				locals[1] = currentFrame.pop();
				currentFrame.pop(); // Pop receiver
				
				Process process = (Process)callable;
				locals[0] = process;
				
				currentFrame = new Frame(currentFrame, locals, FORWARD_CALL_INSTRUCTIONS, currentFrame.interfaceId, 0);
			} else {
				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(code) + "'.");
			}
			
			break;
		} case Instruction.OPCODE_RET: {
			Frame returnFrame = currentFrame.sender;
			returnFrame.push(currentFrame.peek());
			currentFrame = returnFrame;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_RET_NONE: {
			currentFrame = currentFrame.sender;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_IF_TRUE: {
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
			Process value = currentFrame.peek();
			Process receiver = (Process)currentFrame.peek1();
			currentFrame.pop2();
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
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_SET: {
			Process value = currentFrame.peek();
			StringProcess key = (StringProcess)currentFrame.peek1();
			Process receiver = (Process)currentFrame.peek2();
			currentFrame.pop3();
			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
			receiver.define(code, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_SET_PROTO: {
			Process value = currentFrame.peek();
			StringProcess key = (StringProcess)currentFrame.peek1();
			Process receiver = (Process)currentFrame.peek2();
			currentFrame.pop3();
			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
			receiver.defineProto(code, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_GET: {
			StringProcess key = (StringProcess)currentFrame.peek();
			Process receiver = (Process)currentFrame.peek1();
			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
			Process value = receiver.lookup(code);
			currentFrame.set1(value);
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_IS_DEFINED: {
			StringProcess key = (StringProcess)currentFrame.peek();
			Process receiver = (Process)currentFrame.peek1();
			int code = symbolTable.getSymbolCodeFromId(Selector.get(key.str));
			Process value = receiver.lookup(code);
			currentFrame.set1(getBoolean(value != null));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SLOTS_NAMES: {
			Process receiver = (Process)currentFrame.peek();
			String[] rawNames = receiver.getNames();
			Process[] names = new Process[rawNames.length];
			for(int i = 0; i < names.length; i++)
				names[i] = createString(rawNames[i]);
			ArrayProcess namesArray = new ArrayProcess(names);
			namesArray.defineProto(SymbolTable.Codes.prototype, protoArray);
			currentFrame.set0(namesArray);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_CALL_CLOSURE: {
			ClosureProcess closure = (ClosureProcess)currentFrame.peek();
			BehaviorProcess behavior = closure.behavior;
			FrameProcess frame = closure.frame;
			currentFrame.copyNInto(closure.argumentOffset, frame.frame.locals, closure.parameterCount, 1);
			currentFrame.popN(closure.parameterCount);
			currentFrame = new Frame(currentFrame, frame.frame.locals, behavior.frameInfo.instructions, frame.frame.interfaceId, behavior.frameInfo.maxStackSize);
			
			break;
		} case Instruction.OPCODE_CALL_CLOSURE_0: {
			ClosureProcess closure = (ClosureProcess)currentFrame.pop();
			BehaviorProcess behavior = closure.behavior;
			FrameProcess frame = closure.frame;
			currentFrame = new Frame(currentFrame, frame.frame.locals, behavior.frameInfo.instructions, frame.frame.interfaceId, behavior.frameInfo.maxStackSize);
			
			break;
		} case Instruction.OPCODE_CALL_CLOSURE_1: {
			ClosureProcess closure = (ClosureProcess)currentFrame.peek();
			BehaviorProcess behavior = closure.behavior;
			FrameProcess frame = closure.frame;
			frame.frame.locals[closure.argumentOffset] = currentFrame.peek1();
			currentFrame.pop2();
			currentFrame = new Frame(currentFrame, frame.frame.locals, behavior.frameInfo.instructions, frame.frame.interfaceId, behavior.frameInfo.maxStackSize);
			
			break;
		} case Instruction.OPCODE_CALL_CLOSURE_2: {
			ClosureProcess closure = (ClosureProcess)currentFrame.peek();
			BehaviorProcess behavior = closure.behavior;
			FrameProcess frame = closure.frame;
			currentFrame.copyNInto(closure.argumentOffset, frame.frame.locals, 2, 1);
			currentFrame.pop3();
			currentFrame = new Frame(currentFrame, frame.frame.locals, behavior.frameInfo.instructions, frame.frame.interfaceId, behavior.frameInfo.maxStackSize);
			
			break;
		} case Instruction.OPCODE_CALL_CLOSURE_3: {
			ClosureProcess closure = (ClosureProcess)currentFrame.peek();
			BehaviorProcess behavior = closure.behavior;
			FrameProcess frame = closure.frame;
			currentFrame.copyNInto(closure.argumentOffset, frame.frame.locals, 3, 1);
			currentFrame.pop4();
			currentFrame = new Frame(currentFrame, frame.frame.locals, behavior.frameInfo.instructions, frame.frame.interfaceId, behavior.frameInfo.maxStackSize);
			
			break;
		} case Instruction.OPCODE_EXTEND_INTER_ID: {
			String id = (String)instruction.operand1;
			currentFrame.extendInterfaceId(id);
			if(currentFrame.shouldMemorize()) {
				// What if the interface id is not an expression? Just jump?
				
				// Try to read memorized value
				Object memorization = interactionHistory.nextOutputFor(currentFrame.getInterfaceId(), -1);
				if(memorization != null) {
					Process memorizationAsProcess;
					if(memorization instanceof String)
						memorizationAsProcess = new StringProcess(protoString, (String)memorization);
					else if(memorization instanceof Integer)
						memorizationAsProcess = new IntegerProcess(protoInteger, (int)memorization);
					else if(memorization instanceof Boolean)
						memorizationAsProcess = getBoolean((boolean)memorization);
					else if(memorization instanceof NilProcess.Serialization) {
						memorizationAsProcess = singletonNil;
					} else {
						throw new RuntimeException("Could not deserialize: " + memorization);
					}
					
					// If a memorized value could be found, push it, jump, and shrink
					currentFrame.push(memorizationAsProcess);
					int shrinkPairJump = (int)instruction.operand2;
					currentFrame.instructionPointer += shrinkPairJump;
					currentFrame.shrinkInterfaceId();
				}
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SHRINK_INTER_ID: {
			if(currentFrame.shouldMemorize()) {
				Process toMemorize = currentFrame.peek();
				Object toMemorizeSerialized = toMemorize.toSerializable();
				interactionHistory.append(currentFrame.getInterfaceId(), null, toMemorizeSerialized);
			}
			currentFrame.shrinkInterfaceId();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_THIS: {
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
		} case Instruction.OPCODE_LOAD_INT: {
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
		} case Instruction.OPCODE_LOAD_BEHAVIOR: {
			BehaviorProcess behavior = (BehaviorProcess)instruction.operand1;
			currentFrame.push(behavior);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_DO_HANDLE: {
			Process handler = currentFrame.peek();
			Process attempt = currentFrame.peek1();
			currentFrame.pop2();
			
			Object callable = attempt.getCallable(SymbolTable.Codes.call);
			if(callable instanceof BehaviorProcess) {
				BehaviorProcess behavior = (BehaviorProcess)callable;
				Process[] locals = new Process[behavior.frameInfo.localCount];
				locals[0] = attempt;
				
				currentFrame = new Frame(currentFrame, locals, behavior.frameInfo.instructions, currentFrame.interfaceId, behavior.frameInfo.maxStackSize, handler);
			} else if(callable != null) {
				// Send some kind of generic call message?
				Process[] locals = new Process[1];
				
				Process process = (Process)callable;
				locals[0] = process;
				
				Instruction[] forwardMessageInstructions = new Instruction[] {
					new Instruction(Instruction.OPCODE_LOAD_LOC, 0),
					new Instruction(Instruction.OPCODE_SEND_CODE_0, SymbolTable.Codes.call)
				};
				currentFrame = new Frame(currentFrame, locals, forwardMessageInstructions, currentFrame.interfaceId, 0);
			} else {
				throw new RuntimeException("Cache-miss and absent callable for '" + symbolTable.getIdFromSymbolCode(SymbolTable.Codes.call) + "'.");
			}
			
			break;
		} case Instruction.OPCODE_REPORT_ERROR: {
			@SuppressWarnings("unused")
			FrameProcess frame = (FrameProcess)currentFrame.peek();
			Process signal = (Process)currentFrame.peek1();
			StringProcess message = (StringProcess)signal.lookup(SymbolTable.Codes.message);
			// Look up, and print, message slot which must be a string
			System.err.println("Error: " + message.str);
			currentFrame.instructionPointer++;
			
			break;
		}
		
		// Special opcodes
		case Instruction.OPCODE_SP_BOOLEAN_OR: {
			BooleanProcess rhs = (BooleanProcess)currentFrame.peek();
			BooleanProcess lhs = (BooleanProcess)currentFrame.peek1();
			currentFrame.set1(getBoolean(lhs.value || rhs.value));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_BOOLEAN_AND: {
			BooleanProcess rhs = (BooleanProcess)currentFrame.peek();
			BooleanProcess lhs = (BooleanProcess)currentFrame.peek1();
			currentFrame.set1(getBoolean(lhs.value && rhs.value));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_BOOLEAN_NOT: {
			BooleanProcess b = (BooleanProcess)currentFrame.peek();
			currentFrame.set0(getBoolean(!b.value));
			currentFrame.instructionPointer++;
			
			break;
		}  case Instruction.OPCODE_SP_ARRAY_GET: {
			IntegerProcess index = (IntegerProcess)currentFrame.peek();
			ArrayProcess array = (ArrayProcess)currentFrame.peek1();
			currentFrame.set1(array.get(index.intValue));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_ARRAY_SET: {
			Process value = currentFrame.peek();
			IntegerProcess index = (IntegerProcess)currentFrame.peek1();
			ArrayProcess array = (ArrayProcess)currentFrame.peek2();
			currentFrame.pop3();
			array.set(index.intValue, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_STRING_CONCAT: {
			StringProcess rhs = (StringProcess)currentFrame.peek();
			StringProcess lhs = (StringProcess)currentFrame.peek1();
			currentFrame.set1(createString(lhs.str + rhs.str));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_STRING_EQUAL: {
			StringProcess rhs = (StringProcess)currentFrame.peek();
			StringProcess lhs = (StringProcess)currentFrame.peek1();
			currentFrame.set1(getBoolean(lhs.str.equals(rhs.str)));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_ADD: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
			currentFrame.set1(new IntegerProcess(protoInteger, lhs.intValue + rhs.intValue));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		}case Instruction.OPCODE_SP_INT_SUB: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
			currentFrame.set1(new IntegerProcess(protoInteger, lhs.intValue - rhs.intValue));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_MULT: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
			currentFrame.set1(new IntegerProcess(protoInteger, lhs.intValue * rhs.intValue));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_DIV: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
			currentFrame.set1(new IntegerProcess(protoInteger, lhs.intValue / rhs.intValue));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_REM: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
			currentFrame.set1(new IntegerProcess(protoInteger, lhs.intValue % rhs.intValue));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_EQUAL: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
			currentFrame.set1(getBoolean(lhs.intValue == rhs.intValue));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_GREATER: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
			currentFrame.set1(getBoolean(lhs.intValue > rhs.intValue));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_LESS: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.peek();
			IntegerProcess lhs = (IntegerProcess)currentFrame.peek1();
			currentFrame.set1(getBoolean(lhs.intValue < rhs.intValue));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_TO_STRING: {
			IntegerProcess integer = (IntegerProcess)currentFrame.peek();
			currentFrame.set0(createString(Integer.toString(integer.intValue)));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_FRAME_SENDER: {
			FrameProcess frame = (FrameProcess)currentFrame.peek();
			currentFrame.set0(frame.frame.sender.getReifiedFrame(protoFrame));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_FRAME_SET_SENDER: {
			FrameProcess newSender = (FrameProcess)currentFrame.peek();
			FrameProcess frame = (FrameProcess)currentFrame.peek1();
			currentFrame.pop2();
			frame.frame.sender = newSender.frame;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_FRAME_RESUME: {
			Process value = currentFrame.peek();
			FrameProcess frame = (FrameProcess)currentFrame.peek1();
			currentFrame.pop2();
			currentFrame = frame.frame;
			currentFrame.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_REF_EQUAL: {
			Process rhs = currentFrame.peek();
			Process lhs = currentFrame.peek1();
			currentFrame.set1(getBoolean(lhs == rhs));
			currentFrame.pop1();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_DICT: {
			DictionaryProcess newDict = new DictionaryProcess();
			newDict.defineProto(SymbolTable.Codes.prototype, protoAny);
			currentFrame.push(newDict);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_ARRAY: {
			IntegerProcess length = (IntegerProcess)currentFrame.peek();
			ArrayProcess newArray = new ArrayProcess(length.intValue, singletonNil);
			newArray.defineProto(SymbolTable.Codes.prototype, protoArray);
			currentFrame.set0(newArray);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_ARRAY_LENGTH: {
			ArrayProcess newArray = (ArrayProcess)currentFrame.peek();
			currentFrame.set0(new IntegerProcess(protoInteger, newArray.length()));
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
				
				Compiler compiler = new Compiler();
				FrameInfo processFrame = compiler.load(sourcePath, codePath);
				// Assumed to end with finish instruction. Replace finish with pop_frame.
				processFrame.instructions[processFrame.instructions.length - 1] = new Instruction(Instruction.OPCODE_RET_NONE);
				Process[] locals = new Process[processFrame.localCount];
				locals[0] = protoAny;
//				customProcess.currentFrame.locals = new Process[]{protoAny};
				currentFrame = new Frame(
					currentFrame, locals, processFrame.instructions, currentFrame.interfaceId, processFrame.maxStackSize);
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
			
			break;
		} case Instruction.OPCODE_SP_NEW_CLOSURE: {
			int argumentOffset = (int)instruction.operand1;
			int parameterCount = (int)instruction.operand2;
			
			BehaviorProcess behavior = (BehaviorProcess)currentFrame.peek();
			ClosureProcess closure = new ClosureProcess(closureBehavior, currentFrame.getReifiedFrame(protoFrame), behavior, argumentOffset, parameterCount);
			currentFrame.set0(closure);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_BEHAVIOR: {
			int localCount = (int)instruction.operand1;
			int maxStackSize = (int)instruction.operand2;
			Instruction[] instructions = (Instruction[])instruction.operand3;
			BehaviorProcess behavior = new BehaviorProcess(protoBehavior, new FrameInfo(localCount, maxStackSize, instructions));
			currentFrame.push(behavior);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_CLONE: {
			DictionaryProcess dict = (DictionaryProcess)currentFrame.peek();
			DictionaryProcess clone = dict.clone();
			currentFrame.set0(clone);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_NATIVE_CLASS_FIELD: {
			String className = (String)instruction.operand1;
			String fieldName = (String)instruction.operand2;
			try {
				Class<?> theClass = Class.forName(className);
				Field field = theClass.getField(fieldName);
				if(field.getType().equals(int.class))
					currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_NATIVE_CLASS_FIELD_INT, field);
				else if(field.getType().equals(String.class))
					currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_NATIVE_CLASS_FIELD_STRING, field);
				else
					currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_NATIVE_CLASS_FIELD_OTHER, field);
			} catch (ClassNotFoundException | NoSuchFieldException | SecurityException e) {
				// Call handler
				e.printStackTrace();
				currentFrame.instructionPointer++;
			}
			
			break;
		} case Instruction.OPCODE_NATIVE_CLASS_FIELD_INT: {
			Field field = (Field)instruction.operand1;
			try {
				int nativeObject = field.getInt(null);
				currentFrame.push(new IntegerProcess(protoInteger, nativeObject));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// Call handler
				currentFrame.push(new IntegerProcess(protoInteger, 0));
				e.printStackTrace();
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_NATIVE_CLASS_FIELD_STRING: {
			Field field = (Field)instruction.operand1;
			try {
				String nativeObject = (String)field.get(null);
				currentFrame.push(new StringProcess(protoString, nativeObject));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// Call handler
				currentFrame.push(new StringProcess(protoString, ""));
				e.printStackTrace();
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_NATIVE_CLASS_FIELD_OTHER: {
			Field field = (Field)instruction.operand1;
			try {
				Object nativeObject = field.get(null);
				currentFrame.push(wrapNativeObject(nativeObject));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// Call handler
				currentFrame.push(singletonNil);
				e.printStackTrace();
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_NATIVE_INSTANCE_INVOKE: {
			String className = (String)instruction.operand1;
			String methodName = (String)instruction.operand2;
			String[] methodParameters = (String[])instruction.operand3;
			try {
				Class<?> theClass = Class.forName(className);
				Class<?>[] parameterTypes = new Class<?>[methodParameters.length];
				for(int i = 0; i < methodParameters.length; i++)
					parameterTypes[i] = Class.forName(methodParameters[0]);
				Method method = theClass.getMethod(methodName, parameterTypes);
				if(method.getReturnType().equals(int.class))
					currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_NATIVE_INSTANCE_INVOKE_INT, method);
				else if(method.getReturnType().equals(String.class))
					currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_NATIVE_INSTANCE_INVOKE_STRING, method);
				else
					currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_NATIVE_INSTANCE_INVOKE_OTHER, method);
			} catch (ClassNotFoundException | NoSuchMethodException | SecurityException e) {
				// Call handler
				e.printStackTrace();
				currentFrame.instructionPointer++;
			}
			
			break;
		} case Instruction.OPCODE_NATIVE_INSTANCE_INVOKE_INT: {
			Method method = (Method)instruction.operand1;
			Object[] arguments = new Object[method.getParameterCount()];
			for(int i = method.getParameterCount() - 1; i >= 0; i--) {
				NativeInteroperable nativeInteroperable = (NativeInteroperable)currentFrame.pop();
				arguments[i] = nativeInteroperable.getNativeObject();
			}
			NativeInteroperable receiver = (NativeInteroperable)currentFrame.pop();
			Object nativeReceiver = receiver.getNativeObject();
			try {
				int nativeObject = (int)method.invoke(nativeReceiver, arguments);
				currentFrame.push(new IntegerProcess(protoInteger, nativeObject));
			} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
				// Call handler
				currentFrame.push(new IntegerProcess(protoInteger, 0));
				e.printStackTrace();
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_NATIVE_INSTANCE_INVOKE_STRING: {
			Method method = (Method)instruction.operand1;
			Object[] arguments = new Object[method.getParameterCount()];
			for(int i = method.getParameterCount() - 1; i >= 0; i--) {
				NativeInteroperable nativeInteroperable = (NativeInteroperable)currentFrame.pop();
				arguments[i] = nativeInteroperable.getNativeObject();
			}
			NativeInteroperable receiver = (NativeInteroperable)currentFrame.pop();
			Object nativeReceiver = receiver.getNativeObject();
			try {
				String nativeObject = (String)method.invoke(nativeReceiver, arguments);
				currentFrame.push(new StringProcess(protoString, nativeObject));
			} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
				// Call handler
				currentFrame.push(new StringProcess(protoString, ""));
				e.printStackTrace();
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_NATIVE_INSTANCE_INVOKE_OTHER: {
			Method method = (Method)instruction.operand1;
			Object[] arguments = new Object[method.getParameterCount()];
			for(int i = method.getParameterCount() - 1; i >= 0; i--) {
				NativeInteroperable nativeInteroperable = (NativeInteroperable)currentFrame.pop();
				arguments[i] = nativeInteroperable.getNativeObject();
			}
			NativeInteroperable receiver = (NativeInteroperable)currentFrame.pop();
			Object nativeReceiver = receiver.getNativeObject();
			try {
				Object nativeObject = method.invoke(nativeReceiver, arguments);
				currentFrame.push(wrapNativeObject(nativeObject));
			} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
				// Call handler
				currentFrame.push(singletonNil);
				e.printStackTrace();
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_NATIVE_NEW_INSTANCE: {
			String className = (String)instruction.operand1;
			String[] methodParameters = (String[])instruction.operand2;
			try {
				Class<?> theClass = Class.forName(className);
				Class<?>[] parameterTypes = new Class<?>[methodParameters.length];
				for(int i = 0; i < methodParameters.length; i++)
					parameterTypes[i] = Class.forName(methodParameters[0]);
				Constructor<?> constructor = theClass.getConstructor(parameterTypes);
				if(theClass.equals(String.class))
					currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_NATIVE_NEW_INSTANCE_STRING, constructor);
				else
					currentFrame.instructions[currentFrame.instructionPointer] = new Instruction(Instruction.OPCODE_NATIVE_NEW_INSTANCE_OTHER, constructor);
			} catch (ClassNotFoundException | NoSuchMethodException | SecurityException e) {
				// Call handler
				e.printStackTrace();
				currentFrame.instructionPointer++;
			}
			
			break;
		} case Instruction.OPCODE_NATIVE_NEW_INSTANCE_STRING: {
			Constructor<?> constructor = (Constructor<?>)instruction.operand1;
			Object[] arguments = new Object[constructor.getParameterCount()];
			for(int i = constructor.getParameterCount() - 1; i >= 0; i--) {
				NativeInteroperable nativeInteroperable = (NativeInteroperable)currentFrame.pop();
				arguments[i] = nativeInteroperable.getNativeObject();
			}
			try {
				String nativeObject = (String)constructor.newInstance(arguments);
				currentFrame.push(new StringProcess(protoString, nativeObject));
			} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
				// Call handler
				currentFrame.push(new StringProcess(protoString, ""));
				e.printStackTrace();
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_NATIVE_NEW_INSTANCE_OTHER: {
			Constructor<?> constructor = (Constructor<?>)instruction.operand1;
			Object[] arguments = new Object[constructor.getParameterCount()];
			for(int i = constructor.getParameterCount() - 1; i >= 0; i--) {
				NativeInteroperable nativeInteroperable = (NativeInteroperable)currentFrame.pop();
				arguments[i] = nativeInteroperable.getNativeObject();
			}
			try {
				Object nativeObject = constructor.newInstance(arguments);
				currentFrame.push(wrapNativeObject(nativeObject));
			} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
				// Call handler
				currentFrame.push(singletonNil);
				e.printStackTrace();
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_NONE: {
			currentFrame.instructionPointer++;
			break;
		} case Instruction.OPCODE_BREAK_POINT: {
			currentFrame.instructionPointer++;
			break;
		}
		}
	}

	private Process wrapNativeObject(Object nativeObject) {
		return nativeObject != null ? new NativeObjectHolder(nativeObject) : singletonNil;
	}

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
	
	public final BooleanProcess getBoolean(boolean value) {
		return value ? singletonTrue : singletonFalse;
	}

	public final StringProcess createString(String str) {
		return new StringProcess(protoString, str);
	}
}
