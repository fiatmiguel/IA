package aima.core.enviroment.misioneros;


import aima.core.agent.Action;
import aima.core.agent.impl.DynamicAction;

class EstadoMisioneros 
{
	private final int nMAX = 3;
	private int misioneros;
	private int indigenas;
	private boolean barca;

	public EstadoMisioneros()
	{
		misioneros=nMAX;
		indigenas=nMAX;
		barca=true;
	}
	
	public EstadoMisioneros(int m, int i, boolean b){
		misioneros=m;
		indigenas=i;
		barca=b;
	}

	public EstadoMisioneros(EstadoMisioneros e)
	{
		this(e.getMisioneros(),e.getIndigenas(),e.isBarca());
	}

	

	public static Action MM = new DynamicAction("2misionero");
	public static Action MI = new DynamicAction("misioneroIndigena");	
	public static Action M = new DynamicAction("misionero");
	public static Action I = new DynamicAction("indigena");
	public static Action II = new DynamicAction("2indigena");
	
	void MM(){
		if(barca){
			misioneros-=2;
			barca=false;
		}else{
			misioneros+=2;
			barca=true;
		}
	}
	void MI(){
		if(barca){
			misioneros--;
			indigenas--;
			barca=false;
		}else{
			misioneros++;
			indigenas++;
			barca=true;
		}
	}
	void M (){
		if(barca){
			misioneros--;		
			barca=false;	
		}else{
			misioneros++;	
			barca=true;		
		}
	}
	void I (){
		if(barca){
			indigenas--;
			barca=false;
		}else{
			indigenas++;
			barca=true;
		}
	}
	void II(){
		if(barca){
			indigenas--;
			indigenas--;
			barca=false;
		}else{
			indigenas++;
			indigenas++;
			barca=true;
		}
	}
	

	public boolean movimientoValido(Action where){
		boolean vale = false;
		EstadoMisioneros siguiente = new EstadoMisioneros(this);
		if(EstadoMisioneros.MM.equals(where)){ 
			siguiente.MM();
			vale=!siguiente.peligro();
		}
		else if(EstadoMisioneros.MI.equals(where)){ 
			siguiente.MI();
			vale=!siguiente.peligro();
		}
		else if(EstadoMisioneros.M.equals(where)){ 
				siguiente.M();
				vale=!siguiente.peligro();}
		
		else if(EstadoMisioneros.I.equals(where)){ 
				siguiente.I();
				vale=!siguiente.peligro();
		}
		else if(EstadoMisioneros.II.equals(where)){ 
				siguiente.II();
				vale=!siguiente.peligro();
		}
		return vale;
	}

	private boolean peligro(){
		
		return (misioneros< indigenas) && (misioneros!= 0)
				|| (misioneros> indigenas) && (misioneros!= nMAX);
		
		
	}

	public boolean equals(Object o){
		if (this == o) { 
			return true;
		}
		if ((o == null) || (this.getClass() != o.getClass())) {
			return false;
		}
		EstadoMisioneros nuevo = (EstadoMisioneros) o;
		int total=this.hashCode();
		int t=nuevo.hashCode();
		if (total==t) {
			return true;
		}else
			return false;
	}

	public int hashCode(){
		return(100 * misioneros) + (10 * indigenas) + (barca? 1 : 0);
	}

	

	public int getMisioneros() {
		return misioneros;
	}

	public int getIndigenas() {
		return indigenas;
	}

	public boolean isBarca() {
		return barca;
	}

}