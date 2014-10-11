package runtime2;

public class SquareActor extends Actor {
	@Override
	public Frame createFrame(Actor receiver, Frame sender, String name, Actor[] args) {
		return new Frame() {
//			int state;
			
			@Override
			public void resume(Dispatcher dispatcher, Actor reply) {
//				switch(state) {
//				case 0:
//					dispatcher.send(args[0], this, "*", new Actor[]{args[1]});
//					state = 1;
//					break;
//				case 1:
//					dispatcher.replyTo(sender, reply);
//					break;
//				}
				
				dispatcher.send(receiver, sender, "*", new Actor[]{args[1]});
			}
		};
	}
}
