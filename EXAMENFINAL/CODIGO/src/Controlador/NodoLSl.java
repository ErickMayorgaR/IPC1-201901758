/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Erick Mayorga
 */
public class NodoLSl {
    JButton button;
 NodoLSl siguiente;
    public NodoLSl(JButton button) {
        this.button = button;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public NodoLSl getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLSl siguiente) {
        this.siguiente = siguiente;
    }

  

}

