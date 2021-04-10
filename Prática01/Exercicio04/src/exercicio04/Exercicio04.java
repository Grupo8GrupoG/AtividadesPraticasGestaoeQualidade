
package exercicio04;

import javax.swing.JOptionPane;


public class Exercicio04 {

    
    public static void main(String[] args) {
        double cate01=Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto 01:"));
        double cate02=Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto 02:"));
        
        double hipotenusa=Math.pow(cate01,2)+Math.pow(cate02,2);
        JOptionPane.showMessageDialog(null, "A hipotenusa é: "+hipotenusa);
        
    }
    
}
