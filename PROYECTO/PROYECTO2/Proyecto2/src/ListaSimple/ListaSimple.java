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

    public NodoLS primerNodo;

    public void insertarNodo(NodoLS aux) {
        if (this.primerNodo == null) {
            this.primerNodo = aux;
        } else {
            NodoLS temp = primerNodo;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(aux);

        }

    }

    public void eliminarNodo(String valor, String color) {
        if (this.primerNodo == null) {
            System.out.println("No hay nada en la lista");
        } else {
            NodoLS temp = primerNodo;
            while (temp != null) {
                if (temp.getSiguiente() != null) {
                    if (temp.getSiguiente().getValor() == valor && color == temp.getSiguiente().getColor()) {
                        System.out.println("Te encontre");
                        NodoLS tempSiguiente = temp.getSiguiente();
                        temp.setSiguiente(tempSiguiente.getSiguiente());

                        tempSiguiente.setSiguiente(null);
                        return;

                    }
                }
                temp = temp.getSiguiente();
            }
            System.out.println("No existe");
        }
    }
    
     public void imprimirLista() {       

        
        NodoLS actual = primerNodo;    
          while (actual != null) {
            
            System.out.println(actual.getFila()+","+actual.getColumna()+","+actual.getValor()+","+actual.getColor());            
            actual = actual.siguiente;
            
        }
     }
     
      
    
    
}
