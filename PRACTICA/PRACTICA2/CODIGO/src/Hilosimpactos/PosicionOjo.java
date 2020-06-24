/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilosimpactos;

import Vistas.TableroJ;
import static Vistas.TableroJ.areaMisil;
import java.awt.geom.Area;
import javax.swing.JLabel;

/**
 *
 * @author Erick Mayorga
 */
public class PosicionOjo implements Runnable {
   
    JLabel etiqueta;  
      
            
    public PosicionOjo(JLabel etiquetas){
        this.etiqueta=etiquetas;   
}

    @Override
    public void run() {
        
            try{
                while(true){
                    
                    if(areaMisil==null){
                        
                }               
                    else{                
                Area ojoArea=new Area(etiqueta.getBounds());
                
                                
                if(areaMisil.intersects(ojoArea.getBounds())){
                    TableroJ.poder++;
                    TableroJ.poderField.setText(String.valueOf(TableroJ.poder));
                    this.etiqueta.setVisible(false);                    
                  return;
                } else if(areaMisil.intersects(ojoArea.getBounds())){
                    TableroJ.poder++;
                    TableroJ.poderField.setText(String.valueOf(TableroJ.poder));
                    this.etiqueta.setVisible(false);                    
                  return;        
                }
                    }
                    Thread.sleep(100);                    
                }            
        }catch(InterruptedException e){
            
        }
    }
    
}
