package aima.core.enviroment.misioneros;

import aima.core.search.framework.HeuristicFunction;

public class MisionerosHeuristicFunctionEquil implements HeuristicFunction{

	
	public double h(Object state) {
		
		EstadoMisioneros m = (EstadoMisioneros) state;
		
		return Math.abs(m.getMisioneros()-m.getIndigenas());
	}
	
	@Override
	public String toString(){
		return "EquilHeuristic";
	}

}
