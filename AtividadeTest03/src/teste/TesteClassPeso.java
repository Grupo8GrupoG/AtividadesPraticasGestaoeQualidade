package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import calculos.ClassPeso;

public class TesteClassPeso {
	
	ClassPeso cp=new ClassPeso();

	@Test
	public void testimc() {
		double verifi=cp.calculoimc(1.75, 65);
		assertEquals(21.22, verifi,0.01);
	}
	@Test
	public void testclassimc() {
		String verifica=cp.classimc(21.22);
		assertEquals("PESO NORMAL", verifica);
	}
	@Test
	public void testpesoideal() {
		double verifica=cp.pesoideal(4, 1.20, true);
		assertEquals(17, verifica,0.01);
	}

}
