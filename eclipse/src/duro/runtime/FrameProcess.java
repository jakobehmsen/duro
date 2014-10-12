package duro.runtime;

import duro.runtime.CustomProcess.Frame;

public class FrameProcess extends BuiltinProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomProcess.Frame frame;

	public FrameProcess(Process prototype, Frame frame) {
		super(prototype);
		this.frame = frame;
	}
	
//	@Override
//	public DictionaryProcess newBase() {
//		return new FrameProcess(frame);
//	}
}
