package Testes;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.text.ParseException;

public class mascaraTelefone {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                MaskFormatter mascara = new MaskFormatter("(##) #####-####");
                JFormattedTextField telefoneField = new JFormattedTextField(mascara);
                telefoneField.setFocusLostBehavior(JFormattedTextField.PERSIST);

                int option = JOptionPane.showConfirmDialog(null, telefoneField, "Informe o Telefone",
                        JOptionPane.OK_CANCEL_OPTION);

                if (option == JOptionPane.OK_OPTION) {
                    String telefone = telefoneField.getText();
                    JOptionPane.showMessageDialog(null, "Telefone informado: " + telefone);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        });
    }
}
