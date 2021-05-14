package praticarefatoracao;

import javax.swing.JOptionPane;

public class PraticaRefatoracao {

    public static void main(String[] args) {
        
        // Integrantes do grupo:Gabriel Asevedo de Amorim RA:42113579 | Gabriel Augusto Ferreira Maia RA:42014524 | Guilherme de Almeida Oliveira RA:42014935 | Guilherme Asevedo de Amorim RA:42015274 
        // Refatorações aplicadas:Mover Método e Extrair Método 
        // Código refatorado com base no código da Prática 02 Exercício 06 disponível aqui no GitHub.
        int vezes = 0;

        vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vezes a se repetir o programa \nDigite um número negativo para sair", 0));
        
        
        //Fizemos com Programação Orientada a Objeto
        Equacao equacao = new Equacao();
        
        //Adicionamos a opção de repetição ao algoritmo
        while (vezes > 0) {

            equacao.setA(Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A da equação")));
            equacao.setB(Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B da equação")));
            equacao.setC(Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C da equação")));

            equacao.calculaEquacao(equacao.getA(), equacao.getB(), equacao.getC());

            equacao.calculaDiscriminante(equacao.getA(), equacao.getB(), equacao.getC());

            vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vezes a se repetir o programa \nDigite um número negativo para sair", 0));

        }
        JOptionPane.showMessageDialog(null, "Programa encerrada");
    }
}
