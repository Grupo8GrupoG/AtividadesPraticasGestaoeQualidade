package calculos;

public class ClassPeso {
	double peso, altura, imc;

	public double calculoimc(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;

		imc = peso / Math.pow(altura, 2);
		System.out.println(imc);
		return imc;
	}

	public String classimc(double imc) {
		String resultado = "";
		this.imc = imc;
		if (imc < 20) {
			resultado = "ABAIXO DO PESO";
		} else if (imc >= 20 && imc <= 25)
			resultado = "PESO NORMAL";
		else if (imc > 25 && imc <= 30) {
			resultado = "SOBRE PESO";
		} else if (imc > 30 && imc <= 40) {
			resultado = "OBESO";
		} else if (imc > 40) {
			resultado = "OBESO MÓRBIDO";
		}
		System.out.println(resultado);
		return resultado;
	}

	public double pesoideal(int idade, double altura,boolean masc) {
		double ideal = 0;
		if (idade >= 3 && idade <= 10) {
			ideal = idade * 2 + 9;
			System.out.println(ideal);

		} else if (idade >= 18 && idade <= 64) {
			if (masc) {
				ideal = Math.pow(altura, 2) * 22;
			} else
				ideal = Math.pow(altura, 2) * 21;

			System.out.println(ideal);
		} else if (idade >= 65) {
			
			ideal = Math.pow(altura, 2) * 50;
			System.out.println(ideal);

		}
		return ideal;

	}
	
	
	

}
