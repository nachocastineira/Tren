package ar.edu.unlam.pb2.tren;

public class Locomotora {
	
	private String modelo;
	private Integer anioDeFabricacion;
	

	public Locomotora (String modelo, Integer anioDeFabricacion)
	{
		this.modelo = modelo;
		this.anioDeFabricacion = anioDeFabricacion;
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
	
	
	public int compareTo(Locomotora otro) {
		return this.anioDeFabricacion.compareTo(otro.getAnioDeFabricacion());   //uso el metodo .compareTo
	}
	

}
