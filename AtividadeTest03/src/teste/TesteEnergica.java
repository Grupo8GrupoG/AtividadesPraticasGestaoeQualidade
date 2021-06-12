package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import calculos.Energica;

public class TesteEnergica {
	
	Energica en = new Energica();
	double verifica=0;
	
	@Test
	public void testtaxamet() {
		 verifica=en.taxametab(31, 69, false);
		assertEquals(1429.3, verifica,0.1);
	}
	@Test
	public void testfa() {
		 verifica=en.fa(en.taxametab(31, 69, false));
		 assertEquals(1715.16, verifica,0.1);
	}

}
