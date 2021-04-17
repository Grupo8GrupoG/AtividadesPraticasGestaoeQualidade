package atividade02.pkg4;

import java.util.Scanner;

public class Atividade024 {

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
                    System.out.println("Digite o raio da circunferência: ");
                    double compri,
                     area,
                     volume,
                     raio = sc.nextDouble();
                    compri = 2 * Math.PI / raio;
                    area = Math.PI * Math.pow(raio, 2);
                    volume = 0.75 * Math.PI * Math.pow(raio, 3);
                    
                    System.out.println("\nO comprimento da esfera é: "+compri+"\nA área da esfera é: "+area+"\nO volume da esfera é: "+volume);
                default:
                    System.out.println("Saindo.....");
                    break;
            }
        }while(opcao<=1);
    
    }

}
