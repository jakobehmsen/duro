package duro.debugging;

public class Debug {
	public static final int LEVEL_LOW = 0;
	public static final int LEVEL_HIGH = 1;
	
	private static final int maxLevel = LEVEL_LOW;
//	private static final int maxLevel = LEVEL_HIGH;
	
	public static final void println(int level, String message) {
		if(level <= maxLevel) {
			System.out.println("DEBUG: " + message);
		}
	}
}
