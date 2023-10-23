package AulaAlura;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner readCase = new Scanner(System.in);
        int [] nota = new int [5];
        double mediaNota = 0;
        for (int i = 0; i < 5; i++) {
          nota[i] = readCase.nextInt();
          mediaNota += nota[i];
        }


        StringBuilder notaString = new StringBuilder();
        for (int i = 0; i < nota.length; i++) {
            notaString.append((i+1)+" - "+nota[i]);
            if (i < nota.length - 1) {
                notaString.append("\n");
            }
        }

        System.out.println(notaString+"\nMedia Total das notas - "+mediaNota);
    }
}
