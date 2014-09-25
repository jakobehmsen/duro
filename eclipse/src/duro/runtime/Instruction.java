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
	public static final int OPCODE_RET = 15;
	public static final int OPCODE_RET_THIS = 16;
	public static final int OPCODE_RET_FORWARD = 17;
	public static final int OPCODE_IF_TRUE = 18;
	public static final int OPCODE_IF_FALSE = 19;
	public static final int OPCODE_JUMP = 20;
	public static final int OPCODE_SET = 21;
	public static final int OPCODE_SET_PROTO = 22;
	public static final int OPCODE_GET = 23;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_CALL_CLOSURE = 24;
	public static final int OPCODE_EXTEND_INTER_ID = 25;
	public static final int OPCODE_SHRINK_INTER_ID = 26;
	public static final int OPCODE_LOAD_THIS = 27;
	public static final int OPCODE_LOAD_NULL = 28;
	public static final int OPCODE_LOAD_LOC = 29;
	public static final int OPCODE_LOAD_ARG = 30;
	public static final int OPCODE_LOAD_INT = 31;
	public static final int OPCODE_LOAD_TRUE = 32;
	public static final int OPCODE_LOAD_FALSE = 33;
	public static final int OPCODE_LOAD_STRING = 34;
	public static final int OPCODE_LOAD_ARRAY = 35;
	public static final int OPCODE_LOAD_THIS_FRAME = 36;
	public static final int OPCODE_LOAD_FRAME = 37;
	public static final int OPCODE_LOAD_BEHAVIOR = 38;

	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_BOOLEAN_OR = 65;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_BOOLEAN_AND = 66;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_BOOLEAN_NOT = 67;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_ARRAY_GET = 68;
	@ExpressionCompatible
	public static final int OPCODE_SP_ARRAY_SET = 69;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_STRING_CONCAT = 70;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_STRING_EQUAL = 71;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_INT_ADD = 72;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_INT_SUB = 73;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_INT_MULT = 74;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_INT_DIV = 75;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_INT_REM = 76;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_INT_EQUAL = 77;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_INT_GREATER = 78;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_INT_LESS = 79;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_INT_TO_STRING = 80;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_FRAME_SENDER = 81;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_FRAME_SET_SENDER = 82;
	@ExpressionCompatible
	public static final int OPCODE_SP_FRAME_RESUME = 83;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_REF_EQUAL = 84;

	@ExpressionCompatible
	public static final int OPCODE_SP_WRITE = 127;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_NEXT_LINE = 128;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_NEW_DICT = 129;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_NEW_ARRAY = 130;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_ARRAY_LENGTH = 131;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_LOAD = 132;
	public static final int OPCODE_SP_NEW_CLOSURE = 133;
	public static final int OPCODE_SP_NEW_BEHAVIOR = 134;
	@ExpressionCompatible @DoesReturn
	public static final int OPCODE_SP_CLONE = 135;
	
	public static final int OPCODE_BREAK_POINT = 255;

	public final int opcode;
	public final Object operand1;
	public final Object operand2;
	public final Object operand3;
	
	public Instruction(int opcode) {
		this(opcode, null);
	}
	
	public Instruction(int opcode, Object operand1) {
		this(opcode, operand1, null);
	}
	
	public Instruction(int opcode, Object operand1, Object operand2) {
		this(opcode, operand1, operand2, null);
	}
	
	public Instruction(int opcode, Object operand1, Object operand2, Object operand3) {
		this.opcode = opcode;
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operand3 = operand3;
	}
	
	private static class InstructionInfo {
		public final String name;
		public final ExpressionCompatible expressionCompatible;
		public final DoesReturn doesReturn;
		
		public InstructionInfo(String name, ExpressionCompatible expressionCompatible, DoesReturn doesReturn) {
			this.name = name;
			this.expressionCompatible = expressionCompatible;
			this.doesReturn = doesReturn;
		}
	}
	
	private static Hashtable<Integer, InstructionInfo> opcodeToIdMap;
	private static Hashtable<String, Integer> idToOpcodeMap;
	
	private static String getNameFromOpcode(int opcode) {
		ensureMapCreated();
		
		return opcodeToIdMap.get(opcode).name;
	}

	private static void ensureMapCreated() {
		if(opcodeToIdMap == null) {
			opcodeToIdMap = new Hashtable<Integer, InstructionInfo>();
			idToOpcodeMap = new Hashtable<String, Integer>();
			
			try {
				for (Field field : Instruction.class.getDeclaredFields()) {
				    if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.getName().startsWith("OPCODE_")) {
				    	int fieldOpcode = (int)field.get(null);
				    	String name = field.getName().substring("OPCODE_".length());
				    	
				    	InstructionInfo info = new InstructionInfo(name, field.getDeclaredAnnotation(ExpressionCompatible.class), field.getDeclaredAnnotation(DoesReturn.class));
				    	
				    	opcodeToIdMap.put(fieldOpcode, info);
				    	idToOpcodeMap.put(name.toLowerCase(), fieldOpcode);
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
		if(operand2 != null)
			operands.add(operand2);
		if(operand3 != null)
			operands.add(operand3);
		return getNameFromOpcode(opcode) + operands;
	}

	public static boolean isReturn(int opcode) {
		return opcode == OPCODE_RET || opcode == OPCODE_RET_THIS || opcode == OPCODE_RET_FORWARD;
	}
	
	public static boolean isExpressionCompatible(int opcode) {
		ensureMapCreated();
		
		return opcodeToIdMap.get(opcode).expressionCompatible != null;
	}

	public static boolean doesReturn(int opcode) {
		ensureMapCreated();
		
		return opcodeToIdMap.get(opcode).doesReturn != null;
	}
}
