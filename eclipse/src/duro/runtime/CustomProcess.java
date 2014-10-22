package duro.runtime;

import java.util.List;

import duro.runtime.InteractionHistory.Interaction;

public class CustomProcess extends Process {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FrameInfo behavior;

	public CustomProcess(FrameInfo behavior) {
		this.behavior = behavior;
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
}
