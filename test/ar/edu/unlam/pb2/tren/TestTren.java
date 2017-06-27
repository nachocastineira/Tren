package ar.edu.unlam.pb2.tren;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTren {

	@Test
	public void testQueAgregaVagones() throws Exception {
		Tren miTren = new Tren();
		Locomotora miLocomotora = new Locomotora("Fiat", 2000, 200);
		Vagon miVagon1 = new Vagon(10);
		Vagon miVagon2 = new Vagon(20);

		miTren.setLocomotora(miLocomotora);
		
		miTren.admitirVagon(miVagon1);
		miTren.admitirVagon(miVagon2);

		
		assertEquals(miTren.contarCantidadDeVagones(), 2, 0);
	}
	
	@Test 
	public void testQueCuentaPesoDeLosVagones() throws Exception{
		Tren miTren = new Tren();
		Locomotora miLocomotora = new Locomotora("Fiat", 2000, 200);
		Vagon miVagon1 = new Vagon(10);
		Vagon miVagon2 = new Vagon(23);

		miTren.setLocomotora(miLocomotora);
		
		miTren.admitirVagon(miVagon1);
		miTren.admitirVagon(miVagon2);
		
		
		Integer pesoDelTren = miTren.calcularCargaTotal(); //igualo el metodo a una variable
		assertEquals(33, pesoDelTren, 0);
		
		assertEquals(miTren.calcularPromedioDeCargaDeLosVagones(), 16.5, 0.01);  //se hace el promedio de carga de los vagones	
	}
	
	
	@Test (expected = Exception.class) //solo se pone en los que tienen excepciones, para que no caiga el programa
	
	public void testQueNoSeAceptenMasVagonesDeLaCargaPermitida()  throws Exception{
		Tren miTren = new Tren();
		Locomotora miLocomotora = new Locomotora("Fiat", 2000, 50); //el peso maxima de la locomotora es 50
		Vagon miVagon1 = new Vagon(20);
		Vagon miVagon2 = new Vagon(50);
		
		miTren.setLocomotora(miLocomotora);
		
		miTren.admitirVagon(miVagon1); //agrego un vagon
		miTren.admitirVagon(miVagon2); //agrego un vagon y ya se pasa el peso maximo
	}
	
	
	@Test
	public void testQueRemueveTodosLosVagones() throws Exception
	{
		Tren miTren = new Tren();
		Locomotora miLocomotora = new Locomotora("Fiat", 2000, 100); 
		Vagon miVagon1 = new Vagon(10);
		Vagon miVagon2 = new Vagon(10);
		Vagon miVagon3 = new Vagon(10);
		Vagon miVagon4 = new Vagon(10);
		
		miTren.setLocomotora(miLocomotora);
		
		miTren.admitirVagon(miVagon1);
		miTren.admitirVagon(miVagon2);
		miTren.admitirVagon(miVagon3);
		miTren.admitirVagon(miVagon4);
		
		assertEquals(miTren.contarCantidadDeVagones(), 4, 0);
		
		miTren.removerVagon(miVagon3);   //remuevo un vagon
		
		assertEquals(miTren.contarCantidadDeVagones(), 3, 0);
		
		miTren.removerTodosLosVagones();  //se remueven todos los vagones del tren
	
		assertEquals(miTren.contarCantidadDeVagones(), 0, 0);
	}
	
	@Test
	public void testRemoverUltimoVagon() throws Exception
	{
		Tren miTren = new Tren();
		Locomotora miLocomotora = new Locomotora("Fiat", 2000, 100); 
		Vagon miVagon1 = new Vagon(11);
		Vagon miVagon2 = new Vagon(12);
		Vagon miVagon3 = new Vagon(13);
		
		miTren.setIdDelTren(1000);
		
		miVagon1.setId(1);
		miVagon2.setId(2);
		miVagon3.setId(3);
		
		miTren.setLocomotora(miLocomotora);
		
		miTren.admitirVagon(miVagon1);
		miTren.admitirVagon(miVagon2);
		miTren.admitirVagon(miVagon3);
		
		miTren.imprimirSiElTrenNoTieneVagones(); //me dice si el tren esta vacio o no
		
		miTren.imprimirVagones();  //muestro todos los vagones admitidos
		
		miTren.removerUltimoVagon();  //elimino que se agrego en ultimo lugar
		
		miTren.imprimirVagones();  //vuelvo a mostrar los vagones, esta vez sin el ultimo eliminado
			
		assertEquals(miTren.contarCantidadDeVagones(), 2, 0);
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
