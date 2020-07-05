/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import finallab.Pila;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Erick Mayorga
 */
public class Datos {
    
    JPanel panel;
    JButton unBoton;

    public Datos(JPanel panel) {
        this.panel = panel;
    }   
    
    public static ListaSimpleL listaBotones;
    public static Pila Piladatos=new Pila();
    
    
    
    public void llenarListaL(){
        int contador = 0;
        
        for(int i=0; i<7; i++){
            
            contador++;
            unBoton=Utiles.creaBoton(contador);
            unBoton.setVisible(true);
          
            
            Mover procesoMover=new Mover(unBoton);
            Thread hilomov=new Thread(procesoMover);            
            hilomov.start();
            
            panel.add(unBoton);
            esperar(1);
        }
        
    }
    public void esperar(int s){
        try {
            Thread.sleep(s*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
   
    

