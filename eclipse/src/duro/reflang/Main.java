package duro.reflang;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import duro.runtime.CustomProcess;

public class Main {
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Please supply path of source code and then path to output object code to.");
			return;
		}
		
		String sourceCodePath = args[0];
		String objectCodePath = args[1];
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(sourceCodePath);
			duro.reflang.Compiler_NEW compiler = new Compiler_NEW();
			CustomProcess process = compiler.compile(inputStream);
			
			if(compiler.hasErrors())
				compiler.printErrors();
			else {
				try (ObjectOutput oo = new ObjectOutputStream(new FileOutputStream(objectCodePath))) {
			        oo.writeObject(process);
			    }
				
				System.out.println("Compiled '" + sourceCodePath + "' into '" + objectCodePath + "'.");
			}
		} catch (IOException e) {
			System.out.println("Compilation failed.");
			e.printStackTrace();
		}
	}
}
