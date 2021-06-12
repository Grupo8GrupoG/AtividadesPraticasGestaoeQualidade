package calculos;

import java.util.Scanner;

public class Energica {

	Scanner sc = new Scanner(System.in);

	public double taxametab(int idade, double peso, boolean masc) {

		double tmb = 0;

		if (masc == false) {
			if (idade >= 10 && idade <= 18) {
				tmb = 12.2 * peso + 746;
			} else if (idade > 18 && idade <= 30) {
				tmb = 14.7 * peso + 496;
			} else if (idade > 30 && idade <= 60) {
				tmb = 8.7 * peso + 829;
			} else if (idade > 60) {
				tmb = 10.5 * peso + 596;
			}
		} else {
			if (idade >= 10 && idade <= 18) {
				tmb = 17.5 * peso + 651;
			} else if (idade > 18 && idade <= 30) {
				tmb = 15.3 * peso + 679;
			} else if (idade > 30 && idade <= 60) {
				tmb = 8.7 * peso + 879;
			} else if (idade > 60) {
				tmb = 13.5 * peso + 487;
			}
		}

		System.out.println(tmb);
		return tmb;
	}

	public double fa(double tmb) {

		String resp = "";
		int escolha = 0;
		double fa = 0, multiplica = 0;
		System.out.println(
				"Você fica a maior parte do tempo sentada(o) e não pratica atividades físicas programadas.Digite 1 para sim,2 para não");
		escolha = sc.nextInt();
		if (escolha == 1) {
			multiplica = 1.2;
		} else if(escolha==2) {
			System.out.println("OK");
		} else
			System.out.println("Número Inválido");
		System.out.println("Digite 1 para masculino e 2 para feminino");
		resp = sc.next();
		if (resp == "1") {
			System.out.println(
					"Dia-a-dia movimentado – dirige, cozinha, caminha até o ponto de ônibus, mas sem atividades físicas programadas OU dia-a-dia sedentário e exercícios físicos três vezes por semana, cerca de 30 minutos por dia.Digite 1 para sim,2 para não");
			escolha = sc.nextInt();
			if (escolha == 1) {
				multiplica = 1.4;
			} else if(escolha==2) {
				System.out.println("OK");
			} else
				System.out.println("Número Inválido");
			System.out.println(
					"Você Dia-a-dia movimentado e atividades físicas três vezes por semana, cerca de 30 minutos por dia.Digite 1 para sim, 2 para não");
			escolha = sc.nextInt();
			if (escolha == 1) {
				multiplica = 1.5;
			}  else if(escolha==2) {
				System.out.println("OK");
			}else
				System.out.println("Número Inválido");
			System.out.println(
					"De uma a duas horas e meia de atividades físicas diárias.Digite 1 para sim,2 para não");
			escolha = sc.nextInt();
			if (escolha == 1) {
				multiplica = 1.6;
			} else if(escolha==2) {
				System.out.println("OK");
			} else
				System.out.println("Número Inválido");
			System.out.println("Você pratica Atividade física diária por mais de três horas.Digite 1 para sim,2 para não");
			escolha = sc.nextInt();
			if (escolha == 1) {
				multiplica = 1.8;
			} else if(escolha==2) {
				System.out.println("OK");
			} else
				System.out.println("Número Inválido");
		} else {
			System.out.println(
					"Dia-a-dia movimentado – dirige, cozinha, caminha até o ponto de ônibus, mas sem atividades físicas programadas OU dia-a-dia sedentário e exercícios físicos três vezes por semana, cerca de 30 minutos por dia.Digite 1 para sim,2 para não");
			escolha = sc.nextInt();
			if (escolha == 1) {
				multiplica = 1.3;
			} else if(escolha==2) {
				System.out.println("OK");
			} else
				System.out.println("Número Inválido");
			System.out.println(
					"Você Dia-a-dia movimentado e atividades físicas três vezes por semana, cerca de 30 minutos por dia.Digite 1 para sim,2 para não");
			escolha = sc.nextInt();
			if (escolha == 1) {
				multiplica = 1.45;
			} else if(escolha==2) {
				System.out.println("OK");
			} else
				System.out.println("Número Inválido");
			System.out.println(
					"De uma a duas horas e meia de atividades físicas diárias.Digite 1 para sim,2 para não");
			escolha = sc.nextInt();
			if (escolha == 1) {
				multiplica = 1.5;
			}  else if(escolha==2) {
				System.out.println("OK");
			}else
				System.out.println("Número Inválido");
			System.out.println("Você pratica Atividade física diária por mais de três horas.Digite 1 para sim,2 para não");
			escolha = sc.nextInt();
			if (escolha == 1) {
				multiplica = 1.7;
			} else if(escolha==2) {
				System.out.println("OK");
			}
			else
				System.out.println("Número Inválido");
		}
		
		fa=multiplica*tmb;
		System.out.println(fa);

		return fa;

	}

}
