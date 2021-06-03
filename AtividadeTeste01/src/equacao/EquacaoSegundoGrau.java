package equacao;

public class EquacaoSegundoGrau {
	double a, b, c;
	
	public EquacaoSegundoGrau(){
		
	}

	public EquacaoSegundoGrau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDelta() {
		return Math.pow(this.b, 2) - 4 * this.a * this.c;
	}

	public double getX() {
		return -this.b / (2 * this.a);
	}

	public double getX1() {
		return (-this.b + Math.sqrt(this.getDelta())) / (2 * this.a);
	}

	public double getX2() {
		return (-this.b - Math.sqrt(this.getDelta())) / (2 * this.a);
	}
}