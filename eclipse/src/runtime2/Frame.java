package runtime2;

public interface Frame {
	void resume(Dispatcher dispatcher, Actor reply);
}
