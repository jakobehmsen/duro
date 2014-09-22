package duro.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import duro.debugging.Debug;
import duro.transcriber.Journal;
import duro.transcriber.Player;

public class CustomProcess extends Process implements Iterable<Object>, ProcessFactory, Player<InteractionHistory.Interaction> {
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
		
		public Frame(Frame sender, Process self, Process[] arguments, int variableCount, Instruction[] instructions) {
			this.sender = sender;
			this.self = self;
			this.arguments = arguments;
			variables = new Process[variableCount];
			this.instructions = instructions;
			reificationHandle = new Handle();
		}
		
		public Frame(Frame sender, Process self, Process[] arguments, Process[] variables, Instruction[] instructions) {
			this.sender = sender;
			this.self = self;
			this.arguments = arguments;
			this.variables = variables;
			this.instructions = instructions;
			reificationHandle = new Handle();
		}
		
		public final FrameProcess getReifiedFrame(Process any) {
			if(reificationHandle.value == null) {
				reificationHandle.value = new FrameProcess(this);
				reificationHandle.value.defineProto("prototype", any.lookup("Frame"));
			}
			
			return reificationHandle.value;
		}
	}
	
	private Frame rootFrame;
	private Frame currentFrame;
//	private Stack<Frame> frameStack = new Stack<Frame>();
	private DictionaryProcess any;

	public CustomProcess(int parameterCount, int variableCount, Instruction[] instructions) {
		// TODO: Consider: Should the Any prototype be this? Should CustomProcess be a DictionaryProcess?
		// Should CustomProcess not be a process at all? Should CustomProcess hold any and push it instead this?  - Also at other locations, e.g. when loading.
		// Add Any prototype
		any = new DictionaryProcess();
		any.defineShared("Any", any);
		// Add Null singleton
		any.defineShared("Null", any.clone());
		// Add boolean True singleton
		BooleanProcess t = new BooleanProcess(true);
		t.defineShared("prototype", any);
		any.defineShared("True", t);
		// Add boolean False singleton
		BooleanProcess f = new BooleanProcess(false);
		f.defineShared("prototype", any);
		any.defineShared("False", f);
		any.defineShared("Array", any.clone());
		// Add String prototype
		any.defineShared("String", any.clone());
		// Add Integer prototype
		any.defineShared("Integer", any.clone());
		// Add Frame prototype
		any.defineShared("Frame", any.clone());
		// Add Behavior prototype
		any.defineShared("Behavior", any.clone());
		// Add Closure prototype
		any.defineShared("Closure", any.clone());
		
		currentFrame = rootFrame = new Frame(null, any, new Process[parameterCount], variableCount, instructions);
		
	}

	@Override
	public void replay(List<InteractionHistory.Interaction> commands) {
		Debug.println(Debug.LEVEL_HIGH, "replay");

//		for(Instruction instruction: commands) {
//			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);
//			Debug.println(Debug.LEVEL_HIGH, "replay: " + instruction);
//			
//			next(instruction, interactionHistory);
//		}
		
		InteractionHistory interactionHistory = new InteractionHistory(commands);
		
		if(currentFrame != null) {
			while(!stopRequested) {
				Instruction instruction = currentFrame.instructions[currentFrame.instructionPointer];
				
				Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);
				Debug.println(Debug.LEVEL_HIGH, "play: " + instruction);
				
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
			Object output = interactionHistory.nextOutputFor(Instruction.OPCODE_PAUSE);
			if(output == null) {
				stopRequested = true;
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_INC_IP: {
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_FINISH: {
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
			String key = (String)instruction.operand1;
			int argumentCount = (int)instruction.operand2;
			
			Process receiver = (Process)currentFrame.stack.get(currentFrame.stack.size() - argumentCount - 1);
			
			Object callable = receiver.getCallable(this, key);

			if(callable instanceof BehaviorProcess) {
				BehaviorProcess behavior = (BehaviorProcess)callable;
				
				Process[] arguments = new Process[behavior.parameterCount];
				
				if(argumentCount < behavior.parameterCount) {
					for(int i = argumentCount - 1; i >= 0; i--)
						arguments[i] = currentFrame.stack.pop();
					for(int i = behavior.parameterCount - 1; i >= argumentCount; i--)
						arguments[i] = any.lookup("Null");
				} else {
					for(int i = behavior.parameterCount - 1; i >= 0; i--)
						arguments[i] = currentFrame.stack.pop();
				}
				
				currentFrame.stack.pop(); // Pop receiver
				
				currentFrame = new Frame(currentFrame, receiver, arguments, behavior.variableCount, behavior.instructions);
			} else if(callable != null) {
				Process[] arguments = new Process[argumentCount];
				
				for(int i = argumentCount - 1; i >= 0; i--)
					arguments[i] = currentFrame.stack.pop();
				currentFrame.stack.pop(); // Pop receiver
				
				Process process = (Process)callable;
				
				currentFrame = new Frame(currentFrame, process, arguments, 0, FORWARD_CALL_INSTRUCTIONS);
			} else {
				throw new RuntimeException("Cache-miss and absent callable for '" + key + "'.");
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
						arguments[i] = any.lookup("Null");
				} else {
					for(int i = behavior.parameterCount - 1; i >= 0; i--)
						arguments[i] = currentFrame.stack.pop();
				}
				
				currentFrame.stack.pop(); // Pop receiver
				
				currentFrame = new Frame(currentFrame, currentFrame.self, arguments, behavior.variableCount, behavior.instructions);
			} else {
				Process[] arguments = new Process[argumentCount];
				
				for(int i = argumentCount - 1; i >= 0; i--)
					arguments[i] = currentFrame.stack.pop();
				currentFrame.stack.pop(); // Pop receiver
				
				Process process = (Process)callable;
				
				currentFrame = new Frame(currentFrame, process, arguments, 0, FORWARD_CALL_INSTRUCTIONS);
			}
			
			break;
		} case Instruction.OPCODE_FORWARD_CALL: {
			Process[] arguments = currentFrame.arguments;
			Process proxyCallable = currentFrame.self;
			
			Object callable = proxyCallable.getCallable(this, "call");

			if(callable instanceof BehaviorProcess) {
				BehaviorProcess behavior = (BehaviorProcess)callable;
				Process[] callArguments;
				if(arguments.length < behavior.parameterCount) {
					callArguments = new Process[behavior.parameterCount];
					System.arraycopy(arguments, 0, behavior.parameterCount, 0, arguments.length);
				} else
					callArguments = arguments;

				currentFrame = new Frame(currentFrame, currentFrame.self, callArguments, behavior.variableCount, behavior.instructions);
			} else {
				Process process = (Process)callable;
				
				currentFrame = new Frame(currentFrame, process, arguments, 0, FORWARD_CALL_INSTRUCTIONS);
			}
			break;
		} case Instruction.OPCODE_RET: {
			int returnCount = (int)instruction.operand1;
			Frame returnFrame = currentFrame.sender;
			for(int i = 0; i < returnCount; i++)
				returnFrame.stack.push(currentFrame.stack.pop());
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
			Process value = currentFrame.stack.pop();
			StringProcess key = (StringProcess)currentFrame.stack.pop(); // Assumed to be string only
			Process receiver = (Process)currentFrame.stack.pop();
			receiver.define(key.str, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SET_PROTO: {
			Process value = currentFrame.stack.pop();
			StringProcess key = (StringProcess)currentFrame.stack.pop(); // Assumed to be string only
			Process receiver = (Process)currentFrame.stack.pop();
			receiver.defineProto(key.str, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_GET: {
			StringProcess key = (StringProcess)currentFrame.stack.pop(); // Assumed to be string only
			Process receiver = (Process)currentFrame.stack.pop();
			Process value = receiver.lookup(key.str);
			currentFrame.stack.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_EXEC_ON_FRAME: {
			BehaviorProcess behavior = (BehaviorProcess)currentFrame.stack.pop();
			FrameProcess frame = (FrameProcess)currentFrame.stack.pop();
			int[] ordinals = (int[])instruction.operand1;
			// Move forward arguments
			if(currentFrame.arguments.length < ordinals.length) {
				for(int i = 0; i < currentFrame.arguments.length; i++) {
					int ordinal = ordinals[i];
					Process argument = currentFrame.arguments[i];
					frame.frame.arguments[ordinal] = argument;
				}
			} else {
				for(int i = 0; i < ordinals.length; i++) {
					int ordinal = ordinals[i];
					Process argument = currentFrame.arguments[i];
					frame.frame.arguments[ordinal] = argument;
				}
			}
			currentFrame = new Frame(currentFrame, frame.frame.self, frame.frame.arguments, frame.frame.variables, behavior.instructions);
			
			break;
		} case Instruction.OPCODE_LOAD_THIS: {
			currentFrame.stack.push(currentFrame.self);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_NULL: {
			Process nil = any.lookup("Null");
			currentFrame.stack.push(nil);
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
			IntegerProcess integer = new IntegerProcess(intValue);
			integer.defineProto("prototype", any.lookup("Integer"));
			currentFrame.stack.push(integer);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_TRUE: {
			currentFrame.stack.push(getTrue());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_FALSE: {
			currentFrame.stack.push(getFalse());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_STRING: {
			String str = (String)instruction.operand1;
			StringProcess string = new StringProcess(str);
			string.defineProto("prototype", any.lookup("String"));
			currentFrame.stack.push(string);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_ARRAY: {
			Object[] array = (Object[])instruction.operand1;
			currentFrame.stack.push((Process)(Object)array);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_THIS_FRAME: {
			currentFrame.stack.push(currentFrame.getReifiedFrame(any));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_FRAME: {
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
		case Instruction.OPCODE_SP_OR: {
			BooleanProcess rhs = (BooleanProcess)currentFrame.stack.pop();
			BooleanProcess lhs = (BooleanProcess)currentFrame.stack.pop();
			currentFrame.stack.push(getBoolean(lhs.value || rhs.value));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_AND: {
			BooleanProcess rhs = (BooleanProcess)currentFrame.stack.pop();
			BooleanProcess lhs = (BooleanProcess)currentFrame.stack.pop();
			currentFrame.stack.push(getBoolean(lhs.value && rhs.value));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NOT: {
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
			StringProcess result = new StringProcess(lhs.str + rhs.str);
			result.defineProto("prototype", any.lookup("String"));
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
			IntegerProcess result = new IntegerProcess(lhs.intValue + rhs.intValue);
			result.defineProto("prototype", any.lookup("Integer"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		}case Instruction.OPCODE_SP_INT_SUB: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess result = new IntegerProcess(lhs.intValue - rhs.intValue);
			result.defineProto("prototype", any.lookup("Integer"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_MULT: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess result = new IntegerProcess(lhs.intValue * rhs.intValue);
			result.defineProto("prototype", any.lookup("Integer"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_DIV: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess result = new IntegerProcess(lhs.intValue / rhs.intValue);
			result.defineProto("prototype", any.lookup("Integer"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_REM: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess result = new IntegerProcess(lhs.intValue % rhs.intValue);
			result.defineProto("prototype", any.lookup("Integer"));
			currentFrame.stack.push(result);
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
			StringProcess result = new StringProcess(Integer.toString(integer.intValue));
			result.defineProto("prototype", any.lookup("String"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_FRAME_SENDER: {
			FrameProcess frame = (FrameProcess)currentFrame.stack.pop();
			currentFrame.stack.push(frame.frame.sender.getReifiedFrame(any));
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
		}
		
		case Instruction.OPCODE_SP_WRITE: {
			Object output = interactionHistory.nextOutputFor(Instruction.OPCODE_SP_WRITE);
			if(output == null) {
				StringProcess value = (StringProcess)currentFrame.stack.pop();
				System.out.print(value.str);
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEXT_LINE: {
			String line;

			Object output = interactionHistory.nextOutputFor(Instruction.OPCODE_SP_NEXT_LINE);
			
			if(output == null) {
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					line = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
					line = null;
				}
			} else {
				line = (String)output;
			}

			StringProcess string = new StringProcess(line);
			string.defineProto("prototype", any.lookup("String"));
			
			currentFrame.stack.push(string);
			// Store the value for the replay instruction
			lastReadLine = line;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_DICT: {
			DictionaryProcess newDict = new DictionaryProcess();
			newDict.defineProto("prototype", any);
			currentFrame.stack.push(newDict);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_ARRAY: {
			IntegerProcess length = (IntegerProcess)currentFrame.stack.pop();
			ArrayProcess newArray = new ArrayProcess(length.intValue, any.lookup("Null"));
			newArray.defineProto("prototype", any.lookup("Array"));
			currentFrame.stack.push(newArray);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_ARRAY_LENGTH: {
			ArrayProcess newArray = (ArrayProcess)currentFrame.stack.pop();
			IntegerProcess result = new IntegerProcess(newArray.length());
			result.defineProto("prototype", any.lookup("Integer"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_LOAD: {
			StringProcess pathSource = (StringProcess)currentFrame.stack.pop();
			String path = pathSource.str;
			try {
				// What to do here during replay?
				// or rather, what to replace this instruction with for replay?
				path = "commons/gens/" + path;
				Journal<CustomProcess, InteractionHistory.Interaction> journal = Journal.read(path);
				CustomProcess customProcess = (CustomProcess)journal.getRoot();
				
				// Assumed to end with finish instruction. Replace finish with pop_frame.
				customProcess.currentFrame.instructions[customProcess.currentFrame.instructions.length - 1] = new Instruction(Instruction.OPCODE_RET_THIS);
				currentFrame = new Frame(currentFrame, any, customProcess.currentFrame.arguments, customProcess.currentFrame.variables.length, customProcess.currentFrame.instructions);
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
			
			break;
		} case Instruction.OPCODE_SP_NEW_CLOSURE: {
			int[] ordinals = (int[])instruction.operand1;
			BehaviorProcess behavior = (BehaviorProcess)currentFrame.stack.pop();
			ClosureProcess closure = new ClosureProcess(currentFrame.getReifiedFrame(any), behavior, ordinals);
			closure.defineProto("prototype", any.lookup("Closure"));
			currentFrame.stack.push(closure);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_BEHAVIOR: {
			int parameterCount = (int)instruction.operand1;
			int variableCount = (int)instruction.operand2;
			Instruction[] instructions = (Instruction[])instruction.operand3;
			BehaviorProcess behavior = new BehaviorProcess(parameterCount, variableCount, instructions);
			behavior.defineProto("prototype", any.lookup("Behavior"));
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
			new String();
			currentFrame.instructionPointer++;
			break;
		}
		}
	}

	private String lastReadLine;

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
				
				switch(instruction.opcode) {
				case Instruction.OPCODE_PAUSE:
//					playedInstructions.add(new Instruction(Instruction.OPCODE_INC_IP));
					interactionHistory.append(instruction, instruction);
					break;
				case Instruction.OPCODE_SP_WRITE:
					// Don't manipulate peripherals on replay
					interactionHistory.append(instruction, instruction);
					break;
				case Instruction.OPCODE_SP_NEXT_LINE:
					// The replay instruction simply pushes the read key consistently
//					playedInstructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, lastReadLine, null, null, true, instruction));
					interactionHistory.append(instruction, lastReadLine);
					// Don't manipulate peripherals on replay
					break;
				default:
//					playedInstructions.add(instruction);
					break;
				}
			}
		}

		if(currentFrame != null && currentFrame.stack.size() > 0)
			Debug.println(Debug.LEVEL_LOW, "stack isn't empty: " + currentFrame.stack);
		
		if(currentFrame != null)
			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);

		Debug.println(Debug.LEVEL_HIGH, "/play");
	}
	
	@Override
	public Object getCallable(ProcessFactory factory, Object key) {
		return null;
	}
	
	@Override
	public void define(Object key, Process value) {

	}
	
	@Override
	public void defineProto(Object key, Process value) {

	}

	@Override
	public Process lookup(Object key) {
		return null;
	}

	@Override
	public Iterator<Object> iterator() {
		return null;
	}
	
	@Override
	public BehaviorProcess createBehavior(int parameterCount, int variableCount, Instruction[] instructions) {
		BehaviorProcess behavior = new BehaviorProcess(parameterCount, variableCount, instructions);
		behavior.defineProto("prototype", any.lookup("Behavior"));
		return behavior;
	}
	
	public BooleanProcess getBoolean(boolean value) {
		return value ? getTrue() : getFalse();
	}
	
	public BooleanProcess getTrue() {
		return (BooleanProcess)any.lookup("True");
	}
	
	public BooleanProcess getFalse() {
		return (BooleanProcess)any.lookup("False");
	}
}
