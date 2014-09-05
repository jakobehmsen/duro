package duro.transcriber;

import java.util.List;

public interface Player<C> {
	void replay(List<C> commands);
}
