package duro.transcriber;

import java.util.List;

import duro.runtime.InteractionHistory;

public interface Player<C> {
	void replay(InteractionHistory interactionHistory);
}
