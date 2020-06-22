/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

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
          label.setBounds(label.getX(),label.getY()+2,label.getWidth(),label.getHeight());
            
        
        try{
            Thread.sleep(10);
                    
        }
        catch(InterruptedException ie){
            System.out.println("Se trabo");    
        
    }
    }
    
    
    
}
}