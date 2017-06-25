package ar.edu.unlam.pb2.tren;

import java.util.ArrayList;


public class Tren {
	
		private Locomotora locomotora;
	
	
	private ArrayList <Vagon> vagones = new ArrayList <Vagon>();

	
	public Tren ()
	{
		this.locomotora = new Locomotora(null, null);
	}
	
	
	
	//metodos
	
	public Integer contarCantidadDeVagones()
	{
		return vagones.size();
	}
	
	public ArrayList <Vagon> mostrarVagones()
	{
		return vagones;
	}
	
	public void admitirVagon (Vagon vagon)
	{
		vagones.add(vagon);
	}
	


	//getters y setters

	public ArrayList<Vagon> getVagones() {
		return vagones;
	}



	public void setVagones(ArrayList<Vagon> vagones) {
		this.vagones = vagones;
	}



	public Locomotora getLocomotora() {
		return locomotora;
	}



	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}



	

}
