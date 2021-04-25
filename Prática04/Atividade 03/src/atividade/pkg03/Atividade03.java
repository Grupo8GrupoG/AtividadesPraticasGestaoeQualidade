package atividade.pkg03;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Atividade03 {

    public static void main(String[] args) {
        int nfilhos = 0, cont = 0;
        double sal, somasal = 0;

        String resposta;

        resposta = JOptionPane.showInputDialog("Informe o salário: \nPara sair insira um salário negativo.", 0);
        sal = Double.parseDouble(resposta);

        while (sal >= 0) {
            somasal += sal;
            resposta = JOptionPane.showInputDialog("Informe o número de filhos: ", 0);
            nfilhos = Integer.parseInt(resposta);
            cont++;

            resposta = JOptionPane.showInputDialog("Informe o salário: \nPara sair insira um salário negativo.", 0);
            sal = Double.parseDouble(resposta);

        }
        if (cont > 0) {
            JOptionPane.showMessageDialog(null, "Média salarial: "+somasal/cont+" \nMédia de filhos: "+nfilhos/cont);
            
        }

    }

}
