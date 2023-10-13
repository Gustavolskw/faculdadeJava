package SwitchCase;/*DESAFIO 2
Solicite que o usuário informe uma letra do alfabeto. Posteriormente, verifique se essa
letra é uma vogal, uma consoante ou um caractere inválido. */

import javax.swing.JOptionPane;

public class Desafio2Switch {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite uma letra:").toLowerCase(); // Converte a entrada para
                                                                                       // minúsculas

        if (input.length() == 1) {
            char letra = input.charAt(0);

            switch (letra) {
                case 'a', 'e', 'i', 'o', 'u':
                    JOptionPane.showMessageDialog(null, "A letra é uma vogal.");
                    break;
                default:
                    if ((letra >= 'a' && letra <= 'z')) {
                        JOptionPane.showMessageDialog(null, "A letra é uma consoante.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Isso caractere inválido.");
                    }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, insira apenas uma letra.");
        }
    }

}