package duro.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import duro.debugging.Debug;
import duro.transcriber.Journal;

public class CustomProcess extends Process implements Iterable<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final Instruction[] FORWARD_CALL_INSTRUCTIONS = new Instruction[] {
		new Instruction(Instruction.OPCODE_FORWARD_CALL),
		new Instruction(Instruction.OPCODE_RET_FORWARD)
	};

	public static class Frame implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public final Process self;
		public Object[] arguments;
		public Object[] variables;
		public final Instruction[] instructions;
		public int instructionPointer;
		public Stack<Object> stack = new Stack<Object>();
		
		public Frame(Process self, Object[] arguments, int variableCount, Instruction[] instructions) {
			this.self = self;
			this.arguments = arguments;
			variables = new Object[variableCount];
			this.instructions = instructions;
		}
		
		public Frame(Process self, Object[] arguments, Object[] variables, Instruction[] instructions) {
			this.self = self;
			this.arguments = arguments;
			this.variables = variables;
			this.instructions = instructions;
		}
	}
	
	private Frame currentFrame;
	private Stack<Frame> frameStack = new Stack<Frame>();
	private DictionaryProcess any;

	public CustomProcess(int parameterCount, int variableCount, Instruction[] instructions) {
		// TODO: Consider: Should the Any prototype be this? Should CustomProcess be a DictionaryProcess?
		// Should CustomProcess not be a process at all? Should CustomProcess hold any and push it instead this?  - Also at other locations, e.g. when loading.
		// Add Any prototype
		any = new DictionaryProcess();
		any.defineShared("Any", any);
		// Add Iterable prototype
		DictionaryProcess iterable = any.clone();
		any.defineShared("Iterable", iterable);
		// Add Iterator prototype
		any.defineShared("Iterator", any.clone());
		// Add Array prototype
		any.defineShared("Array", iterable.clone());
		// Add String prototype
		any.defineShared("String", any.clone());
		// Add Integer prototype
		any.defineShared("Integer", any.clone());
		
		currentFrame = new Frame(any, new Object[parameterCount], variableCount, instructions);
	}

	@Override
	public void replay(List<Instruction> commands) {
		Debug.println(Debug.LEVEL_HIGH, "replay");

		for(Instruction instruction: commands) {
			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);
			Debug.println(Debug.LEVEL_HIGH, "replay: " + instruction);
			
			next(instruction);
		}
		
		if(currentFrame != null)
			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);
		
		Debug.println(Debug.LEVEL_HIGH, "/replay");
	}
	
	private boolean stopRequested;
	
	private void next(Instruction instruction) {
		switch(instruction.opcode) {
		case Instruction.OPCODE_PAUSE: {
			stopRequested = true;
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
			
			Object sourceValue = currentFrame.stack.get(top - sourceOffset);
			currentFrame.stack.add(top - insertionOffset, sourceValue);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_STORE_LOC: {
			int ordinal = (int)instruction.operand1;
			Object value = currentFrame.stack.pop();
			currentFrame.variables[ordinal] = value;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_POP: {
			currentFrame.stack.pop();
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SWAP: {
			Object tmp = currentFrame.stack.get(currentFrame.stack.size() - 1);
			currentFrame.stack.set(currentFrame.stack.size() - 1, currentFrame.stack.get(currentFrame.stack.size() - 2));
			currentFrame.stack.set(currentFrame.stack.size() - 2, tmp);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SWAP1: {
			Object tmp = currentFrame.stack.get(currentFrame.stack.size() - 2);
			currentFrame.stack.set(currentFrame.stack.size() - 2, currentFrame.stack.get(currentFrame.stack.size() - 3));
			currentFrame.stack.set(currentFrame.stack.size() - 3, tmp);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SWAP_ANY: {
			int top = currentFrame.stack.size() - 1;
			int index1 = top - (int)instruction.operand1; // operand1: offsetFromTop0 for first index
			int index2 = top - (int)instruction.operand2; // operand2: offsetFromTop0 for second index
			Object tmp = currentFrame.stack.get(index1);
			currentFrame.stack.set(index1, currentFrame.stack.get(index2));
			currentFrame.stack.set(index2, tmp);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SEND: {
			String key = (String)instruction.operand1;
			int argumentCount = (int)instruction.operand2;
			
			Process receiver = (Process)currentFrame.stack.get(currentFrame.stack.size() - argumentCount - 1);
			
			Object callable = receiver.getCallable(key);

			if(callable instanceof CallFrameInfo) {
				CallFrameInfo callFrameInfo = (CallFrameInfo)callable;
				
				Object[] arguments = new Object[callFrameInfo.argumentCount];
				
				for(int i = callFrameInfo.argumentCount - 1; i >= 0; i--)
					arguments[i] = currentFrame.stack.pop();
				currentFrame.stack.pop(); // Pop receiver
				
				frameStack.push(currentFrame);
				currentFrame = new Frame(receiver, arguments, callFrameInfo.variableCount, callFrameInfo.instructions);
			} else {
				Object[] arguments = new Object[argumentCount];
				
				for(int i = argumentCount - 1; i >= 0; i--)
					arguments[i] = currentFrame.stack.pop();
				currentFrame.stack.pop(); // Pop receiver
				
				Process process = (Process)callable;
				
				frameStack.push(currentFrame);
				currentFrame = new Frame(process, arguments, 0, FORWARD_CALL_INSTRUCTIONS);
			}
			
			break;
		} case Instruction.OPCODE_CALL: {
			int argumentCount = (int)instruction.operand1;
			
			Object callable = currentFrame.stack.get(currentFrame.stack.size() - argumentCount - 1);

			if(callable instanceof CallFrameInfo) {
				CallFrameInfo callFrameInfo = (CallFrameInfo)callable;
				
				Object[] arguments = new Object[callFrameInfo.argumentCount];
				
				for(int i = argumentCount - 1; i >= 0; i--)
					arguments[i] = currentFrame.stack.pop();
				currentFrame.stack.pop(); // Pop receiver
				
				frameStack.push(currentFrame);
				currentFrame = new Frame(currentFrame.self, arguments, callFrameInfo.variableCount, callFrameInfo.instructions);
			} else {
				Object[] arguments = new Object[argumentCount];
				
				for(int i = argumentCount - 1; i >= 0; i--)
					arguments[i] = currentFrame.stack.pop();
				currentFrame.stack.pop(); // Pop receiver
				
				Process process = (Process)callable;
				
				frameStack.push(currentFrame);
				currentFrame = new Frame(process, arguments, 0, FORWARD_CALL_INSTRUCTIONS);
			}
			
			break;
		} case Instruction.OPCODE_FORWARD_CALL: {
			Object[] arguments = currentFrame.arguments;
			Process proxyCallable = currentFrame.self;
			
			Object callable = proxyCallable.getCallable("call");

			if(callable instanceof CallFrameInfo) {
				CallFrameInfo callFrameInfo = (CallFrameInfo)callable;
				Object[] callArguments;
				if(arguments.length < callFrameInfo.argumentCount) {
					callArguments = new Object[callFrameInfo.argumentCount];
					System.arraycopy(arguments, 0, callFrameInfo.argumentCount, 0, arguments.length);
				} else
					callArguments = arguments;
				frameStack.push(currentFrame);
				currentFrame = new Frame(currentFrame.self, callArguments, callFrameInfo.variableCount, callFrameInfo.instructions);
			} else {
				Process process = (Process)callable;
				
				frameStack.push(currentFrame);
				currentFrame = new Frame(process, arguments, 0, FORWARD_CALL_INSTRUCTIONS);
			}
			break;
		} case Instruction.OPCODE_RESUME: {
			Frame frame = (Frame)currentFrame.stack.pop();

			frameStack.push(currentFrame);
			currentFrame = frame;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_RET: {
			int returnCount = (int)instruction.operand1;
			Frame outerFrame = frameStack.pop();
			for(int i = 0; i < returnCount; i++)
				outerFrame.stack.push(currentFrame.stack.pop());
			currentFrame = outerFrame;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_RET_THIS: {
			Object result = currentFrame.self;
			currentFrame = frameStack.pop();
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_RET_FORWARD: {
			Frame outerFrame = frameStack.pop();
			outerFrame.stack.addAll(currentFrame.stack);
			currentFrame = outerFrame;
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_IF_TRUE: {
			boolean value = (boolean)currentFrame.stack.pop();
			if(value) {
				int jump = (int)instruction.operand1;
				currentFrame.instructionPointer += jump;
			} else
				currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_IF_FALSE: {
			boolean value = (boolean)currentFrame.stack.pop();
			if(!value) {
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
			Object value = currentFrame.stack.pop();
			StringProcess key = (StringProcess)currentFrame.stack.pop(); // Assumed to be string only
			Process receiver = (Process)currentFrame.stack.pop();
			receiver.define(key.str, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_GET: {
			StringProcess key = (StringProcess)currentFrame.stack.pop(); // Assumed to be string only
			Process receiver = (Process)currentFrame.stack.pop();
			Object value = receiver.lookup(key.str);
			currentFrame.stack.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_EXEC_ON_FRAME: {
			CallFrameInfo callFrameInfo = (CallFrameInfo)currentFrame.stack.pop();
			Frame frame = (Frame)currentFrame.stack.pop();
			// Move forward arguments
//			Object[] arguments = new Object[frame.arguments.length + callFrameInfo.argumentCount];
			int start = frame.arguments.length - currentFrame.arguments.length;
			System.arraycopy(currentFrame.arguments, 0, frame.arguments, start, currentFrame.arguments.length);
			frameStack.push(currentFrame);
			currentFrame = new Frame(frame.self, frame.arguments, frame.variables, callFrameInfo.instructions);
			
			break;
		} case Instruction.OPCODE_LOAD_THIS: {
			currentFrame.stack.push(currentFrame.self);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_NULL: {
			currentFrame.stack.push(new NullProcess());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_LOC: {
			int ordinal = (int)instruction.operand1;
			Object value = currentFrame.variables[ordinal];
			currentFrame.stack.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_ARG: {
			int ordinal = (int)instruction.operand1;
			Object value = currentFrame.arguments[ordinal];
			currentFrame.stack.push(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_INT: {
			int intValue = (int)instruction.operand1;
			IntegerProcess integer = new IntegerProcess(intValue);
			integer.defineProto("parent", any.lookup("Integer"));
			currentFrame.stack.push(integer);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_FUNC: {
			currentFrame.stack.push(instruction.operand1);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_TRUE: {
			currentFrame.stack.push(true);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_FALSE: {
			currentFrame.stack.push(false);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_STRING: {
			String str = (String)instruction.operand1;
			StringProcess string = new StringProcess(str);
			string.defineProto("parent", any.lookup("String"));
			currentFrame.stack.push(string);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_FRAME: {
			Frame frame = (Frame)instruction.operand1;
			currentFrame.stack.push(frame);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_ARRAY: {
			Object[] array = (Object[])instruction.operand1;
			currentFrame.stack.push(array);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_LOAD_ANY: {
			Process process = (Process)instruction.operand1;
			currentFrame.stack.push(process);
			currentFrame.instructionPointer++;
			
			break;
		}
		
		// Special opcodes
		case Instruction.OPCODE_SP_OR: {
			boolean rhs = (boolean)currentFrame.stack.pop();
			boolean lhs = (boolean)currentFrame.stack.pop();
			currentFrame.stack.push(lhs || rhs);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_AND: {
			boolean rhs = (boolean)currentFrame.stack.pop();
			boolean lhs = (boolean)currentFrame.stack.pop();
			currentFrame.stack.push(lhs && rhs);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_EQUALS: {
			Object rhs = (Object)currentFrame.stack.pop();
			Object lhs = (Object)currentFrame.stack.pop();
			currentFrame.stack.push(lhs.equals(rhs));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_GREATER: {
			@SuppressWarnings("rawtypes")
			Comparable rhs = (Comparable)currentFrame.stack.pop();
			@SuppressWarnings("rawtypes")
			Comparable lhs = (Comparable)currentFrame.stack.pop();
			@SuppressWarnings("unchecked")
			boolean result = lhs.compareTo(rhs) > 0;
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_GREATER_EQUALS: {
			@SuppressWarnings("rawtypes")
			Comparable rhs = (Comparable)currentFrame.stack.pop();
			@SuppressWarnings("rawtypes")
			Comparable lhs = (Comparable)currentFrame.stack.pop();
			@SuppressWarnings("unchecked")
			int comparison = lhs.compareTo(rhs);
			boolean result = comparison >= 0;
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_LESS: {
			@SuppressWarnings("rawtypes")
			Comparable rhs = (Comparable)currentFrame.stack.pop();
			@SuppressWarnings("rawtypes")
			Comparable lhs = (Comparable)currentFrame.stack.pop();
			@SuppressWarnings("unchecked")
			boolean result = lhs.compareTo(rhs) < 0;
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_LESS_EQUALS: {
			@SuppressWarnings("rawtypes")
			Comparable rhs = (Comparable)currentFrame.stack.pop();
			@SuppressWarnings("rawtypes")
			Comparable lhs = (Comparable)currentFrame.stack.pop();
			@SuppressWarnings("unchecked")
			int comparison = lhs.compareTo(rhs);
			boolean result = comparison <= 0;
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} 
		
		
		case Instruction.OPCODE_SP_NOT: {
			boolean b = (boolean)currentFrame.stack.pop();
			currentFrame.stack.push(!b);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_ADD: {
			Object rhs = currentFrame.stack.pop();
			Object lhs = currentFrame.stack.pop();
			
			if(lhs instanceof Integer && rhs instanceof Integer)
				currentFrame.stack.push((int)lhs + (int)rhs);
			else if(lhs instanceof String || rhs instanceof String)
				currentFrame.stack.push(lhs.toString() + rhs.toString());
			else {
				Debug.println(Debug.LEVEL_LOW, "Invalid add operation.");
			}
			
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_SUB: {
			int rhs = (int)currentFrame.stack.pop();
			int lhs = (int)currentFrame.stack.pop();
			currentFrame.stack.push(lhs - rhs);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_MULT: {
			int rhs = (int)currentFrame.stack.pop();
			int lhs = (int)currentFrame.stack.pop();
			currentFrame.stack.push(lhs * rhs);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_DIV: {
			int rhs = (int)currentFrame.stack.pop();
			int lhs = (int)currentFrame.stack.pop();
			currentFrame.stack.push(lhs / rhs);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_REM: {
			int rhs = (int)currentFrame.stack.pop();
			int lhs = (int)currentFrame.stack.pop();
			currentFrame.stack.push(lhs % rhs);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_ARRAY_GET: {
			IntegerProcess index = (IntegerProcess)currentFrame.stack.pop();
			ArrayProcess array = (ArrayProcess)currentFrame.stack.pop();
			currentFrame.stack.push(array.get(index.intValue));
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_ARRAY_SET: {
			Object value = currentFrame.stack.pop();
			IntegerProcess index = (IntegerProcess)currentFrame.stack.pop();
			ArrayProcess array = (ArrayProcess)currentFrame.stack.pop();
			array.set(index.intValue, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_STRING_CONCAT: {
			StringProcess rhs = (StringProcess)currentFrame.stack.pop();
			StringProcess lhs = (StringProcess)currentFrame.stack.pop();
			StringProcess result = new StringProcess(lhs.str + rhs.str);
			result.defineProto("parent", any.lookup("String"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_ADD: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess result = new IntegerProcess(lhs.intValue + rhs.intValue);
			result.defineProto("parent", any.lookup("Integer"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		}case Instruction.OPCODE_SP_INT_SUB: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess result = new IntegerProcess(lhs.intValue - rhs.intValue);
			result.defineProto("parent", any.lookup("Integer"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_MULT: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess result = new IntegerProcess(lhs.intValue * rhs.intValue);
			result.defineProto("parent", any.lookup("Integer"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_DIV: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess result = new IntegerProcess(lhs.intValue / rhs.intValue);
			result.defineProto("parent", any.lookup("Integer"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_REM: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess result = new IntegerProcess(lhs.intValue % rhs.intValue);
			result.defineProto("parent", any.lookup("Integer"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_EQUAL: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			currentFrame.stack.push(lhs.intValue == rhs.intValue);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_GREATER: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			currentFrame.stack.push(lhs.intValue > rhs.intValue);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_LESS: {
			IntegerProcess rhs = (IntegerProcess)currentFrame.stack.pop();
			IntegerProcess lhs = (IntegerProcess)currentFrame.stack.pop();
			currentFrame.stack.push(lhs.intValue < rhs.intValue);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_INT_TO_STRING: {
			IntegerProcess integer = (IntegerProcess)currentFrame.stack.pop();
			StringProcess result = new StringProcess(Integer.toString(integer.intValue));
			result.defineProto("parent", any.lookup("String"));
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		}
		
		case Instruction.OPCODE_SP_WRITE: {
			StringProcess value = (StringProcess)currentFrame.stack.pop();
			System.out.print(value.str);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEXT_LINE: {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				String line = br.readLine();
				
				currentFrame.stack.push(line);
				// Store the value for the replay instruction
				lastReadLine = line;
			} catch (IOException e) {
				e.printStackTrace();
			}
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_DICT: {
			DictionaryProcess newDict = new DictionaryProcess();
			newDict.defineProto("parent", any);
			currentFrame.stack.push(newDict);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_ARRAY: {
			IntegerProcess length = (IntegerProcess)currentFrame.stack.pop();
			ArrayProcess newArray = new ArrayProcess(length.intValue);
			newArray.defineProto("prototype", any.lookup("Array"));
			currentFrame.stack.push(newArray);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_ARRAY_LENGTH: {
			ArrayProcess newArray = (ArrayProcess)currentFrame.stack.pop();
			currentFrame.stack.push(newArray.length());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_LOAD: {
			StringProcess pathSource = (StringProcess)currentFrame.stack.pop();
			String path = pathSource.str;
			try {
				// What to do here during replay?
				// or rather, what to replace this instruction with for replay?
				path = "commons/gens/" + path;
				Journal<duro.runtime.Process, Instruction> journal = Journal.read(path);
				CustomProcess customProcess = (CustomProcess)journal.getRoot();
				
				// Assumed to end with finish instruction. Replace finish with pop_frame.
				customProcess.currentFrame.instructions[customProcess.currentFrame.instructions.length - 1] = new Instruction(Instruction.OPCODE_RET_THIS);
				this.frameStack.push(currentFrame);
				currentFrame = new Frame(any, customProcess.currentFrame.arguments, customProcess.currentFrame.variables.length, customProcess.currentFrame.instructions);
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
			
			break;
		} case Instruction.OPCODE_SP_NEW_GENERATOR: {
			Object[] arguments = (Object[])currentFrame.stack.pop();
			Process self = (Process)currentFrame.stack.pop();
			CallFrameInfo callFrameInfo = (CallFrameInfo)currentFrame.stack.pop();
			
			Frame generatorFrame = new Frame(self, arguments, callFrameInfo.variableCount, callFrameInfo.instructions);
			GeneratorProcess generator = new GeneratorProcess(generatorFrame);
			DictionaryProcess iteratorPrototype = (DictionaryProcess)any.lookup("Iterator");
			generator.defineProto("prototype", iteratorPrototype);
			currentFrame.stack.push(generator);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_GENERATABLE: {
			int argumentCount = (int)instruction.operand1;
			Object[] arguments = new Object[argumentCount];
			
			for(int i = argumentCount - 1; i >= 0; i--)
				arguments[i] = currentFrame.stack.pop();
			
			CallFrameInfo callFrameInfo = (CallFrameInfo)currentFrame.stack.pop();

			GeneratableProcess generatable = new GeneratableProcess(callFrameInfo, currentFrame.self, arguments);
			DictionaryProcess iterablePrototype = (DictionaryProcess)any.lookup("Iterable");
			generatable.defineProto("prototype", iterablePrototype);
			currentFrame.stack.push(generatable);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_CLOSURE: {
			CallFrameInfo callFrameInfo = (CallFrameInfo)currentFrame.stack.pop();
			currentFrame.stack.push(new ClosureProcess(currentFrame, callFrameInfo));
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
	public void resume(List<Instruction> playedInstructions) {
		Debug.println(Debug.LEVEL_HIGH, "play");
		
		if(currentFrame != null) {
			while(!stopRequested) {
				Instruction instruction = currentFrame.instructions[currentFrame.instructionPointer];
				
				Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);
				Debug.println(Debug.LEVEL_HIGH, "play: " + instruction);
				
				next(instruction);
				
				switch(instruction.opcode) {
				case Instruction.OPCODE_PAUSE:
					playedInstructions.add(new Instruction(Instruction.OPCODE_INC_IP));
					break;
				case Instruction.OPCODE_SP_WRITE:
					// Don't manipulate peripherals on replay
					break;
				case Instruction.OPCODE_SP_NEXT_LINE:
					// The replay instruction simply pushes the read key consistently
					playedInstructions.add(new Instruction(Instruction.OPCODE_LOAD_STRING, lastReadLine));
					// Don't manipulate peripherals on replay
					break;
				default:
					playedInstructions.add(instruction);
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
	public Object getCallable(Object key) {
		return null;
	}
	
	@Override
	public void define(Object key, Object value) {

	}

	@Override
	public Object lookup(Object key) {
		return null;
	}

	@Override
	public Iterator<Object> iterator() {
		return null;
	}
}
