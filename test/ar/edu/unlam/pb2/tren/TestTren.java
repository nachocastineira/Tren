package ar.edu.unlam.pb2.tren;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTren {

	@Test
	public void test() {
		Tren miTren = new Tren();
		Locomotora miLocomotora = new Locomotora("A", 2006);
		Vagon miVagon1 = new Vagon(40);
		Vagon miVagon2 = new Vagon(60);
		Vagon miVagon3 = new Vagon(50);
		

		miTren.setLocomotora(miLocomotora);
		miTren.admitirVagon(miVagon1);
		miTren.admitirVagon(miVagon2);
		miTren.admitirVagon(miVagon3);
		
		assertEquals(miTren.contarCantidadDeVagones(), 3, 0);
		assertEquals(miVagon1.getCantidadDeAsientos(), 40, 0);

	}

}
