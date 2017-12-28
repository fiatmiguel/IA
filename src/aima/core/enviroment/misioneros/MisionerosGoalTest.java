package aima.core.enviroment.misioneros;
import aima.core.search.framework.GoalTest;


public class MisionerosGoalTest implements GoalTest {

	public boolean isGoalState(Object s) {
		EstadoMisioneros sol = (EstadoMisioneros) s;
		EstadoMisioneros meta = new EstadoMisioneros(0,0,false);
		return sol.equals(meta);
	}
	
}
