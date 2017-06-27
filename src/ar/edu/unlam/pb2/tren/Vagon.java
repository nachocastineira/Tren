package ar.edu.unlam.pb2.tren;

public class Vagon {
	
	private Integer cargaPermitida;
	private Integer id;
	
	public Vagon (Integer cargaPermitida)
	{
		this.cargaPermitida = cargaPermitida;
	}


			//getter y setter
	public Integer getCargaPermitida() {
		return cargaPermitida;
	}

	public void setCargaPermitida(Integer cargaPermitida) {
		this.cargaPermitida = cargaPermitida;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	  public String toString() {
	        return "[Id: "+ this.getId() +"] [Carga: "+this.getCargaPermitida()+"]";
	    }
	
	

}
