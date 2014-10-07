package duro.runtime;

public class IntegerProcess extends BuiltinProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final int intValue;

	public IntegerProcess(Process prototype, int intValue) {
		super(prototype);
		this.intValue = intValue;
	}
	
//	@Override
//	public DictionaryProcess newBase() {
//		return new IntegerProcess(sharedProtos, sharedProperties, intValue);
//	}
	
	@Override
	public String toString() {
		return "" + intValue;
	}
}
