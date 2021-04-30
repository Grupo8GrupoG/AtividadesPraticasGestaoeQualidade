package atividade02;

import javax.swing.JOptionPane;

public class Atividade02 {

    public static void main(String[] args) {

        double[] nums = new double[10];

        for (int i = 0; i < 10; i++) {

            nums[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: "));

        }
        JOptionPane.showMessageDialog(null, "Os números digitados foram: " + "\n" + nums[0] + "\n" + nums[1] + "\n" + nums[2] + "\n" + nums[3] + "\n" + nums[4] + "\n" + nums[5] + "\n" + nums[6] + "\n" + nums[7] + "\n" + nums[8] + "\n" + nums[9]);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                JOptionPane.showMessageDialog(null,"Valor na posição "+i+" é negativo: "+nums[i]);
            }
        }

    }
}
