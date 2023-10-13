package For;
/*DESAFIO 1
Solicite uma palavra ao usuário. Depois, apresente cada letra daquilo que ele
escreveu e conte quantos caracteres essa palavra tem.
 */

import javax.swing.JOptionPane;

public class Desafio1For {

    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog(null, "Digite um palavra para executar o programa", "INICIO",
                JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "tamanho da Palavra: " + palavra.length(), "TAMANHO",
                JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < palavra.length(); i++) {
            char result = palavra.charAt(i);
            JOptionPane.showMessageDialog(null, result);
        }

    }

}
