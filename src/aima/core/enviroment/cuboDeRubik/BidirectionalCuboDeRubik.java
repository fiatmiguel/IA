package aima.core.enviroment.cuboDeRubik;

import aima.core.search.framework.BidirectionalProblem;
import aima.core.search.framework.DefaultGoalTest;
import aima.core.search.framework.Problem;

public class BidirectionalCuboDeRubik extends Problem implements BidirectionalProblem {

	Problem reverseProblem; 
	
	public BidirectionalCuboDeRubik(EstadoCuboDeRubik arg0,EstadoCuboDeRubik solucion){
		super(arg0, CuboDeRubikFunctionFactory.getActionsFunction(),
				CuboDeRubikFunctionFactory.getResultFunction(),
				new DefaultGoalTest(solucion));
		
		reverseProblem = new Problem(new EstadoCuboDeRubik(solucion),
				CuboDeRubikFunctionFactory.getActionsFunction(), CuboDeRubikFunctionFactory.getResultFunction(),
				new CuboDeRubikGoalTest(initialState));
		
	}
	
	public Problem getOriginalProblem() {
		return this;
	}

	public Problem getReverseProblem() {
		return reverseProblem;
	}

}
