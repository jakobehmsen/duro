package duro.runtime;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DictionaryProcess extends Process implements Iterable<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Hashtable<Object, Object> protos = new Hashtable<Object, Object>();

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
		CallFrameInfo callFrameInfo = (CallFrameInfo)properties.get(key);
		
		if(callFrameInfo != null)
			return callFrameInfo;
		
		for(Object proto: protos.values()) {
			callFrameInfo = ((Process)proto).getInstructions(key);
			if(callFrameInfo != null)
				return callFrameInfo;
		}
		
		return null;
	}
	
	public void defineProto(Object key, Object value) {
		properties.put(key, value);
		protos.put(key, value);
	}
	
	@Override
	public void define(Object key, Object value) {
		properties.put(key, value);
		protos.remove(key);
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
	
	public DictionaryProcess clone() {
		DictionaryProcess clone = newBase();
		for(Map.Entry<Object, Object> entry: this.properties.entrySet()) {
			Object clonedValue = entry.getValue();
			if(clonedValue instanceof DictionaryProcess)
				clonedValue = ((DictionaryProcess)entry.getValue()).clone();
			clone.properties.put(entry.getKey(), clonedValue);
		}
		clone.defineProto("parent", this);
		return clone;
	}
	
	public DictionaryProcess newBase() {
		return new DictionaryProcess();
	}
}
