package aima.core.enviroment.misioneros;

import aima.core.search.framework.HeuristicFunction;

public class MisionerosHeuristicFunctionMissplaced implements HeuristicFunction{

	
	public double h(Object estado) {
		EstadoMisioneros rio = (EstadoMisioneros) estado;
		
		return (rio.getMisioneros()+rio.getIndigenas())*-1;
	}
	
	@Override
	public String toString(){
		return "MissplacedHeuristic";
	}
}
