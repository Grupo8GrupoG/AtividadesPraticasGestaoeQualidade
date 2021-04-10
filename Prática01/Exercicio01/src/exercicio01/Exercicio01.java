package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area, diagmaio, diagmen;
        System.out.println("Digite a diagonal maior: ");
        diagmaio = scanner.nextDouble();
        System.out.println("Digite a diagonal menor: ");
        diagmen = scanner.nextDouble();
        area = (diagmaio * diagmen) / 2;
        System.out.println("A área do seu losango é: " + area);

    }

}
