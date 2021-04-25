
package atividade01;

import java.util.Scanner;


public class Atividade01 {

   
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        int[] nums=new int[10];
        int soma=0;
        
        for(int i=0;i<10;i++){
            System.out.println("Digite um número: ");
            nums[i]=sc.nextInt();
            if(nums[i]%2==0){
                soma=soma+nums[i];
            }
        }
        System.out.println("A soma dos números pares é: "+soma);
        
    }
    
}
