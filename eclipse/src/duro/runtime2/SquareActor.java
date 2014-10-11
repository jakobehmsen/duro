package duro.runtime2;

public class SquareActor extends LazyActor {
	@Override
	protected Actor createActor(SymbolTable symbolTable) {
		int multSymbol1 = symbolTable.getSymbolCodeFromId(new Selector("*", 1));
		return new Actor() {
			@Override
			public Frame createFrame(SymbolTable symbolTable, Actor receiver, Frame sender, int symbolCode, Actor[] args) {
				return new Frame() {
//					int state;
					
					@Override
					public void resume(Dispatcher dispatcher, Actor reply) {
//						switch(state) {
//						case 0:
//							dispatcher.send(args[0], this, "*", new Actor[]{args[1]});
//							state = 1;
//							break;
//						case 1:
//							dispatcher.replyTo(sender, reply);
//							break;
//						}
						
						dispatcher.send(receiver, sender, multSymbol1, new Actor[]{args[1]});
					}
				};
			}
		};
	}
}
