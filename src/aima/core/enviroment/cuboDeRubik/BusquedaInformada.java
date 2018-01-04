package aima.core.enviroment.cuboDeRubik;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import aima.core.agent.Action;
import aima.core.search.framework.GraphSearch;
import aima.core.search.framework.HeuristicFunction;
import aima.core.search.framework.Problem;
import aima.core.search.framework.Search;
import aima.core.search.framework.SearchAgent;
import aima.core.search.informed.AStarSearch;
import aima.core.search.informed.GreedyBestFirstSearch;

public class BusquedaInformada {
	
	public static EstadoCuboDeRubik estadoInicial = new EstadoCuboDeRubik();
	
	public static void main(String args[]){
		CapaBlancaHeuristic heu= new CapaBlancaHeuristic();
		cuboDeRubikAStar(heu);
	}
	
	
	private static void cuboDeRubikAStar(HeuristicFunction heu){
		System.out.println("\nCubo de Rubik A* with " + heu.toString());
		try{
			Problem problem = new Problem(estadoInicial,
					CuboDeRubikFunctionFactory.getActionsFunction(), 
					CuboDeRubikFunctionFactory.getResultFunction(),
					new CuboDeRubikGoalTest(),
					new CuboDeRubikStepCostFunction());
		
			Search search = new AStarSearch(new GraphSearch(), heu);
			SearchAgent agent = new SearchAgent(problem, search);
			printInstrumentation(agent.getInstrumentation());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static void cuboDeRubikGreedy(HeuristicFunction heu){
		System.out.println("\nCubo de Rubik Voraz with " + heu.toString());
		try{
			Problem problem = new Problem(estadoInicial,
					CuboDeRubikFunctionFactory.getActionsFunction(), 
					CuboDeRubikFunctionFactory.getResultFunction(),
					new CuboDeRubikGoalTest(),
					new CuboDeRubikStepCostFunction());
			
			Search search = new GreedyBestFirstSearch(new GraphSearch(), heu);
			SearchAgent agent = new SearchAgent(problem, search);
			printInstrumentation(agent.getInstrumentation());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static void printInstrumentation(Properties instrumentation) {
		System.out.println("instrumentation:" + instrumentation.toString());
		
	}
	
	@SuppressWarnings("unused")
	private static void printActions(List<Action> actions) {
		Iterator<Action> it = actions.iterator();
		System.out.println("Secuencia de acciones:");
		while(it.hasNext()){
			System.out.println("\t" + it.next());
		}
	}
}
