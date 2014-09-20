package duro.runtime;

import duro.runtime.CustomProcess.Frame;

public class FrameProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomProcess.Frame frame;
	
	private final CallFrameInfo outerCallFrameInfo;

	public FrameProcess(Frame frame) {
		this.frame = frame;
		
		Instruction[] iteratorInstructions = new Instruction[] {
			new Instruction(Instruction.OPCODE_LOAD_THIS),
			new Instruction(Instruction.OPCODE_SP_FRAME_SENDER),
			new Instruction(Instruction.OPCODE_RET, 1)
		};
		outerCallFrameInfo = new CallFrameInfo(0, 0, iteratorInstructions);
	}

	@Override
	public Object getCallable(Object key) {
		if(key.equals("sender"))
			return outerCallFrameInfo;
		
		return super.getCallable(key);
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new FrameProcess(frame);
	}
}
