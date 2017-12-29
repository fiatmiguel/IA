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
				fichas[i][b]=i*9+b+1;
		}
		//movimientoHorizontalCentral();//
		//movimientoHorizontalCentral()
		//Rprime();
		movimientoHorizontalCentral();movimientoVerticalCentral();
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
		if (comprobarConsistencia(fichas)){
			System.out.println("F");
			System.exit(-1);
		}
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
		if (comprobarConsistencia(fichas)){
			System.out.println("F'");
			System.exit(-1);
		}
	}
	public boolean comprobarConsistencia(int[][] fichas){
		boolean[] b=new boolean[27];
		for (int i=0;i<3;i++){
			for (int j=0;j<9;j++){
				if (!b[i*9+j])
					b[i*9+j]=true;
				else{
					String s = "La siguiente matriz está corrompida\n";
					for (int as=0;as<3;as++){
						for (int c=0;c<9;c++){
							s+=fichas[as][c]+" ";
						}
						s+="\n";
					}
					System.out.println(s);
					return true;
				}
			}
			
		}
		return false;
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
		if (comprobarConsistencia(fichas)){
			System.out.println("B'");
			System.exit(-1);
		}
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
		if (comprobarConsistencia(fichas)){
			System.out.println("B");
			System.exit(-1);
		}
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
		if (comprobarConsistencia(fichas)){
			System.out.println("U");
			System.exit(-1);
		}
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
		if (comprobarConsistencia(fichas)){
			System.out.println("D");
			System.exit(-1);
		}
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
		fichas[2][6]=viejo[0][6];if (comprobarConsistencia(fichas)){
			System.out.println("L");
			System.exit(-1);
		}
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
		if (comprobarConsistencia(fichas)){
			System.out.println("R");
			System.exit(-1);
		}
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
		if (comprobarConsistencia(fichas)){
			System.out.println("L'");
			System.exit(-1);
		}
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
		if (comprobarConsistencia(fichas)){
			System.out.println("U'");
			System.exit(-1);
		}
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
		if (comprobarConsistencia(fichas)){
			System.out.println("D'");
			System.exit(-1);
		}
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
		if (comprobarConsistencia(fichas)){
			System.out.println("R'");
			System.exit(-1);
		}
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
				result+=fichas[i][j]*prims[i*9+j];
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
		boolean returnValue=false;
		int[][] seguridad=copia(fichas);
		for(int j=0;j<4;j++){
			for (int i=0;i<4;i++){
				for(int k=0;k<3;k++){
					for (int h= 0;h<9;h++){
					if (Arrays.deepEquals(fichas, other.getFichas()))
						returnValue= true;
					}
				}
				rotarZ();
			}
			rotarX();
		}
		rotarY();
		for (int i=0;i<4;i++){
			if (Arrays.deepEquals(fichas, other.getFichas()))
				returnValue= true;
			rotarX();
		}
		rotarY();
		rotarY();
		for (int i=0;i<4;i++){
			if (Arrays.deepEquals(fichas, other.getFichas()))
				returnValue= true;
			rotarZ();
		}	
		rotarY();
		/*
		if (returnValue){
			String s = "";
			for (int as=0;as<3;as++){
				for (int c=0;c<9;c++){
					s+=other.getFichas()[as][c]+" ";
				}
				s+="\n";
			}
			System.out.println(s);
		}
		*/
		return returnValue;
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
		if (comprobarConsistencia(fichas)){
			System.out.println("Vertical");
			System.exit(-1);
		}
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
		if (comprobarConsistencia(fichas)){
			System.out.println("Z");
			System.exit(-1);
		}
	}
	
	public void movimientoZCentral(){//Idem
		int viejo[][]=copia(fichas);
		fichas[1][2]=viejo[1][0];
		fichas[1][5]=viejo[1][1];
		fichas[1][8]=viejo[1][2];
		fichas[1][1]=viejo[1][3];
			//fichas[0][4]=viejo[0][4]
		fichas[1][7]=viejo[1][5];
		fichas[1][0]=viejo[1][6];
		fichas[1][3]=viejo[1][7];
		fichas[1][6]=viejo[1][8];
		if (comprobarConsistencia(fichas)){
			System.out.println("Z");
			System.exit(-1);
		}
		
	}
	
	private void rotarX(){
		U();
		movimientoHorizontalCentral();
		D();
	}
	private void rotarY(){
		L();
		movimientoVerticalCentral();
		R();
	}
	private void rotarZ(){
		F();
		movimientoZCentral();
		B();
	}
	
	
}
