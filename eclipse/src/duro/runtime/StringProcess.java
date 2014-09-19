package duro.runtime;

public class StringProcess extends DictionaryProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final String str;

	public StringProcess(String str) {
		this.str = str;
	}
	
	@Override
	public DictionaryProcess newBase() {
		return new StringProcess(str);
	}
}
