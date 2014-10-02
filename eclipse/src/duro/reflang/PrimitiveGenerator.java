package duro.reflang;

import java.util.List;

import duro.runtime.Instruction;

public interface PrimitiveGenerator {
	void enterPrimitive(List<Instruction> instructions);
	void exitPrimitive(List<Instruction> instructions);
}
