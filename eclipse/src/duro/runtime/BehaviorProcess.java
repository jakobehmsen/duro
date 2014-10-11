package duro.runtime;

public class BehaviorProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int parameterCount;
	public int variableCount;
	public Instruction[] instructions;
	
	public BehaviorProcess(int parameterCount, int variableCount, Instruction[] instructions) {
		this.parameterCount = parameterCount;
		this.variableCount = variableCount;
		this.instructions = instructions;
	}

	@Override
	public DictionaryProcess newBase() {
		return new BehaviorProcess(parameterCount, variableCount, instructions);
	}
}
