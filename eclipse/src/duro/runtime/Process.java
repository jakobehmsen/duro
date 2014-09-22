package duro.runtime;

import java.io.Serializable;
import java.util.List;

import duro.transcriber.Player;

public abstract class Process implements Serializable, Player<Instruction> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract void replay(List<Instruction> commands);

	public abstract void resume(List<Instruction> playedInstructions);

	public abstract Object getCallable(ProcessFactory factory, Object key);

	public abstract void define(Object key, Process value);

	public abstract Process lookup(Object key);

	public abstract void defineProto(Object key, Process value);
}
