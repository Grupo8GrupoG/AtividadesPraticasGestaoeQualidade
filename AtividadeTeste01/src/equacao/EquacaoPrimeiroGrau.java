package equacao;

public class EquacaoPrimeiroGrau {
	double  b, c;

	public EquacaoPrimeiroGrau( double b, double c) {
        
		this.b = b;
		this.c = c;
	}

	public double getX() {
		return -this.c / this.b;
	}

}