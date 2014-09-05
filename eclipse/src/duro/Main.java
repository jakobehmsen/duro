package duro;

import java.io.FileInputStream;
import java.io.IOException;

import duro.runtime.Instruction;
import duro.runtime.Runtime;
import duro.transcriber.Journal;

public class Main {
	public static void main(String[] args) {
		// Given a path (args[0]), continue the process at that path.
		
		String command = args[0];
		
		switch(command.toLowerCase()) {
		case "run": {
			String path = args[1];
			Journal<duro.runtime.Process, Instruction> journal;
			try {
				journal = Journal.read(path);
//				duro.runtime.Process process = duro.runtime.Process.read(path);
				duro.runtime.Runtime runtime = new Runtime();
				runtime.resume(journal.getRoot());
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
			break;
		} case "gen": {
			String sourceCodePath = args[1];
			String journalPath = args[2];
			FileInputStream inputStream;
			try {
				inputStream = new FileInputStream(sourceCodePath);
				duro.runtime.Process process = duro.reflang.Compiler.compile(inputStream);
				Journal.write(process, journalPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		}
		}
	}
}
