package duro.runtime2;

public class Program1 extends LazyActor {
	@Override
	protected Actor createActor(SymbolTable symbolTable) {
		int multSymbol1 = symbolTable.getSymbolCodeFromId(new Selector("*", 1));
		
		return new Actor() {
			@Override
			public Frame createFrame(SymbolTable symbolTable, Actor receiver, Frame sender, int symbolCode, Actor[] args) {
				return new Frame() {
					Actor local_int1;
					Actor local_int2;
					Actor local_int3;
					
					int state;
					
					@Override
					public void resume(Dispatcher dispatcher, Actor reply) {
						switch(state) {
						case 0:
							dispatcher.requestIntPrototype(this);
							state = 1;
							break;
						case 1:
							((DictActor)reply).define(multSymbol1, new MultiplyActor());
							state = 2;
						case 2:
							local_int1 = dispatcher.getInt(5);
							local_int2 = dispatcher.getInt(9);
							dispatcher.send(local_int1, this, multSymbol1, new Actor[]{local_int2});
							state = 3;
							break;
						case 3:
							local_int3 = dispatcher.getInt(2);
							
							dispatcher.send(reply, sender, multSymbol1, new Actor[]{local_int3});
							break;
						}
					}
				};
			}
		};
	}
}
