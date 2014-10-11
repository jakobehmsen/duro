package duro.runtime2;

public class IntActor extends Actor {
	public final DictActor prototype;
	public final int value;
	
	public IntActor(DictActor prototype, int value) {
		this.prototype = prototype;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "" + value;
	}

	@Override
	public Frame createFrame(SymbolTable symbolTable, Actor receiver, Frame sender, int symbolCode, Actor[] args) {
		return prototype.createFrame(symbolTable, receiver, sender, symbolCode, args);
	}
}
