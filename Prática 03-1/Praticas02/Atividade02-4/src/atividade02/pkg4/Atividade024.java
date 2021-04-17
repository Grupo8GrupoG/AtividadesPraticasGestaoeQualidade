package atividade02.pkg4;

import java.util.Scanner;

public class Atividade024 {

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
                    double x,
                     y,
                     z;
                    System.out.println("Digite o lado 1");
                    x = sc.nextDouble();
                    System.out.println("Digite o lado 2");
                    y = sc.nextDouble();
                    System.out.println("Digite o lado 3");
                    z = sc.nextDouble();

                    if (x + y > z && x + z > y && y + z > x) {
                        System.out.println("Não é um triângulo");
                    } else {
                        System.out.println("É um triângulo");
                    }

                default:
                    System.out.println("Saindo.....");
                    break;
            }
        } while (opcao <= 1);
    }
}
