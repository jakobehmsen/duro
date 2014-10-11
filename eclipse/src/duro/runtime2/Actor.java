package duro.runtime2;

public abstract class Actor {
	public abstract Frame createFrame(SymbolTable symbolTable, Actor receiver, Frame sender, int symbolCode, Actor[] args);
}
