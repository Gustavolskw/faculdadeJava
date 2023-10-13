package ScanPrint;

import javax.swing.JOptionPane;

public class DesafioSP3 {
    public static void main(String[] args) {

        double kelvin, fahrenheit;
        int celcius;
        String answer;

        celcius = Integer.parseInt(JOptionPane.showInputDialog(" Graus Celcius - °C: "));
        fahrenheit = (celcius * 1.8 + 32);
        kelvin = (celcius + 273);

        do {
            Object[] possibleValues = { "Kelvin", "Fahrenheit" };

            Object selectedValue = JOptionPane.showInputDialog(null,
                    "Converter a temperatura para: ", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[1]);

            if (selectedValue.equals("Kelvin")) {
                JOptionPane.showMessageDialog(null, "Resultado em Kelvin = " + kelvin, "kelvin",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            if (selectedValue.equals("Fahrenheit")) {
                JOptionPane.showMessageDialog(null, "Resultado em Fahrenheit = " + fahrenheit, "kelvin",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            answer = JOptionPane.showInputDialog("Deseja relizar outra Pesquisa?");

        } while (answer.equals("sim"));
    }
}
