package aima.core.enviroment.cuboDeRubik;

import java.util.Arrays;

public class MainMatriz {
	static final int t=9;
	static int[][] matriz=new int[t][t];
	static int[][] natriz=new int[t][t];
	public static void main(String[] args) { 
		EstadoCuboDeRubik estado1 = new EstadoCuboDeRubik();
		EstadoCuboDeRubik estado2 = new EstadoCuboDeRubik();
		String s = "Paso0\n";
		for (int as=0;as<3;as++){
			for (int c=0;c<9;c++){
				s+=estado1.getFichas()[as][c]+" ";
			}
			s+="\n";
		}
		System.out.println(s);
		estado1.Rprime();
		s = "Paso1\n";
		for (int as=0;as<3;as++){
			for (int c=0;c<9;c++){
				s+=estado1.getFichas()[as][c]+" ";
			}
			s+="\n";
		}
		System.out.println(s);
		estado1.movimientoZCentral();
		s = "PasoDoble\n";
		for (int as=0;as<3;as++){
			for (int c=0;c<9;c++){
				s+=estado1.getFichas()[as][c]+" ";
			}
			s+="\n";
		}
		System.out.println(s);
		estado1.B();
		s = "Paso4\n";
		for (int as=0;as<3;as++){
			for (int c=0;c<9;c++){
				s+=estado1.getFichas()[as][c]+" ";
			}
			s+="\n";
		}
		System.out.println(s);
		estado1.F();
		s = "Paso 5\n";
		for (int as=0;as<3;as++){
			for (int c=0;c<9;c++){
				s+=estado1.getFichas()[as][c]+" ";
			}
			s+="\n";
		}
		System.out.println(s);
		
		estado1.Dprime();
		s = "?SOLUCIONfinal\n";
		for (int as=0;as<3;as++){
			for (int c=0;c<9;c++){
				s+=estado1.getFichas()[as][c]+" ";
			}
			s+="\n";
		}
		System.out.println(s);
		System.out.println(estado1.equals(estado2));
		
	}

}
