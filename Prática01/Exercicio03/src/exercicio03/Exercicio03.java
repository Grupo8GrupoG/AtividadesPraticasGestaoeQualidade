package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sal_min = 1039.00, sal_func, quant;

        System.out.println("Digite o seu salário: ");
        sal_func = teclado.nextDouble();
        quant = sal_func / sal_min;
        if (quant == 1) {
            System.out.println("Você ganha " + quant + " vez um salário mínimo");
        } else {
            System.out.println("Você ganha " + quant + " vezes um salário mínimo");
        }
    }

}
