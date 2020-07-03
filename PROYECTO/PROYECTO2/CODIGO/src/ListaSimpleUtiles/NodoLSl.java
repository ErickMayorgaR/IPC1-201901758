/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimpleUtiles;

import javax.swing.JLabel;

/**
 *
 * @author Erick Mayorga
 */
public class NodoLSl {
    JLabel label;
    String valor;
    String color;
    NodoLSl siguiente;
   
    

    public NodoLSl(JLabel label, String valor, String color) {
        this.label = label;
        this.valor=valor;
        this.color=color;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public NodoLSl getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLSl siguiente) {
        this.siguiente = siguiente;
    }

   
           
    
}
