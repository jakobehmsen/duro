package duro.runtime;

public class StringProcess extends BuiltinProcess {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final String str;

	public StringProcess(Process prototype, String str) {
		super(prototype);
		this.str = str;
	}
	
//	@Override
//	public DictionaryProcess newBase() {
//		return new StringProcess(str);
//	}
}
