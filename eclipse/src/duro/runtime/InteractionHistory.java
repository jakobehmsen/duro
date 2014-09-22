package duro.runtime;

import java.io.Serializable;
import java.util.List;

public class InteractionHistory {
	public static class Interaction implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public final Instruction instruction;
		public final Object output;
		
		public Interaction(Instruction instruction, Object output) {
			this.instruction = instruction;
			this.output = output;
		}
	}
	
	private int index;
	private List<Interaction> interactions;
	
	public InteractionHistory(List<Interaction> interactions) {
		this.interactions = interactions;
	}
	
	public void append(Instruction instruction, Object output) {
		interactions.add(new Interaction(instruction, output));
		index++;
	}
	
	public Object nextOutputFor(int opcode) {
		for(; index < interactions.size(); index++) {
			Interaction interaction = interactions.get(index);
			if(interaction.instruction.opcode == opcode)
				return interaction.output;
		}
		
		return null;
	}
}
