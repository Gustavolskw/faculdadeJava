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
		  Object genero;
		  int cont= 0, contFem = 0 , contMas = 0;
		  boolean continua = true;
		  float maiorSalario= 0, menorSalario = 0;
		  
		  
		  do{
			   genero = requesitaGenero();
			   salario = requesitaSalario();
			   salarioTotal += salario;
			   if(genero.equals(0)){
					salarioMasc += salario;
					contMas++;
			   } else if (genero.equals(1)) {
					salarioFem+=salario;
							contFem ++;
					
			   }
			   
			   
			   Object[]  sairOuNao = {"Sim", "Não"};
			   Object escolha = JOptionPane.showOptionDialog(null,"Deseja Preencher mas um fichario","Continuar",
					   JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
					   null, sairOuNao, sairOuNao[1]);
			   if(escolha.equals(0)){
					continua = true;
			   }else if(escolha.equals(1)){
					continua = false;
					
			   }
			   cont++;
		  }while(continua);
		  JOptionPane.showMessageDialog(null, "Salário Total: R$" + salarioTotal+ "\nSalário Feminino: R$"+
				  salarioFem+ "\nSalário Masculino: R$"+salarioMasc, "Teste", -1);
		  
	 }
	 public static float requesitaSalario(){
		  float soldo;
		  
		  soldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu Salario mensal: ", "<Salario>", -1));
		  
		  
		  
		  return soldo;
	 }
	 public static Object requesitaGenero(){
		  Object[] options = {"Masculino", "Feminino"};
		  Object genero = JOptionPane.showOptionDialog(null, "Escolha seu Genero: ","<Genero>",
				  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,  options, options[1]);
		  return genero;
	 }

}
