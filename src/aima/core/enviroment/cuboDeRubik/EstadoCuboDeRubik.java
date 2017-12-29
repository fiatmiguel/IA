package aima.core.enviroment.cuboDeRubik;

import java.util.Arrays;

import aima.core.agent.Action;
import aima.core.agent.impl.DynamicAction;


public class EstadoCuboDeRubik {

	int[][] fichas=new int[3][9];
	public EstadoCuboDeRubik(int[][] conf) {
		fichas=conf;
		
	}

	public EstadoCuboDeRubik(EstadoCuboDeRubik estado) {
		fichas=copia(estado.getFichas());
	}

	public EstadoCuboDeRubik() {
		for(int i = 0;i<3;i++){
			for(int b=0;b<9;b++)
				fichas[i][b]=i*3+b;
		}
		movimientoHorizontalCentral();
		movimientoHorizontalCentral();
		movimientoVerticalCentral();
		
		
	}

	public static Action F = new DynamicAction("F");
	public static Action B = new DynamicAction("B");
	public static Action L = new DynamicAction("L");
	public static Action U = new DynamicAction("U");
	public static Action D = new DynamicAction("D");
	public static Action R = new DynamicAction("R");
	public static Action Fprime = new DynamicAction("Fprime");
	public static Action Bprime = new DynamicAction("Bprime");
	public static Action Lprime = new DynamicAction("Lprime");
	public static Action Uprime = new DynamicAction("Uprime");
	public static Action Dprime = new DynamicAction("Dprime");
	public static Action Rprime = new DynamicAction("Rprime");
	
	private int[][] copia(int[][] original){
		int copia[][]=new int[3][9];
		for (int i=0;i<3;i++)
				for (int j=0;j<9;j++)
					copia[i][j]=original[i][j];
		return copia;
	}

	public void F(){
		int viejo[][]=copia(fichas);
		fichas[0][2]=viejo[0][0];
		fichas[0][5]=viejo[0][1];
		fichas[0][8]=viejo[0][2];
		fichas[0][1]=viejo[0][3];
		//fichas[0][4]=viejo[0][4]
		fichas[0][7]=viejo[0][5];
		fichas[0][0]=viejo[0][6];
		fichas[0][3]=viejo[0][7];
		fichas[0][6]=viejo[0][8];
	}
	public void Fprime(){
		int viejo[][]=copia(fichas);
		fichas[0][0]=viejo[0][2];
		fichas[0][1]=viejo[0][5];
		fichas[0][2]=viejo[0][8];
		fichas[0][3]=viejo[0][1];
		//fichas[0][4]=viejo[0][4]
		fichas[0][5]=viejo[0][7];
		fichas[0][6]=viejo[0][0];
		fichas[0][7]=viejo[0][3];
		fichas[0][8]=viejo[0][6];
	}
	
	public void Bprime() {
		int viejo[][]=copia(fichas);
		fichas[2][0]=viejo[2][2];
		fichas[2][1]=viejo[2][5];
		fichas[2][2]=viejo[2][8];
		fichas[2][3]=viejo[2][1];
		//fichas[0][4]=viejo[0][4]
		fichas[2][5]=viejo[2][7];
		fichas[2][6]=viejo[2][0];
		fichas[2][7]=viejo[2][3];
		fichas[2][8]=viejo[2][6];
	}
	public void B(){
		int viejo[][]=copia(fichas);
		fichas[2][2]=viejo[2][0];
		fichas[2][5]=viejo[2][1];
		fichas[2][8]=viejo[2][2];
		fichas[2][1]=viejo[2][3];
		//fichas[0][4]=viejo[0][4]
		fichas[2][7]=viejo[2][5];
		fichas[2][0]=viejo[2][6];
		fichas[2][3]=viejo[2][7];
		fichas[2][6]=viejo[2][8];
	}
	public void U(){
		int viejo[][]=copia(fichas);
		fichas[0][0]=viejo[2][0];
		fichas[0][1]=viejo[1][0];
		fichas[0][2]=viejo[0][0];
		fichas[1][0]=viejo[2][1];

		fichas[1][2]=viejo[0][1];
		fichas[2][0]=viejo[2][2];
		fichas[2][1]=viejo[1][2];
		fichas[2][2]=viejo[0][2];
	}
	public void D(){
		int viejo[][]=copia(fichas);
		fichas[0][6]=viejo[2][6];
		fichas[0][7]=viejo[1][6];
		fichas[0][8]=viejo[0][6];
		fichas[1][6]=viejo[2][7];

		fichas[1][8]=viejo[0][7];
		fichas[2][6]=viejo[2][8];
		fichas[2][7]=viejo[1][8];
		fichas[2][8]=viejo[0][8];
	}
	public void L(){
		int viejo[][]=copia(fichas);
		fichas[0][0]=viejo[2][0];
		fichas[0][3]=viejo[1][0];
		fichas[0][6]=viejo[0][0];
		fichas[1][0]=viejo[2][3];
		//fichas[1][3]=
		fichas[1][6]=viejo[0][3];
		fichas[2][0]=viejo[2][6];
		fichas[2][3]=viejo[1][6];
		fichas[2][6]=viejo[0][6];
	}
	public void R(){
		int viejo[][]=copia(fichas);
		fichas[0][2]=viejo[2][2];
		fichas[0][5]=viejo[1][2];
		fichas[0][8]=viejo[0][2];
		fichas[1][2]=viejo[2][5];
		fichas[1][8]=viejo[0][5];
		fichas[2][2]=viejo[2][8];
		fichas[2][5]=viejo[1][8];
		fichas[2][8]=viejo[0][8];
	}
	public void Lprime(){
		int viejo[][]=copia(fichas);
		fichas[2][0]=viejo[0][0];
		fichas[1][0]=viejo[0][3];
		fichas[0][0]=viejo[0][6];
		fichas[2][3]=viejo[1][0];
		
		fichas[0][3]=viejo[1][6];
		fichas[2][6]=viejo[2][0];
		fichas[1][6]=viejo[2][3];
		fichas[0][6]=viejo[2][6];
	}
	public void Uprime(){
		int viejo[][]=copia(fichas);
		fichas[2][0]=viejo[0][0];
		fichas[1][0]=viejo[0][1];
		fichas[0][0]=viejo[0][2];
		fichas[2][1]=viejo[1][0];

		fichas[0][1]=viejo[1][2];
		fichas[2][2]=viejo[2][0];
		fichas[1][2]=viejo[2][1];
		fichas[0][2]=viejo[2][2];
	}
	public void Dprime(){
		int viejo[][]=copia(fichas);
		fichas[2][6]=viejo[0][6];
		fichas[1][6]=viejo[0][7];
		fichas[0][6]=viejo[0][8];
		fichas[2][7]=viejo[1][6];

		fichas[0][7]=viejo[1][8];
		fichas[2][8]=viejo[2][6];
		fichas[1][8]=viejo[2][7];
		fichas[0][8]=viejo[2][8];
	}
	public void Rprime(){
		int viejo[][]=copia(fichas);
		fichas[2][2]=viejo[0][2];
		fichas[1][2]=viejo[0][5];
		fichas[0][2]=viejo[0][8];
		fichas[2][5]=viejo[1][2];
		fichas[0][5]=viejo[1][8];
		fichas[2][8]=viejo[2][2];
		fichas[1][8]=viejo[2][5];
		fichas[0][8]=viejo[2][8];
		}

	public int[][] getFichas() {
		return fichas;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result;
		final int prims[]={	101, 103, 107, 109, 113, 127, 131, 137,
							139, 149, 151, 157, 163, 167, 173, 179,
							181, 191, 193, 197, 199, 211, 223, 227,
							229, 233, 239, 241, 251, 257};
		for(int i=0;i<3;i++){
			for(int j=0;j<9;j++)
				result+=fichas[i][j]*prims[i*3+j];
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstadoCuboDeRubik other = (EstadoCuboDeRubik) obj;
		if (!Arrays.deepEquals(fichas, other.getFichas())){
			U();
			movimientoHorizontalCentral();
			D();
			if (!Arrays.deepEquals(fichas, other.getFichas())){
				U();
				movimientoHorizontalCentral();
				D();
				if (!Arrays.deepEquals(fichas, other.getFichas())){
					U();
					movimientoHorizontalCentral();
					D();
					if (!Arrays.deepEquals(fichas, other.getFichas())){
						U();
						movimientoHorizontalCentral();
						D();
						L();
						movimientoVerticalCentral();
						R();
						if (!Arrays.deepEquals(fichas, other.getFichas())){
							L();
							movimientoVerticalCentral();
							R();
							L();
							movimientoVerticalCentral();
							R();
							if (!Arrays.deepEquals(fichas, other.getFichas()))
								return false;
						}
					}
				}	
			}
		}
		return true;
	}

	public void movimientoVerticalCentral(){//Este movimiento sirve para calcular
											//cubos similares, no se usa como
		int viejo[][]=copia(fichas);		//como movimento para resolver el cubo
		fichas[0][1]=viejo[2][1];			//sino fabricar nuevos
		fichas[0][4]=viejo[1][1];
		fichas[0][7]=viejo[0][1];
		fichas[1][1]=viejo[2][4];
		//fichas[1][3]=
		fichas[1][7]=viejo[0][4];
		fichas[2][1]=viejo[2][7];
		fichas[2][4]=viejo[1][7];
		fichas[2][7]=viejo[0][7];
	}
	
	public void movimientoHorizontalCentral(){//Idem
		int viejo[][]=copia(fichas);
		fichas[0][3]=viejo[2][3];
		fichas[0][4]=viejo[1][3];
		fichas[0][5]=viejo[0][3];
		fichas[1][3]=viejo[2][4];

		fichas[1][5]=viejo[0][4];
		fichas[2][3]=viejo[2][5];
		fichas[2][4]=viejo[1][5];
		fichas[2][5]=viejo[0][5];
	}
	
}
