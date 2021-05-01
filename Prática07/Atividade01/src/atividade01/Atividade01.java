package atividade01;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite o valor da posição %d, %d: ", i + 1, j + 1);
                mat[i][j] = sc.nextInt();
            }
           
        }
        System.out.println("\nOs números da matriz são: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d", mat[i][j]);
                System.out.printf(" ");

            }
             System.out.println("\n");
        }
        System.out.println("\nA os números da matriz nas colunas ímpares e linhas pares são: ");
        for (int i = 0; i < 5; i = i + 2) {
            for (int j = 1; j < 5; j = j + 2) {

                System.out.printf(" %d", mat[i][j]);
                System.out.printf(" ");
            }
             System.out.println("\n");
        }

        System.out.println("\nA matriz transposta é: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.printf(" %d", mat[j][i]);
                System.out.printf(" ");

            }
             System.out.println("\n");
        }

        System.out.println("\nTrocando as diagonais..... ");

        for (int i = 0; i < 5; i++) {
            int pos = (mat[i].length - 1) - i;
            int temp = mat[i][pos];
            mat[i][pos] = mat[i][i];
            mat[i][i] = temp;

        }
        System.out.println("\nOs números da matriz com diagonais trocadas são: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d", mat[i][j]);
                System.out.printf(" ");

            }
             System.out.println("\n");
        }
    }
}
