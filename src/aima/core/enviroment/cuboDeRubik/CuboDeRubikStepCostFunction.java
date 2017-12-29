package aima.core.enviroment.cuboDeRubik;

import aima.core.agent.Action;
import aima.core.search.framework.StepCostFunction;

public class CuboDeRubikStepCostFunction implements StepCostFunction {

	public double c(Object arg0, Action arg1, Object arg2) {
		return 1;
	}

}
