package duro;

import duro.runtime.Runtime;

public class Main {
	public static void main(String[] args) {
		// Given a path (args[0]), continue the process at that path.
		
		String path = args[0];
		duro.runtime.Process process = duro.runtime.Process.read(path);
		duro.runtime.Runtime runtime = new Runtime();
		runtime.resume(process);
	}
}
