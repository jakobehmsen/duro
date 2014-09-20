package duro.runtime;

public interface ProcessFactory {
	BehaviorProcess createBehavior(int parameterCount, int variableCount, Instruction[] instructions);
}
