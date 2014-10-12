package duro.runtime;

public class BehaviorProcess extends BuiltinProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int localCount; // receiver + arguments + variables
	public int maxStackSize; // stack
	public Instruction[] instructions;
	
	public BehaviorProcess(Process prototype, int localCount, int maxStackSize, Instruction[] instructions) {
		super(prototype);
		this.localCount = localCount;
		this.maxStackSize = maxStackSize;
		this.instructions = instructions;
	}

//	@Override
//	public DictionaryProcess newBase() {
//		return new BehaviorProcess(localCount, maxStackSize, instructions);
//	}
}
