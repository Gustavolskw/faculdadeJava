package DoWhile;

import javax.swing.JOptionPane;

/*DESAFIO 4
Foi conduzida uma pesquisa com "N" indivíduos sobre suas opiniões em relação à 
pré-estreia de um filme. Os dados coletados incluíram sexo, idade e uma nota de 0 a 
10 referente à opinião sobre o filme. As perguntas foram feitas repetidamente até que 
todas as pessoas disponíveis tivessem respondido.
Com base nos resultados da pesquisa, podemos calcular e apresentar as seguintes 
informações:

● A média de idade das pessoas que responderam ao questionário;

● Lista de pessoas que deram nota igual a 10;

● A quantidade de homens cujas opiniões sobre o filme foram inferiores a 5;

● A quantidade de mulheres cujas opiniões sobre o filme foram inferiores a 5;

● A quantidade de homens cujas opiniões sobre o filme foram superiores a 7;

● A quantidade de mulheres cujas opiniões sobre o filme foram superiores a 7;

● Média das notas informadas.

Essas informações podem ajudar a compreender melhor a recepção do público em 
relação ao filme e a orientar decisões futuras da equipe responsável pela sua 
promoção.
Obs.: não esqueça de validar se a nota está entre 0 e 10

 */

public class Desafio4DoWhile {

    public static void main(String[] args) {
	int cont = 0, contManTop7 = 0, contManSub5=0;
	int contWomTop7 = 0, contWomSub5=0;
	float nota = 0, notaTotal = 0; 
	float mediaNota, mediaIdade;
	int idade, idadeTotal=0, contNota10Man = 0, contNota10Wom = 0;
	boolean continuar = true;
	Object genero;

	JOptionPane.showInternalMessageDialog(null, "Bem Vindo ao Software de pesquisa de opiniões sobre a pré estreia de uma filme ", "Bem Vindo!", -1);

	do {
	    idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Sua Idade: ", "Idade", -1));
	    genero = requesitaGenero();
	    do {
		 nota = requesitaNota();
	    }while(nota>10 || nota<0);
	   
	    idadeTotal+=idade;
	    notaTotal += nota;
	    
	    
	    if(genero.equals(0)){
		//Masculino
	    if(nota == 10) {
		contNota10Man++;
	    }else if(nota>7) {
		contManTop7++;
	    }else {
		contManSub5++;
	    }
		
	    } else if (genero.equals(1)) {
		//Feminino
		 if(nota == 10) {
			contNota10Wom++;
		    }else if(nota>7) {
			contWomTop7++;
		    }else {
			contWomSub5++;
		    }	
	    }
	    Object[]  sairOuNao = {"Sim", "Não"};
	    Object escolha = JOptionPane.showOptionDialog(null,"Deseja Preencher mais uma Pesquisa? ","Continuar",
		    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
		    null, sairOuNao, sairOuNao[1]);
	    if(escolha.equals(0)){
		continuar = true;
	    }else if(escolha.equals(1)){
		continuar = false;	
	    }

	    cont++;
	}while(continuar);
	 mediaNota = notaTotal / cont;
	 mediaIdade = idadeTotal / cont;
	 
	 JOptionPane.showMessageDialog(null, "Media De Idade das pessoas Participantes do Questionario - "+mediaIdade+
		 "\nA quantidade de homens cujas opiniões sobre o filme foram inferiores a 5 - "+contManSub5+
		 "\nA quantidade de mulheres cujas opiniões sobre o filme foram inferiores a 5 - "+contWomSub5+
		 "\nA quantidade de homens cujas opiniões sobre o filme foram superiores a 7 - "+contManTop7+
		 "\nA quantidade de mulheres cujas opiniões sobre o filme foram superiores a 7 - "+contWomTop7+
		 "\nMédia das notas informadas - " +mediaNota,
		 "Conclusão",-1);
	 
	 
	 JOptionPane.showMessageDialog(null,"Lista de pessoas que deram nota igual a 10"+"\nHomens - "+contNota10Man+"\nMulheres - "+contNota10Wom, "Notas 10", -1);
	 
	 
	 
	 
	 
	 
    }
    public static float requesitaNota() {
	float nota;

	nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Nota para o Filme: ", "Nota", -1 ));
	return nota;
    }
    public static Object requesitaGenero(){
	Object[] options = {"Masculino", "Feminino"};
	Object genero = JOptionPane.showOptionDialog(null, "Escolha seu Genero: ","<Genero>",
		JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,  options, options[1]);
	return genero;
    }

}
