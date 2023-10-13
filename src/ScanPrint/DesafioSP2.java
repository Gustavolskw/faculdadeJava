package ScanPrint;

import javax.swing.JOptionPane;

public class DesafioSP2 {

    public static void main(String[] args) {

        double number;

        number = Double.parseDouble(JOptionPane.showInputDialog("Informe seu número Real: "));

        JOptionPane.showInternalMessageDialog(null,
                "seu Número arrednondado é: \n" + Math.round(number),
                "Arredondamento ",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
