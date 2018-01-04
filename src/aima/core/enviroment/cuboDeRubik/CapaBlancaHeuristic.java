package aima.core.enviroment.cuboDeRubik;

import aima.core.search.framework.HeuristicFunction;

public class CapaBlancaHeuristic implements HeuristicFunction {

public double h(Object state) {
		
	EstadoCuboDeRubik m = (EstadoCuboDeRubik) state;
	int sum=27;
	int[][] fichas = m.getFichas();//primera cruz
	if (	fichas[0][1]==2 &&
			fichas[1][0]==10 &&
			fichas[1][1]==11 &&
			fichas[1][2]==12 &&
			fichas[2][1]==20 &&
			fichas[0][4]==5 &&
			fichas[1][3]==13 &&
			fichas[1][5]==15 && 
			fichas[2][4]==23)
		sum-=9;
	else return sum*10;
	if(		fichas[0][0]==1 &&//primera capa
			fichas[0][2]==3 &&
			fichas[2][0]==19 &&
			fichas[2][2]==21)
		sum-=4;
	else return sum*10;
	
	if(		fichas[0][3]==4 &&//segunda capa
			fichas[0][5]==6 &&
			fichas[2][3]==22 &&
			fichas[2][5]==25)
		sum-=4;
	else return sum*10;
	
	if ((	fichas[0][7]==8 || fichas[0][8]==16|| fichas[0][8]== 18|| fichas[0][8]==26) &&
		(	fichas[1][6]==8 || fichas[1][6]==16|| fichas[1][6]==18 || fichas[1][6]==26) &&
		(	fichas[1][8]==8 || fichas[1][8]==16|| fichas[1][8]==18 || fichas[1][8]==26) &&
		(	fichas[2][7]==8 || fichas[2][7]==16|| fichas[2][7]==18 || fichas[2][7]==26))
				sum-=2;//primer intento de ultima capa, medio colocadas
	else return sum*10;
	if(fichas[0][7]==8 && fichas[1][6]==16 && fichas[1][8]==18 && fichas[2][7]==26 )
		sum-=2;
	else return sum*10;
	
	if(		(fichas[0][6]==7||fichas[0][6]==9||fichas[0][6]==25||fichas[0][6]==27)&&
			(fichas[0][8]==7||fichas[0][8]==9||fichas[0][8]==25||fichas[0][8]==27)&&
			(fichas[2][6]==7||fichas[2][6]==9||fichas[2][6]==25||fichas[2][6]==27)&&
			(fichas[2][8]==27||fichas[2][8]==9||fichas[2][8]==25||fichas[2][8]==7))
		sum-=-2;
	return sum*10;
	}
	
	@Override
	public String toString(){
		return "CampeonDeAjedrezHeuristic";
	}


}
