package duro.runtime;

import java.io.Serializable;

public class CallFrameInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final int argumentCount;
	public final int variableCount;
	public final Instruction[] instructions;
	
	public CallFrameInfo(int argumentCount, int variableCount, Instruction[] instructions) {
		this.argumentCount = argumentCount;
		this.variableCount = variableCount;
		this.instructions = instructions;
	}
}
