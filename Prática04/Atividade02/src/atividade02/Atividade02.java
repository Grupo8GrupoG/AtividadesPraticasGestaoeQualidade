package atividade02;

import javax.swing.JOptionPane;

public class Atividade02 {

    public static void main(String[] args) {

        int canal = 0, pessoas = 0,
                canal4 = 0,
                canal5 = 0,
                canal7 = 0,
                canal12 = 0;
        String resp;

        

        pessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de telespectadores: ", 0));

        resp = JOptionPane.showInputDialog("Informe o canal:  \nPara sair digite 0.:", 0);

        canal = Integer.parseInt(resp);
        
        while (canal != 0) {
            switch (canal) {
                case 4:
                    resp = JOptionPane.showInputDialog("Informe o número de telespectadores do canal 4: ", 0);
                    canal4 = Integer.parseInt(resp);

                    break;
                case 5:
                    resp = JOptionPane.showInputDialog("Informe o número de telespectadores do canal 5: ", 0);
                    canal5 = Integer.parseInt(resp);

                    break;
                case 7:
                    resp = JOptionPane.showInputDialog("Informe o número de telespectadores do canal 7: ", 0);
                    canal7 = Integer.parseInt(resp);

                    break;
                case 12:
                    resp = JOptionPane.showInputDialog("Informe o número de telespectadores do canal 12: ", 0);
                    canal12 = Integer.parseInt(resp);

                    break;
                default:
                    System.out.println("Canal Inválido");
            }
            resp = JOptionPane.showInputDialog("Informe o canal:  \nPara sair digite 0.:", 0);

            canal = Integer.parseInt(resp);

        }

        if (pessoas > 0) {

            JOptionPane.showMessageDialog(null, String.format("Canal %3d: %9.2f%% \nCanal %3d: %9.2f%% \nCanal %3d: %9.2f%% \nCanal %3d: %9.2f%%",
                    4, ((double) canal4 / pessoas * 100),
                    5, ((double) canal5 / pessoas * 100),
                    7, ((double) canal7 / pessoas * 100),
                    12, ((double) canal12 / pessoas * 100)));

        }

    }

}
