package duro.runtime;

import duro.runtime.Processor.Frame;

public class MessageInfo {
	public Processor.Frame frame;
	public int selectorCode;
	public int arity;
	
	public MessageInfo(Frame frame, int selectorCode, int arity) {
		this.frame = frame;
		this.selectorCode = selectorCode;
		this.arity = arity;
	}
}
