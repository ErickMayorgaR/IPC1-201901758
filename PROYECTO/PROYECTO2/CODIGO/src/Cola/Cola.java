/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

/**
 *
 * @author Erick Mayorga
 */
public class Cola {
    
     public NodoCola cabeza;
     int contador=0;

    public Cola() {
    }

    
    public Cola(NodoCola cabeza) {
        this.cabeza = null;
    }

    public void encolar(String valor){
        NodoCola nuevo = new NodoCola(valor);
        if(this.getCabeza()==null){
            contador++;
            nuevo.setId(contador);
            this.setCabeza(nuevo);
        }else{
            NodoCola actual=this.getCabeza();
            while(actual.getSiguiente()!=null){
                actual=actual.getSiguiente();
            }
            contador++;
            nuevo.setId(contador);
            actual.setSiguiente(nuevo);
        }
    }
    
    public void desencolar(){
        NodoCola retorno;
        if(this.getCabeza()!=null){
            retorno=this.getCabeza();
            if(this.getCabeza().getSiguiente()!=null){
                this.setCabeza(retorno.getSiguiente());
                
            }else{
                this.setCabeza(null);
            }            
        }
        
    }
    public String generagraph() {
        String texto;
        texto = "digraph G{" + "\n";
        texto+= "0[label=" + "\"" +"INICIO"+ "\"" + "]" + "\n";
        NodoCola actual = cabeza;
        if(actual!=null){
        texto += "0" + "->" +actual.getId() + ";"+"\n";
        }

        while (actual != null) {
            
            texto += actual.getId()+ "[label=" + "\"" + actual.getValor() + ",VERDE" + "\"" + "]" + "\n";
            if (actual.getSiguiente() != null) {
                texto += actual.getId() + "->" + actual.getSiguiente().getId() + ";"+"\n";
            }
            actual = actual.getSiguiente();

        }

        texto += " }";

        return texto;
    }
    
    public NodoCola getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCola cabeza) {
        this.cabeza = cabeza;
    }
    
}

    

