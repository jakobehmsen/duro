package duro.reflang;

import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;

public class MessageCollector {
	private static class Entry {
		public final int line;
		public final int charPositionInLine;
		public final String message;
		
		public Entry(int line, int charPositionInLine, String message) {
			this.line = line;
			this.charPositionInLine = charPositionInLine;
			this.message = message;
		}
	}
	
	private ArrayList<Entry> messages = new ArrayList<Entry>();
	
	public void appendMessage(ParserRuleContext ctx, String message) {
		messages.add(new Entry(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), message));
	}
	
	public void appendMessage(int line, int charPositionInLine, String message) {
		messages.add(new Entry(line, charPositionInLine, message));
	}
	
	public void appendMessages(MessageCollector collector) {
		messages.addAll(collector.messages);
	}
	
	public boolean hasMessages() {
		return messages.size() > 0;
	}
	
	public void printMessages() {
		messages.forEach(x -> System.err.println("@" + x.line + "," + (x.charPositionInLine + 1) + ": " + x.message));
	}
}
