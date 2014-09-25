package duro.runtime;

import java.util.Arrays;

public class ArrayProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Process[] items;

	public ArrayProcess(int length, Process exemplar) {
		this.items = new Process[length];
		Arrays.fill(items, exemplar);
	}

	public ArrayProcess(Process[] items) {
		this.items = items;
	}
	
	public int length() {
		return items.length;
	}
	
	@Override
	public DictionaryProcess newBase() {
		Process[] clonedItems = new Process[items.length];
		for(int i = 0; i < items.length; i++) {
			Process clonedItem = items[i];
			if(clonedItem instanceof DictionaryProcess)
				clonedItem = ((DictionaryProcess)clonedItem).clone();
			clonedItems[i] = clonedItem;
		}
		return new ArrayProcess(clonedItems);
	}

	public Process get(int index) {
		return items[index];
	}

	public void set(int index, Process value) {
		items[index] = value;
	}
}
