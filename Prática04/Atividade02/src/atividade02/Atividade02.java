package atividade02;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número de canais");
        int n_canais = teclado.nextInt();
        int canais[]=new int[n_canais];
        int telespec[]=new int[n_canais];
        int i=0;
        double perc;
        while(i<n_canais){
            System.out.println("Digite canal com 0 para sair");
            
            System.out.println("Digite o canal: ");
            canais[i]=teclado.nextInt();
            if(canais[i]==0){
                System.out.println("Saindo...");
                break;
            }
            System.out.println("Digite o número de telespectadores: ");
            telespec[i]=teclado.nextInt();
            perc=canais[i]*100/telespec[i];
            
            System.out.println("A porcentagem de audiência desse canal foi: "+perc);
            i++;
        }
        
        
    }

}
