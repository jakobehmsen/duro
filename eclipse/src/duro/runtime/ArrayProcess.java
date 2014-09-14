package duro.runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayProcess extends DictionaryProcess implements Iterable<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Object[] items;

	public ArrayProcess(int length) {
		this.items = new Object[length];
		Arrays.fill(items, new NullProcess());
	}

	private ArrayProcess(Object[] items) {
		this.items = items;
	}

	@Override
	public void replay(List<Instruction> commands) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume(List<Instruction> playedInstructions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void define(Object key, Object value) {
		items[(int)key] = value;
	}

	@Override
	public Object lookup(Object key) {
		return items[(int)key];
	}
	
	public int length() {
		return items.length;
	}
	
	@Override
	public Iterator<Object> iterator() {
		ArrayList<Object> keys = new ArrayList<Object>();
		
		for(int i = 0; i < length(); i++)
			keys.add(i);
		
		return keys.iterator();
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
	
	@Override
	public String toString() {
		return Arrays.toString(items);
	}
}
