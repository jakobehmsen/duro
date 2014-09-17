package duro.runtime;

import duro.runtime.CustomProcess.Frame;

public class ClosureProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomProcess.Frame frame;
	private CallFrameInfo callFrameInfo;

	public ClosureProcess(Frame frame, CallFrameInfo callFrameInfo) {
		this.frame = frame;
		this.callFrameInfo = callFrameInfo;
	}

	@Override
	public Object getCallable(Object key) {
		if(key.equals("call")) {
			Instruction[] instructions = new Instruction[] {
				new Instruction(Instruction.OPCODE_LOAD_FRAME, frame),
				new Instruction(Instruction.OPCODE_LOAD_FUNC, callFrameInfo),
				new Instruction(Instruction.OPCODE_EXEC_ON_FRAME),
				new Instruction(Instruction.OPCODE_RET, 1)
			};

			return new CallFrameInfo(0, 0, instructions);
		}
		
		return super.getCallable(key);
	}
}
