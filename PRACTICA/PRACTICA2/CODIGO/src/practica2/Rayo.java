/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import Hilosimpactos.PosicionAs;
import Hilosimpactos.PosicionRayo;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import static practica2.Asteroide.asteroideLabel;
import static practica2.Caracol.caracolLabel;
import static practica2.Corazon.corazonLabel;
import static practica2.Ojo.ojoLabel;

public class Rayo implements Runnable {  
    
 public static JLabel rayoLabel;
    JPanel tablero;
    public Rayo( JPanel tablero) {           
        this.tablero = tablero;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
                rayoLabel = Utilidades.CreaRayoLabel();
                if (corazonLabel != null && asteroideLabel != null && ojoLabel != null && caracolLabel != null) {
                    
                    rayoLabel = Utilidades.posicionesLabelrayo(rayoLabel);
                    
                    tablero.add(rayoLabel);
                    
                }
                
                tablero.add(rayoLabel);

                Mover procesoMover = new Mover(rayoLabel);
                Thread hilorayo = new Thread(procesoMover);
                hilorayo.start();
                
                PosicionRayo posRayo=new PosicionRayo(rayoLabel);          
                Thread hiloposAs=new Thread(posRayo);
                hiloposAs.start();

            } catch (InterruptedException e) {
                System.out.println("No se pone la ex");
            }
        }
    }

}
