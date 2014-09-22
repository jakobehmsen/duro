package duro.runtime;

import java.io.IOException;

import duro.transcriber.Journal;

public class Main {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Please supply path of journal.");
			return;
		}
		
		String path = args[0];
		try {
			Journal<CustomProcess, InteractionHistory.Interaction> journal = Journal.read(path);
			duro.runtime.Runtime runtime = new Runtime(journal);
			runtime.resume(journal.getRoot());
			journal.close();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
