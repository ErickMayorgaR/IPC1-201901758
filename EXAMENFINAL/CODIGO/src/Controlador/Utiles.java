/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Erick Mayorga
 */
public class Utiles {
      public static JButton creaBoton(int numero) {
  
        JButton Nombre = new JButton();
        Nombre.setText(String.valueOf(numero));
        
        Nombre.setBounds(20, 20, 100, 50);
        return Nombre;
    }
    
}
