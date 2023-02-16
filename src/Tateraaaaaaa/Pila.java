package Tateraaaaaaa;

 class Pila extends AcomuladorElectrico {
	private String tipoEstandar;
	private boolean esReciclable;
	private int porcentajeCargaMaxima;
	 Pila(String codigo, String uso, int cargaMaxima,String tipoEstandar,boolean esReciclable) {
		super(codigo, uso, cargaMaxima);
		this.setPorcentajeCargaActual(100);
		this.tipoEstandar=tipoEstandar;
		this.esReciclable=esReciclable;
		this.porcentajeCargaMaxima=100;;
		
	}
	
	public String getTipoEstandar() {
		return tipoEstandar;
	}

	public void setTipoEstandar(String tipoEstandar) {
		this.tipoEstandar = tipoEstandar;
	}

	public boolean isEsReciclable() {
		return esReciclable;
	}

	public void setEsReciclable(boolean esReciclable) {
		this.esReciclable = esReciclable;
	}

	@Override
	public String toString() {
		return "Pila [tipoEstandar=" + tipoEstandar + ", esReciclable=" + esReciclable + ", Codigo=" + getCodigo()
				+ ", Uso=" + getUso() + ", CargaMaxima=" + getCargaMaxima() + ", PorcentajeCargaActual="
				+ getPorcentajeCargaActual() + ", porcentajeCargaMaxima="+porcentajeCargaMaxima;
	}
	
	
}
