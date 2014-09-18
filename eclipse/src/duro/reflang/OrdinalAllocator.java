package duro.reflang;

import java.util.Hashtable;

public class OrdinalAllocator {
	private static class Allocation {
		private int nextBlockId;
		private Hashtable<Integer, Integer> blockIdToOrdinalMap = new Hashtable<Integer, Integer>();
	}
	
	private Allocation allocation;
	private OrdinalAllocator outer;
	private Hashtable<String, Integer> localIdToBlockIdMap = new Hashtable<String, Integer>();
	
	public OrdinalAllocator() {
		allocation = new Allocation();
	}
	
	private OrdinalAllocator(OrdinalAllocator outer) {
		this.outer = outer;
		allocation = outer.allocation;
	}
	
	public OrdinalAllocator newInner() {
		return new OrdinalAllocator(this);
	}
	
	public OrdinalAllocator getOuter() {
		return outer;
	}
	
	public int declare(String id) {
		Integer blockId = localIdToBlockIdMap.get(id);
		
		if(blockId == null) {
			blockId = allocation.nextBlockId++;
			int ordinal = allocation.blockIdToOrdinalMap.size();
			localIdToBlockIdMap.put(id, blockId);
			allocation.blockIdToOrdinalMap.put(blockId, ordinal);
			return ordinal;
		}
		
		return allocation.blockIdToOrdinalMap.get(blockId);
	}
	
	public Integer ordinalFor(String id) {
		Integer blockId = localIdToBlockIdMap.get(id);
		if(blockId != null)
			return allocation.blockIdToOrdinalMap.get(blockId);
		
		if(outer != null)
			return outer.ordinalFor(id);

		return null;
	}

	public boolean isDeclared(String id) {
		return ordinalFor(id) != null;
	}

	public int size() {
		return allocation.blockIdToOrdinalMap.size();
	}
}
