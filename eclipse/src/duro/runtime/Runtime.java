package duro.runtime;

import java.util.ArrayList;

import duro.transcriber.Journal;

public class Runtime {
	private Journal<Process, Instruction> journal;
	
	public Runtime(Journal<Process, Instruction> journal) {
		this.journal = journal;
	}

	public void resume(Process process) {
		// Start off where the process left of, which may be from its beginning
		
		ArrayList<Instruction> playedInstructions = new ArrayList<Instruction>();
		process.resume(playedInstructions);
		
		journal.log(playedInstructions);
	}
}
