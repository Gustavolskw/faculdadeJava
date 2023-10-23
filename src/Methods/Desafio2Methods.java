package Methods;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

/*DESAFIO 2
Construa um programa que solicite ao usuário apenas os números de seu telefone.
(ex.: 47987654321). Em seguida, por meio de um método, você construirá uma
máscara para esse número (ex.: (47) 98765-4321).


 */
public class Desafio2Methods {
	 
	 public static void main(String[] args){
		  
		  
		  try{
			   MaskFormatter mascara = new MaskFormatter("(##) #####-####");
			   JFormattedTextField  telephone  = requestTelephone(mascara);
			   
			   String telefone = telephone.getText();
			   JOptionPane.showMessageDialog(null, "Telefone informado: " + telefone);
			   
		  }catch(ParseException e )	{
			   e.printStackTrace();
		  }
	 }
	 public static JFormattedTextField requestTelephone(MaskFormatter mascara){
		  
		  
		  
		  JFormattedTextField telefoneField = new JFormattedTextField(mascara);
		  telefoneField.setFocusLostBehavior(JFormattedTextField.PERSIST);
		  
		  int option = JOptionPane.showConfirmDialog(null, telefoneField, "Informe o Telefone",
				  JOptionPane.DEFAULT_OPTION);
		  
		  
		  
		  
		  
		  return telefoneField;
		  
		  
	 }
}

