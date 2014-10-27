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
	
	private MessageInfo currentMessage;

	public ActiveProcess(Process environment, Processor.Frame frame) {
		this.environment = environment;
		this.frame = frame;
		currentMessage = new MessageInfo(null, SymbolTable.Codes.call, 0);
	}
	
	@Override
	public Object getCallable(Frame currentFrame, int selectorCode, int arity) {
		currentMessage.frame = currentFrame;
		// Could messageId, messageArity, and messageArgs be derived from the currentFrame itself? Its current instructions?
		currentMessage.selectorCode = selectorCode;
		currentMessage.arity = arity;
		frame.instructionPointer++;
		// Active processes changes behavior it now has dependents; thus, it should stall all outer activity
		// Infinite loop? Finish?
		frame.instructions[frame.instructions.length - 1] = new Instruction(Instruction.OPCODE_FINISH);
		return frame;
	}
	
	public final String getMessageId(SymbolTable symbolTable) {
		return symbolTable.getIdFromSymbolCode(currentMessage.selectorCode).getId();
	}
	
	public final int getMessageArity() {
		return currentMessage.arity;
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
