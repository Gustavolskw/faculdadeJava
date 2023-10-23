package Matrix;

import javax.swing.*;
import java.util.Random;

/*DESAFIO 4
Desenvolva um programa em Java que leia uma matriz de dimensões 4x4 e exiba o
resto da divisão de cada elemento da diagonal principal. Além disso, apresente
também produto total da diagonal secundária da matriz.

 */
public class Desafio4Matrix {
    public static void main(String[] args ){
		int [][] matrix = new int [4][4];
		 int []divMatrix = new int [4];
		 int diagonalSecundaria = 0;
		 Random random = new Random();
		 
		 for(int i = 0; i <4 ; i++) {
			  for (int j = 0; j < 4; j++) {
				   
				   matrix[i][j] = random.nextInt(55);
			  }
		 }
		 for(int i = 0; i <4 ; i++) {
			  
				   
				 divMatrix[i] = matrix[i][i] % 2;
			  
		 }
		 for(int i = 0; i <4 ; i++) {
			  
				   diagonalSecundaria += matrix[i][4 - 1 - i];
				   
			  }
			  StringBuilder matrixCompleta = new StringBuilder();
			  for (int i = 0; i < 4; i++) {
				   for (int j = 0; j < 4; j++) {
						matrixCompleta.append("[" + matrix[i][j] + "]");
						if (i < 3 - 1 || j < 2 - 1) {
							 matrixCompleta.append("");
						}
						
				   }
				   matrixCompleta.append("\n");
			  }
			  StringBuilder divMatrixString = new StringBuilder();
			  for(int i = 0; i <4; i++){
				   divMatrixString.append("[" + divMatrix[i] + "]");
				   if (i <4 - 1 ) {
						divMatrixString.append("");
				   }
				   divMatrixString.append("\n");
			  }
			  
			  
			  JOptionPane.showMessageDialog(null, "Matriz \n" + matrixCompleta +"Resultado da divisao dos números da diagonal Principal\n"+divMatrixString+ "\nProduto da Diagonal Secundaria - " +
														  diagonalSecundaria, "", -1);
			  
			  
	}
}

