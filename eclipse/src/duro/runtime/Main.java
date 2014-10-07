package duro.runtime;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

import duro.debugging.Debug;
import duro.reflang.SymbolTable;
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
			Debug.println(Debug.LEVEL_MEDIUM, "Reading main process...");
			long startReadMainProcess = System.currentTimeMillis();
			CustomProcess mainProcess;
			
			try (ObjectInput oo = new ObjectInputStream(new FileInputStream(mainObjectCodePath))) {
				mainProcess = (CustomProcess) oo.readObject();
				SymbolTable symbolTable = SymbolTable.ROOT;
				mainProcess.setSymbolTable(symbolTable);
		    }
			long endReadMainProcess = System.currentTimeMillis();
			Debug.println(Debug.LEVEL_MEDIUM, "Read main process.");
			Debug.println(Debug.LEVEL_MEDIUM, "Read main process time: " + (endReadMainProcess - startReadMainProcess));

			Debug.println(Debug.LEVEL_MEDIUM, "Reading interaction history...");
			long startReadInteractionHistory = System.currentTimeMillis();
			Journal<InteractionHistory.Interaction> journal = Journal.read(mainObjectCodeJournalPath);
			List<InteractionHistory.Interaction> commands = journal.getCommands();
			long endReadInteractionHistory = System.currentTimeMillis();
			
			InteractionHistory interactionHistory = new InteractionHistory(commands);
			Debug.println(Debug.LEVEL_MEDIUM, "Read interaction history.");
			Debug.println(Debug.LEVEL_MEDIUM, "Read interaction history time: " + (endReadInteractionHistory - startReadInteractionHistory));

			Debug.println(Debug.LEVEL_MEDIUM, "Running...");
			long startEvaluation = System.currentTimeMillis();
			mainProcess.replay(interactionHistory);
			long endEvaluation = System.currentTimeMillis();
			Debug.println(Debug.LEVEL_MEDIUM, "Ran.");
			Debug.println(Debug.LEVEL_MEDIUM, "Ran time: " + (endEvaluation - startEvaluation));
			
			Debug.println(Debug.LEVEL_MEDIUM, "Logging interactions...");
			long startLoggingInteractions = System.currentTimeMillis();
			if(interactionHistory.hasNewInteractions())
				journal.log(interactionHistory.getNewInteractions());
			
			journal.close();
			long endLoggingInteractions = System.currentTimeMillis();
			Debug.println(Debug.LEVEL_MEDIUM, "Logged interactions.");
			Debug.println(Debug.LEVEL_MEDIUM, "Logged interactions time: " + (endLoggingInteractions - startLoggingInteractions));
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
