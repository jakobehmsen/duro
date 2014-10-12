package duro.runtime;

public class BehaviorProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int localCount; // receiver + arguments + variables
	public int maxStackSize; // stack
	public Instruction[] instructions;
	
	public BehaviorProcess(int localCount, int maxStackSize, Instruction[] instructions) {
		this.localCount = localCount;
		this.maxStackSize = maxStackSize;
		this.instructions = instructions;
	}

	@Override
	public DictionaryProcess newBase() {
		return new BehaviorProcess(localCount, maxStackSize, instructions);
	}
}
