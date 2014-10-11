package duro.runtime2;

import java.util.Hashtable;

public class DictActor extends Actor {
	private Hashtable<Integer, Actor> slots = new Hashtable<Integer, Actor>();
	
	public void define(int symbolCode, Actor value) {
		slots.put(symbolCode, value);
	}

	@Override
	public Frame createFrame(SymbolTable symbolTable, Actor receiver, Frame sender, int symbolCode, Actor[] args) {
		return slots.get(symbolCode).createFrame(symbolTable, receiver, sender, SymbolTable.Codes.eval, args);
	}
}
