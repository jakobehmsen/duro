package duro.runtime;

import duro.runtime.CustomProcess.Frame;

public class GeneratorProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CustomProcess.Frame frame;

	private final CallFrameInfo nextCallFrameInfo;

	public GeneratorProcess(Frame frame) {
		// -1 because resume increments instruction pointer
		frame.instructionPointer = -1;
		this.frame = frame;
		
		Instruction[] nextInstructions = new Instruction[] {
			new Instruction(Instruction.OPCODE_LOAD_FRAME, frame),
			new Instruction(Instruction.OPCODE_RESUME),
			new Instruction(Instruction.OPCODE_RET_FORWARD),
		};
		nextCallFrameInfo = new CallFrameInfo(0, 0, nextInstructions);
	}

	@Override
	public Object getCallable(Object key) {
		if(key.equals("next"))
			return nextCallFrameInfo;
		
		return super.getCallable(key);
	}
	
	@Override
	public DictionaryProcess newBase() {
		// How to clone frame?
		return new GeneratorProcess(frame);
	}
}
