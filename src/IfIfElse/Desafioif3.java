package IfIfElse;/*DESAFIO 3
Você  está  construindo  uma  solução  para  calcular  o  valor  final  do  salário  de  um 
colaborador. Portanto, calcule o salário de um colaborador, sabendo que: 
• A jornada de trabalho é de 40 horas semanais, ou 160 horas mensais; 
• Caso haja horas extras, o valor a ser pago é de 50% a mais do valor normal da hora 
para cada hora extra realizada.*/

///ajustar parte de salario, automatizar com valor de horas completas explo fez 161 horas mensais  
import javax.swing.JOptionPane;

public class Desafioif3 {

    public static void main(String[] args) {

        double valHora;
        int horasSemanal[] = new int[4];

        // Requesita o valor Recebido por Hora do colaborador
        do {
            valHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o Valor por Hora ?", null));
        } while (valHora == 0);

        // Pergunta ao Colaborador se ele realizou hora extra dutante as 4 semanas do
        // mes e quantas(caso tenha reazliado).
        for (int i = 0; i < 4; i++) {
            horasSemanal[i] = showMenu(i);
        }
        // realiza o calculo do saalrio total do colaborador.
        double salario = calculoDeSalario(horasSemanal, valHora);

        // mostra ao colaborador o resultado do salario total apos calculado com horas
        // extras.
        showsalario(salario);

    }

    private static void showsalario(double salario) {
        JOptionPane.showMessageDialog(null, "O Salario Total é " + salario);
    }

    public static int showMenu(int order) {

        int quantidadeDeHoras = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Quantas Horas Voce trabalhou na " + (order + 1) + "º Semana", "Recursos Humanos",
                JOptionPane.QUESTION_MESSAGE));

        return quantidadeDeHoras;
    }

    public static double calculoDeSalario(int horasSemanal[], double valHora) {
        double salarioTotal = 0.0;
        int totalHorasMensais = 0;
        double valorHoraExtra = 0;
        int totalHE = 0;
        int horasNegativas = 0;
        for (int i = 0; i < 4; i++) {
            totalHorasMensais += horasSemanal[i];
        }
        if (totalHorasMensais > 220) {
            totalHE = totalHorasMensais - 220;
        } else if (totalHorasMensais == 220) {
            totalHE = 0;
        } else {
            horasNegativas = totalHorasMensais - 160;

        }

        valorHoraExtra = totalHE * (valHora * 0.50);
        salarioTotal = (valHora * totalHorasMensais - horasNegativas) + valorHoraExtra;

        return salarioTotal;
    }
}