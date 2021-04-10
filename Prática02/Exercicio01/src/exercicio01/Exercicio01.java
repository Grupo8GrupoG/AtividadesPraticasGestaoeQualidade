package exercicio01;

import javax.swing.JOptionPane;

public class Exercicio01 {


    public static void main(String[] args) {
        
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Diigite o lado 1 do triâgulo: ")), lado2 = Double.parseDouble(JOptionPane.showInputDialog("Diigite o lado 2 do triâgulo: ")), lado3 = Double.parseDouble(JOptionPane.showInputDialog("Diigite o lado 3 do triâgulo: "));
        if (lado1 == lado2 && lado2 == lado3 ) {
            JOptionPane.showMessageDialog(null, "Seu triângulo é equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            JOptionPane.showMessageDialog(null, "Seu triângulo é isósceles");
        }else{
            JOptionPane.showMessageDialog(null, "Seu triângulo é escaleno");
        }
    
}

}
