package Methods;

import javax.swing.*;

/*DESAFIO 1
Construa um código capaz de solicitar ao usuário uma nota de 0 a 10. Se ele tirou: a
partir 7 está aprovado, entre 5 e 6 está em recuperação, abaixo de 5 está reprovado.
*/
public class Desafio1Methods {
	 
	 public static void main(String[] args) {
		  double grade;
		  
		  grade = requestGrade();
		  
		  gradeResult(grade);
		  
		  
		  
	 }
	 public static double requestGrade(){
		  double grade;
		  grade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a Sua Nota: ", "Nota do Usuario", -1 ));
		  return grade;
	 }
	 public static void gradeResult(double grade){
		  if(grade >=7){
			   JOptionPane.showMessageDialog(null, "Sua Nota Foi -  "+grade+"\n Você Esta Aprovado!", "Resultado", -1 );
		  } else if (grade<= 6 && grade>=5) {
			   JOptionPane.showMessageDialog(null, "Sua Nota Foi -  "+grade+"\n Você Esta de Recuperação!", "Resultado", -1 );
		  } else{
			   JOptionPane.showMessageDialog(null, "Sua Nota Foi -  "+grade+"\n Você Esta Reprovado!", "Resultado", -1 );
		  }
	 }
	 
}
