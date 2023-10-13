package For;
/* Você simulará aqui um jogo de cartas chamado 21, porém, por enquanto, será um
jogo de uma só pessoa. O jogador/usuário deve puxar cartas, somando o valor das
mesmas. O objetivo é chegar o mais próximo possível de 21 sem ultrapassá-lo. Para
isso, a cada rodada pergunte se o jogador deseja mais uma carta para seu jogo ou se
deseja parar. Caso ele ultrapasse 21 na sua contagem, ele perde o jogo. Ao final,
mostre qual sua pontuação final.
Obs. 1: as cartas são dadas de maneira aleatória.
Obs. 2: pesquise o valor de cada carta em um jogo de 21.*/

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Desafio4For {
	 public static void main(String[] args) {
		  Random rand = new Random();
		  
		  
		  // A
		  ImageIcon asDeCopas = new ImageIcon(
				  new ImageIcon("src/img/asDeCopas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon asDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/asDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon asDeOuro = new ImageIcon(
				  new ImageIcon("src/img/asDeOuro.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon asDePaus = new ImageIcon(
				  new ImageIcon("src/img/asDePaus.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  // 2
		  ImageIcon doisDeCopas = new ImageIcon(
				  new ImageIcon("src/img/doisDeCopas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon doisDePaus = new ImageIcon(
				  new ImageIcon("src/img/doisDePaus.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon doisDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/doisDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon doisDeDiamantes = new ImageIcon(
				  new ImageIcon("src/img/doisDeDiamantes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  // 3
		  ImageIcon tresDeDiamantes = new ImageIcon(
				  new ImageIcon("src/img/tresDeDiamantes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon tresDeCoracoes = new ImageIcon(
				  new ImageIcon("src/img/tresDeCoracoes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon tresDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/tresDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  
		  ImageIcon tresDePaus = new ImageIcon(
				  new ImageIcon("src/img/tresDePaus.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  // 4
		  ImageIcon quatroDeDiamantes = new ImageIcon(
				  new ImageIcon("src/img/quatroDeDiamantes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon quatroDeCoracoes = new ImageIcon(
				  new ImageIcon("src/img/quatroDeCoracoes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon quatroDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/quatroDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  
		  ImageIcon quatroDePaus = new ImageIcon(
				  new ImageIcon("src/img/quatroDePaus.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  // 5
		  ImageIcon cincoDeDiamantes = new ImageIcon(
				  new ImageIcon("src/img/cincoDeDiamantes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon cincoDeCoracoes = new ImageIcon(
				  new ImageIcon("src/img/cincoDeCoracoes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon cincoDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/cincoDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  
		  ImageIcon cincoDePaus = new ImageIcon(
				  new ImageIcon("src/img/cincoDePaus.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  // 6
		  ImageIcon seisDeDiamantes = new ImageIcon(
				  new ImageIcon("src/img/seisDeDiamantes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon seisDeCoracoes = new ImageIcon(
				  new ImageIcon("src/img/seisDeCoracoes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon seisDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/seisDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  
		  ImageIcon seisDePaus = new ImageIcon(
				  new ImageIcon("src/img/seisDePaus.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  
		  // 7
		  ImageIcon seteDeDiamantes = new ImageIcon(
				  new ImageIcon("src/img/seteDeDiamantes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon seteDeCoracoes = new ImageIcon(
				  new ImageIcon("src/img/seteDeCoracoes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon seteDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/seteDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  
		  ImageIcon seteDePaus = new ImageIcon(
				  new ImageIcon("src/img/seteDePaus.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  // 8
		  ImageIcon oitoDeDiamantes = new ImageIcon(
				  new ImageIcon("src/img/oitoDeDiamantes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon oitoDeCoracoes = new ImageIcon(
				  new ImageIcon("src/img/oitoDeCoracoes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon oitoDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/oitoDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  
		  ImageIcon oitoDePaus = new ImageIcon(
				  new ImageIcon("src/img/oitoDePaus.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  // 9
		  ImageIcon noveDeDiamantes = new ImageIcon(
				  new ImageIcon("src/img/noveDeDiamantes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon noveDeCoracoes = new ImageIcon(
				  new ImageIcon("src/img/noveDeCoracoes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon noveDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/noveDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  
		  ImageIcon noveDePaus = new ImageIcon(
				  new ImageIcon("src/img/noveDePaus.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  //10
		  ImageIcon dezDeDiamantes = new ImageIcon(
				  new ImageIcon("src/img/dezDeDiamantes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon dezDeCoracoes = new ImageIcon(
				  new ImageIcon("src/img/dezDeCoracoes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon dezDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/dezDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  
		  ImageIcon dezDePaus = new ImageIcon(
				  new ImageIcon("src/img/dezDePaus.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  // J
		  ImageIcon JackDeCopas = new ImageIcon(
				  new ImageIcon("src/img/JackDeCopas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon jackDeCoracoes = new ImageIcon(
				  new ImageIcon("src/img/jackDeCoracoes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon JackDeDiamantes = new ImageIcon(
				  new ImageIcon("src/img/JackDeDiamantes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon JDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/JDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  // Q
		  ImageIcon rainhaDeDiamantes = new ImageIcon(
				  new ImageIcon("src/img/rainhaDeDiamantes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon rainhaDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/rainhaDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon rainhaDePaus = new ImageIcon(
				  new ImageIcon("src/img/rainhaDePaus.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon rainhaDeCopas = new ImageIcon(
				  new ImageIcon("src/img/rainhaDeCopas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  
		  // K
		  ImageIcon reiDeCopas = new ImageIcon(
				  new ImageIcon("src/img/reiDeCopas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon reiDeEspadas = new ImageIcon(
				  new ImageIcon("src/img/reiDeEspadas.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon reiDePaus = new ImageIcon(
				  new ImageIcon("src/img/reiDePaus.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon reiDeDiamantes = new ImageIcon(
				  new ImageIcon("src/img/reiDeDiamantes.png").getImage().getScaledInstance(200, 200,
						  Image.SCALE_DEFAULT));
		  ImageIcon blackjack = new ImageIcon(
				  new ImageIcon("src/img/BlackJack.jpg").getImage().getScaledInstance(400, 250,
						  Image.SCALE_DEFAULT));
		  
		  Object[] cardValDez = {dezDeDiamantes, dezDeCoracoes, dezDeEspadas, dezDeEspadas, JackDeCopas, jackDeCoracoes, JackDeDiamantes, JDeEspadas,
				  rainhaDeDiamantes, rainhaDeEspadas, rainhaDePaus, rainhaDeCopas, reiDeCopas, reiDeEspadas, reiDePaus, reiDeDiamantes};
		  Object[] cardValNove = {noveDeDiamantes, noveDeCoracoes, noveDeDiamantes, noveDePaus};
		  Object[] cardValOito ={oitoDeDiamantes, oitoDePaus, oitoDeCoracoes, oitoDeEspadas};
		  Object[] cardValSete = {seteDeDiamantes, seteDePaus, seteDeCoracoes, seteDeEspadas};
		  Object[] cardValSeis = {seisDeDiamantes, seisDePaus, seisDeCoracoes, seisDeEspadas};
		  Object[] cardValCinco = {cincoDeDiamantes, cincoDePaus, cincoDeCoracoes, cincoDeEspadas};
		  Object[] cardValQuatro = {quatroDeDiamantes, quatroDePaus, quatroDeCoracoes, quatroDeEspadas};
		  Object[] cardValTres = {tresDeDiamantes, tresDePaus, tresDeCoracoes, tresDeEspadas};
		  Object[] cardValDois = {doisDeDiamantes, doisDePaus, doisDeCopas, doisDeEspadas};
		  Object[] cardValAs = {asDeOuro, asDePaus, asDeCopas, asDeEspadas};
		  
		  
		  JOptionPane.showMessageDialog(null, "", "Cassino Royale 21 ", JOptionPane.PLAIN_MESSAGE, blackjack);
		  JOptionPane.showMessageDialog(null, "O Dealer lhe entregará uma carta e o valor dessa carta irá adicionar a sua pontuação,\n apos isso voce escolherá se quer continuar ou parar de jogar com a pontuação que conquistou.\nBOA SORTE!", "BalckJack 21 Cassino", JOptionPane.INFORMATION_MESSAGE);
		  int pontuacaoJogador = 0;
		  for (int rodada = 1; rodada <= 21; rodada++) {
			   int dealer = rand.nextInt(10) + 1;
			   pontuacaoJogador += dealer;
			   
			   if(dealer == 1){
					cardValAs(cardValAs);
			   } else if (dealer == 2 ) {
					cardValDois(cardValDois);
			   } else if (dealer==3) {
					cardValTres(cardValTres);
			   } else if (dealer==4) {
					cardValQuatro(cardValQuatro);
			   } else if (dealer == 5 ) {
					cardValCinco(cardValCinco);
			   } else if (dealer ==6 ) {
					cardValSeis(cardValSeis);
			   } else if (dealer==7) {
					cardValSete(cardValSete);
			   } else if (dealer ==8) {
					cardValOito(cardValOito);
			   } else if (dealer==9) {
					cardValNove(cardValNove);
			   } else if (dealer==10) {
					cardValDez(cardValDez);
			   }
			   
			   JOptionPane.showMessageDialog(null, "Pontuação Atual: "+pontuacaoJogador , "Rodada " + rodada, -1  );
			   
			   if (pontuacaoJogador == 21) {
					JOptionPane.showMessageDialog(null, "Você fez 21 pontos! Parabéns, você ganhou!");
					break;
			   } else if (pontuacaoJogador > 21) {
					JOptionPane.showMessageDialog(null, "Sua pontuação ultrapassou 21. Você perdeu!");
					break;
			   }
			   
			   int resposta = JOptionPane.showConfirmDialog(null, "Deseja receber outra carta?", "Dealer", JOptionPane.YES_NO_OPTION);
			   
			   if (resposta != JOptionPane.YES_OPTION) {
					break;
			   }
		  }
		  JOptionPane.showMessageDialog(null, "Fim do jogo. Sua pontuação final é: " + pontuacaoJogador);
	 }
	 
	 public static void cardValDez( Object[] cardValDez) {
			   Random rand = new Random();
			   int i = rand.nextInt(12);
			   JOptionPane.showMessageDialog(null, "", "Carta", JOptionPane.INFORMATION_MESSAGE, (Icon) cardValDez[i]);
		
		}
		public static void cardValNove(Object[] cardValNove){
			 Random rand = new Random();
			 int i = rand.nextInt(4);
			 JOptionPane.showMessageDialog(null, "", "Carta", JOptionPane.INFORMATION_MESSAGE, (Icon) cardValNove[i]);
			 
		}
	 public static void cardValOito(Object[] cardValOito){
		  Random rand = new Random();
		  int i = rand.nextInt(4);
		  JOptionPane.showMessageDialog(null, "", "Carta", JOptionPane.INFORMATION_MESSAGE, (Icon) cardValOito[i]);
		  
	 }
	 public static void cardValSete(Object[] cardValSete){
		  Random rand = new Random();
		  int i = rand.nextInt(4);
		  JOptionPane.showMessageDialog(null, "", "Carta", JOptionPane.INFORMATION_MESSAGE, (Icon) cardValSete[i]);
		  
	 }
	 public static void cardValSeis(Object[] cardValSeis){
		  Random rand = new Random();
		  int i = rand.nextInt(4);
		  JOptionPane.showMessageDialog(null, "", "Carta", JOptionPane.INFORMATION_MESSAGE, (Icon) cardValSeis[i]);
		  
	 }
	 public static void cardValCinco(Object[] cardValCinco){
		  Random rand = new Random();
		  int i = rand.nextInt(4);
		  JOptionPane.showMessageDialog(null, "", "Carta", JOptionPane.INFORMATION_MESSAGE, (Icon) cardValCinco[i]);
		  
	 }
	 public static void cardValQuatro(Object[] cardValQuatro){
		  Random rand = new Random();
		  int i = rand.nextInt(4);
		  JOptionPane.showMessageDialog(null, "", "Carta", JOptionPane.INFORMATION_MESSAGE, (Icon) cardValQuatro[i]);
		  
	 }
	 public static void cardValTres(Object[] cardValTres){
		  Random rand = new Random();
		  int i = rand.nextInt(4);
		  JOptionPane.showMessageDialog(null, "", "Carta", JOptionPane.INFORMATION_MESSAGE, (Icon) cardValTres[i]);
		  
	 }
	 public static void cardValDois(Object[] cardValDois){
		  Random rand = new Random();
		  int i = rand.nextInt(4);
		  JOptionPane.showMessageDialog(null, "", "Carta", JOptionPane.INFORMATION_MESSAGE, (Icon) cardValDois[i]);
		  
	 }
	 public static void cardValAs(Object[] cardValAs){
		  Random rand = new Random();
		  int i = rand.nextInt(4);
		  JOptionPane.showMessageDialog(null, "", "Carta", JOptionPane.INFORMATION_MESSAGE, (Icon) cardValAs[i]);
		  
	 }
}