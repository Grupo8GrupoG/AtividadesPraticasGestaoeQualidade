
package exercicio05;

import javax.swing.JOptionPane;


public class Exercicio05 {

    
    public static void main(String[] args) {
        double x=Double.parseDouble(JOptionPane.showInputDialog("Digite o lado 1 do triângulo: "));
        double y=Double.parseDouble(JOptionPane.showInputDialog("Digite o lado 2 do triângulo: "));
        double z=Double.parseDouble(JOptionPane.showInputDialog("Digite o lado 3 do triângulo: "));
        
        
        
        
        if(x+y>z&&x+z>y&&y+z>x)
            JOptionPane.showMessageDialog(null, "Não é um triângulo");
        else
            JOptionPane.showMessageDialog(null, "É um triângulo");
        
        
    }
    
}
