/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallab;

import javax.swing.JOptionPane;

/**
 *
 * @author Erick Mayorga
 */
public class Pila {
    

    NodoPila cabeza;
    int contador;

    public Pila() {
        this.cabeza = null;

    }

    public void push(String valor) {
        NodoPila nuevo = new NodoPila(valor);
        if (this.cabeza == null) {
            contador++;
            nuevo.setId(contador);

            this.setCabeza(nuevo);
        } else {
            nuevo.setSiguiente(this.getCabeza());
            contador++;
            nuevo.setId(contador);
            this.setCabeza(nuevo);
        }

    }

    public String generagraph() {
        String texto;
        texto = "digraph G{" + "\n";
        texto += "0[label=" + "\"" + "TOPE" + "\"" + "]" + "\n";
        NodoPila actual = cabeza;
        if (actual != null) {
            texto += "0" + "->" + actual.getId() + ";" + "\n";
        }

        while (actual != null) {

            texto += actual.getId() + "[label=" + "\"" + actual.getValor() + ",AMARILLO" + "\"" + "]" + "\n";
            if (actual.getSiguiente() != null) {
                texto += actual.getId() + "->" + actual.getSiguiente().getId() + ";" + "\n";
            }
            actual = actual.getSiguiente();

        }

        texto += " }";

        return texto;
    }

    public void pop() {
        if(this.getCabeza()!=null){
        NodoPila retorno = this.getCabeza();
        this.setCabeza(this.getCabeza().getSiguiente());
        }else{
            JOptionPane.showMessageDialog(null,"No hay nada en la pila");
        }
    }

    public NodoPila getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoPila cabeza) {
        this.cabeza = cabeza;
    }

}
    

