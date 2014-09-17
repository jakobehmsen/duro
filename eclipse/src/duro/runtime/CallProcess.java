package duro.runtime;

import java.util.List;

public class CallProcess extends Process {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Process local;
	private Process outer;

	public CallProcess(Process local, Process outer) {
		this.local = local;
		this.outer = outer;
	}

	@Override
	public void replay(List<Instruction> commands) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume(List<Instruction> playedInstructions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getCallable(Object key) {
		return local.getCallable(key);
	}

	@Override
	public void define(Object key, Object value) {
		Object localLookup = local.lookup(key);
		if(localLookup != null)
			local.define(key, value);
		else
			outer.define(key, value);
	}

	@Override
	public Object lookup(Object key) {
		Object localLookup = local.lookup(key);
		if(localLookup != null)
			return localLookup;

		return outer.lookup(key);
	}
}
