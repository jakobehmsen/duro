package duro.runtime;

public class BooleanProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean value;

	public BooleanProcess(boolean value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return Boolean.toString(value);
	}
	
	@Override
	public Object toSerializable() {
		return value;
	}
}
