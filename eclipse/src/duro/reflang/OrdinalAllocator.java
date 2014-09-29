package duro.reflang;

import java.util.ArrayList;
import java.util.function.Consumer;

import java.util.function.Function;

import duro.runtime.Instruction;

public class OrdinalAllocator {
	private static class AllocationInfo {
		public final String id;
		public final ArrayList<Consumer<Integer>> ordinalHandlers;
		
		public AllocationInfo(String id) {
			this.id = id;
			this.ordinalHandlers = new ArrayList<Consumer<Integer>>();
		}
	}
	
//	private static class Allocation {
//		private int nextBlockId;
////		private Hashtable<Integer, Integer> blockIdToOrdinalMap = new Hashtable<Integer, Integer>();
//		private ArrayList<AllocationInfo> blockIdToOrdinalMap = new ArrayList<AllocationInfo>();
//	}
	
//	private Allocation allocation;
	private ArrayList<AllocationInfo> allocation = new ArrayList<AllocationInfo>();
	private OrdinalAllocator outer;
	private ArrayList<OrdinalAllocator> childrenStart = new ArrayList<OrdinalAllocator>();
	private ArrayList<OrdinalAllocator> childrenEnd = new ArrayList<OrdinalAllocator>();
	private ArrayList<Consumer<Integer>> offsetHandlers = new ArrayList<Consumer<Integer>>();
//	private Hashtable<String, Integer> localIdToBlockIdMap = new Hashtable<String, Integer>();
//	private int offset;
	
	public OrdinalAllocator() {
//		allocation = new Allocation();
	}
	
	private OrdinalAllocator(OrdinalAllocator outer) {
		this.outer = outer;
//		offset = allocation.blockIdToOrdinalMap.size();
	}
	
	public OrdinalAllocator newInnerStart() {
		OrdinalAllocator child = new OrdinalAllocator(this);
		childrenStart.add(child);
		return child;
	}
	
	public OrdinalAllocator newInnerEnd() {
		OrdinalAllocator child = new OrdinalAllocator(this);
		childrenEnd.add(child);
		return child;
	}
	
	public OrdinalAllocator getOuter() {
		return outer;
	}
	
	public void declare(String id, ArrayList<Instruction> instructions, Function<Integer, Instruction> instructionFunc) {
		declare(id, instructionsConsumer(instructions, instructionFunc));
	}
	
	public void declare(String id) {
		declare(id, ordinal -> {});
	}
	
	public void declare(String id, Consumer<Integer> handler) {
		AllocationInfo allocationInfo = getAllocationInfo(id);
		
//		Integer blockId = localIdToBlockIdMap.get(id);
		
		
		if(allocationInfo == null) {
//			blockId = allocation.nextBlockId++;
//			int ordinal = allocation.blockIdToOrdinalMap.size();
//			localIdToBlockIdMap.put(id, blockId);
//			allocation.blockIdToOrdinalMap.put(blockId, ordinal);
			allocationInfo = new AllocationInfo(id);
			allocation.add(allocationInfo);
		} 
		
//		return allocation.blockIdToOrdinalMap.get(blockId);
		
		allocationInfo.ordinalHandlers.add(handler);
	}
	
	public void ordinalFor(String id, ArrayList<Instruction> instructions, Function<Integer, Instruction> instructionFunc) {
		ordinalFor(id, instructionsConsumer(instructions, instructionFunc));
	}
	
	public void ordinalFor(String id, Consumer<Integer> handler) {
		AllocationInfo allocationInfo = getAllocationInfo(id);
		if(allocationInfo != null)
			allocationInfo.ordinalHandlers.add(handler);
//			return allocation.blockIdToOrdinalMap.get(blockId);
		
		if(outer != null)
			outer.ordinalFor(id, handler);
//			return outer.ordinalFor(id);

//		return null;
	}
	
	public Consumer<Integer> instructionsConsumer(ArrayList<Instruction> instructions, Function<Integer, Instruction> instructionFunc) {
		final int index = instructions.size();
		instructions.add(null);
		
		return ordinal -> {
			Instruction instruction = instructionFunc.apply(ordinal);
			instructions.set(index, instruction);
		};
	}
	
	private AllocationInfo getAllocationInfo(String id) {
		for(int i = 0; i < allocation.size(); i++) {
			if(allocation.get(i).id.equals(id))
				return allocation.get(i);
		}
		
		return null;
	}

	public boolean isDeclared(String id) {
		AllocationInfo allocationInfo = getAllocationInfo(id);
		
		if(allocationInfo != null)
			return true;
		
		if(outer != null)
			return outer.isDeclared(id);
		
		return false;
		
//		return ordinalFor(id) != null;
	}

	public int size() {
		return allocation.size() + 
			childrenStart.stream().mapToInt(a -> a.size()).sum() +
			childrenEnd.stream().mapToInt(a -> a.size()).sum();
		
//		return allocation.blockIdToOrdinalMap.size();
	}

//	public int[] getOrdinals() {
//		return localIdToBlockIdMap.values().stream().mapToInt(x -> (int)x).sorted().toArray();
//	}

	public int sizeExceptEnd() {
//		return localIdToBlockIdMap.size();
//		return allocation.blockIdToOrdinalMap.size() - offset;
		return allocation.size() + 
			childrenStart.stream().mapToInt(a -> a.size()).sum();
	}
	
	public void getLocalParameterOffset(ArrayList<Instruction> instructions, Function<Integer, Instruction> instructionFunc) {
		getLocalParameterOffset(instructionsConsumer(instructions, instructionFunc));
	}

	public void getLocalParameterOffset(Consumer<Integer> handler) {
		offsetHandlers.add(handler);
//		return offset;
	}

//	public int getSelectorParameterCount() {
//		return offset;
//	}

	public boolean isDeclaredLocally(String id) {
//		return localIdToBlockIdMap.get(id) != null;
		return getAllocationInfo(id) != null;
	}
	
	public void generate() {
		generate(0);
	}
	
	public void generate(int offset) {
		for(int i = 0; i < allocation.size(); i++) {
			for(Consumer<Integer> handler: allocation.get(i).ordinalHandlers) {
				handler.accept(offset + i);
			}
		}

		int childStartOffset = offset + allocation.size();
		for(int i = 0; i < childrenStart.size(); i++) {
			childrenStart.get(i).generate(childStartOffset);
			childStartOffset += childrenStart.get(i).size();
		}

		int childEndOffset = offset + allocation.size();
		for(int i = 0; i < childrenEnd.size(); i++) {
			childrenEnd.get(i).generate(childEndOffset);
			childEndOffset += childrenEnd.get(i).size();
		}
		
		for(Consumer<Integer> handler: offsetHandlers)
			handler.accept(offset);
	}
}
