package ar.edu.unlam.pb2.tren;

import java.util.ArrayList;
import java.util.Iterator;


public class Tren {
	
		private Locomotora locomotora;
	
	
	private ArrayList <Vagon> vagones = new ArrayList <Vagon>();

	
	
	
	//metodos
	
	public Integer contarCantidadDeVagones()
	{
		return vagones.size();
	}
	

	
	public void admitirVagon (Vagon vagon) throws Exception
	{
		

		if((calcularCargaTotal()+vagon.getCargaPermitida())<=locomotora.getCargaMaxima() )
		{
			vagones.add(vagon);
		}
		else
		{	

			throw new Exception("La carga maxima de locomotora está excedida");			
		}
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



	//metodo que suma la carga total de los vagones
	public Integer calcularCargaTotal(){

		Iterator <Vagon> it = vagones.iterator();  //para recorrer coleccion

		Integer cargaDelTren = 0;

		while (it.hasNext()){  //mientras haya un prox elemento itero

			Vagon vagon = it.next();  //obtengo un vagon
			
			cargaDelTren = cargaDelTren + vagon.getCargaPermitida();
			 
		}
		
	   return cargaDelTren;
	}



	

}
