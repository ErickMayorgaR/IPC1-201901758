/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea4;

/**
 *
 * @author Erick Mayorga
 */
public class NodoCircular {

    String id;
    String valor;
    NodoCircular siguiente;

    public NodoCircular(String id, String valor) {
        this.id = id;
        this.valor = valor;
        this.siguiente = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NodoCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }

}
