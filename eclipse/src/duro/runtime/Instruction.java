package duro.runtime;

public class Instruction {
	public static final int OPCODE_STORE = 0;
	public static final int OPCODE_LOAD_INT = 1;
	public static final int OPCODE_PAUSE = 2;

	public final int opcode;
	public final Object operand1;
	
	public Instruction(int opcode) {
		this(opcode, null);
	}
	
	public Instruction(int opcode, Object operand1) {
		this.opcode = opcode;
		this.operand1 = operand1;
	}
}
