package duro.runtime;

public class GeneratorProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FrameProcess frame;

	private final CallFrameInfo nextCallFrameInfo;

	public GeneratorProcess(FrameProcess frame) {
		// -1 because resume increments instruction pointer
		frame.frame.instructionPointer = -1;
		this.frame = frame;
		
		Instruction[] nextInstructions = new Instruction[] {
			new Instruction(Instruction.OPCODE_LOAD_REIFIED_FRAME, frame),
			new Instruction(Instruction.OPCODE_SP_REIFIED_FRAME_RESUME),
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
