package duro.runtime;

import java.util.List;

import duro.runtime.InteractionHistory.Interaction;

public class BuiltinProcess extends Process {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Process prototype;

	public BuiltinProcess(Process prototype) {
		this.prototype = prototype;
	}

	@Override
	public void resume(List<Interaction> playedInstructions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getCallable(int selectorCode) {
		return prototype.getCallable(selectorCode);
	}

	@Override
	public Process lookup(int selectorCode) {
		return prototype.lookup(selectorCode);
	}

	@Override
	public String[] getNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void define(int selectorCode, Process value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defineProto(int selectorCode, Process value) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void defineShared(int selectorCode, Process value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDefined(int code) {
		return prototype.isDefined(code);
	}
	
	@Override
	public Process getEnvironment() {
		return this;
	}
}
