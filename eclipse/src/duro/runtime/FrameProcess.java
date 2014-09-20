package duro.runtime;

import duro.runtime.CustomProcess.Frame;

public class FrameProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomProcess.Frame frame;
	
	private BehaviorProcess senderBehavior;

	public FrameProcess(Frame frame) {
		this.frame = frame;
	}

	@Override
	public Object getCallable(ProcessFactory factory, Object key) {
		if(key.equals("sender")) {
			if(senderBehavior == null) {
				Instruction[] senderInstructions = new Instruction[] {
					new Instruction(Instruction.OPCODE_LOAD_THIS),
					new Instruction(Instruction.OPCODE_SP_FRAME_SENDER),
					new Instruction(Instruction.OPCODE_RET, 1)
				};
				
				senderBehavior = factory.createBehavior(0, 0, senderInstructions);
			}
			return senderBehavior;
		}
		
		return super.getCallable(factory, key);
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new FrameProcess(frame);
	}
}
