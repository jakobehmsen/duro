package duro.runtime;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import duro.reflang.SymbolTable;

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
		public final int code;
		public final boolean isShared;
		public final Process value;
		
		public Member(int code, boolean isShared, Process value) {
			this.code = code;
			this.isShared = isShared;
			this.value = value;
		}
		
		@Override
		public String toString() {
			return SymbolTable.ROOT.getIdFromSymbolCode(code) + ": " + value;
		}
	}

	private Hashtable<Integer, Process> protos = new Hashtable<Integer, Process>();
	private Hashtable<Integer, Member> properties = new Hashtable<Integer, Member>();
	
	@Override
	public Object getCallable(int selectorCode) {
		Member callableMember = properties.get(selectorCode);
		
		if(callableMember != null)
			return callableMember.value;
		
		for(Process proto: protos.values()) {
			Object callable = proto.getCallable(selectorCode);
			if(callable != null)
				return callable;
		}
		
		return null;
	}

	@Override
	public Process lookup(int selectorCode) {
		Member valueMember = properties.get(selectorCode);
		
		if(valueMember != null)
			return valueMember.value;
		
		for(Process proto: protos.values()) {
			Process value = proto.lookup(selectorCode);
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
	public void defineProto(int selectorCode, Process value) {
		properties.put(selectorCode, new Member(selectorCode, true, value));
		protos.put(selectorCode, value);
	}
	
	public void defineShared(int selectorCode, Process value) {
		properties.put(selectorCode, new Member(selectorCode, true, value));
		protos.remove(selectorCode);
	}
	
	@Override
	public void define(int selectorCode, Process value) {
		properties.put(selectorCode, new Member(selectorCode, false, value));
		protos.remove(selectorCode);
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
		
		for(Map.Entry<Integer, Member> entry: this.properties.entrySet()) {
			if(!entry.getValue().isShared) {
				Process clonedValue = entry.getValue().value;
				if(clonedValue instanceof DictionaryProcess)
					clonedValue = ((DictionaryProcess)entry.getValue().value).clone(cachedClones);
				clone.properties.put(entry.getKey(), new Member(entry.getValue().code, false, clonedValue));
			}
		}
		
		clone.defineProto(SymbolTable.Codes.parent, this);
		
		return clone;
	}
	
	public DictionaryProcess newBase() {
		return new DictionaryProcess();
	}
}
