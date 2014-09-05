package duro;

import java.io.FileInputStream;
import java.io.IOException;

import duro.runtime.Runtime;

public class Main {
	public static void main(String[] args) {
		// Given a path (args[0]), continue the process at that path.
		
		String command = args[0];
		
		switch(command.toLowerCase()) {
		case "run": {
			String path = args[1];
			duro.runtime.Process process = duro.runtime.Process.read(path);
			duro.runtime.Runtime runtime = new Runtime();
			runtime.resume(process);
			break;
		} case "gen": {
			String path = args[1];
			FileInputStream inputStream;
			try {
				inputStream = new FileInputStream(path);
				duro.runtime.Process process = duro.reflang.Compiler.compile(inputStream);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		}
	}
}
