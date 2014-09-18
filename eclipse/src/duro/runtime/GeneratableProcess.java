package duro.runtime;

public class GeneratableProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CallFrameInfo callFrameInfo;
	private Process self;
	private Object[] arguments;

	public GeneratableProcess(CallFrameInfo callFrameInfo, Process self, Object[] arguments) {
		this.callFrameInfo = callFrameInfo;
		this.self = self;
		this.arguments = arguments;
	}

	@Override
	public Object getCallable(Object key) {
		if(key.equals("iterator")) {
			Instruction[] instructions = new Instruction[] {
				new Instruction(Instruction.OPCODE_LOAD_FUNC, callFrameInfo),
				new Instruction(Instruction.OPCODE_LOAD_ANY, self),
				new Instruction(Instruction.OPCODE_LOAD_ARRAY, arguments),
				new Instruction(Instruction.OPCODE_SP_NEW_GENERATOR),
				new Instruction(Instruction.OPCODE_RET, 1)
			};

			return new CallFrameInfo(0, 0, instructions);
		}
		
		return super.getCallable(key);
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new GeneratableProcess(callFrameInfo, self, arguments);
	}
}
