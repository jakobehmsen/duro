package duro.runtime;

public class ClosureProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final FrameProcess frame;
	public final BehaviorProcess behavior;
	public final int argumentOffset;
	public final int parameterCount;

	public ClosureProcess(FrameProcess frame, BehaviorProcess behavior, int argumentOffset, int parameterCount) {
		this.frame = frame;
		this.behavior = behavior;
		this.argumentOffset = argumentOffset;
		this.parameterCount = parameterCount;
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new ClosureProcess(frame, behavior, argumentOffset, parameterCount);
	}
}
