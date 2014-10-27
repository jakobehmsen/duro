package duro.runtime;

import java.util.List;

import duro.reflang.SymbolTable;
import duro.runtime.InteractionHistory.Interaction;
import duro.runtime.Processor.Frame;

public class ActiveProcess extends Process {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Process environment;
	private Processor.Frame frame;
	private Frame messageFrame;

	public ActiveProcess(Process environment, Processor.Frame frame, Frame messageFrame) {
		this.environment = environment;
		this.frame = frame;
		this.messageFrame = messageFrame;
	}
	
	@Override
	public Object getCallable(Frame currentFrame, int selectorCode, int arity) {
		messageFrame = currentFrame;
		frame.instructionPointer++;
		frame.instructions[frame.instructions.length - 1] = new Instruction(Instruction.OPCODE_FINISH);
		return frame;
	}
	
	public final String getMessageId(SymbolTable symbolTable) {
		return symbolTable.getIdFromSymbolCode(getMessageSelector()).getId();
	}
	
	private final int getMessageSelector() {
		Instruction instruction = messageFrame.instructions[messageFrame.instructionPointer];
		switch(instruction.opcode) {
		case Instruction.OPCODE_SEND_CODE:
		case Instruction.OPCODE_SEND_CODE_0:
		case Instruction.OPCODE_SEND_CODE_1:
		case Instruction.OPCODE_SEND_CODE_2:
		case Instruction.OPCODE_SEND_CODE_3:
			return (int)instruction.operand1;
		default:
			return SymbolTable.Codes.call;
		}
	}
	
	public final int getMessageArity() {
		Instruction instruction = messageFrame.instructions[messageFrame.instructionPointer];
		switch(instruction.opcode) {
		case Instruction.OPCODE_SEND_CODE:
		case Instruction.OPCODE_SEND_CODE_0:
		case Instruction.OPCODE_SEND_CODE_1:
		case Instruction.OPCODE_SEND_CODE_2:
		case Instruction.OPCODE_SEND_CODE_3:
			return (int)instruction.operand2;
		default:
			return 0;
		}
	}
	
	@Override
	public void define(int selectorCode, Process value) {

	}
	
	@Override
	public void defineProto(int selectorCode, Process value) {

	}
	
	@Override
	public void defineShared(int selectorCode, Process value) {
		// TODO Auto-generated method stub
		
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
