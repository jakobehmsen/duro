package duro.transcriber;

import duro.runtime.InteractionHistory;

public interface Player<C> {
	void replay(InteractionHistory interactionHistory);
}
