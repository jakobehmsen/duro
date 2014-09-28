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

	private Hashtable<Selector, Process> protos = new Hashtable<Selector, Process>();
	private Hashtable<Selector, Member> properties = new Hashtable<Selector, Member>();
	
	@Override
	public Object getCallable(ProcessFactory factory, Selector selector) {
		Member callableMember = properties.get(selector);
		
		if(callableMember != null)
			return callableMember.value;
		
		for(Object proto: protos.values()) {
			Object callable = ((Process)proto).getCallable(factory, selector);
			if(callable != null)
				return callable;
		}
		
		return null;
	}

	@Override
	public Process lookup(Selector selector) {
		Member valueMember = properties.get(selector);
		
		if(valueMember != null)
			return valueMember.value;
		
		for(Process proto: protos.values()) {
			Process value = proto.lookup(selector);
			if(value != null)
				return value;
		}
		
		return null;
		
	}
	
	@Override
	public String[] getNames() {
		return properties.keySet().toArray(new String[properties.size()]);
	}

	@Override
	public void defineProto(Selector selector, Process value) {
		properties.put(selector, new Member(true, value));
		protos.put(selector, value);
	}
	
	public void defineShared(Selector selector, Process value) {
		properties.put(selector, new Member(true, value));
		protos.remove(selector);
	}
	
	@Override
	public void define(Selector selector, Process value) {
		properties.put(selector, new Member(false, value));
		protos.remove(selector);
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
		
		for(Map.Entry<Selector, Member> entry: this.properties.entrySet()) {
			if(!entry.getValue().isShared) {
				Process clonedValue = entry.getValue().value;
				if(clonedValue instanceof DictionaryProcess)
					clonedValue = ((DictionaryProcess)entry.getValue().value).clone(cachedClones);
				clone.properties.put(entry.getKey(), new Member(false, clonedValue));
			}
		}
		
		clone.defineProto(Selector.get("parent"), this);
		
		return clone;
	}
	
	public DictionaryProcess newBase() {
		return new DictionaryProcess();
	}
}
