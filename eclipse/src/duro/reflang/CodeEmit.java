package duro.reflang;

import java.util.List;
import java.util.Map;

import duro.runtime.Instruction;

public interface CodeEmit {
	void allocate(List<Instruction> instructions, Map<Label, Integer> labelToIndex);
	void deploy(List<Instruction> instructions, int start, int end, Map<Label, Integer> labelToIndex);
}
