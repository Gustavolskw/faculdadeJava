package DesafioFinal;

import javax.swing.*;
import java.util.Random;

public class DesafioFinal {

	public static void main(String[] args) {
		boolean continuar = true;
		int notaTesteSocial = 0 ;
		Object[] simOuNao = {"SIM", "NÃO"};
		String []tipos = {"Nome Completo", "Idade", "Endereço", "CPF", "Motivo para adoção"};
		Object []listas = {"Todos os animais ", "Lista Disponiveis adoção ","Lista por Raça ","Lista por Idade ","Lista de Vacinaçao", "Lista de Nome"};
		 String vacinado = "";
		String []dadosPessoais = new String[5];
		 String []adotadoList = new String[12];
		 String []vacinadoList = new String[12];
		 boolean escolhido = false;
		 int listaDeEspera = 0;
		 Random sorteio = new Random();
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
			 // realiza a coleta dos dados pessoais
			 for (int i = 0; i < 5; i++) {
				  dadosPessoais[i] = preencheDados(i, tipos);
			 }
			 // realiza a impresaao dos dados pessoais
			 imprimeDados(tipos, dadosPessoais);
		 do {
			 // pergunta se deseja fazer ou nao o processo seletivo
			 Object escolha = JOptionPane.showOptionDialog(null, "Deseja Realizar o teste Social para da continuidade no proceso de adoção\n caso(NÃO) encerrará o porcesso.", "Teste Social", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
			 
			 if (escolha.equals(0)) {
				  // realiza o teste Social e retorna a nota para a avalizaçao
				  notaTesteSocial = testeSocial(simOuNao);
			 } else if (escolha.equals(1)) {
				  continuar = false;
				  break;
			 }
			 // calculo da nota do Teste Social - se aprovado continua, se reprovado termina o processo
			 if (notaTesteSocial >= -5) {
				  JOptionPane.showMessageDialog(null, "Aprovado!", "Resultado Teste Social", JOptionPane.INFORMATION_MESSAGE);
			 } else if (notaTesteSocial == 0) {
				  JOptionPane.showMessageDialog(null, "Reprovado!", "Resultado Teste Social", JOptionPane.ERROR_MESSAGE);
				  continuar = false;
				  break;
			 } else {
				  JOptionPane.showMessageDialog(null, "Reprovado!", "Resultado Teste Social", JOptionPane.ERROR_MESSAGE);
				  continuar = false;
				  break;
			 }
		
			// perguntar se Deseja cadastrar um animal.
			Object cadastroAnimal = JOptionPane.showOptionDialog(null, "Deseja Cadastrar um Animal para adoção ? Se sim preencher os dados do animal, se nao passar para listas de adoção.", "Cadastrar", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
			if (cadastroAnimal.equals(0)) {
				 String nome = JOptionPane.showInputDialog(null, "Nome do Animal", "Cadastro Pet ", JOptionPane.PLAIN_MESSAGE);
				String raca = JOptionPane.showInputDialog(null, "Raça do Animal", "Cadastro Pet ", JOptionPane.PLAIN_MESSAGE);
				int idadeAnimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade do Pet ", "Cadastro Pet ", -1));
				String Comportamento = JOptionPane.showInputDialog(null, "Comportamento do Animal", "Cadastro Pet", JOptionPane.PLAIN_MESSAGE);
				Object vacinacao = JOptionPane.showOptionDialog(null, "Pet é vacinado ", "Cadastro Pet", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
				if (vacinacao.equals(0)) {
					vacinado = "Sim";
				} else if (vacinacao.equals(1)) {
					 vacinado = "Não";
				}
				JOptionPane.showMessageDialog(null, "Nome - "+nome+"\n Raça - "+raca+"\n Idade - "+ idadeAnimal+"\n Vacinado - "+vacinado+"\n Comportamento - "+Comportamento, "Dados do Pet Cadastrado", -1  );
			}
			//Perguntar se há o desejo de adotar um animal.
			Object adotarOuNao = JOptionPane.showOptionDialog(null, "Deseja Adotar um Animal?", "Adotar ? ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
			if (adotarOuNao.equals(1)) {
				continuar = false;
				break;
			}
		

			JOptionPane.showMessageDialog(null, "Agora que Realizado todos os cadastros, Mostraremos as listas de animais presentes no banco de dados", "Mensagem do sistema", JOptionPane.INFORMATION_MESSAGE);

			// Mostrar a lista e perguntar se ja decidiu sobre adotar um animal.
			boolean adotar = false;
			do {
				 Object escolhaLista = JOptionPane.showOptionDialog(null, "Escolha Dentre a Listas a seguir", "Escolha de Lista", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, listas, listas[1]);
				 listas(escolhaLista, adotadoList, vacinadoList);
				 Object decidido = JOptionPane.showOptionDialog(null, "Decidiu qual animal adotar? ", "Decisão.", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
				 if (decidido.equals(0)) {
					  adotar = true;
				 } else if (decidido.equals(1)) {
					  adotar = false;
				 }
			}while(!adotar);
				do {
					 
					 
						  int decisao = Integer.parseInt(JOptionPane.showInputDialog(null, listaTodos(adotadoList, vacinadoList), "DECISÃO", -1));
					 if(decisao>12){
						  JOptionPane.showMessageDialog(null, "numero nao valido");
					 }else {
						  if (adotadoList[decisao - 1].equalsIgnoreCase("Sim")) {
							   JOptionPane.showMessageDialog(null, "Pet Escolhido não esta Disponivel para Adoção!");
						  } else if (adotadoList[decisao - 1].equalsIgnoreCase("Não")) {
							   
							   Object decisaoFinal = JOptionPane.showOptionDialog(null, decisaoAdocao(decisao, adotadoList, vacinadoList), "Decisao", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
							   if (decisaoFinal.equals(0)) {
									JOptionPane.showMessageDialog(null, "Parabens pela Adoçao!!!", "Mensagem Final", -1);
									
									escolhido = true;
									break;
							   } else if (decisaoFinal.equals(1)) {
									Object feedBack = JOptionPane.showOptionDialog(null, "Deixar Um FeedBack?", "FeedBack", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
									if (feedBack.equals(0)) {
										 String feedBackMotivo = JOptionPane.showInputDialog(null, "Feedback");
										 Object listasDeDesejosSouN = JOptionPane.showOptionDialog(null, "Deseja deixar um Desejo a Lista...", "LIsta de Desejos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
										 if (listasDeDesejosSouN.equals(0)) {
											  String desejo = JOptionPane.showInputDialog(null, "Deixe seu Desejo abaixo", "Desejo", -1);
											  listaDeEspera++;
										 } else if (listasDeDesejosSouN.equals(1)) {
											  escolhido = true;
											  break;
										 }
									} else if (feedBack.equals(1)) {
										 Object listasDeDesejosSouN = JOptionPane.showOptionDialog(null, "Deseja deixar um Desejo a Lista...", "LIsta de Desejos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
										 if (listasDeDesejosSouN.equals(0)) {
											  String desejo = JOptionPane.showInputDialog(null, "Deixe seu Desejo abaixo", "Desejo", -1);
											  listaDeEspera++;
										 } else if (listasDeDesejosSouN.equals(1)) {
											  escolhido = true;
											  break;
										 }
									}
									escolhido = true;
									break;
									
							   }
						  }
					 }
				}while (!escolhido);
			 
		 }while(continuar== false);

		JOptionPane.showMessageDialog(null, "Fim Do Proceso Seletivo!","Fim do Processo de adoção", JOptionPane.PLAIN_MESSAGE);
		Object  abrirListaDeEspera = JOptionPane.showOptionDialog(null, "Abrir Lista de Espera", "Lista de Espera" , JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao,simOuNao[1]);
		if (abrirListaDeEspera.equals(0)) {
			 JOptionPane.showMessageDialog(null,showWaitList(listaDeEspera, tipos, dadosPessoais), "Lista de Espera", -1 );
		} else if (abrirListaDeEspera.equals(1)) {
			 JOptionPane.showMessageDialog(null, "Muito Obrigaod por Participar do Nosso processo de Adoção!", "Mensgame Final", -1 );
		}
	}
	public static int testeSocial(Object []simOuNao){
		int nota = 0;
		Object[] medidorUsoDeIntorpecente = {"Nunca", " 1 á 4 vezes  ","Todos os Dias"};
		String [] perguntas = {"Quantas vezes por Semana voce faz uso de Alcool?", "Quantas vezes por Semana voce faz uso de Drogas ilicitas?", "Você possui emprego fixo ou fonte de renda?", "Possui algum historico de agressividade?", "Possui Passagem na Policia?" };
		String [] titulos = {"Alcool", "Drogas", "Emprego","Historico de Agressividade","Historico Criminal"};

		for(int i = 0; i<2; i++){
			Object intorpecentes = JOptionPane.showOptionDialog(null, perguntas[i], titulos[i], JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, medidorUsoDeIntorpecente, medidorUsoDeIntorpecente[1]);
			if (intorpecentes.equals(0)) {
				nota = +5;
			} else if (intorpecentes.equals(1)) {
				nota++;
			}else if(i == 1 && intorpecentes.equals(2)){
				nota= -20;
			}else if( i == 0 && intorpecentes.equals(2)){
				nota= -5;
			}
		}
		for(int i = 2; i<5; i++) {
			Object resposta = JOptionPane.showOptionDialog(null,perguntas[i], titulos[i], JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1] );
			if(i == 4 && resposta.equals(0)){
				nota = -20;

			}else if(i == 3 && resposta.equals(0)){
				nota = -20;

			}
			if (resposta.equals(0)) {
				nota++;
			} else if (resposta.equals(1)) {
				nota--;
			}
		}

		return nota;
	}
	public static String preencheDados(int i, String []tipos){
		String []dado = new String[5];
		dado[i] = JOptionPane.showInputDialog(null,tipos[i], "DADOS", JOptionPane.QUESTION_MESSAGE  );


		return dado[i];
	}
	public static void imprimeDados(String []tipos, String []dadosPessoais){
		StringBuilder imprimeDados= new StringBuilder();
		for(int i = 0; i <5; i++){
			imprimeDados.append(tipos[i]+" - " +dadosPessoais[i]+ "\n");

		}
		JOptionPane.showMessageDialog(null, imprimeDados,"DADOS", JOptionPane.PLAIN_MESSAGE);
	}
	public static void listas(Object escolhaLista, String []adotadoList, String []vacinadoList){
		
		 Object [] idadesList = {" 7 Anos de idade ", " 3 anos de idade"," 6 anos de idade"," 2 anos de idade"," 1 ano de idade"," 7 anos de idade","18meses de  idade "," 8 meses de idade "," 2 anos de idade", " 5 anos de idade"," 1 mês de idade","3 meses de idade "};
		 Object[] racasList = {"Cachorro", "Cachorro", "Cachorro", "Gato", "Gato", "Gato", "Pássaro", "Pássaro", "Lagarto", "Cobra", "Peixe", "Peixe"};
		 Object[] nomesList = {"Pog", "Bob", "Marley", "Lia", "Loki", "Felix", "Lyon", "joan", "Rex", "Lila", "Pablo ", "Kyle"};
		 Object[] infoComportamentalList = {"calmo e Dorminhoco", "Agitado, Barulhento e muito brincalhão", "Protetor, Atento e Brincalhao",
				 "Calmo e dorminhoco", "Agitado principlamnte norturno, brincalhao e bagunceiro", "bagunceiro, desconfiado e irritado", "Barulhento, e agitado",
				 "calma e faz poucos sons", "Agitado, bom caçador e manço", "agressiva, bonita, manter no terrario, alimenta-se de ratos",
				 "calmo", "agitado e agressivo"};
		

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
	public static String listaTodos(String []adotadoList, String []vacinadoList){
		 Object [] idadesList = {" 7 Anos de idade ", " 3 anos de idade"," 6 anos de idade"," 2 anos de idade"," 1 ano de idade"," 7 anos de idade","18meses de  idade "," 8 meses de idade "," 2 anos de idade", " 5 anos de idade"," 1 mês de idade","3 meses de idade "};
		 Object[] racasList = {"Cachorro", "Cachorro", "Cachorro", "Gato", "Gato", "Gato", "Pássaro", "Pássaro", "Lagarto", "Cobra", "Peixe", "Peixe"};
		 Object[] nomesList = {"Pog", "Bob", "Marley", "Lia", "Loki", "Felix", "Lyon", "joan", "Rex", "Lila", "Pablo ", "Kyle"};
		 Object[] infoComportamentalList = {"calmo e Dorminhoco", "Agitado, Barulhento e muito brincalhão", "Protetor, Atento e Brincalhao",
				 "Calmo e dorminhoco", "Agitado principlamnte norturno, brincalhao e bagunceiro", "bagunceiro, desconfiado e irritado", "Barulhento, e agitado",
				 "calma e faz poucos sons", "Agitado, bom caçador e manço", "agressiva, bonita, manter no terrario, alimenta-se de ratos",
				 "calmo", "agitado e agressivo"};
		 
		 
		
		 StringBuilder listaTodos = new StringBuilder();
		 for (int i = 0; i < 12; i++) {
			  listaTodos.append("  [" + (i + 1) + "] || " + nomesList[i]+" || "+racasList[i]+" || "+ idadesList[i]+" ||   "+vacinadoList[i]+"   ||   "+adotadoList[i]);
			  if (i < 12 - 1) {
				   listaTodos.append("\n");
			  }
		 }
		 return "NUM ||   NOME ||   RAÇA ||   IDADE ||   VACINADO |   ADOTADO - \n"+listaTodos;

	}
	public static String decisaoAdocao(int decisao, String[] adotadoList, String[] vacinadoList) {
		 Object[] idadesList = {" 7 Anos de idade ", " 3 anos de idade", " 6 anos de idade", " 2 anos de idade", " 1 ano de idade", " 7 anos de idade", "18meses de  idade ", " 8 meses de idade ", " 2 anos de idade", " 5 anos de idade", " 1 mês de idade", "3 meses de idade "};
		 Object[] racasList = {"Cachorro", "Cachorro", "Cachorro", "Gato", "Gato", "Gato", "Pássaro", "Pássaro", "Lagarto", "Cobra", "Peixe", "Peixe"};
		 Object[] nomesList = {"Pog", "Bob", "Marley", "Lia", "Loki", "Felix", "Lyon", "joan", "Rex", "Lila", "Pablo ", "Kyle"};
		 Object[] infoComportamentalList = {"calmo e Dorminhoco", "Agitado, Barulhento e muito brincalhão", "Protetor, Atento e Brincalhao",
				 "Calmo e dorminhoco", "Agitado principlamnte norturno, brincalhao e bagunceiro", "bagunceiro, desconfiado e irritado", "Barulhento, e agitado",
				 "calma e faz poucos sons", "Agitado, bom caçador e manço", "agressiva, bonita, manter no terrario, alimenta-se de ratos",
				 "calmo", "agitado e agressivo"};
		 int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		 StringBuilder DecisaoFinal = new StringBuilder();
		 for (int i = 0; i < 12; i++) {
			  if (decisao == numeros[i]) {
				   DecisaoFinal.append("  [" +numeros[i]+ "] || " + nomesList[i]+" || "+racasList[i]+" || "+ idadesList[i]+" ||   "+vacinadoList[i]+"   ||   "+adotadoList[i]);
				   if (i < 12 - 1) {
						DecisaoFinal.append("\n");
				   }
			  }
		 }
		 return "                      - PET Escolhido para Adoçao - \n"+DecisaoFinal;
	}
	public static String showWaitList(int listaDeEspera,String []tipos,  String []dadosPessoais){
		 StringBuilder imprimeListaDeEspera= new StringBuilder();
		 
			  for (int i = 0; i < 5; i++) {
				   imprimeListaDeEspera.append("["+listaDeEspera +"] - \n"+ tipos[i] + " - " + dadosPessoais[i] + "\n");
			  }
			  
		 
		 return "Lista de Espera \n"+ imprimeListaDeEspera;
	}
}
