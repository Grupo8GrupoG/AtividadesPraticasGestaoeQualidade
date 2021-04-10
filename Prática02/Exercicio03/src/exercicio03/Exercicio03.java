
package exercicio03;

import javax.swing.JOptionPane;


public class Exercicio03 {

    
    public static void main(String[] args) {
        double peso,altura,imc;
        
        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu peso(kg): "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu altura(m): "));
        
        imc = peso/(altura*altura);
        
        if (imc <20){
            JOptionPane.showMessageDialog(null, "Você está abaixo do peso");
        }else if(imc>=20 & imc <25 ){
            JOptionPane.showMessageDialog(null, "Seu peso está normal");
        }else if (imc >=25 & imc <30 ){
            JOptionPane.showMessageDialog(null, "Você está sobrpeso");
        }else if (imc >=30 & imc<40){
            JOptionPane.showMessageDialog(null, "Você está obeso");
        }else{
            JOptionPane.showMessageDialog(null, "Você está obeso mórbido");

        }
        System.out.println(imc);
    }
    
}
