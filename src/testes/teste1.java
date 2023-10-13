package testes;

import javax.swing.JOptionPane;

public class teste1 {

    public static void main(String[] args) {

        int quantidadeDeHoras;
        for (int i = 0; i < 4; i++) {
            Object[] options = { "Sim", "Não" };

            Object horaExtra = JOptionPane.showOptionDialog(null,
                    "Foi Realizado Hora extra na " + (i + 1) + "º Semana", "Recursos Humanos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[1]);
            if (horaExtra.equals(0)) {
                quantidadeDeHoras = Integer
                        .parseInt(JOptionPane.showInputDialog("Quantidade de Horas extras realizadas: "));
            } else if (horaExtra.equals(1)) {
                quantidadeDeHoras = 0;
            }

        }
    }
}