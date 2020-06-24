/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import Vistas.TableroJ;
import static Vistas.TableroJ.panelTablero;
import javax.swing.JButton;
import javax.swing.JLabel;



public class Mover implements Runnable {
    JLabel label;

    public Mover(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        while(true){
          label.setBounds(label.getX(),label.getY()+TableroJ.velocidad,label.getWidth(),label.getHeight());
            if(label.getY()>=650){
                label.setVisible(false);
                label=null;
               
            break;
        }        
        try{
            Thread.sleep(10);                    
        }
        catch(InterruptedException ie){
            System.out.println("Se trabo");   
        
    }
    }
    
    
    
}
}