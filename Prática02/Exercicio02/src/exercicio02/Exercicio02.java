package exercicio02;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {

        double media, nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")), nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: ")), nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3: "));

        if (nota1 < 0 & nota2 < 0 & nota3 < 0) {
            JOptionPane.showMessageDialog(null, "Nota Inválida");
        } else if (nota1 > 10 & nota2 > 10 & nota3 > 10) {
            JOptionPane.showMessageDialog(null, "Nota Inválida");
        }
        media = (nota1 + nota2 + nota3) / 3;
        if (media >= 0 && media < 3) {
            JOptionPane.showMessageDialog(null, "Reprovado");
        } else if (media >= 3 && media < 7) {
            JOptionPane.showMessageDialog(null, "Exame");
        } else if (media <= 10) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        }

    }

}
