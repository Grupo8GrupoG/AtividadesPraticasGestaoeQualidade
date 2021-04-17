package atividade02.pkg3;

import java.util.Scanner;

public class Atividade023 {

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
                    System.out.println("Digite o cateto 01:");
                    double cate01 = sc.nextDouble();
                    System.out.println("Digite o cateto 02:");
                    double cate02 = sc.nextDouble();
                    double hipotenusa = Math.pow(cate01, 2) + Math.pow(cate02, 2);
                    System.out.println("A hipotenusa é: " + hipotenusa);
                    break;
                default:
                    System.out.println("Saindo.....");
                    break;

            }
        } while (opcao <= 1);

    }
}
