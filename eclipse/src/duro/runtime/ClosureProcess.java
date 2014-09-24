package duro.runtime;

public class ClosureProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final FrameProcess frame;
	public final BehaviorProcess behavior;
	public int[] ordinals;

	public ClosureProcess(FrameProcess frame, BehaviorProcess behavior, int[] ordinals) {
		this.frame = frame;
		this.behavior = behavior;
		this.ordinals = ordinals;
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new ClosureProcess(frame, behavior, ordinals);
	}
}
