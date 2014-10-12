package duro.reflang;

import java.util.ArrayList;

import duro.runtime.Instruction;

public class CodeEmitter {
	// Support for labels?
	
	private ArrayList<Instruction> instructions = new ArrayList<Instruction>();
//	private int stackIndex;
//	private int maxStackSize;
	
	public void add(Instruction instruction) {
//		if(instruction != null) {
//			stackIndex -= Instruction.getPopCount(instruction);
//			stackIndex += Instruction.getPushCount(instruction);
//			if(stackIndex > maxStackSize)
//				maxStackSize = stackIndex;
//		} else {
//			// Assumed to be set later using the set method
//		}
		
//		stackIndex -= Instruction.getPopCount(instruction);
//		stackIndex += Instruction.getPushCount(instruction);
//		if(stackIndex > maxStackSize)
//			maxStackSize = stackIndex;
		
		instructions.add(instruction);
	}
	
	public void set(int index, Instruction instruction) {
		// Assumed only non stack affecting instruction are supplied here
		instructions.set(index, instruction);
	}
	
	public <T> T[] toArray(T[] a) {
		return instructions.toArray(a);
	}

	public int getMaxStackSize() {
		return getMaxStackSize(0, 0, 0);
	}

	private int getMaxStackSize(int stackIndex, int maxStackSize, int index) {
		for(int i = index; i < instructions.size(); ) {
			Instruction instruction = instructions.get(i);
			
			switch(instruction.opcode) {
			case Instruction.OPCODE_IF_TRUE:
			case Instruction.OPCODE_IF_FALSE: {
				stackIndex--;
				int jump = (int)instruction.operand1;
				if(jump >= 1) {
					int maxSizeOnJump = getMaxStackSize(stackIndex, maxStackSize, i + jump);
					int maxSizeOnStay = getMaxStackSize(stackIndex, maxStackSize, i + 1);
					return Math.max(maxSizeOnJump, maxSizeOnStay);
				} else {
					return maxStackSize;
				}
			} case Instruction.OPCODE_JUMP: {
				int jump = (int)instruction.operand1;
				if(jump >= 1) {
					i += jump;
					break;
				} else {
					return maxStackSize;
				}
			} default:
				stackIndex -= Instruction.getPopCount(instruction);
				stackIndex += Instruction.getPushCount(instruction);
				if(stackIndex > maxStackSize)
					maxStackSize = stackIndex;
				i++;
			}
		}
		
		return maxStackSize;
	}

	public int size() {
		return instructions.size();
	}
}
