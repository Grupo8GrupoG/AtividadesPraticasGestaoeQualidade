package atividade01;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] contador = new int[10];
        int[] negativo = new int[10];
        int tn = 0;
        contador[0] = 1;

        for (int i = 0; i <= 9; i++) {

            System.out.println("DIGITE UM NUMERO ");
            contador[i] = input.nextInt();
            if (contador[i] < 0) {
                tn++;
            }

        }
        System.out.println(" A QUANTIDADE DE NUM NEGATIVO FOI " + tn);

    }
}

