package Testes;

import javax.swing.*;

public class testeAluraFormat {
    public static void main(String[] args) {

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        JOptionPane.showMessageDialog(null,String.format
        	("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        String nome1 = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome1, aulas);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
