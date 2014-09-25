package duro.runtime;

import java.io.Serializable;
import java.util.List;

public abstract class Process implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract void resume(List<InteractionHistory.Interaction> playedInstructions);

	public abstract Object getCallable(ProcessFactory factory, Object key);

	public abstract Process lookup(Object key);

	public abstract String[] getNames();

	public abstract void define(Object key, Process value);

	public abstract void defineProto(Object key, Process value);
}
