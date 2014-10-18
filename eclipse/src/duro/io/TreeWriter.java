package duro.io;

import java.io.IOException;
import java.io.Writer;

public class TreeWriter {
	private Writer writer;
	private String indention = "";
	private boolean printIndention;

	public TreeWriter(Writer writer) {
		this.writer = writer;
	}
	
	private String indentionBlock() {
		return "    ";
	}
	
	private int indentionBlockLength() {
		return indentionBlock().length();
	}
	
	public void write(String text) throws IOException {
		String[] lines = text.split("\\r?\\n");
		if(lines.length > 0) {
			append(lines[0]);
			for(int i = 1; i < lines.length; i++) {
				appendln();
				append(lines[i]);
			}
		}
	}
	
	private void append(String str) throws IOException {
		if(printIndention)
			writer.write(indention);
		writer.write(str);
	}
	
	private void appendln() throws IOException {
		writer.write("\n");
		printIndention = true;
	}
	
	public void indentnl() throws IOException {
		appendln();
		indention = new String(indention + indentionBlock());
	}
	
	public void dedentnl() throws IOException {
		if(indention.length() == 0)
			throw new RuntimeException("Cannot dedent when indention depth is zero.");
		
		appendln();
		indention = indention.substring(0, indention.length() - indentionBlockLength());
	}
}
