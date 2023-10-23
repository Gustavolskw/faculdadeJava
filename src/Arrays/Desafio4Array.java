package Arrays;



import javax.swing.*;

/*DESAFIO 4
		Faça um programa que leia 5 números inteiros digitados pelo usuário e armazene-os
		em um vetor. Em seguida, o programa deve ordenar os números em ordem crescente
		e imprimir o vetor ordenado.
*/
public class Desafio4Array {
	 public static void main(String[] args ) {
		  int array[]= new int[5] ;
		  int aux = 0;
		  int  arrayPrint= 0;
		  for (int i = 0; i < 5; i++) {
			   String[] nomes = new String[] {"John", "Mary", "Bob"};
			   
			   
			   array[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
					   "Digite o " + (i + 1) + "º Valor ", "Valores", -1));
			   
			   
		  }
		  for (int j = 0; j < 5; j++) {
			   for (int k = 0; k < 4; k++) {
					if (array[k] > array[k + 1]) {
						 aux = array[k];
						 array[k] = array[k + 1];
						 array[k + 1] = aux;
					}
			   }
		  }
		  
		  StringBuilder arrayString = new StringBuilder();
		  for (int i = 0; i < array.length; i++) {
			   arrayString.append(array[i]);
			   if (i < array.length - 1) {
					arrayString.append("]\n[");
			   }
		  }
		  
		  
		  JOptionPane.showMessageDialog(null,"["+arrayString+"]", "Array Organizada em ordem crescente", -1 );
		  
		  
		  
		  
	 }
}

