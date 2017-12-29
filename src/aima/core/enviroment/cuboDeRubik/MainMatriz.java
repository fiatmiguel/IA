package aima.core.enviroment.cuboDeRubik;

public class MainMatriz {
	static final int t=9;
	static int[][] matriz=new int[t][t];
	public static void main(String[] args) { 
		for (int i=0;i<3;i++)
			for (int j=0;j<3;j++)
				matriz[i][j]=i*3+j;
		for (int i=0;i<t;i++){
			String s = "";
			for (int j=0;j<t;j++){
				s+=matriz[i][j]+" ";
			}

			System.out.println(s);
		}
	}

}
