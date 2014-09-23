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
	}
	
	public Object nextOutputFor(String interfaceId, int opcode) {
		tracks.putIfAbsent(interfaceId, 0);
		int trackIndex = tracks.get(interfaceId);
		for(int i = trackIndex; i < interactions.size(); i++) {
			Interaction interaction = interactions.get(i);
			if(interaction.instruction.opcode == opcode && interaction.interfaceId.equals(interfaceId)) {
				tracks.put(interfaceId, trackIndex + 1);
				return interaction.output;
			}
		}
		
		return null;
	}
}
