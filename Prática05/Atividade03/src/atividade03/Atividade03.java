
package atividade03;

import java.util.Scanner;


public class Atividade03 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int a,b;
        System.out.println("Digite um número");
        a=teclado.nextInt();
        System.out.println("Digite um número maior do que o já digitado");
        b=teclado.nextInt();
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
        
    }
    
}
