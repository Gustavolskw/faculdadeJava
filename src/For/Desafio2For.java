package For;

import javax.swing.*;

/*DESAFIO 2
Construa um programa que solicita ao usuário uma frase. Ao final, indique quantas
vogais, consoantes, espaços e outros caracteres compõem essa frase.*/
public class Desafio2For {

    public static void main(String[] agrs) {
        int vogais = 0;
        int consoantes = 0;
        int charact = 0;
        int spaces = 0;
        String frase;

        frase = JOptionPane.showInputDialog(null, "Digite uma Frase  para executar o programa", "INICIO",
                JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "tamanho da Palavra: " + frase.length(), "TAMANHO",
                JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < frase.length(); i++) {
            char ch = frase.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i' || ch == 'A' || ch == 'E' || ch == 'I'
                        || ch == 'O' || ch == 'U') {
                    vogais++;
                }

                else {
                    consoantes++;
                }
            } else if (ch == ' ') {
                spaces++;
            } else {
                charact++;
            }

        }
        JOptionPane.showMessageDialog(null, "Vogais- " + vogais + "\nConsoantes- " + consoantes + "\nEspaços- " + spaces
                + "\nOutros caracteres- " + charact, frase, -1);
    }
}

