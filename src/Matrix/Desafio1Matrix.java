package Matrix;
/*
DESAFIO 1
O professor "Beico Zito" está em busca de uma solução que possa calcular a soma
de cada linha e a soma total de uma matriz 4x5. Para isso, ele precisa de um algoritmo
que possa realizar esses cálculos.
 */

import javax.swing.*;
import java.util.Random;

public class Desafio1Matrix {
    public static void main(String[] args) {
	int [][] valores = new int[4][5];
	int [] somaLinha= new int[4];
	int totalDaMatrix = 0;
	
        Random random = new Random();

        for(int i = 0; i <4 ; i++){
            for(int j = 0; j <5; j++){
              valores[i][j] = random.nextInt(11);
				somaLinha[i]+=  valores[i][j];
            }
			totalDaMatrix+= somaLinha[i];
        }
		 StringBuilder arrayString = new StringBuilder();
		 for (int i = 0; i < somaLinha.length; i++) {
			  arrayString.append(somaLinha[i]);
			  if (i < somaLinha.length - 1) {
				   arrayString.append("]\n[");
			  }
		 }
			 JOptionPane.showMessageDialog(null, "soma das linhas- \n["+arrayString+ "]\nSoma da matrix - \n"+totalDaMatrix, "Somas dentro da Matrix", -1 );
		 
		
		











    }
}
