package DesafioFinal;

import javax.swing.*;

public class DesafioFinal {
	 
	 public static void main(String[] args) {
		  boolean continuar = true;
		  int notaTesteSocial = 0;
		  Object[] simOuNao = {"SIM", "NÃO"};
		  String []tipos = {"Nome Completo", "Idade", "Endereço", "CPF", "Motivo para adoção"};
		  Object []listas = {"Todos os animais ", "Lista Disponiveis adoção ","Lista por Raça ","Lista por Idade ","Lista de Vacinaçao", "Lista de Comportamento"};
		  String []dadosPessoais = new String[5];
		  
		  do {
			   // realiza a coleta dos dados pessoais
			   for (int i = 0; i < 5; i++) {
					dadosPessoais[i] = preencheDados(i, tipos);
			   }
			   // realiza a impresaao dos dados pessoais
			   imprimeDados(tipos, dadosPessoais);
			   // pergunta se deseja fazer ou nao o processo seletivo
			   Object escolha = JOptionPane.showOptionDialog(null, "Deseja Realizar o teste Social para da continuidade no proceso de adoção\n caso(NÃO) encerrará o porcesso.", "Teste Social", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
			   
			   if (escolha.equals(0)) {
					// realiza o teste Social e retorna a nota para a avalizaçao
					notaTesteSocial = testeSocial(simOuNao);
			   } else {
					continuar = false;
			   }
			   // calculo da nota do Teste Social - se aprovado continua, se reprovado termina o processo
			   if (notaTesteSocial >= -5) {
					JOptionPane.showMessageDialog(null, "Aprovado!", "Resultado Teste Social", JOptionPane.INFORMATION_MESSAGE);
			   } else {
					JOptionPane.showMessageDialog(null, "Reprovado!", "Resultado Teste Social", JOptionPane.ERROR_MESSAGE);
					continuar = false;
			   }
			   // perguntar se Deseja cadastrar um animal.
			   Object cadastroAnimal = JOptionPane.showOptionDialog(null, "Deseja Realizar o teste Social para da continuidade no proceso de adoção\n caso(NÃO) encerrará o porcesso.", "Teste Social", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
			   if (cadastroAnimal.equals(0)) {
					
					String raca = JOptionPane.showInputDialog(null, "Raça do Animal", "Cadastro Animal", JOptionPane.PLAIN_MESSAGE);
					int IdadeAnimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Raça do Animal", "Cadastro Animal", -1));
					String Comportamento = JOptionPane.showInputDialog(null, "Comportamento do Animal", "Cadastro Animal", JOptionPane.PLAIN_MESSAGE);
					Object vacinaçao = JOptionPane.showOptionDialog(null, "Animal é vacinado ", "Cadastro Animal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
					if (vacinaçao.equals(0)) {
						 String vacinado = "Sim";
					}
			   }
			   //Perguntar se há o desejo de adotar um animal.
			   Object adotarOuNao = JOptionPane.showOptionDialog(null, "Deseja Adotar um Animal?", "Adotar ? ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
			   if (adotarOuNao.equals(1)) {
					continuar = false;
			   }
			   
			   // Mostrar a lista e perguntar se ja decidiu sobre adotar um animal.
			   boolean adotar = false;
			   do {
					Object escolhaLista = JOptionPane.showOptionDialog(null, "Escolha Dentre a Listas a seguir", "Escolha de Lista", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, listas, listas[1]);
					
					
					Object decidido = JOptionPane.showOptionDialog(null, "Decidiu qual animal adotar? ", "Decisão.", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simOuNao, simOuNao[1]);
					if (decidido.equals(0)) {
						 adotar = true;
					}
			   } while (!adotar);
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
		  }while(continuar);
		  JOptionPane.showMessageDialog(null, "Fim Do Proceso Seletivo!","Fim do Processo de adoção", JOptionPane.PLAIN_MESSAGE);
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
	 
}
