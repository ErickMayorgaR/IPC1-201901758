/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimpleUtiles;

/**
 *
 * @author Erick Mayorga
 */
public class ListaSimpleL {
     
    public NodoLSl primerNodo;

    public void insertarNodo(NodoLSl aux) {
        if (this.primerNodo == null) {
            this.primerNodo = aux;
        } else {
            NodoLSl temp = primerNodo;
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
            NodoLSl temp = primerNodo;
            while (temp != null) {
                
                if(temp.getValor().equals(valor)&&temp.getColor().equals(color)){
                    primerNodo=temp.getSiguiente();
                   return;
                }else{
                if (temp.getSiguiente() != null) {
                    if (temp.getSiguiente().getValor().equals(valor) &&temp.getSiguiente().getColor().equals(color)) {
                        System.out.println("Te encontre");
                        NodoLSl tempSiguiente = temp.getSiguiente();
                        temp.setSiguiente(tempSiguiente.getSiguiente());

                        tempSiguiente.setSiguiente(null);
                        return;

                    }
                }
                temp = temp.getSiguiente();
            }
            }
            System.out.println("No existe");
        }
    }
    
    public NodoLSl buscaNodo(NodoLSl nodoaBuscar){
        NodoLSl actual = primerNodo;    
          while (actual != nodoaBuscar) {
           if(nodoaBuscar==actual){
              nodoaBuscar=actual;
           } else{
                      
            actual = actual.siguiente;
           }
            
        }
        return nodoaBuscar;
        
        
    }
    
     public void imprimirLista() {       

        
        NodoLSl actual = primerNodo;    
          while (actual != null) {
            
            System.out.println(actual.getValor()+","+actual.getColor());            
            actual = actual.siguiente;
            
        }
     }
     
     
     
      
    
}
