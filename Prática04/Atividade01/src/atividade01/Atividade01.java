package atividade01;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n_alunos;
        System.out.println("Digite o número de alunos: ");
        n_alunos = teclado.nextInt();
        double notas[] = new double[n_alunos];
        int faltas[] = new int[n_alunos];
        int i = 0;
        int reprovados = 0, aprovados = 0;
        double soma = 0, media, maior=0, menor=0;
        while (i < n_alunos) {
            System.out.println("Digite a nota do aluno: ");
            notas[i] = teclado.nextInt();
            System.out.println("Digite o número de faltas do aluno: ");
            faltas[i] = teclado.nextInt();
            soma = soma + notas[i];
            if (notas[i] < 70) {
                reprovados++;
            } else if (faltas[i] >= 20) {
                reprovados++;
            } else {
                aprovados++;
            }
            maior=notas[0];
            menor=notas[0];
            if(maior<notas[i]){
                maior=notas[i];
            }
            if(menor>notas[i]){
                menor=notas[i];
            }
            i++;
        }
        media=soma/notas.length;
        System.out.println("A quantidade de alunos aprovados: "+aprovados);
        System.out.println("A quantidade de alunos reprovados: "+reprovados);
        System.out.println("A maior nota foi: "+maior+" e a menor nota foi: "+menor);
        System.out.println("A média de notas da turma foi: "+media);
    }

}
