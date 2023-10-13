package For;
import javax.swing.JOptionPane;
import java.util.Random;
public class TesteFor21 {
	
	 
	
		  public static void main(String[] args) {
			   Random random = new Random();
			   int pontuacaoJogador = 0;
			   
			   JOptionPane.showMessageDialog(null, "Bem-vindo ao Jogo de 21!");
			   
			   for (int rodada = 1; rodada <= 5; rodada++) {
					int carta = random.nextInt(11) + 1;  // Gera uma carta aleatória de 1 a 11.
					pontuacaoJogador += carta;
					
					JOptionPane.showMessageDialog(null, "Rodada " + rodada + ": Você recebeu uma carta de valor " + carta +
							". Sua pontuação atual é: " + pontuacaoJogador);
					
					if (pontuacaoJogador == 21) {
						 JOptionPane.showMessageDialog(null, "Você fez 21 pontos! Parabéns, você ganhou!");
						 break;
					} else if (pontuacaoJogador > 21) {
						 JOptionPane.showMessageDialog(null, "Sua pontuação ultrapassou 21. Você perdeu!");
						 break;
					}
					
					int resposta = JOptionPane.showConfirmDialog(null, "Deseja receber outra carta?", "Escolha", JOptionPane.YES_NO_OPTION);
					
					if (resposta != JOptionPane.YES_OPTION) {
						 break;
					}
			   }
			   
			   JOptionPane.showMessageDialog(null, "Fim do jogo. Sua pontuação final é: " + pontuacaoJogador);
		  }
	 }


	 
	 
	 