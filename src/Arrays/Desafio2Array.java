package Arrays;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

/*DESAFIO 2
Um professor deseja ter uma aplicação que calcule a média PONDERADA de seus
cinco alunos
durante o bimestre.
O bimestre é composto por três notas,
portanto, é
necessário criar dois vetores para armazenar cada uma das notas dos alunos. Em
seguida, outro vetor deve ser criado para armazenar o resultado da média dos alunos.
*/
public class Desafio2Array {
	 public static void main(String[] args) {
		  float primBimestre[] = new float[15];
		  float primBimestreVar[] = new float[15];
		  float mediaPonderada[] = new float[5];
		  Random random = new Random();
	
		  for (int k = 0; k < 1; k++) {
			   for (int i = 0; i < 3; i++) {
					
					do {
						
						 primBimestre[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Notas do " + (k + 1) + " Aluno ",
								 "<Notas>", -1));
					} while (primBimestre[i] < 0 || primBimestre[i] > 10);
					primBimestreVar[i] = primBimestre[i];
			   }
		  }for (int k = 1; k < 2; k++) {
			   for (int i = 3; i < 6; i++) {
					
					do {
						
						primBimestre[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Notas do " + (k + 1) + " Aluno ", "<Notas>", -1));
					} while (primBimestre[i] < 0 || primBimestre[i] > 10);
					primBimestreVar[i] = primBimestre[i];
			   }
		  }for (int k = 2; k < 3; k++) {
			   for (int i = 6; i < 9; i++) {
					
					do {
						
						primBimestre[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Notas do " + (k + 1) + " Aluno ", "<Notas>", -1));
					} while (primBimestre[i] < 0 || primBimestre[i] > 10);
					primBimestreVar[i] = primBimestre[i];
			   }
		  }for (int k = 3; k < 4; k++) {
			   for (int i = 9; i < 12; i++) {
					
					do {
						
						 primBimestre[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Notas do " + (k + 1) + " Aluno ","<Notas>", -1));
					} while (primBimestre[i] < 0 || primBimestre[i] > 10);
					primBimestreVar[i] = primBimestre[i];
			   }
		  }for (int k = 4; k <5; k++) {
			   for (int i = 12; i < 15; i++) {
					
					do {
						 primBimestre[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Notas do " + (k + 1) + " Aluno ", "<Notas>", -1));
					} while (primBimestre[i] < 0 || primBimestre[i] > 10);
					primBimestreVar[i] = primBimestre[i];
			   }
		  }
		  for(int k = 0; k <3; k++){
			   primBimestreVar[k] += primBimestre[k];
			   mediaPonderada[0] = primBimestreVar[k] / 3;
		  }for(int k = 3; k <6; k++){
			   primBimestreVar[k] += primBimestre[k];
			   mediaPonderada[1] = primBimestreVar[k] / 3;
		  }for(int k = 6; k <9; k++){
			   primBimestreVar[k] += primBimestre[k];
			   mediaPonderada[2] = primBimestreVar[k] / 3;
		  }for(int k = 9; k <12; k++){
			   primBimestreVar[k] += primBimestre[k];
			   mediaPonderada[3] = primBimestreVar[k] / 3;
		  }for(int k = 12; k <15; k++){
			   primBimestreVar[k] += primBimestre[k];
			   mediaPonderada[4] = primBimestreVar[k] / 3;
		  }
		  DecimalFormat formato = new DecimalFormat("0.00");
	
		  StringBuilder arrayString = new StringBuilder();
		  for (int i = 0; i < mediaPonderada.length; i++) {
			   arrayString.append(formato.format(mediaPonderada[i]));
			   if (i < mediaPonderada.length - 1) {
					arrayString.append("]\n[");
			   }
		  }
		  JOptionPane.showMessageDialog(null,"["+arrayString+"]", "Array Organizada em ordem crescente", -1 );
  
	 }
}




		
