package duro.runtime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class InteractionHistory {
	public static class Interaction implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public final String interfaceId;
		public final Instruction instruction;
		public final Object output;
		
		public Interaction(String interfaceId, Instruction instruction, Object output) {
			this.interfaceId = interfaceId;
			this.instruction = instruction;
			this.output = output;
		}
	}
	
	private int initialSize;
	private List<Interaction> interactions;
	private Hashtable<String, Integer> tracks = new Hashtable<String, Integer>();
	
	public InteractionHistory(List<Interaction> interactions) {
		this.interactions = interactions;
		initialSize = interactions.size();
	}

	public boolean hasNewInteractions() {
		return initialSize < interactions.size();
	}
	
	public List<Interaction> getNewInteractions() {
		return new ArrayList<Interaction>(interactions.subList(initialSize, interactions.size()));
	}
	
	public void append(String interfaceId, Instruction instruction, Object output) {
		interactions.add(new Interaction(interfaceId, instruction, output));
		
		tracks.put(interfaceId, interactions.size() - 1);
	}
	
	public Object nextOutputFor(String interfaceId, int opcode) {
		tracks.putIfAbsent(interfaceId, -1);
		int trackIndex = tracks.get(interfaceId);
		for(int i = trackIndex + 1; i < interactions.size(); i++) {
			Interaction interaction = interactions.get(i);
			if(/*interaction.instruction.opcode == opcode && */interaction.interfaceId.equals(interfaceId)) {
				tracks.put(interfaceId, i);
//				System.out.println("***Found next output for " + interfaceId + " at index " + i + "***");
				return interaction.output;
			}
		}

//		System.out.println("***Couldn't find next output for " + interfaceId + "***");
		return null;
	}
}
