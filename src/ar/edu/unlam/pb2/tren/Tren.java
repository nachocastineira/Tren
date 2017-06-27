package ar.edu.unlam.pb2.tren;

import java.util.ArrayList;
import java.util.Iterator;


public class Tren {
	
		private Locomotora locomotora;
		private Integer idDelTren;
	
	
	private ArrayList <Vagon> vagones = new ArrayList <Vagon>();

	
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
	
	public Integer getIdDelTren() {
		return idDelTren;
	}

	public void setIdDelTren(Integer idDelTren) {
		this.idDelTren = idDelTren;
	}
	


				 //metodos
	public Integer contarCantidadDeVagones()
	{
		return vagones.size();
	}
	
	
	public void removerVagon (Vagon vagon)
	{
		vagones.remove(vagon);
	}
	
	
	public void removerTodosLosVagones()
	{
		vagones.clear();
	}
	
	
	
	
	public void admitirVagon (Vagon vagon) throws Exception
	{	
		//	que la carga del vagon sea menor o igual a lo permitido por la locomotora, y que no se vuelva a agregar un vagon
		if((calcularCargaTotal()+vagon.getCargaPermitida())<=locomotora.getCargaMaxima() && !vagones.contains(vagon))
		{
			vagones.add(vagon);
		}
		else {	
			throw new Exception("La carga maxima de locomotora está excedida o se volvió a agregar un mismo vagon");			
		}
	}
	
	
	public Double calcularPromedioDeCargaDeLosVagones()
	{
		return ((double)this.calcularCargaTotal()/vagones.size());  //se castea el metodo cargaTotal porque era un Integer y el promedio es Double
	}
	


	
	
	public void imprimirVagones()   //para que muestre el dato es necesario el metodo toString()  en la clase Vagon
	{	
					//impresion usando un iterador
//        Iterator<Vagon> it = vagones.iterator();   
//        while(it. hasNext()) {
//            System.out.println(it.next());	
//        	}
        
        System.out.println("Listado de vagones del tren: " +this.idDelTren);   //impresion usando un for
        for(int i=0; i< vagones.size(); i++) {
            System.out.println(vagones.get(i)); //con el vagones.get obtengo los valores de la clase Vagon sacados del metodo toString()
        }
	}
	
	
	public void removerUltimoVagon()   //(vagones.get(vagones.size() -1) --> con esto obtengo el ultimo objeto agregado a a la coleccion
	{			
		vagones.remove(vagones.get(vagones.size() -1));
		System.out.println("Se ha eliminado el ultimo vagon del tren "+this.idDelTren);
	}
	
	
	public void imprimirSiElTrenNoTieneVagones()
	{
		if(vagones.isEmpty() == true) //si vagones esta vacio que haga eso
		{
			System.out.println("El tren"+this.idDelTren+  "no tiene vagones");
		}
		else
		{
			System.out.println("El tren "+this.idDelTren+ " tiene " +vagones.size() + " vagones");  //impresion concatenando cadenas
		}
	}
	

	//metodo que suma la carga total de los vagones
	public Integer calcularCargaTotal(){

		Iterator <Vagon> it = vagones.iterator();  //creo un iterador para recorrer coleccion
		Integer cargaDelTren = 0;  //una variable para ir sumando los valores

		while (it.hasNext()) //mientras haya un prox elemento itero
		{  
			Vagon vagon = it.next();  //obtengo un vagon
			cargaDelTren = cargaDelTren + vagon.getCargaPermitida();	//voy sumando la carga permitida de todos los vagones
		}	
	   return cargaDelTren;
	}



	

}
