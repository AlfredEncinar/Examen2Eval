package Tateraaaaaaa;

 class AcomuladorElectrico {
	private String codigo,uso;
	private int cargaMaxima;
	private int porcentajeCargaActual;
	


	AcomuladorElectrico(String codigo, String uso, int cargaMaxima) {
		super();
		this.codigo = codigo;
		this.uso = uso;
		this.cargaMaxima = cargaMaxima;
		this.porcentajeCargaActual=0;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getUso() {
		return uso;
	}


	public void setUso(String uso) {
		this.uso = uso;
	}


	public int getCargaMaxima() {
		return cargaMaxima;
	}


	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}


	public int getPorcentajeCargaActual() {
		return porcentajeCargaActual;
	}


	public void setPorcentajeCargaActual(int porcentajeCargaActual) {
		this.porcentajeCargaActual = porcentajeCargaActual;
	}


	 void usar(int u) {
		this.porcentajeCargaActual=porcentajeCargaActual-u;
	}


	@Override
	public String toString() {
		return "AcomuladorElectrico codigo=" + codigo + ", uso=" + uso + ", cargaMaxima=" + cargaMaxima
				+ ", porcentajeCargaActual=" + porcentajeCargaActual;
	}
	
	

}
