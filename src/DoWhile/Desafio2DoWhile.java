package DoWhile;
/*DESAFIO 2
Você deverá desenvolver um algoritmo que solicite a idade, o gênero e o salário de
um grupo de pessoas. Para encerrar o programa, o usuário deve digitar "Finalizar".
Certifique-se de validar para que o usuário digite exatamente "Finalizar". Ao término
da execução do programa, será apresentado ao usuário as seguintes informações:
● A média de idade geral;
● A média de idade de pessoas do gênero feminino;
● A média de idade de pessoas do gênero masculino;
● A média salarial geral;
● A média salarial do gênero feminino;
● A média salarial do gênero masculino.
● O maior salário;
● O menor salário.
 */

import javax.swing.*;

public class Desafio2DoWhile {
    public static void main(String[] args){
	float salario, salarioTotal=0, salarioFem = 0, salarioMasc = 0;
	int idade, idadeTotal = 0, idadeFem = 0, idadeMas = 0;
	int  genero;
	int cont= 0, contFem = 0 , contMas = 0;
	boolean continua = true;
	float maiorSalario= 0, menorSalario = 0;


	do{
	    idade = requesitaIdade();
	    genero = requesitaGenero();
	    salario = requesitaSalario();
	    salarioTotal += salario;
	    idadeTotal += idade;
	    if(genero== 0){
		salarioMasc += salario;
		idadeMas+=idade;
		contMas++;
	    } else if (genero == 1) {
		salarioFem+=salario;
		idadeFem+=idade;
		contFem ++;	
	    }
	    if(cont == 0) {
		maiorSalario = salario;
		menorSalario = salario;
	    }
	    if(salario > maiorSalario) {
		maiorSalario = salario;
	    }else if (salario < menorSalario) {
		menorSalario=salario;
	    }


	    Object[]  sairOuNao = {"Sim", "Não"};
	    Object escolha = JOptionPane.showOptionDialog(null,"Deseja Preencher mais um fichario","Continuar",
		    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
		    null, sairOuNao, sairOuNao[1]);
	    if(escolha.equals(0)){
		continua = true;
	    }else if(escolha.equals(1)){
		continua = false;	
	    }


	    cont++;
	}while(continua);
	int mediaIdadeGer = idadeTotal / cont;
	int mediaIdadeFem = idadeFem / contFem;
	int mediaIdadeMasc = idadeMas / contMas;
	float mediaSalarioGer = salarioTotal / cont;
	float mediaSalarioFem = salarioFem / contFem;
	float mediaSalarioMasc = salarioMasc / contMas;

	showResults(mediaIdadeGer, mediaIdadeFem, mediaIdadeMasc, mediaSalarioGer, mediaSalarioFem, mediaSalarioMasc, maiorSalario, menorSalario);



    }
    public static float requesitaSalario(){
	float soldo;

	soldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu Salario mensal: ", "<Salario>", -1));



	return soldo;
    }
    public static int requesitaGenero(){
	String[] options = {"Masculino", "Feminino"};
	int genero = JOptionPane.showOptionDialog(null, "Escolha seu Genero: ","<Genero>",
		JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,  options, options[1]);
	return genero;
    }
    public static int requesitaIdade() {

	int idadeRet;

	idadeRet = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: ", "<Idade>", -1));

	return idadeRet;

    }

    public static void showResults(int mediaIdadeGer, int mediaIdadeFem, int mediaIdadeMasc, float mediaSalarioGer, float mediaSalarioFem, float mediaSalarioMasc, float maiorSalario, float menorSalario) {
	JOptionPane.showMessageDialog(null, "Média de idade Geral - " + mediaIdadeGer+ "\nMedia de Idade Feminina - "+
		mediaIdadeFem+ "\nMedia de Idade Masculina - "+mediaIdadeMasc+"\nMedia de Salario Geral - R$"+ mediaSalarioGer+
		"\nMedia Salario Feminina - R$"+mediaSalarioFem+"\nMedia Salario Masculina - R$"+mediaSalarioMasc+"\nMaior Salario - R$"+maiorSalario+"\nMenor Salario - R$"+menorSalario
		,"Tabela de Dados dos Usuários", -1);
    }

}
