/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimple;

/**
 *
 * @author Erick Mayorga
 */
public class NodoLSData {
    NodoLSData siguiente;
    
    
    String valor;
    String color;
int id;
    public NodoLSData( String valor, String color) {
       
        this.valor = valor;
        this.color = color;
   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodoLSData getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLSData siguiente) {
        this.siguiente = siguiente;
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
    
    
    
}
