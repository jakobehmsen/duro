package duro.runtime;

import java.util.List;

import duro.reflang.SymbolTable;
import duro.runtime.InteractionHistory.Interaction;

public class ActiveProcess extends Process {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Process environment;
	private Processor.Frame frame;
//	private Frame messageFrame;

	public ActiveProcess(Process environment, Processor.Frame frame /*Frame messageFrame,*/) {
		this.environment = environment;
		this.frame = frame;
//		this.messageFrame = messageFrame;
//		this.processor = processor;
	}
	
	@Override
	public Object getCallable(Processor processor, int selectorCode, int arity) {
		Process envelope = processor.getEnvelopeFromHere(this, selectorCode, arity);
		frame.push(envelope);
		
//		messageFrame = currentFrame;
		frame.instructionPointer++;
		frame.instructions[frame.instructions.length - 1] = new Instruction(Instruction.OPCODE_FINISH);
		return frame;
	}
	
//	public final String getMessageId(SymbolTable symbolTable) {
//		return symbolTable.getIdFromSymbolCode(getMessageSelector()).getId();
//	}
	
//	private final int getMessageSelector() {
//		Instruction instruction = messageFrame.instructions[messageFrame.instructionPointer];
//		switch(instruction.opcode) {
//		case Instruction.OPCODE_SEND_CODE:
//		case Instruction.OPCODE_SEND_CODE_0:
//		case Instruction.OPCODE_SEND_CODE_1:
//		case Instruction.OPCODE_SEND_CODE_2:
//		case Instruction.OPCODE_SEND_CODE_3:
//			return (int)instruction.operand1;
//		default:
//			return SymbolTable.Codes.call;
//		}
//	}
	
//	public final int getMessageArity() {
//		Instruction instruction = messageFrame.instructions[messageFrame.instructionPointer];
//		switch(instruction.opcode) {
//		case Instruction.OPCODE_SEND_CODE:
//		case Instruction.OPCODE_SEND_CODE_0:
//		case Instruction.OPCODE_SEND_CODE_1:
//		case Instruction.OPCODE_SEND_CODE_2:
//		case Instruction.OPCODE_SEND_CODE_3:
//			return (int)instruction.operand2;
//		default:
//			return 0;
//		}
//	}

//	public final Process getMessageArg(int ordinal) {
//		int peek = (getMessageArity() - 1) - ordinal;
//		switch(peek) {
//		case 0:
//			return messageFrame.peek();
//		case 1:
//			return messageFrame.peek1();
//		case 2:
//			return messageFrame.peek2();
//		case 3:
//			return messageFrame.peek3();
//		default:
//			return messageFrame.peekn(peek);
//		}
//	}

	@Override
	public void sentReply() {
		frame.instructions[frame.instructions.length - 1] = new Instruction(Instruction.OPCODE_HALT);
	}
	
//	private Process pendingReply;
//
//	public final void messageReply(Process answer) {
//		pendingReply = answer;
//		frame.instructions[frame.instructions.length - 1] = new Instruction(Instruction.OPCODE_HALT);
//	}
	
//	public final void halt() {
//		if(pendingReply != null) {
//			int arity = getMessageArity(); 
//			switch(arity) {
//			case 0:
//				messageFrame.set0(pendingReply);
//				break;
//			case 1:
//				messageFrame.pop1();
//				messageFrame.set0(pendingReply);
//				break;
//			case 2:
//				messageFrame.pop2();
//				messageFrame.set0(pendingReply);
//				break;
//			case 3:
//				messageFrame.pop3();
//				messageFrame.set0(pendingReply);
//				break;
//			case 4:
//				messageFrame.pop4();
//				messageFrame.set0(pendingReply);
//				break;
//			default:
//				messageFrame.popN(arity);
//				messageFrame.set0(pendingReply);
//				break;
//			}
//			pendingReply = null;
//			messageFrame = null;
//		}
//	}
	
	@Override
	public void define(int selectorCode, Process value) {

	}
	
	@Override
	public void defineProto(int selectorCode, Process value) {

	}

	@Override
	public Process lookup(int selectorCode) {
		return null;
	}

	@Override
	public String[] getNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resume(List<Interaction> playedInstructions) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean isDefined(int code) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Process getEnvironment() {
		return environment;
	}
}
