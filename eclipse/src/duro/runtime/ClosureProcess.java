package duro.runtime;

public class ClosureProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FrameProcess frame;
	private BehaviorProcess behavior;
	
	private BehaviorProcess callBehavior;

	public ClosureProcess(FrameProcess frame, BehaviorProcess behavior) {
		this.frame = frame;
		this.behavior = behavior;
	}

	@Override
	public Object getCallable(ProcessFactory factory, Object key) {
		if(key.equals("call")) {
			if(callBehavior == null) {
				Instruction[] callInstructions = new Instruction[] {
					new Instruction(Instruction.OPCODE_LOAD_FRAME, frame),
					new Instruction(Instruction.OPCODE_LOAD_BEHAVIOR, behavior),
					new Instruction(Instruction.OPCODE_EXEC_ON_FRAME),
					new Instruction(Instruction.OPCODE_RET, 1)
				};
				
				callBehavior = factory.createBehavior(0, 0, callInstructions);
			}
			return callBehavior;
		}
		
		return super.getCallable(factory, key);
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new ClosureProcess(frame, behavior);
	}
}
