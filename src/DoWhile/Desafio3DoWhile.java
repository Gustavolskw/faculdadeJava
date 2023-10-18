package DoWhile;

import javax.swing.JOptionPane;

/*DESAFIO 3
A prefeitura de "Araquachussets" planeja conduzir uma pesquisa entre seus cidadãos, 
a fim de coletar informações sobre seus nomes, idades, salários e número de filhos. 
Para alcançar esse objetivo, sugiro a criação de um formulário online, que possa ser 
preenchido pelos moradores da cidade.
Uma vez que a pesquisa tenha sido concluída, podemos utilizar os dados coletados 
para gerar algumas informações estatísticas relevantes, tais como:

● A média de salário da população, que pode ser calculada dividindo-se a soma 
de todos os salários pelo número total de respondentes.

● A média do número de filhos, que pode ser calculada dividindo-se a soma de 
todos os filhos pelo número total de respondentes.

● O maior salário entre os habitantes, que pode ser idesntificado através da 
comparação dos salários individuais.

● Uma lista com os nomes das pessoas cujo salário é inferior a R$ 1000,00. Essa 
lista pode ser gerada filtrando-se os respondentes cujo salário é menor que 
esse valor e extraindo seus nomes.

● A média de idade da população, que pode ser calculada da mesma forma que 
a média de salário e a média de número de filhos.

Com essas informações em mãos, a prefeitura de "Araquachussets" poderá ter uma 
melhor compreensão da situação econômica e demográfica de sua cidade, o que pode 
ajudá-la a planejar políticas públicas mais eficazes.

*/

public class Desafio3DoWhile {

    public static void main(String[] args) {
	//Definiçao de variaveis;
	String nome;
	String nomesPob= " ";
	int idade, idadeTotal=0; 
	float salario, salarioTotal=0; 
	int numFilhos, numFilhosTotais=0;
	int qtdPessoas;
	int cont=0;
	float maiorSalario =0;
	float mediaFilhos, mediaIdade, mediaSalario;
	
	//Menssagem de boas vindas; 
	JOptionPane.showMessageDialog(null,"Seja Bem Vindo a Araquachussets", "Prefeitura de Araquachussets", -1 );
	
	
	    
	    //definir um ponto de fim para o loop perguntado qauntidade de pessoas intrevistadas no momeno;
	   qtdPessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas pessoas vao ser cadastradas - ", "<Cadastro>", -1));
	   
	 //loop de preenchimento de dados;
	   do {
	       
	   //requisiçao de nome;
	   nome =  JOptionPane.showInputDialog(null,"Digite seu nome - ", "Nome", -1);
	   
	   //Requisita a idada e somar os mesmos;
	   do {
	   idade = requesitaIdade();
	   }while(idade < 0);
	   idadeTotal += idade;
	  
	   //requsita o salario e somar os mesmos;
	   do {
	   salario = requesitaSalario();
	   }while(salario < 0);
	   salarioTotal += salario;
	   //requistar numero de filhos e somar os mesmos;
	   do{
	   numFilhos = requisitaNumFilhos();
	   }while(numFilhos < 0);
	   numFilhosTotais += numFilhos;
	   //verificaçao e criaçao da lista de nomes com salario inferior a R$1000.00
	   if(salario<1000) {
	       nomesPob += nome+" - ";
	  
	   }
	   //Controle de Maior Salario;
	   if(cont == 0) {
		maiorSalario = salario;
	    }
	    if(salario > maiorSalario) {
		maiorSalario = salario;
	    }
	   cont++; 
	}while(qtdPessoas != cont);
	   
	 mediaFilhos = numFilhosTotais / cont;
	 mediaIdade = idadeTotal / cont;
	 mediaSalario = salarioTotal / cont;
  	
	 String mensagemFinal = """
                 Media de Salarios da população R$%.2f
                 Media de Salarios da população R$%.2f
                 Maior Salario entre a população R$%.2f
                 Media de Idade da população R$%.2f
                 Lista de nome das pessoas com saalrio inferior as R$1000,00 - %s
                 
                 """.formatted(mediaSalario, mediaFilhos, maiorSalario, mediaIdade, nomesPob);

       JOptionPane.showMessageDialog(null, mensagemFinal);
       
        
	 
    }
    public static int requesitaIdade() {

	int idadeRet;

	idadeRet = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: ", "<Idade>", -1));

	return idadeRet;

    }
    public static float requesitaSalario(){
	float soldo;

	soldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu Salario mensal: ", "<Salario>", -1));

	return soldo;
    }
    public static int requisitaNumFilhos(){
	int filhos;
	
	filhos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de filhos?  - ", "<Filhos>", -1 ));
	
	return filhos;
    }

}
