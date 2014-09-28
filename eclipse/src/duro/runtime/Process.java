package duro.runtime;

import java.io.Serializable;
import java.util.List;

public abstract class Process implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract void resume(List<InteractionHistory.Interaction> playedInstructions);

	public abstract Object getCallable(ProcessFactory factory, Selector selector);

	public abstract Process lookup(Selector selector);

	public abstract String[] getNames();

	public abstract void define(Selector selector, Process value);

	public abstract void defineProto(Selector selector, Process value);
}
