package Matrix;

import javax.swing.*;
import java.util.Random;

/*
 DESAFIO 3
Crie um programa para solicitar os valores de uma matriz 3x2. Em seguida, você
deverá fazer a transposição dessa matriz.
Obs.: pesquisar o que é matriz transposta
*/
public class Desafio3Matrix {
    public static void main(String[] args ){
		int[][] matrix = new int[3][2];
		 Random random = new Random();
		for(int i =0; i<3; i++){
			 for (int j = 0; j <2; j ++){
				  matrix[i][j] = random.nextInt(101);
			 }
		}
		 StringBuilder matrixNoTransp = new StringBuilder();
		 for (int i = 0; i < 3; i++) {
			  for (int j = 0; j < 2; j++) {
				   matrixNoTransp.append("["+matrix[i][j]+"]");
				   if (i < 3 - 1 || j < 2 - 1) {
						matrixNoTransp.append("");
				   }
				   
			  }
			  matrixNoTransp.append("\n");
		 }
		 
		 
		 //Transposta
		 StringBuilder matrixTransp = new StringBuilder();
		 for (int i = 0; i < 2; i++) {
			  for (int j = 0; j < 3; j++) {
				   matrixTransp.append("["+matrix[j][i]+"]");
				   if (i < 2 - 1 || j < 3 - 1) {
						matrixTransp.append("");
				   }
			  }
			  matrixTransp.append("\n");
		 }
		 JOptionPane.showMessageDialog(null, "Não Transposta - \n"+matrixNoTransp+"\nTransposta - \n"+matrixTransp);
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
