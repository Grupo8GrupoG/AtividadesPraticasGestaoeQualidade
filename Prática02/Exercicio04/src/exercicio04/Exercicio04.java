
package exercicio04;

import java.util.Scanner;


public class Exercicio04 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        double x,f;
        System.out.println("Digite o valor de x");
        x=teclado.nextDouble();
        if(x<-2)
            System.out.println("f("+x+")= "+(2*x+2));
        else if(x>=-2&&x<3) 
            System.out.println("f("+x+")= "+3);
        else
            System.out.println("f("+x+")= "+(-x));
    }
    
}
