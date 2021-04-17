package atividade02.pkg2;

import java.util.Scanner;

public class Atividade022 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sal_min = 1039.00, sal_func, quant;
        int opcao;

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1:Para prosseguir");
            System.out.println("2:Para cancelar");

            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o seu salário: ");
                    sal_func = teclado.nextDouble();
                    quant = sal_func / sal_min;
                    if (quant == 1) {
                        System.out.println("Você ganha " + quant + " vez um salário mínimo");
                    } else {
                        System.out.println("Você ganha " + quant + " vezes um salário mínimo");
                    }
                    break;
                default:
                    System.out.println("Saindo.....");
                    break;
            }

        } while (opcao <= 1);

    }
}
