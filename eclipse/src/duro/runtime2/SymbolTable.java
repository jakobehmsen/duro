package duro.runtime2;

import java.lang.reflect.Field;
import java.util.Hashtable;

public class SymbolTable {
	public static final class Codes {
		public static final int eval = 0;
	}
	
	public static final SymbolTable ROOT = createRoot();
	
	
	private static SymbolTable createRoot() {
		SymbolTable symbolTable = new SymbolTable();

		try {
			for(Field codeField: Codes.class.getFields()) {
				String id = codeField.getName();
				int symbolCode = codeField.getInt(null);
				
				symbolTable.add(new Selector(id, 0), symbolCode);
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return symbolTable;
	}
	
	private Hashtable<Selector, Integer> idToCodeMap = new Hashtable<Selector, Integer>();
	private Hashtable<Integer, Selector> codeToIdMap = new Hashtable<Integer, Selector>();
	
	private SymbolTable() { }
	
	private void add(Selector id, int symbolCode) {
		idToCodeMap.put(id, symbolCode);
		codeToIdMap.put(symbolCode, id);
	}
	
	public Selector getIdFromSymbolCode(int symbolCode) {
		return codeToIdMap.get(symbolCode);
	}
	
	public int getSymbolCodeFromId(Selector id) {
		Integer symbolCode = idToCodeMap.get(id);
		
		if(symbolCode == null) {
			symbolCode = idToCodeMap.size();
			idToCodeMap.put(id, symbolCode);
			codeToIdMap.put(symbolCode, id);
		}
		
		return symbolCode;
	}
}
