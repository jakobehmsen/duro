package duro.runtime;

public class GeneratableProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BehaviorProcess behavior;
	private Process self;
	private Object[] arguments;
	
	private BehaviorProcess iteratorBehavior;

	public GeneratableProcess(BehaviorProcess behavior, Process self, Object[] arguments) {
		this.behavior = behavior;
		this.self = self;
		this.arguments = arguments;
	}

	@Override
	public Object getCallable(ProcessFactory factory, Object key) {
		if(key.equals("iterator")) {
			if(iteratorBehavior == null) {
				Instruction[] iteratorInstructions = new Instruction[] {
					new Instruction(Instruction.OPCODE_LOAD_BEHAVIOR, behavior),
					new Instruction(Instruction.OPCODE_LOAD_ANY, self),
					new Instruction(Instruction.OPCODE_LOAD_ARRAY, arguments),
					new Instruction(Instruction.OPCODE_SP_NEW_GENERATOR),
					new Instruction(Instruction.OPCODE_RET, 1)
				};
				
				iteratorBehavior = factory.createBehavior(0, 0, iteratorInstructions);
			}
			return iteratorBehavior;
		}
		
		return super.getCallable(factory, key);
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new GeneratableProcess(behavior, self, arguments);
	}
}
