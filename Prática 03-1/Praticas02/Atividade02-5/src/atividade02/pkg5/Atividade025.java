/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02.pkg5;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Atividade025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, opcao;
        double delta;

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1:Para prosseguir");
            System.out.println("2:Para cancelar");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o A da equação");
                    a = teclado.nextInt();
                    System.out.println("Digite o B da equação");
                    b = teclado.nextInt();
                    System.out.println("Digite o C da equação");
                    c = teclado.nextInt();

                    delta = Math.pow(b, 2) - 4 * a * c;
                    System.out.println("O delta é: " + delta);
                    if (a == 0 && b == 0 && c != 0) {
                        System.out.println("Coeficientes informados incorretamente");
                    } else if (c == 0) {
                        System.out.println("Igualdade confirmada: 0 = 0");
                    } else if (a == 0 && b != 0) {
                        double x1 = b / c;
                        System.out.println("As raízes são: " + x1);
                        System.out.println("Esta é uma equação de primeiro grau");
                    } else if (delta < 0) {
                        System.out.println("Esta equação não possui raízes reais");
                    } else if (delta == 0) {
                        System.out.println("Esta equação possui duas raízes reais iguais");
                        double x1 = -b + Math.sqrt(delta) / 2 * a;
                        System.out.println("As raízes são: " + x1);
                    } else if (delta > 0) {
                        System.out.println("Esta equação possui duas raízes reais diferentes");
                        double x1 = -b + Math.sqrt(delta) / 2 * a;
                        double x2 = -b - Math.sqrt(delta) / 2 * a;
                        System.out.println("As raízes são: " + x1 + " e " + x2);
                    }
                    break;
                    default:System.out.println("Saindo.....");
            } 
        } while (opcao <= 1);
    }
    
}
