package duro.runtime;

import duro.runtime.CustomProcess.Frame;

public class ClosureProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FrameProcess frame;
	private CallFrameInfo callFrameInfo;
	
	private CallFrameInfo callCallFrameInfo;

	public ClosureProcess(FrameProcess frame, CallFrameInfo callFrameInfo) {
		this.frame = frame;
		this.callFrameInfo = callFrameInfo;
		
		Instruction[] callInstructions = new Instruction[] {
			new Instruction(Instruction.OPCODE_LOAD_THIS_REIFIED_FRAME, frame),
			new Instruction(Instruction.OPCODE_LOAD_FUNC, callFrameInfo),
			new Instruction(Instruction.OPCODE_EXEC_ON_FRAME),
			new Instruction(Instruction.OPCODE_RET, 1)
		};
		
		callCallFrameInfo = new CallFrameInfo(0, 0, callInstructions);
	}

	@Override
	public Object getCallable(Object key) {
		if(key.equals("call"))
			return callCallFrameInfo;
		
		return super.getCallable(key);
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new ClosureProcess(frame, callFrameInfo);
	}
}
