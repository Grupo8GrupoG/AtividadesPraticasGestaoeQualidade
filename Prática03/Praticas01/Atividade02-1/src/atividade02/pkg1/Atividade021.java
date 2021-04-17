/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02.pkg1;

import java.util.Scanner;

public class Atividade021 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("Digite a opção desejada:");
            System.out.println("1:Para prosseguir");
            System.out.println("2:Para cancelar");
            
            opcao=teclado.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Digite a temperatura em Celsius °C");
                    double celsius=teclado.nextDouble();
                    double fahrenheit= (celsius*1.8)+32;
                    System.out.println("Sua temperatura em fahrenheit é: "+fahrenheit+"°F");
                    break;
                default:
                    System.out.println("Saindo.....");
                    break;
            }
        }while(opcao<=1);
    }
}
