package duro.runtime;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import duro.reflang.SymbolTable;

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
	
	private Hashtable<Integer, Object> properties = new Hashtable<Integer, Object>();
	
	@Override
	public CallFrameInfo getInstructions(int symbolCode) {
		return (CallFrameInfo)properties.get(symbolCode);
	}
	
	@Override
	public void define(int symbolCode, Object value) {
		properties.put(symbolCode, value);
	}

	@Override
	public Object lookup(int symbolCode) {
		return properties.get(symbolCode);
	}

	@Override
	public Iterator<Object> iterator() {
		ArrayList<Object> names = new ArrayList<Object>();
		
		for(Object symbolCode: properties.keySet())
			names.add(SymbolTable.getIdFromSymbolCode((int)symbolCode));
		
		return names.iterator();
	}
}
