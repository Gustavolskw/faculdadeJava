package SwitchCase;/*DESAFIO 4
Desenvolva um programa que permita calcular o imposto de renda de uma pessoa. O
usuário informa o valor do salário bruto mensal e o programa deve calcular o valor do
imposto de acordo com a seguinte tabela:
● Salário até R$1.903,98: isento de imposto
● Salário de R$1.903,99 até R$2.826,65: 7,5% de imposto
● Salário de R$2.826,66 até R$3.751,05: 15% de imposto
● Salário de R$3.751,06 até R$4.664,68: 22,5% de imposto
● Salário acima de R$4.664,68: 27,5% de imposto
Calcule o valor do imposto de acordo com o salário informado pelo usuário e exiba o
resultado. Lembre-se de que o valor do imposto deve ser calculado apenas sobre a
diferença entre o salário e o limite inferior de cada faixa de imposto. Por exemplo, se
o salário for R$2.000,00, o valor do imposto será 7,5% sobre R$96,01 (R$2.000,00 -
R$1.903,99). Caso o valor do imposto seja igual a zero, exiba a mensagem "Isento de
imposto". Caso contrário, exiba o valor do imposto calculado. */

import javax.swing.*;

class Desafio4Switch {

    public static void main(String[] args) {

        Double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do seu Salario"));
        String salarioTotal;
        double salarioTotalInt = calculoImposto(salario);
        if (salarioTotalInt == salario) {
            salarioTotal = String.format("Isento de Impostos", salarioTotalInt);
        } else {
            salarioTotal = String.format("Salario Final após impostos aplicados: = %.2f ", salarioTotalInt);
        }
        JOptionPane.showMessageDialog(null, salarioTotal, "Final",
                JOptionPane.PLAIN_MESSAGE);

    }

    static Double calculoImposto(Double salario) {
        String QuantidadeImposto = "";
        double resultado = 0;
        double valorImposto;
        double impostos[] = { 7.5, 15, 22.5, 27.5 };

        if (salario < 1903) {
            QuantidadeImposto = "Sem Imposto";
        } else if (salario > 1903 && salario < 2826) {

            QuantidadeImposto = "7,5%";
        } else if (salario > 2826 && salario < 3751) {
            QuantidadeImposto = "15%";
        } else if (salario > 3751 && salario < 4664) {
            QuantidadeImposto = "22,5%";
        } else if (salario > 4664) {
            QuantidadeImposto = "27,5%";
        }
        switch (QuantidadeImposto) {
            case "Sem Imposto":

                resultado = salario;
                break;
            case "7,5%":
                valorImposto = salario * (impostos[0] / 100);
                resultado = salario - valorImposto;
                break;
            case "15%":
                valorImposto = salario * (impostos[1] / 100);
                resultado = salario - valorImposto;
                break;
            case "22,5%":
                valorImposto = salario * (impostos[2] / 100);
                resultado = salario - valorImposto;
                break;
            case "27,5%":
                valorImposto = salario * (impostos[3] / 100);
                resultado = salario - valorImposto;
        }

        return resultado;
    }
}
