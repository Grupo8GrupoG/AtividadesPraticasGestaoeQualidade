package exercicio02;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {

        double celsius= Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius(ºC): "));
        double fahrenheit= (celsius*1.8)+32;
        
        
        JOptionPane.showMessageDialog(null, "A temperatura em graus Fahrenheit (°F) é: "+fahrenheit+"ºF");
        

    }

}
