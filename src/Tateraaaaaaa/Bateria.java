package Tateraaaaaaa;


class Bateria extends AcomuladorElectrico implements Recargable {
	private int numCiclosMax,numCiclosHechos, porcentajeCargaMaxima;

	 Bateria(String codigo, String uso, int cargaMaxima,int numCiclosMax) {
		super(codigo, uso, cargaMaxima);
		this.setPorcentajeCargaActual(0);
		this.numCiclosHechos=0;
		this.porcentajeCargaMaxima=101;
		this.numCiclosMax=numCiclosMax;
		
	}
	 
	public int getNumCiclosMax() {
		return numCiclosMax;
	}

	public void setNumCiclosMax(int numCiclosMax) {
		this.numCiclosMax = numCiclosMax;
	}

	public int getNumCiclosHechos() {
		return numCiclosHechos;
	}

	public void setNumCiclosHechos(int numCiclosHechos) {
		this.numCiclosHechos = numCiclosHechos;
	}

	public int getPorcentajeCargaMaxima() {
		return porcentajeCargaMaxima;
	}

	public void setPorcentajeCargaMaxima(int porcentajeCargaMaxima) {
		this.porcentajeCargaMaxima = porcentajeCargaMaxima;
	}
	
	@Override
	public void cargar() throws Throwable {
		try {
		
			this.numCiclosHechos=this.numCiclosHechos+1;
			this.porcentajeCargaMaxima=this.porcentajeCargaMaxima-1;
			this.setPorcentajeCargaActual(porcentajeCargaMaxima);
			
			
		}
		catch (Exception  baja) {
			
			if(numCiclosHechos==numCiclosMax||porcentajeCargaMaxima<20){
				throw(Exception) new Exception();
				
			}
		}
		
		
		
	}

	@Override
	public void refrescar() {
		this.porcentajeCargaMaxima=100;
		this.numCiclosHechos=this.numCiclosHechos+3;
		this.setPorcentajeCargaActual(100);
		
	}

	/*@Override
	public String toString() {
		return "Bateria [numCiclosMax=" + numCiclosMax + ", numCiclosHechos=" + numCiclosHechos
				+ ", porcentajeCargaMaxima=" + porcentajeCargaMaxima + ", toString()=" + super.toString() + "]";
	}*/
	//lo hago mejor como abajo :)
	
	@Override
	public String toString() {
		return "Bateria numCiclosMax=" + numCiclosMax + ", numCiclosHechos=" + numCiclosHechos
				+ ", porcentajeCargaMaxima=" + porcentajeCargaMaxima + ", Codigo=" + getCodigo() + ", Uso="
				+ getUso() + ", CargaMaxima=" + getCargaMaxima() + ", PorcentajeCargaActual="
				+ getPorcentajeCargaActual();
	}
	
	
}
