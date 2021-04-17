package atividade02;

import java.util.Scanner;

public class Atividade02 {

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
                    System.out.println("Digite a nota 1");

                    double media,
                     nota1 = sc.nextDouble();
                    System.out.println("Digite a nota 2");
                    double nota2 = sc.nextDouble();
                    System.out.println("Digite a nota 3");
                    double nota3 = sc.nextDouble();
                    if (nota1 < 0 & nota2 < 0 & nota3 < 0) {
                        System.out.println("Nota Inválida");
                    } else if (nota1 > 10 & nota2 > 10 & nota3 > 10) {
                        System.out.println("Nota Inválida");
                    }
                    media = (nota1 + nota2 + nota3) / 3;
                    if (media >= 0 && media < 3) {
                        System.out.println("Reprovado");
                    } else if (media >= 3 && media < 7) {
                        System.out.println("Exame");
                    } else if (media <= 10) {
                        System.out.println("Aprovado");;
                    }
                default:
                    System.out.println("Saindo.....");
                    break;
            }

        } while (opcao <= 1);

    }

}
