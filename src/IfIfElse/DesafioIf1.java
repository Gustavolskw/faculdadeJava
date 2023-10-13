package IfIfElse;

import javax.swing.JOptionPane;

public class DesafioIf1 {

    /*
     * Construa uma solução que peça ao usuário sua idade e verifique se ele é:
     * - Uma criança, com idade abaixo de 18 anos;●
     * - Um jovem, com idade entre 18 e 30 anos;
     * - Um adulto, com idade entre 30 e 59 anos;
     * - Um idoso, com idade a partir de 60 anos.
     */

    boolean idadeVerdadeira(int idade) {
        if ((idade < 0) || (idade > 128))
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        DesafioIf1 idadeReal = new DesafioIf1();
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

        if (idadeReal.idadeVerdadeira(idade) && idade < 18) {
            JOptionPane.showMessageDialog(null, "Crinaça: " + idade + " Anos de idade");
        } else if (idadeReal.idadeVerdadeira(idade) && idade >= 18 && idade < 30) {
            JOptionPane.showMessageDialog(null, "Jovem: " + idade + " Anos de idade");
        } else if (idadeReal.idadeVerdadeira(idade) && idade >= 30 && idade <= 59) {
            JOptionPane.showMessageDialog(null, "Adulto: " + idade + " Anos de idade");
        } else if (idadeReal.idadeVerdadeira(idade) && idade >= 60) {
            JOptionPane.showMessageDialog(null, "Idoso: " + idade + " Anos de idade");
        } else
            JOptionPane.showMessageDialog(null, "Idade não real: ");

    }

}
