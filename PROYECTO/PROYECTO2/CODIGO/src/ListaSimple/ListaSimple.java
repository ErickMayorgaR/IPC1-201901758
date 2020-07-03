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
public class ListaSimple {

    public NodoLSData primerNodo;
    int contador = 0;

    public void insertarNodo(NodoLSData aux) {
        contador++;
        if (this.primerNodo == null) {
            this.primerNodo = aux;
            aux.setId(contador);

        } else {
            NodoLSData temp = primerNodo;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            aux.setId(contador);
            temp.setSiguiente(aux);

        }

    }

    public void eliminarNodo(String valor) {
        if (this.primerNodo == null) {
            System.out.println("No hay nada en la lista");
        } else {
            
            NodoLSData temp = primerNodo;

            while (temp != null) {  
                if (temp.getValor().equalsIgnoreCase(valor)) {
                    primerNodo = temp.getSiguiente();
                } else {
                    if (temp.getSiguiente() != null) {
                        if (temp.getSiguiente().getValor().equals(valor)) {

                            System.out.println("Te encontre");
                            NodoLSData tempSiguiente = temp.getSiguiente();
                            temp.setSiguiente(tempSiguiente.getSiguiente());
                            tempSiguiente.setSiguiente(null);
                            return;

                        }
                    }
                }
                temp = temp.getSiguiente();
            }
            System.out.println("No existe");
        }
    }

    public void imprimirLista() {

        NodoLSData actual = primerNodo;
        while (actual != null) {

            System.out.println(actual.getValor() + "," + actual.getColor());
            actual = actual.siguiente;

        }
    }

    public String generagraph() {
        String texto;
        texto = "digraph G{" + "\n";
        NodoLSData actual = primerNodo;

        while (actual != null) {

            texto += actual.getId() + "[label=" + "\"" + actual.getValor() + "," + actual.getColor() + "\"" + "]" + "\n";
            if (actual.getSiguiente() != null) {
                texto += actual.getId() + "->" + actual.getSiguiente().getId() + ";" + "\n";
            }
            actual = actual.getSiguiente();

        }

        texto += " }";

        return texto;
    }

}
