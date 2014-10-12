package duro.reflang;

import java.util.ArrayList;

import duro.runtime.Instruction;

public class CodeEmitter {
	private ArrayList<Instruction> instructions = new ArrayList<Instruction>();
	private int stackIndex;
	private int maxStackSize;
	
	public void add(Instruction instruction) {
//		if(instruction != null) {
//			stackIndex -= Instruction.getPopCount(instruction);
//			stackIndex += Instruction.getPushCount(instruction);
//			if(stackIndex > maxStackSize)
//				maxStackSize = stackIndex;
//		} else {
//			// Assumed to be set later using the set method
//		}
		
		stackIndex -= Instruction.getPopCount(instruction);
		stackIndex += Instruction.getPushCount(instruction);
		if(stackIndex > maxStackSize)
			maxStackSize = stackIndex;
		
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
		return maxStackSize;
	}

	public int size() {
		return instructions.size();
	}
}
