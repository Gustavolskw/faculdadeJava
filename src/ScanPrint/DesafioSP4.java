package ScanPrint;

import javax.swing.JOptionPane;

public class DesafioSP4 {

    boolean isLetter(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            return true;
        else
            return false;
    }

    boolean isSpace(char ch) {
        if (ch == ' ')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        DesafioSP4 strCount = new DesafioSP4();

        String text;
        int letters = 0, spaces = 0;

        text = JOptionPane.showInputDialog("Digite uma palvara Aletória: ");

        for (int i = 0; i < text.length(); i++) {
            if (strCount.isLetter(text.charAt(i)))
                letters++;
            else if (strCount.isSpace(text.charAt(i)))
                spaces++;

        }

        JOptionPane.showMessageDialog(null, "Letters: " + letters + "\nSpaces: " + spaces);
    }
}
