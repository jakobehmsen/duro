package duro.runtime;

public class CustomProcess extends Process {
	public final int variableCount;
	public final Instruction[] instructions;

	public CustomProcess(int variableCount, Instruction[] instructions) {
		this.variableCount = variableCount;
		this.instructions = instructions;
	}
}
