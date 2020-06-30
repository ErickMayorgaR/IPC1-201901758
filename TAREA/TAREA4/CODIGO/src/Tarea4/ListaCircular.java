/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea4;

import java.util.HashSet;
import java.util.Set;

public class ListaCircular {

    NodoCircular primer;
    NodoCircular ultimo;

    public ListaCircular() {

    }

    public void insertar(String id, String valor) {
        NodoCircular nuevo = new NodoCircular(id, valor);
        if (this.getPrimer() == null) {

            primer = nuevo;
            ultimo = primer;
            primer.setSiguiente(nuevo);
        } else {

            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(primer);
            ultimo = nuevo;

        }

    }

    public void imprimirLista() {

        NodoCircular actual = primer;
        do {
            System.out.println(actual.getId() + "," + actual.getValor());
            actual = actual.getSiguiente();

        } while (actual != primer);

    }

    public String generagraph() {
        String texto = null;
        texto = "digraph G{" + "\n";
        NodoCircular actual = primer;
        do {

            texto += actual.getId() + "[label=" + "\"" + actual.getValor() + "\"" + "]" + "\n";
            actual = actual.getSiguiente();

        } while (actual != primer);
        do {

            texto += actual.getId() + "->" + actual.getSiguiente().getId() + ";" + "\n";
            actual = actual.getSiguiente();

        } while (actual != primer);

        texto += " }";

        return texto;
    }

    public void cambiarNodo(String id, String valor) {
        
        if (this.primer == null) {
            System.out.println("No hay nada en la lista");
        } else {
            
            NodoCircular temp = primer;
            do {
                if (temp.getSiguiente() != null) {

                    if (temp.getSiguiente().getId().equals(id)) {
                        temp.getSiguiente().setValor(valor);
                        return;
                    }else{
                        temp=temp.getSiguiente();
                    }
                }

            } while (temp != null);
            System.out.println("No existe");
        }
    }

    public NodoCircular getPrimer() {
        return primer;
    }

    public void setPrimer(NodoCircular primer) {
        this.primer = primer;
    }
}
