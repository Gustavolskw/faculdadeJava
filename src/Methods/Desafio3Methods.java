package Methods;

import javax.swing.*;
import java.text.ParseException;

/*DESAFIO 3
Primeiramente, peça uma medida em metros ao usuário. Depois pergunte para qual
unidade de medida ele deseja converter: centímetros, polegadas, pés ou quilômetros.
Ao final, apresente o valor da conversão.


 */
public class Desafio3Methods {
	 public static void main(String[] args) {
		  int numero;
		  Object escolha;
		  numero = requestNumber();
		  
		  escolha=escolhaConversao();
		  
		  resultadoDaConversao(numero, escolha);
	 }
	 public static int requestNumber(){
		  int number;
		  return number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o a medida em metros que voce deseja converter: ", "Medida", JOptionPane.QUESTION_MESSAGE));
	 }
	 public static Object escolhaConversao(){
		  Object[]conversao = {"centímetros", "polegadas", "pés", "quilômetros"};
		  
		  Object escolha =JOptionPane.showOptionDialog(null, "Escolha Para qual Unidade de Medida será convertido o seu valor em Metros",
				  "Conversao", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, conversao, conversao[1]);
		  return escolha;
	 }
	 public static void  resultadoDaConversao(int numero, Object escolha){
		 double valorConvertido;
		  if(escolha.equals(0)){
			  valorConvertido = (double) numero *100;
			   JOptionPane.showMessageDialog(null, "Metros - "+ numero+"\n"+ "Centimetros - " +valorConvertido, "Conversão", -1);
			   
		  }else if (escolha.equals(1)){
			   valorConvertido = (double) numero*39.37;
			   JOptionPane.showMessageDialog(null, "Metros - "+ numero+"\n"+ "Polegadas - " +valorConvertido, "Conversão", -1);
			   
		  }else if (escolha.equals(2)){
			   valorConvertido = (double) numero*3.281;
			   JOptionPane.showMessageDialog(null, "Metros - "+ numero+"\n"+ "Pés - " +valorConvertido, "Conversão", -1);
			   
		  }else{
			   valorConvertido = (double) numero/ 1000;
			   JOptionPane.showMessageDialog(null, "Metros - "+ numero+"\n"+ "Quilometro - " +valorConvertido, "Conversão", -1);
			   
		  }
		  
	 }
}
