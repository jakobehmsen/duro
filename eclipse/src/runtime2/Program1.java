package runtime2;

public class Program1 extends Actor {
	@Override
	public Frame createFrame(Actor receiver, Frame sender, String id, Actor[] args) {
		return new Frame() {
			@Override
			public void resume(Dispatcher dispatcher, Actor reply) {
				IntActor int1 = new IntActor(5);
				int1.define(new Selector("*", 1), new MultiplyActor());
				IntActor int2 = new IntActor(9);
				
				dispatcher.send(int1, sender, "*", new Actor[]{int2});
			}
		};
	}
}
