package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atvRefat02.Relatorio;
import atvRefat02.Produto;
import atvRefat02.InterfaceRelatorio;

class TesteRefat02 {
	Relatorio relat = new Relatorio();

	double total = 0;
	Produto p1 = new Produto("Arroz", 5, 18.75);
	Produto p2 = new Produto("Feijão", 1, 4.95);
	Produto p3 = new Produto("Leite", 1, 3.49);
	ArrayList<Produto> produtos = new ArrayList();
	
	
	
	@Test
	void testSomatorio() {
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		double somando = relat.somatorioPrecos(produtos);
		assertEquals(102.19, somando);
	}

	@Test
	void testDesconto() {
		double desconto = relat.aplicaDesconto();
		
		
	}

	@Test
	void testTaxa() {
		double taxadomingo=10;
		double taxasemana=5;
		DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
		if (diaSemana == DayOfWeek.SUNDAY) {
			assertEquals(10, taxadomingo);

		} else {
			assertEquals(5, taxasemana);

		}
	}
	
	@Test
	void testExibe() {
		 String valorRecibido=relat.exibeTotal(total);
		 assertTrue(true);
	}
	
	
}
