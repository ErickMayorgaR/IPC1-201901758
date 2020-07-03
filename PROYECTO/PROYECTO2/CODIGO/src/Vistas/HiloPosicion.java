/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Cola.Cola;
import Controladores.DatosTablero;
import static Controladores.DatosTablero.*;
import ListaSimpleUtiles.ListaSimpleL;
import ListaSimpleUtiles.NodoLSl;
import Pila.Pila;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Erick Mayorga
 */


public class HiloPosicion implements Runnable{
   DatosTablero aux=new DatosTablero();
   ListaSimpleL ls=new ListaSimpleL();
   JLabel mv;
   JPanel cabecera;
   
   
  
  
 
    /**
     *
     * @param mv
     * @param aux
     * @param panel
     */
    

    public HiloPosicion(JLabel mv,DatosTablero aux, JPanel panel){
        this.mv = mv;
        this.aux=aux;  
        this.cabecera=panel;
    }
    
 
    

     @Override
            
    public void run() {
        
       try {
         
           
          
           while(true){
                   ls=aux.getListaetiqueta();
                NodoLSl actual = ls.primerNodo;
           
         
           while (actual != null) {              
               if(mv.getX() == actual.getLabel().getX()&& mv.getY()==actual.getLabel().getY()){
                   switch(actual.getColor()){
                       case"ROJO":
                        lCircularDatos.insertar(actual.getValor());
                               break;
                       case "AMARILLO":
                           pilaDatos.push(actual.getValor());
                           break;
                       case "AZUL":
                        listaDDatos.insertarNodo(actual.getValor());
                           break;
                       case "VERDE":
                           colaDatos.encolar(actual.getValor());
                           break;
                           
                   }
                   actual.getLabel().setVisible(false);
                   ls.eliminarNodo(actual.getValor(), actual.getColor());
                   break;
                   
               } else{
                   
                   actual = actual.getSiguiente();
               }
               
           }
           

           Thread.sleep(800);
       }
           
       }catch (InterruptedException ex) {
           Logger.getLogger(HiloPosicion.class.getName()).log(Level.SEVERE, null, ex);
       }
            
           
            
            
        }
        
        
    }

    

