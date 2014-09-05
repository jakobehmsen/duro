package duro.runtime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import duro.transcriber.Player;

public abstract class Process implements Serializable, Player<Instruction> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract void replay(List<Instruction> commands);

	public abstract void resume(List<Instruction> playedInstructions);
}
