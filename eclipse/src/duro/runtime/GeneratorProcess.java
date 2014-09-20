package duro.runtime;

public class GeneratorProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FrameProcess frame;

	private BehaviorProcess nextBehavior;

	public GeneratorProcess(FrameProcess frame) {
		// -1 because resume increments instruction pointer
		frame.frame.instructionPointer = -1;
		this.frame = frame;
	}

	@Override
	public Object getCallable(ProcessFactory factory, Object key) {
		if(key.equals("next")) {
			if(nextBehavior == null) {
				Instruction[] nextInstructions = new Instruction[] {
					new Instruction(Instruction.OPCODE_LOAD_FRAME, frame),
					new Instruction(Instruction.OPCODE_SP_FRAME_RESUME),
					new Instruction(Instruction.OPCODE_RET_FORWARD),
				};
				
				nextBehavior = factory.createBehavior(new CallFrameInfo(0, 0, nextInstructions));
			}
			return nextBehavior;
		}
		
		return super.getCallable(factory, key);
	}
	
	@Override
	public DictionaryProcess newBase() {
		// How to clone frame?
		return new GeneratorProcess(frame);
	}
}
