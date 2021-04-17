package atividade04;

import java.util.Scanner;

public class Atividade04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = teclado.nextInt();
        int fatorial = 1;

        for (int i = 1; i <=a ; i++) {
            fatorial *= i;

            System.out.println("Fatorial de " + i + "=" + fatorial);

        }

    }
}
