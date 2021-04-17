package atividade02.pkg6;

import java.util.Scanner;

public class Atividade026 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n(1) Sapato."
                    + "\n(2) Bolsa."
                    + "\n(3) Camisa."
                    + "\n(4) Calça."
                    + "\n(5) Blusa."
                    + "\n(6) Sair");
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("O sapato custa R$ 99,99 ");
            } else if (opcao == 2) {
                System.out.println("A bolsa custa R$ 103,89");
            } else if (opcao == 3) {
                System.out.println("A camisa custa R$ 49,98");
            } else if (opcao == 4) {
                System.out.println("A calça custa R$ 89,72");
            } else if (opcao == 5) {
                System.out.println("A blusa custa R$ 97,35");
            }

        } while (opcao != 6);

        System.out.println("Fim!");
        input.close();
    }
}
