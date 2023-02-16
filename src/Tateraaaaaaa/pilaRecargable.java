package Tateraaaaaaa;

 class pilaRecargable extends AcomuladorElectrico implements Recargable {
	int numCiclosMax,numCiclosHechos;

	 pilaRecargable(String codigo, String uso, int cargaMaxima,int numCiclosMax) {
		super(codigo, uso, cargaMaxima);
		this.setPorcentajeCargaActual(0);
		this.numCiclosHechos=0;
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

	@Override
	public void cargar() {
		this.setPorcentajeCargaActual(100);
		this.numCiclosHechos=this.numCiclosHechos+1;
		
	}

	@Override
	public void refrescar() {
		this.setPorcentajeCargaActual(100);
		this.numCiclosHechos=this.numCiclosHechos+1;
		
		
	}

	@Override
	public String toString() {
		return "pilaRecargable [numCiclosMax=" + numCiclosMax + ", numCiclosHechos=" + numCiclosHechos
				+ ", Codigo=" + getCodigo() + ", Uso=" + getUso() + ", CargaMaxima=" + getCargaMaxima()
				+ ", PorcentajeCargaActual=" + getPorcentajeCargaActual() + "]";
	}
	
	
	
	

}
