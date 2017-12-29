package aima.core.enviroment.cuboDeRubik;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import aima.core.agent.Action;
import aima.core.search.framework.Problem;
import aima.core.search.framework.Search;
import aima.core.search.framework.SearchAgent;
import aima.core.search.uninformed.BreadthFirstSearch;
import aima.core.search.uninformed.UniformCostSearch;

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
			Search search = new UniformCostSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printInstrumentation(agent.getInstrumentation());
			printActions(agent.getActions());
			
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	private static void printInstrumentation(Properties instrumentation) {
		System.out.println("Informacion:" + instrumentation.toString());
		
	}
	
	private static void printActions(List<Action> actions) {
		Iterator<Action> it = actions.iterator();
		System.out.println("Secuencia de acciones:");
		while(it.hasNext()){
			System.out.println("\t" + it.next());
		}
	}
}
