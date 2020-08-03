/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class validar {
  public void V(JTextField field) {
        int not1;
        not1 = Integer.parseInt(field.getText());
        if (not1 < 0 || not1 == 0) {
            JOptionPane.showMessageDialog(null, "Invalido");
            field.setText("");
        } 
    }   
}
