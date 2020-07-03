/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCircularDoble;

/**
 *
 * @author Erick Mayorga
 */
public class NodoCircularDoble {
    String valor;
    int id;
    NodoCircularDoble siguiente;
    NodoCircularDoble anterior;

    public NodoCircularDoble(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodoCircularDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCircularDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCircularDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCircularDoble anterior) {
        this.anterior = anterior;
    }
    
    
            
    
}
