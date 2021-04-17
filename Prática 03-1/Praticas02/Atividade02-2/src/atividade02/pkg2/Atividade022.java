package atividade02.pkg2;

import java.util.Scanner;

public class Atividade022 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1:Para prosseguir");
            System.out.println("2:Para cancelar");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    double peso,
                     altura,
                     imc;
                    System.out.println("Digite o seu peso: ");
                    peso = sc.nextDouble();
                    System.out.println("Digite sua altura: ");
                    altura = sc.nextDouble();

                    imc = peso / (altura * altura);
                    if (imc < 20) {
                        System.out.println("Você está abaixo do peso");
                    } else if (imc >= 20 & imc < 25) {
                        System.out.println("Seu peso está normal");
                    } else if (imc >= 25 & imc < 30) {
                        System.out.println("Você está sobrpeso");
                    } else if (imc >= 30 & imc < 40) {
                        System.out.println("Você está obeso");
                    } else {
                        System.out.println("Você está obeso mórbido");

                    }
                    break;
                default:
                    System.out.println("Saindo.....");
                    break;

            }
        }while(opcao<=1);
        
    }
}
