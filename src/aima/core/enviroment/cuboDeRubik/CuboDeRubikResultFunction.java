package aima.core.enviroment.cuboDeRubik;

import aima.core.agent.Action;
import aima.core.search.framework.ResultFunction;

public class CuboDeRubikResultFunction implements ResultFunction {

	public Object result(Object arg0, Action arg1) {
		EstadoCuboDeRubik estado = (EstadoCuboDeRubik) arg0;
		EstadoCuboDeRubik newEstado = new EstadoCuboDeRubik(estado);
		if (arg1.equals(EstadoCuboDeRubik.F))
			newEstado.F();
		else if(arg1.equals(EstadoCuboDeRubik.B))
			newEstado.B();
		else if(arg1.equals(EstadoCuboDeRubik.L))
			newEstado.L();
		else if(arg1.equals(EstadoCuboDeRubik.R))
			newEstado.R();
		else if(arg1.equals(EstadoCuboDeRubik.U))
			newEstado.U();
		else if(arg1.equals(EstadoCuboDeRubik.D))
			newEstado.D();
		else if (arg1.equals(EstadoCuboDeRubik.Fprime))
			newEstado.Fprime();
		else if(arg1.equals(EstadoCuboDeRubik.Bprime))
			newEstado.Bprime();
		else if(arg1.equals(EstadoCuboDeRubik.Lprime))
			newEstado.Lprime();
		else if(arg1.equals(EstadoCuboDeRubik.Rprime))
			newEstado.Rprime();
		else if(arg1.equals(EstadoCuboDeRubik.Uprime))
			newEstado.Uprime();
		else if(arg1.equals(EstadoCuboDeRubik.Dprime))
			newEstado.Dprime();
		return newEstado;
	}

}
