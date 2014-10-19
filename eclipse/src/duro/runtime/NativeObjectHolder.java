package duro.runtime;

import java.util.List;

import duro.runtime.InteractionHistory.Interaction;

public class NativeObjectHolder extends Process implements NativeInteroperable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Object nativeObject;

	public NativeObjectHolder(Object nativeObject) {
		this.nativeObject = nativeObject;
	}

	@Override
	public void resume(List<Interaction> playedInstructions) { }

	@Override
	public Object getCallable(int selectorCode) {
		return null;
	}

	@Override
	public Process lookup(int selectorCode) {
		return null;
	}

	@Override
	public String[] getNames() {
		return null;
	}

	@Override
	public void define(int selectorCode, Process value) { }

	@Override
	public void defineProto(int selectorCode, Process value) { }

	@Override
	public Object getNativeObject() {
		return nativeObject;
	}
}
