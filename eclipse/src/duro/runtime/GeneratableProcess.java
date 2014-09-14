package duro.runtime;

public class GeneratableProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CallFrameInfo callFrameInfo;
	private Object[] arguments;

	public GeneratableProcess(CallFrameInfo callFrameInfo, Object[] arguments) {
		this.callFrameInfo = callFrameInfo;
		this.arguments = arguments;
	}

	@Override
	public CallFrameInfo getInstructions(Object key) {
		if(key.equals("iterator")) {
//			generatorInstructions.add(new Instruction(Instruction.OPCODE_LOAD_FUNC, new CallFrameInfo(parameterCount, variableCount, iteratorInstructions.toArray(new Instruction[iteratorInstructions.size()]))));
//			// Forward arguments
//			for(int i = 0; i < parameterCount; i++)
//				generatorInstructions.add(new Instruction(Instruction.OPCODE_LOAD_ARG, i));
//			// A generator is a special object, which understands a single kind of message: next
//			generatorInstructions.add(new Instruction(Instruction.OPCODE_SP_NEW_GENERATOR, parameterCount));
//			generatorInstructions.add(new Instruction(Instruction.OPCODE_RET, 1));
			
			Instruction[] instructions = new Instruction[] {
				new Instruction(Instruction.OPCODE_LOAD_FUNC, callFrameInfo),
				new Instruction(Instruction.OPCODE_LOAD_ARRAY, arguments),
				new Instruction(Instruction.OPCODE_SP_NEW_GENERATOR),
				new Instruction(Instruction.OPCODE_RET, 1)
			};
			
//			instructions[0] = new Instruction(Instruction.OPCODE_LOAD_FUNC, callFrameInfo);
//			for(int i = 0; i < arguments.length; i++)
//				instructions[1 + i] = new Instruction(Instruction.OPCODE_LOAD_ARG, i));
			return new CallFrameInfo(0, 0, instructions);
		}
		
		return super.getInstructions(key);
	}
}
