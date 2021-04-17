package atividade02.pkg3;

import java.util.Scanner;

public class Atividade023 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1:Para prosseguir");
            System.out.println("2:Para cancelar");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    double x,
                     f;
                    System.out.println("Digite o valor de x");
                    x = teclado.nextDouble();
                    if (x < -2) {
                        System.out.println("f(" + x + ")= " + (2 * x + 2));
                    } else if (x >= -2 && x < 3) {
                        System.out.println("f(" + x + ")= " + 3);
                    } else {
                        System.out.println("f(" + x + ")= " + (-x));
                    }

                default:
                    System.out.println("Saindo.....");
                    break;
            }

        } while (opcao <= 1);

    }
}
