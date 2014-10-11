package duro.runtime2;

public abstract class LazyActor extends Actor {
	private Actor createdActor;

	@Override
	public Frame createFrame(SymbolTable symbolTable, Actor receiver, Frame sender, int symbolCode, Actor[] args) {
		if(createdActor == null)
			createdActor = createActor(symbolTable);
		return createdActor.createFrame(symbolTable, receiver, sender, symbolCode, args);
	}
	
	protected abstract Actor createActor(SymbolTable symbolTable);
}
