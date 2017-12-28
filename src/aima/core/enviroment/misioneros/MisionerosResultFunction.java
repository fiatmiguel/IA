package aima.core.enviroment.misioneros;

import aima.core.agent.Action;
import aima.core.search.framework.ResultFunction;

class MisionerosResultFunction implements ResultFunction{

	
	public Object result(Object s, Action a) {
		EstadoMisioneros state = (EstadoMisioneros) s;
		EstadoMisioneros newState = new EstadoMisioneros(state);		
		if(EstadoMisioneros.MM.equals(a)){
			newState.MM();
			return newState;
		}else if(EstadoMisioneros.MI.equals(a)){
			newState.MI();
			return newState;
		}else if(EstadoMisioneros.M.equals(a)){
			newState.M();
			return newState;
		}else if(EstadoMisioneros.I.equals(a)){
			newState.I();
			return newState;
		}else if(EstadoMisioneros.II.equals(a)){
			newState.II();
			return newState;
		}
		
		return s;
	}
}
