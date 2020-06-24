/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilosimpactos;

import Vistas.TableroJ;
import static Vistas.TableroJ.areaMisil;
import java.awt.geom.Area;
import javax.management.StringValueExp;
import javax.swing.JLabel;

/**
 *
 * @author Erick Mayorga
 */
public class PosicionCara implements Runnable{
    JLabel etiqueta;  
      
            
    public PosicionCara(JLabel etiquetas){
        this.etiqueta=etiquetas;   
}

    @Override
    public void run() {
        
             try{
                   
                
                while(true){
                        if(areaMisil==null){                        
                }               
                    else{    
                             
                Area CaracArea=new Area(etiqueta.getBounds());
                
                                
                if(areaMisil.intersects(CaracArea.getBounds())){
                    
                    this.etiqueta.setVisible(false);                    
                    return;
                 }
                else if(TableroJ.areaNave.intersects(CaracArea.getBounds())){
                    if(TableroJ.velocidad>1){
                    TableroJ.velocidad--;
                    TableroJ.velocidadField.setText(String.valueOf(TableroJ.velocidad));
                    TableroJ.panelTablero.repaint();
                    }
                }
                
                
                
               
                        }    
                 Thread.sleep(150);                       
                }
                
             }
                
        catch(InterruptedException e){
            
        }
    }
    
}

