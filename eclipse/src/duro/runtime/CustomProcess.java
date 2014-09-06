package duro.runtime;

import java.io.Serializable;
import java.util.List;
import java.util.Stack;

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
		public Object[] variables;
		public final Instruction[] instructions;
		public int instructionPointer;
		public Stack<Object> stack = new Stack<Object>();
		
		public Frame(int variableCount, Instruction[] instructions) {
			variables = new Object[variableCount];
			this.instructions = instructions;
		}
	}
	
	private Frame currentFrame;
//	private Stack<Frame> frameStack = new Stack<Frame>();

	public CustomProcess(int variableCount, Instruction[] instructions) {
		currentFrame = new Frame(variableCount, instructions);
	}

	@Override
	public void replay(List<Instruction> commands) {
		System.out.println("replay");
		for(Instruction instruction: commands) {
			System.out.println("stack: " + currentFrame.stack);
			System.out.println("replay: " + instruction);
			
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
				int index = (int)instruction.operand1;
				Object value = currentFrame.stack.pop();
				currentFrame.variables[index] = value;
				currentFrame.instructionPointer++;
				
				break;
			} case Instruction.OPCODE_POP: {
				currentFrame.stack.pop();
				currentFrame.instructionPointer++;
				
				break;
			} case Instruction.OPCODE_LOAD_INT: {
				currentFrame.stack.push(instruction.operand1);
				currentFrame.instructionPointer++;
				
				break;
			}
			}
		}
		
		if(currentFrame != null)
			System.out.println("stack: " + currentFrame.stack);
		System.out.println("/replay");
	}

	@Override
	public void resume(List<Instruction> playedInstructions) {
		System.out.println("play");
		
		if(currentFrame != null) {
			boolean stopRequested = false;
			
			checkStopeRequest:
			if(!stopRequested) {
				while(true) {
					Instruction instruction = currentFrame.instructions[currentFrame.instructionPointer];
					playedInstructions.add(instruction);
					System.out.println("stack: " + currentFrame.stack);
					System.out.println("play: " + instruction);
					
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
						int index = (int)instruction.operand1;
						Object value = currentFrame.stack.pop();
						currentFrame.variables[index] = value;
						currentFrame.instructionPointer++;
						
						break;
					} case Instruction.OPCODE_POP: {
						currentFrame.stack.pop();
						currentFrame.instructionPointer++;
						
						break;
					} case Instruction.OPCODE_LOAD_INT: {
						currentFrame.stack.push(instruction.operand1);
						currentFrame.instructionPointer++;
						
						break;
					}
					}
				}
			}
		}
		
		if(currentFrame != null)
			System.out.println("stack: " + currentFrame.stack);
		System.out.println("/play");
	}
}
