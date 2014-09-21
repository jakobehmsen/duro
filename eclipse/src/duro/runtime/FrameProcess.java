package duro.runtime;

import duro.runtime.CustomProcess.Frame;

public class FrameProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomProcess.Frame frame;

	public FrameProcess(Frame frame) {
		this.frame = frame;
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new FrameProcess(frame);
	}
}
