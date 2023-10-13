package IfIfElse;/*DESAFIO 2
Construa  um  programa  que  solicite  ao  usuário  três  comprimentos  de  lado  e,  em 
seguida, verifique se é possível formar um triângulo. Se sim, exiba o tipo de triângulo. 
Obs.: pesquise o que são triângulos equiláteros, isósceles e escalenos. */

import javax.swing.JOptionPane;

public class Desafioif2 {

    public static void main(String[] args) {

        int lados[] = new int[3];
        String triangulo;

        for (int i = 0; i < 3; i++) {
            lados[i] = solicitaValorLado(i);
        }
        ;
        triangulo = verificaTriangulo(lados);

        JOptionPane.showMessageDialog(null, "Seu Trinagulo é: " + triangulo);

    }

    public static int solicitaValorLado(int order) {
        int lado;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (order + 1) + "º lado "));
        return lado;
    }

    public static String verificaTriangulo(int lados[]) {
        String triangleType = "";
        int cont = 0;

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < i; k++) {
                if (lados[i] == lados[k]) {
                    cont++;
                }
            }
        }
        if (cont == 0) {
            triangleType = "escaleno";
        } else if (cont == 1) {
            triangleType = "isósceles";
        } else if (cont == 3) {
            triangleType = "equilátero";
        }

        return triangleType;
    }
}