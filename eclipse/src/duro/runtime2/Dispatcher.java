package duro.runtime2;

public class Dispatcher {
	public static final int REQUEST_SEND = 0;
	public static final int REQUEST_REPLY = 1;
	public static final int REQUEST_REPLACE = 2;
	public static final int REQUEST_INT_PROTOTYPE = 3;
	public static final int REQUEST_EXIT = 4;
	
	private DictActor intPrototype = new DictActor();
	private int request;
	
	private Actor sendReceiver;
	private Frame sendSender;
	private int sendSymbolCode;
	private Actor[] sendArgs;
	
	public void send(Actor receiver, Frame sender, int symbolCode, Actor[] args) {
		sendReceiver = receiver;
		sendSender = sender;
		sendSymbolCode = symbolCode;
		sendArgs = args;
		request = REQUEST_SEND;
	}

	private Frame replySender;
	private Actor replyReply;

	public void replyTo(Frame sender, Actor reply) {
		replyReply = reply;
		replySender = sender;
		request = REQUEST_REPLY;
	}
	
	private Frame replaceFrame;
	
	public void replace(Frame frame) {
		replaceFrame = frame;
		request = REQUEST_REPLACE;
	}
	
	private static class ExitFrame implements Frame {
		@Override
		public void resume(Dispatcher dispatcher, Actor reply) {
			dispatcher.request = REQUEST_EXIT;
		}
	}
	
	public static Actor evaluate(Actor start, Actor[] args) {
		SymbolTable symbolTable = SymbolTable.ROOT;
		Dispatcher dispatcher = new Dispatcher();
		boolean run = true;
		Frame frame = start.createFrame(symbolTable, start, new ExitFrame(), SymbolTable.Codes.eval, args);
		exit:
		if(run) {
			while(true) {
				frame.resume(dispatcher, dispatcher.replyReply);
				
				switch(dispatcher.request) {
				case REQUEST_SEND:
					dispatcher.replyReply = null;
					frame = dispatcher.sendReceiver.createFrame(symbolTable, dispatcher.sendReceiver, dispatcher.sendSender, dispatcher.sendSymbolCode, dispatcher.sendArgs);
					break;
				case REQUEST_REPLY:
					frame = dispatcher.replySender;
					break;
				case REQUEST_REPLACE:
					frame = dispatcher.replaceFrame;
					break;
				case REQUEST_INT_PROTOTYPE:
					dispatcher.replyReply = dispatcher.intPrototype;
					break;
				case REQUEST_EXIT:
					run = false;
					break exit;
				}
			}
		}
		return dispatcher.replyReply;
	}

	public void requestIntPrototype(Frame frame) {
		request = REQUEST_INT_PROTOTYPE;
	}

	public Actor getInt(int i) {
		return new IntActor(intPrototype, i);
	}
}
