package ar.edu.unlam.pb2.tren;

public class Locomotora {
	
	private String modelo;
	private Integer anioDeFabricacion;
	private Integer cargaMaxima;
	

	public Locomotora (String modelo, Integer anioDeFabricacion, Integer cargaMaxima)
	{
		this.modelo = modelo;
		this.anioDeFabricacion = anioDeFabricacion;
		this.cargaMaxima = cargaMaxima;
	}


	//getters y setters
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Integer getAnioDeFabricacion() {
		return anioDeFabricacion;
	}


	public void setAnioDeFabricacion(Integer anioDeFabricacion) {
		this.anioDeFabricacion = anioDeFabricacion;
	}


	public Integer getCargaMaxima() {
		return cargaMaxima;
	}


	public void setCargaMaxima(Integer cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	

	

}
