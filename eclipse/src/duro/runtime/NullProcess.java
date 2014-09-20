package duro.runtime;

import java.util.List;

public class NullProcess extends Process {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void replay(List<Instruction> commands) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume(List<Instruction> playedInstructions) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getCallable(ProcessFactory factory, Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void define(Object key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object lookup(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof NullProcess;
	}

	@Override
	public String toString() {
		return "null";
	}
}
