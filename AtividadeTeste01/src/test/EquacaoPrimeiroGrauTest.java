package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import equacao.EquacaoPrimeiroGrau;

class EquacaoPrimeiroGrauTest {

	EquacaoPrimeiroGrau equacao;

	@Test
	void testGetX() {
		equacao = new EquacaoPrimeiroGrau( 2, -8);
		double response = equacao.getX();
        assertEquals (response, 4);
	}
}
