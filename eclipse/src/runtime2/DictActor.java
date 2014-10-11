package runtime2;

import java.util.Hashtable;

public class DictActor extends Actor {
	private Hashtable<Selector, Actor> slots = new Hashtable<Selector, Actor>();
	
	public void define(Selector selector, Actor value) {
		slots.put(selector, value);
	}

	@Override
	public Frame createFrame(Actor receiver, Frame sender, String id, Actor[] args) {
		return slots.get(new Selector(id, args.length)).createFrame(receiver, sender, "eval", args);
	}
}
