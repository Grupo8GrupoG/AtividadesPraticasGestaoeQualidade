package atividade02;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        //Usado como referência atividade 1 da Prática 01
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Digite a opção: ");
            System.out.println("1: Ir para o programa");
            System.out.println("2: Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    double area,
                     diagmaio,
                     diagmen;
                    System.out.println("Digite a diagonal maior: ");
                    diagmaio = scanner.nextDouble();
                    System.out.println("Digite a diagonal menor: ");
                    diagmen = scanner.nextDouble();
                    area = (diagmaio * diagmen) / 2;
                    System.out.println("A área do seu losango é: " + area);
                break;
                default:
                    System.out.println("Saindo....");
            }
        } while (opcao <= 1);

    }
}
