package runtime2;

public class Dispatcher {
	public static final int REQUEST_SEND = 0;
	public static final int REQUEST_REPLY = 1;
	public static final int REQUEST_EXIT = 2;
	
	private int request;
	private Actor sendActor;
	private Frame sendSender;
	private String sendName;
	private Actor[] sendArgs;
	
	public void send(Actor actor, Frame sender, String name, Actor[] args) {
		sendActor = actor;
		sendSender = sender;
		sendName = name;
		sendArgs = args;
		request = 0;
	}

	private Frame replySender;
	private Actor replyReply;

	public void replyTo(Frame sender, Actor reply) {
		replyReply = reply;
		replySender = sender;
		request = 1;
	}
	
	private static class ExitFrame implements Frame {
		@Override
		public void resume(Dispatcher dispatcher, Actor reply) {
			dispatcher.request = 2;
		}
	}
	
	public static Actor evaluate(Actor start, Actor[] args) {
		Dispatcher dispatcher = new Dispatcher();
		boolean run = true;
		Frame frame = start.createFrame(start, new ExitFrame(), "eval", args);
		exit:
		if(run) {
			while(true) {
				frame.resume(dispatcher, dispatcher.replyReply);
				
				switch(dispatcher.request) {
				case REQUEST_SEND:
					dispatcher.replyReply = null;
					frame = dispatcher.sendActor.createFrame(dispatcher.sendActor, dispatcher.sendSender, dispatcher.sendName, dispatcher.sendArgs);
					break;
				case REQUEST_REPLY:
					frame = dispatcher.replySender;
					break;
				case REQUEST_EXIT:
					run = false;
					break exit;
				}
			}
		}
		return dispatcher.replyReply;
	}
}
