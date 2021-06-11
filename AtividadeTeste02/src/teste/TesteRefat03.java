package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import atvRefat03.Media;
import atvRefat03.Soma;


class TesteRefat03 {

	Media med=new Media();
	Soma soms=new Soma();
	
	double vet1[]={90,88,78,76};
    double vet2[]={865,564,43,12};
	
	double soma=soms.somar(0, vet1);

	@Test
	void testSoma() {
		assertEquals(332, soma);
	}
	
	@Test
	void testCalcMedia() {
		double media = med.calcularMedia(soma);
		assertEquals(83, media);
	}

}
