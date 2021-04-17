
package atividade.pkg03;
import java.util.Scanner;

public class Atividade03 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite o número de habitantes: ");
        int nhabit=teclado.nextInt();
        
        int salhabit[]=new int[nhabit];
        double salario[]=new double[nhabit];
        int nfilhos[]=new int[nhabit];
        int i=0;
        double somasal=0,somafil=0,mediafilhos,mediasal;
        while(i<nhabit){
            System.out.println("Digite um salário negativo para sair");
            System.out.println("Digite o seu salário: ");
            salario[i]=teclado.nextInt();
            if(salario[i]<0){
                System.out.println("Saindo...");
                break;
            }
            somasal=somasal+salario[i];
            System.out.println("Digite quantos filhos você têm: ");
            nfilhos[i]=teclado.nextInt();
            somafil=somafil+nfilhos[i];
            i++;
        }
        mediafilhos=somafil/nfilhos.length;
        mediasal=somasal/salario.length;
        System.out.println("A média de filhos é: "+mediafilhos);
        System.out.println("A média salarial é: "+mediasal);
        
        
    }
    
}
