package runtime2;

public abstract class Actor {
	public abstract Frame createFrame(Actor receiver, Frame sender, String id, Actor[] args);
}
