/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDoble;

/**
 *
 * @author Erick Mayorga
 */
public class ListaDoble {
    
     public NodoDoble primerNodo;
     int contador;

    public void insertarNodo(String valor) {
        NodoDoble aux=new NodoDoble(valor);
        if (this.primerNodo == null) {
            contador++;
            this.primerNodo = aux;
            aux.setId(contador);
        } else {
            NodoDoble temp = primerNodo;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            contador++;
            aux.setId(contador);
            temp.setSiguiente(aux);
            aux.setAnterior(temp);
        }

    }

    public void eliminarNodo(String valor) {
        if (this.primerNodo == null) {
            System.out.println("No hay nada en la lista");
        } else {
            NodoDoble temp = primerNodo;
            while (temp != null) {
                
                if(temp.getValor().equals(valor)){
                    primerNodo=temp.getSiguiente();
                   return;
                }else{
                if (temp.getSiguiente() != null) {
                    if (temp.getSiguiente().getValor().equals(valor)) {
                        System.out.println("Te encontre");
                        NodoDoble tempSiguiente = temp.getSiguiente();
                        
                        temp.setSiguiente(tempSiguiente.getSiguiente());
                        temp.getSiguiente().setAnterior(temp);

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
    
    public NodoDoble buscaNodo(NodoDoble nodoaBuscar){
        NodoDoble actual = primerNodo;    
          while (actual != nodoaBuscar) {
           if(nodoaBuscar==actual){
              nodoaBuscar=actual;
           } else{
                      
            actual = actual.siguiente;
           }
            
        }
        return nodoaBuscar;
        
        
    }
    public String generagraph() {
        String texto;
        texto = "digraph G{" + "\n";
        NodoDoble actual = primerNodo;
       

        while (actual != null) {
            texto += actual.getId()+ "[label=" + "\"" + actual.getValor() + ",AZUL" + "\"" + "]" + "\n";
            if (actual.getSiguiente() != null) {
                texto += actual.getId() + "->" + actual.getSiguiente().getId() + ";"+"\n";
                texto += actual.getSiguiente().getId() + "->" + actual.getSiguiente().getAnterior().getId()+ ";"+"\n";
            }
            actual = actual.getSiguiente();
            

        }

        texto += " }";

        return texto;
    }
    
    
     public void imprimirLista() {       

        
        NodoDoble actual = primerNodo;    
          while (actual != null) {
            
            System.out.println(actual.getValor());            
            actual = actual.siguiente;
            
        }
     }
     
     
     
    
}
