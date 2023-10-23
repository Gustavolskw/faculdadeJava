package Matrix;
/*DESAFIO 2
Crie duas matrizes 4x4 e compare para saber quantos elementos elas possuam que
são iguais. Apresente a quantidade e quais são esses elementos.*/

import javax.swing.*;
import java.util.Random;

public class Desafio2Matrix {
    public static void main(String[] args ){
		 int [][] valores1 = new int[4][4];
		 int [][] valores2 = new int[4][4];
		 int contIguais= 0;
		 boolean iguais = true;
		 
		 
		 Random random = new Random();
		 
		 for(int i = 0; i <4 ; i++){
			  for(int j = 0; j <4; j++) {
				   valores1[i][j] = random.nextInt(11);
				   valores2[i][j] = random.nextInt(11);
				   
				   
				   for(int k= 0; k< i; k++){
						if(valores2[k][j] == valores1[i][j]){
							 contIguais++;
 
						}
				   }
			  }
		 }
		 int [] valIguais = new int[contIguais];
		 for(int i = 0; i <4 ; i++) {
			  for (int j = 0; j < 4; j++) {
				   for (int k = 0; k < i; k++) {
						if (valores2[k][j] == valores1[i][j]) {
							 valIguais[k] += valores1[i][j];
							 
						}
				   }
			  }
		 }
			  StringBuilder arrayString = new StringBuilder();
			  for (int i = 0; i < valIguais.length; i++) {
				   arrayString.append(valIguais[i]);
				   if (i < valIguais.length - 1) {
						arrayString.append("]\n[");
				   }
			  }
	
		 JOptionPane.showMessageDialog(null, "Qauntidade de valores iguais "+contIguais+ "\nValores Iguais - \n["+arrayString+"]", "", -1 );
		 
		 
		 
    }
}
