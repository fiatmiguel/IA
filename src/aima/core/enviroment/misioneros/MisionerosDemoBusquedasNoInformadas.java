package aima.core.enviroment.misioneros;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import aima.core.agent.Action;
import aima.core.search.framework.Problem;
import aima.core.search.framework.Search;
import aima.core.search.framework.SearchAgent;
import aima.core.search.uninformed.*;

public class MisionerosDemoBusquedasNoInformadas {
	
	static EstadoMisioneros estadoInicial = new EstadoMisioneros();
	
	public static void main(String[] args){
		puzzleIABFSDemoBread();
		puzzleIADemoDepth();
		puzzleIABFSDemoUniCost();
	}
	
	private static void puzzleIABFSDemoBread(){
		System.out.println("\nMisionerosEIndigenasBFSDemo BreadFirst--->");
		try{
			Problem problem = new Problem(estadoInicial,
					MisionerosFunctionFactory.getActionsFunction(), 
					MisionerosFunctionFactory.getResultFunction(),
					new MisionerosGoalTest(),
					new MisionerosStepCostFunction());
			Search search = new BreadthFirstSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printInstrumentation(agent.getInstrumentation());
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static void puzzleIADemoDepth(){
		System.out.println("\nMisionerosEIndigenasDemo Depth limited--->");
		try{
			Problem problem = new Problem(estadoInicial,
					MisionerosFunctionFactory.getActionsFunction(), 
					MisionerosFunctionFactory.getResultFunction(),
					new MisionerosGoalTest(),
					new MisionerosStepCostFunction()); 
			Search search = new DepthLimitedSearch(27);
			SearchAgent agent = new SearchAgent(problem, search);
			printInstrumentation(agent.getInstrumentation());
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static void puzzleIABFSDemoUniCost(){
		System.out.println("\nMisionerosEIndigenasBFSDemo Uniform Cost--->");
		try{
			Problem problema = new Problem(estadoInicial, MisionerosFunctionFactory.getActionsFunction(), 
					MisionerosFunctionFactory.getResultFunction(), new MisionerosGoalTest(), new MisionerosStepCostFunction()); 
			Search search = new UniformCostSearch();
			SearchAgent agent = new SearchAgent(problema, search);
			printInstrumentation(agent.getInstrumentation());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	private static void printInstrumentation(Properties instrumentation) {
		System.out.println("Informacion:" + instrumentation.toString());
		
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
