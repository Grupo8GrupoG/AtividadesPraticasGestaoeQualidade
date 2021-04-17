package atividade02.pkg1;

import javax.swing.JOptionPane;

public class Atividade021 {

    public static void main(String[] args) {
        // Usado como referência atividade 01 da Prática 02

        int opcao;
        do {
            JOptionPane.showMessageDialog(null, "Digite a opção:\n 1: Ir para o programa\n 2: Sair");
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada"));
            switch (opcao) {
                case 1:
                    double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado 1 do triâgulo: ")),
                     lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado 2 do triâgulo: ")),
                     lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado 3 do triâgulo: "));
                    if (lado1 == lado2 && lado2 == lado3) {
                        JOptionPane.showMessageDialog(null, "Seu triângulo é equilátero");
                    } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                        JOptionPane.showMessageDialog(null, "Seu triângulo é isósceles");
                    } else {
                        JOptionPane.showMessageDialog(null, "Seu triângulo é escaleno");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Saindo.....");
            }
        } while (opcao <= 1);

    }

}
