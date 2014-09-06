package duro.runtime;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Hashtable;

public class Instruction implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int OPCODE_PAUSE = 0;
	public static final int OPCODE_FINISH = 1;
	public static final int OPCODE_DUP = 2;
	public static final int OPCODE_STORE = 3;
	public static final int OPCODE_POP = 4;
	public static final int OPCODE_CALL = 5;
	public static final int OPCODE_RET = 6;
	public static final int OPCODE_LOAD_THIS = 7;
	public static final int OPCODE_LOAD_NULL = 8;
	public static final int OPCODE_LOAD_LOC = 9;
	public static final int OPCODE_LOAD_ARG = 10;
	public static final int OPCODE_LOAD_INT = 11;
	
	public static final int OPCODE_SPECIAL_LOG = 65;

	public final int opcode;
	public final Object operand1;
	public final Object operand2;
	
	public Instruction(int opcode) {
		this(opcode, null);
	}
	
	public Instruction(int opcode, Object operand1) {
		this(opcode, operand1, null);
	}
	
	public Instruction(int opcode, Object operand1, Object operand2) {
		this.opcode = opcode;
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	private static Hashtable<Integer, String> opcodeToNameMape;
	
	private String getNameFromOpcode(int opcode) {
		if(opcodeToNameMape == null) {
			opcodeToNameMape = new Hashtable<Integer, String>();
			try {
				for (Field field : Instruction.class.getDeclaredFields()) {
				    if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.getName().startsWith("OPCODE_")) {
				    	int fieldOpcode = (int)field.get(null);
				    	opcodeToNameMape.put(fieldOpcode, field.getName().substring("OPCODE_".length()));
				    }
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
		return opcodeToNameMape.get(opcode);
	}
	
	@Override
	public String toString() {
		ArrayList<Object> operands = new ArrayList<Object>();
		if(operand1 != null)
			operands.add(operand1);
		return getNameFromOpcode(opcode) + operands;
	}
}
