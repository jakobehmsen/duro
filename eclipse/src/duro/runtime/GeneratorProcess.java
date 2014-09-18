package duro.runtime;

import duro.runtime.CustomProcess.Frame;

public class GeneratorProcess extends DictionaryProcess {
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
	public Object getCallable(Object key) {
		if(key.equals("next")) {
			Instruction[] instructions = new Instruction[] {
				new Instruction(Instruction.OPCODE_LOAD_FRAME, frame),
				new Instruction(Instruction.OPCODE_RESUME),
				new Instruction(Instruction.OPCODE_RET_FORWARD),
			};
			return new CallFrameInfo(0, 0, instructions);
		}
		
		return super.getCallable(key);
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new GeneratorProcess(frame);
	}
}
