package duro.runtime;

import java.util.ArrayList;

import duro.transcriber.Journal;

public class Runtime {
	private Journal<CustomProcess, InteractionHistory.Interaction> journal;
	
	public Runtime(Journal<CustomProcess, InteractionHistory.Interaction> journal) {
		this.journal = journal;
	}

	public void resume(Process process) {
		// Start off where the process left of, which may be from its beginning
		
		ArrayList<InteractionHistory.Interaction> playedInstructions = new ArrayList<InteractionHistory.Interaction>();
		process.resume(playedInstructions);
		
		journal.log(playedInstructions);
	}
}
