package aima.core.enviroment.misioneros;
import java.util.LinkedHashSet;
import java.util.Set;
import aima.core.agent.Action;
import aima.core.search.framework.ActionsFunction;



class MisionerosActionsFunction implements ActionsFunction{

	public Set<Action> actions(Object o) {
		EstadoMisioneros state = (EstadoMisioneros) o;
		Set<Action> actions = new LinkedHashSet<Action>();
		if(state.movimientoValido(EstadoMisioneros.MM))
			actions.add(EstadoMisioneros.MM);
		if(state.movimientoValido(EstadoMisioneros.MI))
			actions.add(EstadoMisioneros.MI);
		if(state.movimientoValido(EstadoMisioneros.M))
			actions.add(EstadoMisioneros.M);
		if(state.movimientoValido(EstadoMisioneros.I))
			actions.add(EstadoMisioneros.I);
		if(state.movimientoValido(EstadoMisioneros.II))
			actions.add(EstadoMisioneros.II);
		return actions;
	}

}
