package aima.core.enviroment.cuboDeRubik;

import java.util.Properties;

import aima.core.search.framework.Problem;
import aima.core.search.framework.Search;
import aima.core.search.framework.SearchAgent;
import aima.core.search.uninformed.BreadthFirstSearch;

public class CuboDeRubikBusquedaNoInformada {

	static EstadoCuboDeRubik estadoInicial=new EstadoCuboDeRubik();
	public static void main(String[] args) {
		System.out.println("\nCubo De Rubik BreadFirst--->");
		try{
			Problem problem = new Problem(estadoInicial,
					CuboDeRubikFunctionFactory.getActionsFunction(), 
					CuboDeRubikFunctionFactory.getResultFunction(),
					new CuboDeRubikGoalTest(),
					new CuboDeRubikStepCostFunction());
			Search search = new BreadthFirstSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printInstrumentation(agent.getInstrumentation());
			
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	private static void printInstrumentation(Properties instrumentation) {
		System.out.println("Informacion:" + instrumentation.toString());
		
	}
}
