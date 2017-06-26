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
		Vagon miVagon2 = new Vagon(20);

		miTren.setLocomotora(miLocomotora);
		
		miTren.admitirVagon(miVagon1);
		miTren.admitirVagon(miVagon2);
		
		Integer pesoDelTren = miTren.calcularCargaTotal(); //igualo el metodo a una variable
		assertEquals(30, pesoDelTren, 0);
	
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

}
