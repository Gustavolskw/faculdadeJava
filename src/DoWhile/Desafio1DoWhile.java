package DoWhile;

import javax.swing.*;

/*DESAFIO 1
Criar um programa que solicita ao usuário dois números e, em seguida, pergunta qual
é o resultado da multiplicação desses dois números. Enquanto o usuário não acertar
a resposta, o programa deve informar que ele está errado e pedir para tentar
novamente. Quando o usuário acertar, o programa deve informar que o número está
correto e mostrar quantas vezes o usuário tentou até acertar.
*/
public class Desafio1DoWhile {
	 public static void main(String[] args){
		  int num[] = new int[2];
		  int total=0;
		  int palpite=0;
		  int cont=0;
		  
		  for(int i=0; i <2; i++){
			   num[i] = solicitaValor(i);
		  }
		  for(int i=0; i <2; i++){
			  total+=num[i];
		  }
		  do {
			   palpite = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o resultado da soma entre os dois valors escritos anterioemente\n"+num[0]+" + "+num[1], "SOMA", JOptionPane.QUESTION_MESSAGE));
			   if(palpite!=total){
					JOptionPane.showMessageDialog(null, "O Valor informado nao confere com o resultado da operação.", "Erro", JOptionPane.ERROR_MESSAGE);
			   }
			   if(palpite==total){
					JOptionPane.showMessageDialog(null, "Parabens!!! O Valor informado Esta correto!!!.", "Acertou", JOptionPane.PLAIN_MESSAGE);
			   }
			   
			 cont++;
		  }while(palpite!=total);
		JOptionPane.showMessageDialog(null,"Resultado = "+ total+ "\nQuantidade de tentativas = "+cont, "FIM!", -1);
	 }
	 public static int solicitaValor(int order ){
		  int valores;
				  
				  valores = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do "+(order+1)+"º valor ", "Requesição", JOptionPane.QUESTION_MESSAGE));
			  
		return valores;
	 }
}
