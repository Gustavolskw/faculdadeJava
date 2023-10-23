package Methods;

import javax.swing.*;
import java.util.Random;

/*DESAFIO 4
Você está organizando um evento beneficente e precisa distribuir um único
brinde para uma das pessoas participantes do evento. Contudo, esse evento não
permite sorteio nominal. Então, alguém deu a seguinte ideia: desenvolver uma
solução de adivinhação. A pessoa vai no computador e pode digitar até 5 (cinco)
números, ou seja, ela terá 5 (cinco) chances. Se ela adivinhar um o número
escolhido aleatoriamente pelo computador, ela ganhará. Se acertar aparecerá
“PARABÉNS! Você ganhou o brinde!”. Se não, lerá “Que pena. Infelizmente você
não acertou.”

 */
public class Desafio4Methods {
	 
	 public static void main(String[] args) {
		  String endTitle = "RESULTADO";
		  int randNumber;
		  int guess = 0;
		  JOptionPane.showMessageDialog(null, "O desafio é acertar um número (0 e 30)\nvocê terá 5(cino) chances para ganhar o brinde do Evento!\n Boa Sorte!!! ", "Desafio", JOptionPane.INFORMATION_MESSAGE);
		  randNumber = giveRandNumber();
		  for(int i = 0; i< 5; i++) {
			   guess = guessTry(i);
			   if(guess == randNumber){
					JOptionPane.showMessageDialog(null, "“PARABÉNS! Você ganhou o brinde!”", "Mensagem Final", JOptionPane.WARNING_MESSAGE );
					
					break;
			   }
		  }
		  if(guess != randNumber) {
			   JOptionPane.showMessageDialog(null, "“Que pena. Infelizmente você não acertou.”", endTitle, JOptionPane.WARNING_MESSAGE);
		  }
		  
	 }
	 public static int giveRandNumber(){
		  int randNum;
		  Random randShot = new Random();
		  randNum = randShot.nextInt(31);
		  return randNum;
	 }
	 public static int guessTry(int order ){
		  int tryGuess;
		  
			   tryGuess = Integer.parseInt(JOptionPane.showInputDialog(null,
					   "Digite um numero entre (0 e 30)", "Tentativa Nº" + (order + 1), JOptionPane.INFORMATION_MESSAGE));
		  return tryGuess;
	 }
}
