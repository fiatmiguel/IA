package aima.core.enviroment.misioneros;

import aima.core.agent.Action;
import aima.core.search.framework.StepCostFunction;

public class MisionerosStepCostFunction implements StepCostFunction{

	public double c(Object s, Action a, Object o) {
		return 1;
		
	}

}
