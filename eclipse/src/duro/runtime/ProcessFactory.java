package duro.runtime;

public interface ProcessFactory {
	BehaviorProcess createBehavior(CallFrameInfo callFrameInfo);
}
