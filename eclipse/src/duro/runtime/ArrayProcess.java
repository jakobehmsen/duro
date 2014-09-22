package duro.runtime;

import java.util.Arrays;

public class ArrayProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Object[] items;

	public ArrayProcess(int length, Object exemplar) {
		this.items = new Object[length];
		Arrays.fill(items, exemplar);
	}

	private ArrayProcess(Object[] items) {
		this.items = items;
	}
	
	public int length() {
		return items.length;
	}
	
	@Override
	public DictionaryProcess newBase() {
		Object[] clonedItems = new Object[items.length];
		for(int i = 0; i < items.length; i++) {
			Object clonedItem = items[i];
			if(clonedItem instanceof DictionaryProcess)
				clonedItem = ((DictionaryProcess)clonedItem).clone();
			clonedItems[i] = clonedItem;
		}
		return new ArrayProcess(clonedItems);
	}

	public Object get(int index) {
		return items[index];
	}

	public void set(int index, Object value) {
		items[index] = value;
	}
}
