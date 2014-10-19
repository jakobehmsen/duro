package duro.runtime;

public class FrameProcess extends BuiltinProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Processor.Frame frame;

	public FrameProcess(Process prototype, Processor.Frame frame) {
		super(prototype);
		this.frame = frame;
	}
	
//	@Override
//	public DictionaryProcess newBase() {
//		return new FrameProcess(frame);
//	}
}
