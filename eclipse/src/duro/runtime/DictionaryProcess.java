package duro.runtime;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class DictionaryProcess extends Process implements Iterable<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void replay(List<Instruction> commands) {
		// Does is make sense to have this method here?
	}

	@Override
	public void resume(List<Instruction> playedInstructions) {
		// Does is make sense to have this method here?
	}
	
	private Hashtable<Object, Object> properties = new Hashtable<Object, Object>();
	
	@Override
	public CallFrameInfo getInstructions(Object key) {
		return (CallFrameInfo)properties.get(key);
	}
	
	@Override
	public void define(Object key, Object value) {
		properties.put(key, value);
	}

	@Override
	public Object lookup(Object key) {
		return properties.get(key);
	}

	@Override
	public Iterator<Object> iterator() {
		return properties.keySet().iterator();
	}
	
	@Override
	public String toString() {
		return properties.toString();
	}
}
