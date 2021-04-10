package exercicio05;

import javax.swing.JOptionPane;

public class Exercicio05 {

    public static void main(String[] args) {
        double compri,area,volume,raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da esfera: "));
        
        compri=2*Math.PI*raio;
        area=Math.PI*Math.pow(raio, 2);
        volume=0.75*Math.PI*Math.pow(raio, 3);
        JOptionPane.showMessageDialog(null, "\nO comprimento da esfera é: "+compri+"\nA área da esfera é: "+area+"\nO volume da esfera é: "+volume);
        
    }

}
