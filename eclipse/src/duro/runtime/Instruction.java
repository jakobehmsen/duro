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
	public static final int OPCODE_STORE = 0;
	public static final int OPCODE_LOAD_INT = 1;
	public static final int OPCODE_PAUSE = 2;
	public static final int OPCODE_FINISH = 3;

	public final int opcode;
	public final Object operand1;
	
	public Instruction(int opcode) {
		this(opcode, null);
	}
	
	public Instruction(int opcode, Object operand1) {
		this.opcode = opcode;
		this.operand1 = operand1;
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
