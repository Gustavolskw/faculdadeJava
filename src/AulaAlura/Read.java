package AulaAlura;

import java.util.Scanner;




public class Read {
    public static void main(String[] args) {
        Scanner readCase = new Scanner(System.in);

        System.out.println("Digite o seu Filme Favorito");
        String filme = readCase.nextLine();
        System.out.println("Qual o ano de lançamento ");
        int releaseYear = readCase.nextInt();
        System.out.println("Nota de Avaliaçao do Filme");
        double avaliation = readCase.nextDouble();
        System.out.println("Filme - "+filme+"\nAno de Lançamento - "+releaseYear+"\nNota de Avaliação - "+avaliation);
		
		
    }
	
}


