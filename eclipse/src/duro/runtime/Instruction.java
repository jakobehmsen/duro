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
	public static final int OPCODE_DUP1 = 4;
	public static final int OPCODE_DUP2 = 5;
	public static final int OPCODE_DUP_ANY = 6;
	public static final int OPCODE_STORE_LOC = 7;
	public static final int OPCODE_POP = 8;
	public static final int OPCODE_SWAP = 9;
	public static final int OPCODE_SWAP1 = 10;
	public static final int OPCODE_SWAP_ANY = 11;
	public static final int OPCODE_SEND = 12;
	public static final int OPCODE_CALL = 13;
	public static final int OPCODE_FORWARD_CALL = 14;
	public static final int OPCODE_RESUME = 15;
	public static final int OPCODE_RET = 16;
	public static final int OPCODE_RET_THIS = 17;
	public static final int OPCODE_RET_FORWARD = 18;
	public static final int OPCODE_IF_TRUE = 19;
	public static final int OPCODE_IF_FALSE = 20;
	public static final int OPCODE_JUMP = 21;
	public static final int OPCODE_SET = 22;
	public static final int OPCODE_GET = 23;
	public static final int OPCODE_EXEC_ON_FRAME = 24;
	public static final int OPCODE_LOAD_THIS = 25;
	public static final int OPCODE_LOAD_NULL = 26;
	public static final int OPCODE_LOAD_LOC = 27;
	public static final int OPCODE_LOAD_ARG = 28;
	public static final int OPCODE_LOAD_INT = 29;
	public static final int OPCODE_LOAD_FUNC = 30;
	public static final int OPCODE_LOAD_TRUE = 31;
	public static final int OPCODE_LOAD_FALSE = 32;
	public static final int OPCODE_LOAD_STRING = 33;
	public static final int OPCODE_LOAD_FRAME = 34;
	public static final int OPCODE_LOAD_ARRAY = 35;
	public static final int OPCODE_LOAD_ANY = 36;

	public static final int OPCODE_SP_OR = 65;
	public static final int OPCODE_SP_AND = 66;
	public static final int OPCODE_SP_EQUALS = 67;
	public static final int OPCODE_SP_GREATER = 68;
	public static final int OPCODE_SP_GREATER_EQUALS = 69;
	public static final int OPCODE_SP_LESS = 70;
	public static final int OPCODE_SP_LESS_EQUALS = 71;
	public static final int OPCODE_SP_NOT = 72;
	public static final int OPCODE_SP_ADD = 73;
	public static final int OPCODE_SP_SUB = 74;
	public static final int OPCODE_SP_MULT = 75;
	public static final int OPCODE_SP_DIV = 76;
	public static final int OPCODE_SP_REM = 77;
	public static final int OPCODE_SP_ARRAY_GET = 78;
	public static final int OPCODE_SP_ARRAY_SET = 79;
	public static final int OPCODE_SP_STRING_CONCAT = 80;
	public static final int OPCODE_SP_INT_ADD = 81;
	public static final int OPCODE_SP_INT_SUB = 82;
	public static final int OPCODE_SP_INT_MULT = 83;
	public static final int OPCODE_SP_INT_DIV = 84;
	public static final int OPCODE_SP_INT_REM = 85;
	public static final int OPCODE_SP_INT_EQUAL = 86;
	public static final int OPCODE_SP_INT_GREATER = 87;
	public static final int OPCODE_SP_INT_LESS = 88;
	public static final int OPCODE_SP_INT_TO_STRING = 89;

	public static final int OPCODE_SP_WRITE = 127;
	public static final int OPCODE_SP_NEXT_LINE = 128;
	public static final int OPCODE_SP_NEW_DICT = 129;
	public static final int OPCODE_SP_NEW_ARRAY = 130;
	public static final int OPCODE_SP_ARRAY_LENGTH = 131;
	public static final int OPCODE_SP_LOAD = 132;
	public static final int OPCODE_SP_NEW_GENERATOR = 133;
	public static final int OPCODE_SP_NEW_GENERATABLE = 134;
	public static final int OPCODE_SP_NEW_CLOSURE = 135;
	public static final int OPCODE_SP_CLONE = 136;
	
	public static final int OPCODE_BREAK_POINT = 255;

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

	public static boolean isReturn(int opcode) {
		return opcode == OPCODE_RET || opcode == OPCODE_RET_THIS || opcode == OPCODE_RET_FORWARD;
	}
}
