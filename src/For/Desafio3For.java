
import javax.swing.JOptionPane;

/*DESAFIO 3
Prepare um código-fonte para um programa que verifica APENAS os números primos
de 1 a 100.
Obs.: pesquise o que são números primos */

public class Desafio3For {
    public static void main(String[] args) {
        int valor;
        int divisores = 0, cont = 1;
        boolean primo = true;
        do {
            valor = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Digite um Número",
                            "Entrada de Dado", -1));
        } while (valor > 100);
        if (valor > 0) {
            while (cont <= valor) {
                if (valor % cont == 0) {
                    divisores++;
                }
                cont++;
            }
        } else {
            primo = false;
            JOptionPane.showMessageDialog(null, "O Número " + valor + " não é primo ", "Conferencia", 0);

        }
        if (divisores == 2) {
            primo = true;
            JOptionPane.showMessageDialog(null, "O Número " + valor + " é primo ", "Conferencia", -1);

        } else {
            primo = false;
            JOptionPane.showMessageDialog(null, "O Número " + valor + " não é primo ", "Conferencia", 0);
        }

    }
}
