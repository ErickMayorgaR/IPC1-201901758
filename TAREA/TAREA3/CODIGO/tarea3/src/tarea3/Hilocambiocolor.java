/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.awt.Button;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Erick Mayorga
 */
public class Hilocambiocolor implements Runnable {
    JButton color;
    JTextField contador;
    
    public Hilocambiocolor(JButton button){
        this.color=button;
        
    }

    @Override
    public void run() {
        while(true){
            
            
            try {
                Thread.sleep(1000);
                
                if(color.getBackground()==Color.BLUE){
                    color.setBackground(Color.RED);
                }else{
                    color.setBackground(Color.BLUE);
                }
                
            
                
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilocambiocolor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
    
    
}
