package aima.core.enviroment.cuboDeRubik;

import aima.core.search.framework.GoalTest;

public class CuboDeRubikGoalTest implements GoalTest {

	public boolean isGoalState(Object arg0) {
		EstadoCuboDeRubik estadoActual = (EstadoCuboDeRubik) arg0;
		int[][] solucion=new int[3][9];
		for(int i = 0;i<3;i++){
			for(int b=0;b<9;b++)
				solucion[i][b]=i*3+b;
		}
		EstadoCuboDeRubik estadoFinal = new EstadoCuboDeRubik(solucion);
		return estadoFinal.equals(estadoActual);
	}

}
