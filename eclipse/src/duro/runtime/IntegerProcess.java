package duro.runtime;

public class IntegerProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final int intValue;

	public IntegerProcess(int intValue) {
		this.intValue = intValue;
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new IntegerProcess(intValue);
	}
}
