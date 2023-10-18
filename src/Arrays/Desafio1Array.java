package Arrays;

/*DESAFIO 1
Faça um programa que leia 10 números inteiros digitados pelo usuário e armazeneos em um vetor. 
Em seguida, calcule e imprima a média desses números e informe o 2º maior e o 3º menor número.
*/

import javax.swing.*;

public class Desafio1Array {
	 
	 public static void main(String[] args) {
		  int array[] = new int[10];
		  int sum = 0;
		  int aux = 0;
		  float media;
		  boolean igual = false;
		  
		  for (int i = 0; i < 10; i++) {
			   
			   
			   array[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
					   "Digite o " + (i + 1) + "º Valor ", "Valores", -1));
			   
			   do {
					igual = false;
					
					for (int p = 0; p < i; p++) {
						 if (array[p] == array[i]) {
							  igual = true;
							  array[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
									  "Digite o Novamente o " + (i + 1) + "º Valor ", "Valores", -1));
						 }
					}
					
					
			   } while (igual == true);
			   sum += array[i];
		  }
			   
			   for (int j = 0; j < 10; j++) {
					for (int k = 0; k < 9; k++) {
						 if (array[k] > array[k + 1]) {
							  aux = array[k];
							  array[k] = array[k + 1];
							  array[k + 1] = aux;
						 }
					}
			   }
			   
			   JOptionPane.showMessageDialog(null, "Segundo Maior - "+array[8]+"\n"
			   +"Terceiro Menor - " + array[3]+"\n"
			   +"media - "+(media = sum / 10), "Mensagem Final", -1 );
			   
			   
			   
			   
			   
			   
		  }
		  
	 }



