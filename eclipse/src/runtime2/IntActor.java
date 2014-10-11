package runtime2;

public class IntActor extends DictActor {
	public final int value;
	
	public IntActor(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "" + value;
	}
}
