package mockitoTeste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;
import entidades.ServicoEquacaoSegundoGrau;

public class MockTest {

	ServicoEquacaoSegundoGrau eq = Mockito.mock(ServicoEquacaoSegundoGrau.class);
	


	@Test
	public void test() {
		Mockito.when(eq.delta()).thenReturn(0.0);
		Mockito.when(eq.x()).thenReturn(0.0);
		Mockito.when(eq.x1()).thenReturn(0.0);
		Mockito.when(eq.x2()).thenReturn(0.0);

	}
}
