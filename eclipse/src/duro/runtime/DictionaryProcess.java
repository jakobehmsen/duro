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

	private Hashtable<Object, Process> protos = new Hashtable<Object, Process>();

	@Override
	public void resume(List<InteractionHistory.Interaction> playedInstructions) {
		// Does is make sense to have this method here?
	}
	
	private static class Member implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public final boolean isShared;
		public final Process value;
		
		public Member(boolean isShared, Process value) {
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

	@Override
	public void defineProto(Object key, Process value) {
		properties.put(key, new Member(true, value));
		protos.put(key, value);
	}
	
	public void defineShared(Object key, Process value) {
		properties.put(key, new Member(true, value));
		protos.remove(key);
	}
	
	@Override
	public void define(Object key, Process value) {
		properties.put(key, new Member(false, value));
		protos.remove(key);
	}

	@Override
	public Process lookup(Object key) {
		Member valueMember = properties.get(key);
		
		if(valueMember != null)
			return valueMember.value;
		
		for(Process proto: protos.values()) {
			Process value = proto.lookup(key);
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
				Process clonedValue = entry.getValue().value;
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
