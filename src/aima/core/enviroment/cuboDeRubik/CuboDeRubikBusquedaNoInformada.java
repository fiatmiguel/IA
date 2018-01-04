package aima.core.enviroment.cuboDeRubik;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import aima.core.agent.Action;
import aima.core.search.framework.Problem;
import aima.core.search.framework.Search;
import aima.core.search.framework.SearchAgent;
import aima.core.search.uninformed.BidirectionalSearch;
import aima.core.search.uninformed.UniformCostSearch;

public class CuboDeRubikBusquedaNoInformada {
	static EstadoCuboDeRubik estadoInicial=new EstadoCuboDeRubik();
	public static void main(String[] args) {
		//biDireccional();
		costeConstante();

	}
	private static void printInstrumentation(Properties instrumentation) {
		System.out.println("Informacion:" + instrumentation.toString());
		
	}
	
	public static void biDireccional(){
		try{
			int[][] solucion=new int[3][9];
			for(int i = 0;i<3;i++)
				for(int b=0;b<9;b++)
					solucion[i][b]=i*9+b+1;	
			EstadoCuboDeRubik estadoFinal = new EstadoCuboDeRubik(solucion);
			Problem problema = new BidirectionalCuboDeRubik(estadoInicial,estadoFinal);
			Search tipoBusqueda=new BidirectionalSearch();
			SearchAgent ag =new SearchAgent(problema,tipoBusqueda);
			System.out.println("\nCubo De Rubik Busqueda Bidireccional");
			printInstrumentation(ag.getInstrumentation());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void costeConstante(){
		
		try{
			System.out.println("Cubo De Rubik CosteConstante--->");
			Problem problem = new Problem(estadoInicial,
					CuboDeRubikFunctionFactory.getActionsFunction(), 
					CuboDeRubikFunctionFactory.getResultFunction(),
					new CuboDeRubikGoalTest(),
					new CuboDeRubikStepCostFunction());
			Search search = new UniformCostSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printInstrumentation(agent.getInstrumentation());
			printActions(agent.getActions());
		}catch (Exception E){
			
		}
	}
	
	private static void printActions(List<Action> actions) {
		Iterator<Action> it = actions.iterator();
		System.out.println("Secuencia de acciones:");
		while(it.hasNext()){
			System.out.println("\t" + it.next());
		}
	}
}
