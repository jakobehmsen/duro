package duro.runtime;

import java.util.List;

import duro.runtime.CustomProcess.Frame;

public class GeneratorProcess extends Process {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CustomProcess.Frame frame;

	public GeneratorProcess(Frame frame) {
		// -1 because resume increments instruction pointer
		frame.instructionPointer = -1;
		this.frame = frame;
	}

	@Override
	public void replay(List<Instruction> commands) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume(List<Instruction> playedInstructions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CallFrameInfo getInstructions(Object key) {
		if(key.equals("next")) {
			Instruction[] instructions = new Instruction[] {
				new Instruction(Instruction.OPCODE_LOAD_FRAME, frame),
				new Instruction(Instruction.OPCODE_RESUME),
				new Instruction(Instruction.OPCODE_RET_FORWARD),
			};
			return new CallFrameInfo(0, 0, instructions);
		}
		
		return null;
	}

	@Override
	public void define(Object key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object lookup(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
}
