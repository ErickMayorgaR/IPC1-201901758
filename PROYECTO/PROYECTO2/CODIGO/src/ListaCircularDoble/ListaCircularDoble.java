/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCircularDoble;

import java.util.HashSet;

/**
 *
 * @author Erick Mayorga
 */
public class ListaCircularDoble {

    NodoCircularDoble cabeza;
    int contador;

    public ListaCircularDoble() {
        this.cabeza = null;
    }

    public void insertar(String valor) {
        NodoCircularDoble nuevo = new NodoCircularDoble(valor);

        if (this.getCabeza() != null) {
            contador++;
            nuevo.setId(contador);

            nuevo.setSiguiente(this.getCabeza().getSiguiente());

            nuevo.setAnterior(this.getCabeza());
            nuevo.getSiguiente().setAnterior(nuevo);
            this.getCabeza().setSiguiente(nuevo);

        } else {
            contador++;
            nuevo.setId(contador);
            this.setCabeza(nuevo);
            this.getCabeza().setSiguiente(nuevo);
            this.getCabeza().setAnterior(nuevo);

            this.getCabeza().getSiguiente().setAnterior(nuevo);
        }
    }

    public String generagraph() {
        String texto;
        texto = "digraph G{" + "\n";
        NodoCircularDoble actual = cabeza;

        if (actual != null) {
            do {
                if (actual.getAnterior()==actual) {
                    texto += actual.getId() + "[label=" + "\"" + actual.getValor() + ",ROJO" + "\"" + "]" + "\n";
                   break;
                    

                } else if (actual.getAnterior().getAnterior() == actual) {
                    texto += actual.getId() + "[label=" + "\"" + actual.getValor() + ",ROJO" + "\"" + "]" + "\n";
                    texto += actual.getId() + "->" + actual.getAnterior().getId() + ";" + "\n";
                    texto +=actual.getSiguiente().getId()  + "->" +  actual.getId()+ ";" + "\n";
                    actual = actual.getAnterior();
                    texto += actual.getId() + "[label=" + "\"" + actual.getValor() + ",ROJO" + "\"" + "]" + "\n";

                    break;

                } else {
                    texto += actual.getId() + "[label=" + "\"" + actual.getValor() + ",ROJO" + "\"" + "]" + "\n";
                    texto += actual.getId() + "->" + actual.getAnterior().getId() + ";" + "\n";
                    texto += actual.getId() + "->" + actual.getSiguiente().getId() + ";" + "\n";
                    actual = actual.getAnterior();
                }
            } while (actual != cabeza);
        }

        texto += " }";

        return texto;
    }

    public void eliminarNodo(String valor) {
        if (this.cabeza == null) {
            System.out.println("No hay nada en la lista");
        } else {
            NodoCircularDoble temp = cabeza;
            while (temp != null) {

                if (temp.getValor().equals(valor)) {
                    NodoCircularDoble tempaux = temp.getSiguiente();
                    cabeza = temp.getAnterior();
                    cabeza.setSiguiente(tempaux);
                    tempaux.setAnterior(cabeza);

                    return;
                } else {
                    if (temp.getSiguiente() != null) {
                        if (temp.getSiguiente().getValor().equals(valor)) {
                            System.out.println("Te encontre");
                            NodoCircularDoble tempSiguiente = temp.getSiguiente();

                            temp.setSiguiente(tempSiguiente.getSiguiente());

                            temp.getSiguiente().setAnterior(temp);

                            tempSiguiente.setSiguiente(null);
                            tempSiguiente.setAnterior(null);

                            return;

                        }
                    }
                    temp = temp.getSiguiente();
                }
            }
            System.out.println("No existe");
        }
    }

    public void imprimirLista() {

        NodoCircularDoble actual = cabeza;
        do {
            System.out.println("---------------");
            System.out.println("Nombre: " + actual);
            actual = actual.getSiguiente();
            System.out.println("---------------");
        } while (actual != cabeza);

    }

    public NodoCircularDoble getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCircularDoble cabeza) {
        this.cabeza = cabeza;
    }

}
