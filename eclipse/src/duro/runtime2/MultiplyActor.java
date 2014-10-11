package duro.runtime2;

public class MultiplyActor extends Actor {
	@Override
	public Frame createFrame(SymbolTable symbolTable, Actor receiver, Frame sender, int symbolCode, Actor[] args) {
		return new Frame() {
			@Override
			public void resume(Dispatcher dispatcher, Actor reply) {
				dispatcher.replyTo(sender, dispatcher.getInt(((IntActor)receiver).value * ((IntActor)args[0]).value));
			}
		};
	}
}
