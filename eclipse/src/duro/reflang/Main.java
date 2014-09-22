package duro.reflang;

import java.io.FileInputStream;
import java.io.IOException;

import duro.runtime.CustomProcess;
import duro.transcriber.Journal;

public class Main {
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Please supply path of source code and then path (folder) to output journal to.");
			return;
		}
		
		String sourceCodePath = args[0];
		String journalPath = args[1];
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(sourceCodePath);
			CustomProcess process = duro.reflang.Compiler.compile(inputStream);
			Journal.write(process, journalPath);
			System.out.println("Compiled '" + sourceCodePath + "' into '" + journalPath + "'.");
		} catch (IOException e) {
			System.out.println("Compilation failed.");
			e.printStackTrace();
		}
	}
}
