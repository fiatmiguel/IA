package aima.core.enviroment.cuboDeRubik;

import java.util.LinkedHashSet;
import java.util.Set;

import aima.core.agent.Action;
import aima.core.search.framework.ActionsFunction;

public class CuboDeRubikActionsFunction implements ActionsFunction {

	public Set<Action> actions(Object arg0) {
		Set<Action> acciones = new LinkedHashSet<Action>();
		acciones.add(EstadoCuboDeRubik.B);
		acciones.add(EstadoCuboDeRubik.Bprime);
		acciones.add(EstadoCuboDeRubik.F);
		acciones.add(EstadoCuboDeRubik.Fprime);
		acciones.add(EstadoCuboDeRubik.L);
		acciones.add(EstadoCuboDeRubik.Lprime);
		acciones.add(EstadoCuboDeRubik.U);
		acciones.add(EstadoCuboDeRubik.Uprime);
		acciones.add(EstadoCuboDeRubik.D);
		acciones.add(EstadoCuboDeRubik.Dprime);
		acciones.add(EstadoCuboDeRubik.R);
		acciones.add(EstadoCuboDeRubik.Rprime);
		return acciones;
	}
	
}
