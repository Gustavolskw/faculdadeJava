package DesafioFinal;

import javax.swing.*;
import java.util.Random;

public class TesteListas {
	 public static void main(String[] args) {
		  boolean continuar = true;
		  int notaTesteSocial = 0 ;
		  Object[] simOuNao = {"SIM", "NÃO"};
		  String []tipos = {"Nome Completo", "Idade", "Endereço", "CPF", "Motivo para adoção"};
		  Object []listas = {"Todos os animais ", "Lista Disponiveis adoção ","Lista por Raça ","Lista por Idade ","Lista de Vacinaçao", "Lista de Nome"};
		  String []dadosPessoais = new String[5];
		  Object [] idadesList = {" 7 Anos de idade ", " 3 anos de idade"," 6 anos de idade"," 2 anos de idade"," 1 ano de idade"," 7 anos de idade","18meses de  idade "," 8 meses de idade "," 2 anos de idade", " 5 anos de idade"," 1 mês de idade","3 meses de idade "};
		  Object[] racasList = {"Cachorro", "Cachorro", "Cachorro", "Gato", "Gato", "Gato", "Pássaro", "Pássaro", "Lagarto", "Cobra", "Peixe", "Peixe"};
		  Object[] nomesList = {"Pog", "Bob", "Marley", "Lia", "Loki", "Felix", "Lyon", "joan", "Rex", "Lila", "Pablo ", "Kyle"};
		  Object[] infoComportamentalList = {"calmo e Dorminhoco", "Agitado, Barulhento e muito brincalhão", "Protetor, Atento e Brincalhao",
				  "Calmo e dorminhoco", "Agitado principlamnte norturno, brincalhao e bagunceiro", "bagunceiro, desconfiado e irritado", "Barulhento, e agitado",
				  "calma e faz poucos sons", "Agitado, bom caçador e manço", "agressiva, bonita, manter no terrario, alimenta-se de ratos",
				  "calmo", "agitado e agressivo"};
		  String []adotadoList = new String[12];
		  String []vacinadoList = new String[12];
		  boolean adotar = true;
		  
		  
		  do {
			   Object escolhaLista = JOptionPane.showOptionDialog(null, "Escolha Dentre a Listas a seguir", "Escolha de Lista", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, listas, listas[1]);
			   listas(escolhaLista, idadesList, racasList, nomesList, infoComportamentalList, adotadoList, vacinadoList);
			   Object decidido = JOptionPane.showOptionDialog(null, "Decidiu qual animal adotar? ", "Decisão.", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
			   if (decidido.equals(0)) {
					adotar = true;
			   }
		  } while (!adotar );
	 }
	 public static void listas(Object escolhaLista, Object [] idadesList, Object[] racasList, Object[] nomesList,Object[] infoComportamentalList,String []adotadoList,String []vacinadoList ){
		  Random sorteio = new Random();
		  
		  StringBuilder listaIdades = new StringBuilder();
		  for (int i = 0; i < idadesList.length; i++) {
			   listaIdades.append("["+(i+1)+"]"+idadesList[i]);
			   if (i < idadesList.length - 1) {
					listaIdades.append("\n");
			   }
		  }
		  StringBuilder listaRacas = new StringBuilder();
		  for (int i = 0; i < racasList.length; i++) {
			   listaRacas.append("["+(i+1)+"]"+racasList[i]);
			   if (i < racasList.length - 1) {
					listaRacas.append("\n");
			   }
		  }
		  StringBuilder listaNomes = new StringBuilder();
		  for (int i = 0; i < nomesList.length; i++) {
			   listaNomes.append("[" + (i + 1) + "]" + nomesList[i]);
			   if (i < nomesList.length - 1) {
					listaNomes.append("\n");
			   }
		  }
		  StringBuilder listaInfoComp = new StringBuilder();
		  for (int i = 0; i < infoComportamentalList.length; i++) {
			   listaInfoComp.append("["+(i+1)+"]"+infoComportamentalList[i]);
			   if (i < infoComportamentalList.length - 1) {
					listaInfoComp.append("\n");
			   }
		  }
		  for(int i = 0; i<12; i++){
			   int sorteioVal = sorteio.nextInt(10)+1;
			   
			   
			   if(sorteioVal == 2 || sorteioVal == 4 || sorteioVal == 6 || sorteioVal == 8 || sorteioVal == 10) {
					adotadoList[i] = "Sim";
					vacinadoList[i] ="Não";
			   } else {
					adotadoList[i]= "Não";
					vacinadoList[i] ="Sim";
			   }
		  }
		  StringBuilder listaVacinado = new StringBuilder();
		  for (int i = 0; i < vacinadoList.length; i++) {
			   listaVacinado.append("[" + (i + 1) + "]" + vacinadoList[i]);
			   if (i < vacinadoList.length - 1) {
					listaVacinado.append("\n");
			   }
		  }
		  StringBuilder listaAdotado = new StringBuilder();
		  for (int i = 0; i < adotadoList.length; i++) {
			   listaAdotado.append("[" + (i + 1) + "]" + adotadoList[i]);
			   if (i < adotadoList.length - 1) {
					listaAdotado.append("\n");
			   }
		  }
		  StringBuilder listaTodos = new StringBuilder();
		  for (int i = 0; i < 12; i++) {
			   listaTodos.append("  [" + (i + 1) + "] || " + nomesList[i]+" || "+racasList[i]+" || "+ idadesList[i]+" ||   "+vacinadoList[i]+"   ||   "+adotadoList[i]);
			   if (i < 12 - 1) {
					listaTodos.append("\n");
			   }
		  }
		  
		  
		  if(escolhaLista.equals(0)){
			   //todos os animais.
			   JOptionPane.showMessageDialog(null,"NUM ||   NOME ||   RAÇA ||   IDADE ||   VACINADO |   ADOTADO - \n"+listaTodos, "Lista Escolhida", JOptionPane.PLAIN_MESSAGE);
		  }else if(escolhaLista.equals(1)){
			   //"Lista Disponiveis adoção "
			   JOptionPane.showMessageDialog(null, listaAdotado, "Lista Escolhida", JOptionPane.PLAIN_MESSAGE);
		  }else if(escolhaLista.equals(2)){
			   //"Lista por Raça "
			   JOptionPane.showMessageDialog(null, listaRacas, "Lista Escolhida", JOptionPane.PLAIN_MESSAGE);
		  }else if(escolhaLista.equals(3)){
			   //"Lista por Idade "
			   JOptionPane.showMessageDialog(null, listaIdades, "Lista Escolhida", JOptionPane.PLAIN_MESSAGE);
		  }else if(escolhaLista.equals(4)){
			   //"Lista de Vacinaçao"
			   JOptionPane.showMessageDialog(null, listaVacinado, "Lista Escolhida", JOptionPane.PLAIN_MESSAGE);
		  }else if(escolhaLista.equals(5)){
			   //"Lista de Comportamento"
			   JOptionPane.showMessageDialog(null, listaNomes, "Lista Escolhida", JOptionPane.PLAIN_MESSAGE);
		  }
	 }
}

