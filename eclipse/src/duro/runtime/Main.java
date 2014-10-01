package duro.runtime;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

import duro.transcriber.Journal;

public class Main {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Please supply path of object code.");
			return;
		}
		
		String mainObjectCodePath = args[0];
		String mainObjectCodeJournalPath = mainObjectCodePath + ".jnl";
		try {
			CustomProcess mainProcess;
			
			try (ObjectInput oo = new ObjectInputStream(new FileInputStream(mainObjectCodePath))) {
				mainProcess = (CustomProcess) oo.readObject();
		    }
			
			Journal<InteractionHistory.Interaction> journal = Journal.read(mainObjectCodeJournalPath);
			List<InteractionHistory.Interaction> commands = journal.getCommands();
			
			InteractionHistory interactionHistory = new InteractionHistory(commands);
			mainProcess.replay(interactionHistory);
			if(interactionHistory.hasNewInteractions())
				journal.log(interactionHistory.getNewInteractions());
			
//			duro.runtime.Runtime runtime = new Runtime(journal);
//			runtime.resume(mainProcess);
			journal.close();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
