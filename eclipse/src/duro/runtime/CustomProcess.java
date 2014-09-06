package duro.runtime;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

import debugging.Debug;
import duro.reflang.SymbolTable;

public class CustomProcess extends Process {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static class Frame implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public Object[] arguments;
		public Object[] variables;
		public final Instruction[] instructions;
		public int instructionPointer;
		public Stack<Object> stack = new Stack<Object>();
		
		public Frame(Object[] arguments, int variableCount, Instruction[] instructions) {
			this.arguments = arguments;
			variables = new Object[variableCount];
			this.instructions = instructions;
		}
	}
	
	private Frame currentFrame;
	private Stack<Frame> frameStack = new Stack<Frame>();

	public CustomProcess(int variableCount, Instruction[] instructions) {
		currentFrame = new Frame(new Object[0], variableCount, instructions);
		
		// HACK
		fields.put(SymbolTable.getSymbolCodeFromId("log"), new CallFrameInfo(1, 0, new Instruction[] {
			new Instruction(Instruction.OPCODE_LOAD_ARG, 0),
			new Instruction(Instruction.OPCODE_SP_LOG),
			new Instruction(Instruction.OPCODE_LOAD_NULL),
			new Instruction(Instruction.OPCODE_RET)
		}));
	}

	@Override
	public void replay(List<Instruction> commands) {
		Debug.println(Debug.LEVEL_HIGH, "replay");

		for(Instruction instruction: commands) {
			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);
			Debug.println(Debug.LEVEL_HIGH, "replay: " + instruction);
			
			switch(instruction.opcode) {
			case Instruction.OPCODE_PAUSE: {
				currentFrame.instructionPointer++;

				break;
			} case Instruction.OPCODE_FINISH: {
				currentFrame = null;

				break;
			} case Instruction.OPCODE_DUP: {
				currentFrame.stack.push(currentFrame.stack.peek());
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
			} case Instruction.OPCODE_CALL: {
				int symbolCode = (int)instruction.operand1;
				int argumentCount = (int)instruction.operand2;
				
				Object[] arguments = new Object[argumentCount];
				
				for(int i = argumentCount - 1; i >= 0; i--)
					arguments[i] = currentFrame.stack.pop();
				
				Process receiver = (Process)currentFrame.stack.pop();
				
				CallFrameInfo callFrameInfo = receiver.getInstructions(symbolCode);

				frameStack.push(currentFrame);
				currentFrame = new Frame(arguments, callFrameInfo.variableCount, callFrameInfo.instructions);
				
				break;
			} case Instruction.OPCODE_RET: {
				Object result = currentFrame.stack.peek();
				currentFrame = frameStack.pop();
				currentFrame.stack.push(result);
				currentFrame.instructionPointer++;
				
				break;
			} case Instruction.OPCODE_LOAD_THIS: {
				currentFrame.stack.push(this);
				currentFrame.instructionPointer++;
				
				break;
			} case Instruction.OPCODE_LOAD_NULL: {
				currentFrame.stack.push(null);
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
			}
			
			// Special opcodes
			case Instruction.OPCODE_SP_LOG: {
				Object value = currentFrame.stack.pop();
				System.out.println(value);
				currentFrame.instructionPointer++;
				
				break;
			} case Instruction.OPCODE_SP_ADD: {
				int rhs = (int)currentFrame.stack.pop();
				int lhs = (int)currentFrame.stack.pop();
				currentFrame.stack.push(lhs + rhs);
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
			}
		}
		
		if(currentFrame != null)
			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);
		
		Debug.println(Debug.LEVEL_HIGH, "/replay");
	}

	@Override
	public void resume(List<Instruction> playedInstructions) {
		Debug.println(Debug.LEVEL_HIGH, "play");
		
		if(currentFrame != null) {
			boolean stopRequested = false;
			
			checkStopeRequest:
			if(!stopRequested) {
				while(true) {
					Instruction instruction = currentFrame.instructions[currentFrame.instructionPointer];
					playedInstructions.add(instruction);
					Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);
					Debug.println(Debug.LEVEL_HIGH, "play: " + instruction);
					
					switch(instruction.opcode) {
					case Instruction.OPCODE_PAUSE: {
						stopRequested = true;
						currentFrame.instructionPointer++;
						break checkStopeRequest;
					} case Instruction.OPCODE_FINISH: {
						stopRequested = true;
						currentFrame = null;
						break checkStopeRequest;
					} case Instruction.OPCODE_DUP: {
						currentFrame.stack.push(currentFrame.stack.peek());
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
					} case Instruction.OPCODE_CALL: {
						int symbolCode = (int)instruction.operand1;
						int argumentCount = (int)instruction.operand2;
						Object[] arguments = new Object[argumentCount];
						
						for(int i = argumentCount - 1; i >= 0; i--)
							arguments[i] = currentFrame.stack.pop();
						
						Process receiver = (Process)currentFrame.stack.pop();
						
						CallFrameInfo callFrameInfo = receiver.getInstructions(symbolCode);

						frameStack.push(currentFrame);
						currentFrame = new Frame(arguments, callFrameInfo.variableCount, callFrameInfo.instructions);
						
						break;
					} case Instruction.OPCODE_RET: {
						Object result = currentFrame.stack.peek();
						currentFrame = frameStack.pop();
						currentFrame.stack.push(result);
						currentFrame.instructionPointer++;
						
						break;
					} case Instruction.OPCODE_LOAD_THIS: {
						currentFrame.stack.push(this);
						currentFrame.instructionPointer++;
						
						break;
					} case Instruction.OPCODE_LOAD_NULL: {
						currentFrame.stack.push(null);
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
					}
					
					// Special opcodes
					case Instruction.OPCODE_SP_LOG: {
						Object value = currentFrame.stack.pop();
						System.out.println(value);
						currentFrame.instructionPointer++;
						
						break;
					} case Instruction.OPCODE_SP_ADD: {
						int rhs = (int)currentFrame.stack.pop();
						int lhs = (int)currentFrame.stack.pop();
						currentFrame.stack.push(lhs + rhs);
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
					}
				}
			}
		}
		
		if(currentFrame != null)
			Debug.println(Debug.LEVEL_HIGH, "stack: " + currentFrame.stack);

		Debug.println(Debug.LEVEL_HIGH, "/play");
	}
	
	private Hashtable<Integer, Object> fields = new Hashtable<Integer, Object>();
	
	@Override
	public CallFrameInfo getInstructions(int symbolCode) {
		return (CallFrameInfo)fields.get(symbolCode);
	}
}
