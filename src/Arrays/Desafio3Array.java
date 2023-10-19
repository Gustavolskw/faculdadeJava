package Arrays;

import javax.swing.*;
import java.util.jar.JarOutputStream;

/*DESAFIO 3
Uma turma do curso de programação da escola X é formada por 30 alunos. Faça um
programa que leia as notas de cada aluno em uma avaliação e armazene-as em um
vetor. O programa deve calcular e imprimir a média da turma e a quantidade de alunos
que ficaram acima da média.*/
public class Desafio3Array {
	 
	 public static void main(String[] args ){
		  float notas[] = new float[30];
		  float media, totalNotas= 0;
		  int acimaDaMedia = 0;
		  
		  for(int i = 0; i <30; i++){
			   do{
			   notas[i] = Float.parseFloat(JOptionPane.showInputDialog(null,
					   "Nota do "+(i+1)+ "º Aluno", "Notas", -1 ));
			   }while(notas[i]<0 || notas[i]>10);
			   if(notas[i] > 7 ){
					acimaDaMedia++;
			   }
		  }
		  for(int k = 0; k <30; k++){
			   totalNotas += notas[k];
		  }
			media = totalNotas / 30;
	JOptionPane.showMessageDialog(null, "Media da sala - "+media
			+"\n Quantidade de alunos que ficaram acima da média - "+acimaDaMedia, "Mensagem final", -1);
	 }
}
