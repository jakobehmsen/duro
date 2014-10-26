package duro.runtime;

import java.util.List;

import duro.runtime.InteractionHistory.Interaction;

public class ActiveProcess extends Process {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Process environment;
	public Processor.Frame frame;

	public ActiveProcess(Process environment, Processor.Frame frame) {
		this.environment = environment;
		this.frame = frame;
	}
	
	@Override
	public Object getCallable(int selectorCode) {
		return null;
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
