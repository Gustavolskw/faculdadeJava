package SwitchCase;/*DESAFIO 3
Desenvolva um sistema de votação para uma eleição. O programa terá um menu que
deve permitir ao usuário digitar o número do candidato de sua escolha, que varia de
1 a 5, e em seguida, exibir uma mensagem informando o nome e a plataforma política
do candidato escolhido.
Após o usuário digitar o número do candidato, deve-se verificar o número digitado e
exibir uma mensagem com o nome e a plataforma política do candidato escolhido.
Caso o número digitado não corresponda a nenhum candidato válido, o programa
deve exibir uma mensagem de erro. */

import javax.swing.JOptionPane;

public class Desafio3Switch {
    public static void main(String[] args) {
        boolean valido = true;
        int escolhaCandidato;
        do {
            Object[] candidatos = { "7079 - Rafael Chulé", "45369 - Anão Montanha", "70192 - Zé Gotinha da Floresta",
                    "20222 - Naruto", "2024 - Linguiça do Circo" };
            escolhaCandidato = Integer.parseInt(JOptionPane.showInputDialog(null, candidatos));
            switch (escolhaCandidato) {
                case 7079:
                    JOptionPane.showMessageDialog(null,
                            candidatos[0] + "\nCandidato a Deputado Federal\nEstado: Rio Grande Do Sul",
                            "AVANTE", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 45369:
                    JOptionPane.showMessageDialog(null,
                            candidatos[1] + "\nCandidato a Deputado Estadual\nEstado: Rio De janeiro", "PSDB",
                            JOptionPane.PLAIN_MESSAGE);
                    break;
                case 70192:
                    JOptionPane.showMessageDialog(null,
                            candidatos[2] + "\nCandidato a Deputado Estadual\nEstado: Rio Grande Do Sul", "AVANTE",
                            JOptionPane.PLAIN_MESSAGE);
                    break;
                case 20222:
                    JOptionPane.showMessageDialog(null,
                            candidatos[3] + "\nCandidato a Deputado Estadual\nEstado: Amapá",
                            "PSC",
                            JOptionPane.PLAIN_MESSAGE);
                    break;
                case 2024:
                    JOptionPane.showMessageDialog(null,
                            candidatos[4] + "\nCandidato a Deputado Federal\nEstado: Paraná",
                            "PSC",
                            JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    valido = false;
                    JOptionPane.showMessageDialog(null, "Candidato Inexistente!!! ", "Erro!!!",
                            JOptionPane.ERROR_MESSAGE);

            }
        } while (valido == false);
    }
}