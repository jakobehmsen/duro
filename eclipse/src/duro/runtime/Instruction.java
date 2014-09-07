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
	public static final int OPCODE_INC_IP = 1;
	public static final int OPCODE_FINISH = 2;
	public static final int OPCODE_DUP = 3;
	public static final int OPCODE_STORE = 4;
	public static final int OPCODE_POP = 5;
	public static final int OPCODE_CALL = 6;
	public static final int OPCODE_RET = 7;
	public static final int OPCODE_DEF = 8;
	public static final int OPCODE_IF_FALSE = 9;
	public static final int OPCODE_JUMP = 10;
	public static final int OPCODE_LOAD_THIS = 11;
	public static final int OPCODE_LOAD_NULL = 12;
	public static final int OPCODE_LOAD_LOC = 13;
	public static final int OPCODE_LOAD_ARG = 14;
	public static final int OPCODE_LOAD_INT = 15;
	public static final int OPCODE_LOAD_FUNC = 16;
	public static final int OPCODE_LOAD_TRUE = 17;
	public static final int OPCODE_LOAD_FALSE = 18;
	
	public static final int OPCODE_SP_LOG = 65;
	public static final int OPCODE_SP_ADD = 66;
	public static final int OPCODE_SP_SUB = 67;
	public static final int OPCODE_SP_MULT = 68;
	public static final int OPCODE_SP_DIV = 69;


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
	
	private static Hashtable<Integer, String> opcodeToIdMap;
	private static Hashtable<String, Integer> idToOpcodeMap;
	
	private static String getNameFromOpcode(int opcode) {
		ensureMapCreated();
		
		return opcodeToIdMap.get(opcode);
	}

	private static void ensureMapCreated() {
		if(opcodeToIdMap == null) {
			opcodeToIdMap = new Hashtable<Integer, String>();
			idToOpcodeMap = new Hashtable<String, Integer>();
			
			try {
				for (Field field : Instruction.class.getDeclaredFields()) {
				    if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.getName().startsWith("OPCODE_")) {
				    	int fieldOpcode = (int)field.get(null);
				    	opcodeToIdMap.put(fieldOpcode, field.getName().substring("OPCODE_".length()));
				    	idToOpcodeMap.put(field.getName().substring("OPCODE_".length()).toLowerCase(), fieldOpcode);
				    }
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

	public static int getOpcodeFromId(String opcodeId) {
		ensureMapCreated();
		
		return idToOpcodeMap.get(opcodeId);
	}
	
	@Override
	public String toString() {
		ArrayList<Object> operands = new ArrayList<Object>();
		if(operand1 != null)
			operands.add(operand1);
		return getNameFromOpcode(opcode) + operands;
	}
}
