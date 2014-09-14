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
	public static final int OPCODE_RESUME = 14;
	public static final int OPCODE_RET = 15;
	public static final int OPCODE_RET_THIS = 16;
	public static final int OPCODE_RET_FORWARD = 17;
	public static final int OPCODE_DEF = 18;
	public static final int OPCODE_IF_TRUE = 19;
	public static final int OPCODE_IF_FALSE = 20;
	public static final int OPCODE_JUMP = 21;
	public static final int OPCODE_SET = 22;
	public static final int OPCODE_GET = 23;
	public static final int OPCODE_LOAD_THIS = 24;
	public static final int OPCODE_LOAD_NULL = 25;
	public static final int OPCODE_LOAD_LOC = 26;
	public static final int OPCODE_LOAD_ARG = 27;
	public static final int OPCODE_LOAD_INT = 28;
	public static final int OPCODE_LOAD_FUNC = 29;
	public static final int OPCODE_LOAD_TRUE = 30;
	public static final int OPCODE_LOAD_FALSE = 31;
	public static final int OPCODE_LOAD_STRING = 32;
	public static final int OPCODE_LOAD_FRAME = 33;
	public static final int OPCODE_LOAD_ARRAY = 34;

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

	public static final int OPCODE_SP_WRITE = 127;
	public static final int OPCODE_SP_NEXT_LINE = 128;
	public static final int OPCODE_SP_TO_IT = 129;
	public static final int OPCODE_SP_HAS_NEXT = 130;
	public static final int OPCODE_SP_NEXT = 131;
	public static final int OPCODE_SP_NEW_DICT = 132;
	public static final int OPCODE_SP_NEW_ARRAY = 133;
	public static final int OPCODE_SP_ARRAY_LENGTH = 134;
	public static final int OPCODE_SP_LOAD = 135;
	public static final int OPCODE_SP_NEW_GENERATOR = 136;
	public static final int OPCODE_SP_NEW_GENERATABLE = 137;

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
