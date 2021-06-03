package equacao;

public class Equacao {

	double a, b, c;
	
	public Equacao() {
		
	}

	public Equacao(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String calculo() {
		String resp = "";
		if (this.a == 0)
			if (this.b == 0)
				if (this.c == 0)
					resp = ("Igualdade confirmada 0 = 0 ");
				else
					resp = ("Coeficientes informados incorretamentes");
			else
				resp = this.equacaoPrimeiroGrau();
		else
			resp = this.equacaoSegundoGrau();

		return resp;

	}

	private String equacaoPrimeiroGrau() {
		EquacaoPrimeiroGrau equacao = new EquacaoPrimeiroGrau(this.b, this.c);
		return String.format("Esta é uma equaçao do primerio grau: x = %.2f", equacao.getX());
	}

	private String equacaoSegundoGrau() {
        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(this.a, this.b, this.c);
		String resp = String.format("Esta e uma equaçao do segundo grau. ");

		if (equacao.getDelta() < 0)
			resp += String.format("A equaçao nao possui raizes reais (delta < 0): (delta = %.2f)", equacao.getDelta());
		else if (equacao.getDelta() == 00)
			resp += String.format("A equacao possui duas raizes reais iguais: x = %.2f", equacao.getX());
		else
			resp += String.format(
					"Esta equaçao possui duas raizes reais diferentes: delta = %.2f, x1 = %.2f, x2 = %.2f",
					equacao.getDelta(), equacao.getX1(), equacao.getX2());

		return resp;

	}


}
