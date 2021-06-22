package entidades;

public class ServicoEquacaoSegundoGrau  {
	EquacaoSegundoGrauInterface equacao;

	public double delta() {
		return equacao.getDelta();
	}

	public double x() {
		return equacao.getX();
	}

	public double x1() {
		return equacao.getX1();
	}

	public double x2() {
		return equacao.getX2();
	}
}