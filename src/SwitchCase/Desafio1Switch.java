package SwitchCase;
/*/DESAFIO 1
Crie um programa que peça para o usuário selecionar uma figura geométrica de sua
escolha:
● Círculo;
● Quadrado;
● Retângulo;
● Triângulo.
Em seguida, peça os dados necessários para calcular e exibir a área da figura
selecionada.
 */

import javax.swing.*;
import java.awt.*;

public class Desafio1Switch {

    public static void main(String[] args) {
        // Carregue as imagens originais
        ImageIcon circle = new ImageIcon(
                new ImageIcon("SwitchCase/img/circle.png").getImage().getScaledInstance(30, 30,
                        Image.SCALE_DEFAULT));
        ImageIcon rect = new ImageIcon(
                new ImageIcon("SwitchCase/img/rect.png").getImage().getScaledInstance(30, 30,
                        Image.SCALE_DEFAULT));
        ImageIcon square = new ImageIcon(
                new ImageIcon("SwitchCase/img/square.png").getImage().getScaledInstance(30, 30,
                        Image.SCALE_DEFAULT));
        ImageIcon triangle = new ImageIcon(
                new ImageIcon("SwitchCase/img/triangle.png").getImage().getScaledInstance(30, 30,
                        Image.SCALE_DEFAULT));

        String escolha = "";
        Object[] options = { "Círculo", "Quadrado", "Retângulo", "Triângulo" };

        Object escolhaForma = JOptionPane.showOptionDialog(null,
                "Qual Forma Você deseja calcular?", "Escolha da Forma Geométrica",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[1]);
        if (escolhaForma.equals(0)) {
            escolha = "Círculo";
        } else if (escolhaForma.equals(1)) {
            escolha = "Quadrado";
        } else if (escolhaForma.equals(2)) {
            escolha = "Retângulo";
        } else if (escolhaForma.equals(3)) {
            escolha = "Triângulo";
        }
        switch (escolha) {

            case "Círculo":

                double areaCirculo;
                int raio = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Digite o raio do circulo."));
                areaCirculo = calculoCirculo(raio);
                JOptionPane.showMessageDialog(null, "A área do Circulo é: " + areaCirculo,
                        escolha, JOptionPane.INFORMATION_MESSAGE, circle);
                break;
            case "Quadrado":
                double areaQuadrado;
                int lado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do lado do quadrado."));
                areaQuadrado = calculoQuadrado(lado);
                JOptionPane.showMessageDialog(null, "A área do Circulo é: " + areaQuadrado,
                        escolha, JOptionPane.INFORMATION_MESSAGE, square);
                break;
            case "Retângulo":
                double areaRect;
                int base = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da Base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da Altura"));
                areaRect = calculoRect(base, altura);
                JOptionPane.showMessageDialog(null, "A área do Retângulo é: " + areaRect,
                        escolha, JOptionPane.INFORMATION_MESSAGE, rect);
                break;
            case "Triângulo":
                double areaTriang;
                int baseTri = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da Base"));
                int alturaTri = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da Altura"));
                areaTriang = calculoTriang(baseTri, alturaTri);
                JOptionPane.showMessageDialog(null, "A área do Retângulo é: " + areaTriang,
                        escolha, JOptionPane.INFORMATION_MESSAGE, triangle);
                break;
        }

    }

    public static ImageIcon redimensionarImagem(ImageIcon imagemOriginal, int largura, int altura) {
        java.awt.Image imagem = imagemOriginal.getImage();
        java.awt.Image imagemRedimensionada = imagem.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
        return new ImageIcon(imagemRedimensionada);
    }

    private static double calculoCirculo(int raio) {
        double areaCirculo;
        double pi = 3.14;

        areaCirculo = pi * (raio * raio);

        return areaCirculo;
    }

    private static double calculoQuadrado(int lado) {
        double areaQuadrado;
        areaQuadrado = lado * lado;

        return areaQuadrado;
    }

    private static double calculoRect(int base, int altura) {

        double areaRect;
        areaRect = base * altura;
        return areaRect;

    }

    private static double calculoTriang(int baseTri, int alturaTri) {
        double areaTriang;
        areaTriang = (baseTri * alturaTri) / 2;
        return areaTriang;
    }
}