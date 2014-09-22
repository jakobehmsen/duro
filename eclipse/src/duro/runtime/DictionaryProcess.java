package duro.runtime;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class DictionaryProcess extends Process {
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
	
	private static class Member implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public final boolean isShared;
		public final Object value;
		
		public Member(boolean isShared, Object value) {
			this.isShared = isShared;
			this.value = value;
		}
	}
	
	private Hashtable<Object, Member> properties = new Hashtable<Object, Member>();
	
	@Override
	public Object getCallable(ProcessFactory factory, Object key) {
		Member callableMember = properties.get(key);
		
		if(callableMember != null)
			return callableMember.value;
		
		for(Object proto: protos.values()) {
			Object callable = ((Process)proto).getCallable(factory, key);
			if(callable != null)
				return callable;
		}
		
		return null;
	}
	
	public void defineProto(Object key, Object value) {
		properties.put(key, new Member(true, value));
		protos.put(key, value);
	}
	
	public void defineShared(Object key, Object value) {
		properties.put(key, new Member(true, value));
		protos.remove(key);
	}
	
	@Override
	public void define(Object key, Object value) {
		properties.put(key, new Member(false, value));
		protos.remove(key);
	}

	@Override
	public Object lookup(Object key) {
		Member valueMember = properties.get(key);
		
		if(valueMember != null)
			return valueMember.value;
		
		for(Object proto: protos.values()) {
			Object value = ((Process)proto).lookup(key);
			if(value != null)
				return value;
		}
		
		return null;
		
	}
	
	@Override
	public String toString() {
		return "<dict>";
	}
	
	public DictionaryProcess clone() {
		return clone(new Hashtable<DictionaryProcess, DictionaryProcess>());
	}
	
	private DictionaryProcess clone(Hashtable<DictionaryProcess, DictionaryProcess> cachedClones) {
		DictionaryProcess cachedClone = cachedClones.get(this);
		if(cachedClone != null)
			return cachedClone;
		
		DictionaryProcess clone = newBase();
		cachedClones.put(this, clone);
		
		for(Map.Entry<Object, Member> entry: this.properties.entrySet()) {
			if(!entry.getValue().isShared) {
				Object clonedValue = entry.getValue().value;
				if(clonedValue instanceof DictionaryProcess)
					clonedValue = ((DictionaryProcess)entry.getValue().value).clone(cachedClones);
				clone.properties.put(entry.getKey(), new Member(false, clonedValue));
			}
		}
		
		clone.defineProto("parent", this);
		
		return clone;
	}
	
	public DictionaryProcess newBase() {
		return new DictionaryProcess();
	}
}
