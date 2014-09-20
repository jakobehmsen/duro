package duro.runtime;

public class BehaviorProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CallFrameInfo callFrameInfo;

	public BehaviorProcess(CallFrameInfo callFrameInfo) {
		this.callFrameInfo = callFrameInfo;
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new BehaviorProcess(callFrameInfo);
	}
}
