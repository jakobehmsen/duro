package duro.reflang;

import java.util.Hashtable;

public class SymbolTable {
	private static Hashtable<String, Integer> idToCodeMap = new Hashtable<String, Integer>();
	private static Hashtable<Integer, String> codeToIdMap = new Hashtable<Integer, String>();
	
	public static String getIdFromSymbolCode(int symbolCode) {
		return codeToIdMap.get(symbolCode);
	}
	
	public static int getSymbolCodeFromId(String id) {
		Integer symbolCode = idToCodeMap.get(id);
		
		if(symbolCode == null) {
			symbolCode = idToCodeMap.size();
			idToCodeMap.put(id, symbolCode);
			codeToIdMap.put(symbolCode, id);
		}
		
		return symbolCode;
	}
}
