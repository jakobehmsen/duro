package duro.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Hashtable;
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

	private static class Frame implements Serializable {
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
	}
	
	private Frame currentFrame;
	private Stack<Frame> frameStack = new Stack<Frame>();

	public CustomProcess(int variableCount, Instruction[] instructions) {
		currentFrame = new Frame(this, new Object[0], variableCount, instructions);
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
		} case Instruction.OPCODE_STORE: {
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
		} case Instruction.OPCODE_CALL: {
			String key = (String)instruction.operand1;
//			int symbolCode = (int)instruction.operand1;
			int argumentCount = (int)instruction.operand2;
			Object[] arguments = new Object[argumentCount];
			
			for(int i = argumentCount - 1; i >= 0; i--)
				arguments[i] = currentFrame.stack.pop();
			
			Process receiver = (Process)currentFrame.stack.pop();
			
			CallFrameInfo callFrameInfo = receiver.getInstructions(key);

			frameStack.push(currentFrame);
			currentFrame = new Frame(receiver, arguments, callFrameInfo.variableCount, callFrameInfo.instructions);
			
			break;
		} case Instruction.OPCODE_RET: {
			Object result = currentFrame.stack.peek();
			currentFrame = frameStack.pop();
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_RET_THIS: {
			Object result = currentFrame.self;
			currentFrame = frameStack.pop();
			currentFrame.stack.push(result);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_DEF: {
			Object value = currentFrame.stack.pop();
			Object key = currentFrame.stack.pop();
			
			Process receiver = (Process)currentFrame.stack.pop();
			
			receiver.define(key, value);
			
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
			Object key = currentFrame.stack.pop(); // Assumed to be string only
			Process receiver = (Process)currentFrame.stack.pop();
			receiver.define(key, value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_GET: {
			Object key = currentFrame.stack.pop(); // Assumed to be string only
			Process receiver = (Process)currentFrame.stack.pop();
			Object value = receiver.lookup(key);
			currentFrame.stack.push(value);
			currentFrame.instructionPointer++;
			
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
			currentFrame.stack.push(instruction.operand1);
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
			String string = (String)instruction.operand1;
			currentFrame.stack.push(string);
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
			
			if(lhs instanceof String || rhs instanceof String)
				currentFrame.stack.push(lhs.toString() + rhs.toString());
			
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
		} 
		
		case Instruction.OPCODE_SP_WRITE: {
			Object value = currentFrame.stack.pop();
			System.out.print(value);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEXT_LINE: {
			try {
//				DataInputStream in = new DataInputStream(System.in);
//				int nextKey = in.readByte();
				
//				int nextKey = System.console().reader().read();
				
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
		} case Instruction.OPCODE_SP_TO_IT: {
			@SuppressWarnings("unchecked")
			Iterable<Object> iterable = (Iterable<Object>)currentFrame.stack.pop();
			currentFrame.stack.push(iterable.iterator());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_HAS_NEXT: {
			@SuppressWarnings("unchecked")
			Iterator<Object> iterator = (Iterator<Object>)currentFrame.stack.pop();
			currentFrame.stack.push(iterator.hasNext());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEXT: {
			@SuppressWarnings("unchecked")
			Iterator<Object> iterator = (Iterator<Object>)currentFrame.stack.pop();
			currentFrame.stack.push(iterator.next());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_DICT: {
			DictionaryProcess newDict = new DictionaryProcess();
			currentFrame.stack.push(newDict);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_NEW_ARRAY: {
			int length = (int)currentFrame.stack.pop();
			ArrayProcess newArray = new ArrayProcess(length);
			currentFrame.stack.push(newArray);
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_ARRAY_LENGTH: {
			ArrayProcess newArray = (ArrayProcess)currentFrame.stack.pop();
			currentFrame.stack.push(newArray.length());
			currentFrame.instructionPointer++;
			
			break;
		} case Instruction.OPCODE_SP_LOAD: {
			String path = (String)currentFrame.stack.pop();
			try {
				// What to do here during replay?
				// or rather, what to replace this instruction with for replay?
				path = "commons/gens/" + path;
				Journal<duro.runtime.Process, Instruction> journal = Journal.read(path);
				CustomProcess customProcess = (CustomProcess)journal.getRoot();
				
				// Assumed to end with finish instruction. Replace finish with pop_frame.
				customProcess.currentFrame.instructions[customProcess.currentFrame.instructions.length - 1] = new Instruction(Instruction.OPCODE_RET_THIS);
				this.frameStack.push(currentFrame);
				currentFrame = customProcess.currentFrame;
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
			
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
		
		if(currentFrame != null)
			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);

		Debug.println(Debug.LEVEL_HIGH, "/play");
	}
	
	private Hashtable<Object, Object> properties = new Hashtable<Object, Object>();
	
	@Override
	public CallFrameInfo getInstructions(Object key) {
		return (CallFrameInfo)properties.get(key);
	}
	
	@Override
	public void define(Object key, Object value) {
		properties.put(key, value);
	}

	@Override
	public Object lookup(Object key) {
		return properties.get(key);
	}

	@Override
	public Iterator<Object> iterator() {
		return properties.keySet().iterator();
	}
}
