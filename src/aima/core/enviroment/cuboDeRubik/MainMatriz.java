package aima.core.enviroment.cuboDeRubik;

import java.util.Arrays;

public class MainMatriz {
	static final int t=9;
	static int[][] matriz=new int[t][t];
	static int[][] natriz=new int[t][t];
	public static void main(String[] args) { 
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				matriz[i][j]=i*3+j;
				natriz[i][j]=i*3+j;
			}
		}
		if(Arrays.deepEquals(matriz, natriz))
			System.out.println("Aqui no esta el problema");
		
	}

}
