package runtime2;

public class MultiplyActor extends Actor {
	@Override
	public Frame createFrame(Actor receiver, Frame sender, String name, Actor[] args) {
		return new Frame() {
//			int state;
			
			@Override
			public void resume(Dispatcher dispatcher, Actor reply) {
//				switch(state) {
//				case 0:
//					dispatcher.replyTo(sender, new IntActor(((IntActor)receiver).value * ((IntActor)args[0]).value));
//					state = 1;
//					break;
//				case 1:
//					dispatcher.replyTo(sender, reply);
//					break;
//				}
				
				dispatcher.replyTo(sender, new IntActor(((IntActor)receiver).value * ((IntActor)args[0]).value));
			}
		};
	}

}
