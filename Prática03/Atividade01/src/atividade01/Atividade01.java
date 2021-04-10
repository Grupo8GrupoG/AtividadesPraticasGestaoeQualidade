package atividade01;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite a opção: ");
            System.out.println("1: Nota");
            System.out.println("2: Salário");
            System.out.println("3: Masculino ou Feminino");
            System.out.println("4: Idade");
            System.out.println("5: Sair");

            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite a nota: ");
                    double nota = teclado.nextDouble();
                    if (nota >= 0 && nota <= 10) {
                        System.out.println("Nota validada");
                    } else {
                        System.out.println("Nota inválida");
                    }
                    break;
                case 2:
                    System.out.println("Digite o seu salário");
                    double salario = teclado.nextDouble();
                    if (salario > 0) {
                        System.out.println("Salário válido");
                    } else {
                        System.out.println("Salário Inválido");
                    }
                    break;
                case 3:
                    System.out.println("Digite (1) para Masculino (2) para Feminino");
                    int sexo = teclado.nextInt();
                    if (sexo == 1) {
                        System.out.println("Sexo masculino validado");
                    } else if (sexo == 2) {
                        System.out.println("Sexo feminino validado");
                    } else {
                        System.out.println("Sexo inválido");
                    }
                    break;
                case 4:
                    System.out.println("Digite sua idade:");
                    int idade = teclado.nextInt();
                    if (idade > 0 && idade <= 150) {
                        System.out.println("Idade válida");
                    } else {
                        System.out.println("Idade inválida");
                    }
                    break;
                default:
                    System.out.println("Saindo.....");
                    break;
            }

        } while (opcao <= 4);

    }

}
