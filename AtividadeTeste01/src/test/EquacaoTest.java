package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import equacao.Equacao;
import equacao.EquacaoSegundoGrau;

class EquacaoTest {

	private Equacao equacao;


	    @Test
	    void calculoTest() {
		
		String response = equacao.calculo();
		assertEquals(response, "Igualdade confirmada 0 = 0 ");

		equacao = new Equacao(0, 0, 8);
		response = equacao.calculo();
		assertEquals(response, "Coeficientes informados incorretamentes");

		equacao = new Equacao(0, 2, -8);
		response = equacao.calculo();
		assertEquals(response, "Esta é uma equaçao do primerio grau: x = 4,00");

		equacao = new Equacao(10, -4, 12);
		response = equacao.calculo();
		assertEquals(response, "Esta e uma equaçao do segundo grau."
				+ " A equaçao nao possui raizes reais (delta < 0): (delta = -464,00)");

		equacao = new Equacao(4, -4, 1);
		response = equacao.calculo();
		assertEquals(response,
				"Esta e uma equaçao do segundo grau." + " A equacao possui duas raizes reais iguais: x = 0,50");

		equacao = new Equacao(1, 6, 7);
		response = equacao.calculo();
		assertEquals(response, "Esta e uma equaçao do segundo grau."
				+ " Esta equaçao possui duas raizes reais diferentes: delta = 8,00, x1 = -1,59, x2 = -4,41");

	}

}
