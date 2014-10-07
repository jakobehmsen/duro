package duro.runtime;

import java.io.Serializable;
import java.util.List;

public abstract class Process implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract void resume(List<InteractionHistory.Interaction> playedInstructions);

	public abstract Object getCallable(ProcessFactory factory, int selectorCode);

	public abstract Process lookup(int selectorCode);

	public abstract String[] getNames();

	public abstract void define(int selectorCode, Process value);

	public abstract void defineProto(int selectorCode, Process value);
}
