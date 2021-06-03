package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import equacao.EquacaoSegundoGrau;

class EquacaoSegundoGrauTest {
	EquacaoSegundoGrau equacao;
	double response;

	@Test
	void testGetDelta() {
		equacao = new EquacaoSegundoGrau(1, 6, 7);
		response = equacao.getDelta();
		assertEquals(response, 8);
	}

	@Test
	void testGetX1() {
		equacao = new EquacaoSegundoGrau(1, 6, 7);
		response = equacao.getX1();
		assertEquals(response, -1.59, 0.01);
	}

	@Test
	void testGetX2() {
		equacao = new EquacaoSegundoGrau(1, 6, 7);
		response = equacao.getX2();
		assertEquals(response, -4.41, 0.01);
	}

	@Test
	void testGetX() {
		equacao = new EquacaoSegundoGrau(4, -4, 1);
		response = equacao.getX();
		assertEquals(response, 0.5);

	}
}
