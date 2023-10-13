package ScanPrint;

import javax.swing.JOptionPane;

public class DesafioSP1 {

    public static void main(String[] args) {

        int number;
        String answer;

        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Informe seu número: "));

            if (number % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Número Informado é Par", "NumberCheck",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Número Informado é Impar", "NumberCheck",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            answer = JOptionPane.showInputDialog("Deseja relizar outra Pesquisa?");

        } while (answer.equals("sim"));
    }
}