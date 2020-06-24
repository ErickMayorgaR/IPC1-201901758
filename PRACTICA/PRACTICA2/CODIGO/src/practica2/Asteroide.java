/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import Hilosimpactos.PosicionAs;
import Vistas.TableroJ;
import static Vistas.TableroJ.areaMisil;
import java.awt.geom.Area;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static practica2.Rayo.rayoLabel;
import static practica2.Corazon.corazonLabel;
import static practica2.Caracol.caracolLabel;
import static practica2.Ojo.ojoLabel;

/**
 *
 * @author Erick Mayorga
 */
public class Asteroide implements Runnable {

    public static JLabel asteroideLabel;
    JPanel tablero;

    public Asteroide(JPanel tablero) {
        this.tablero = tablero;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);

                asteroideLabel = Utilidades.CreaAsteroideLabel();
//                if (rayoLabel != null && caracolLabel != null && ojoLabel != null && corazonLabel != null) {
//                    
//                    asteroideLabel = Utilidades.posicionesLabelAs(asteroideLabel);
//                    
//                    tablero.add(asteroideLabel);
//                }
                tablero.add(asteroideLabel);
              
            

                Mover procesoMover = new Mover(asteroideLabel);
                Thread hiloAs = new Thread(procesoMover);
                hiloAs.start();
                
                PosicionAs posAs=new PosicionAs(asteroideLabel);          
                Thread hiloposAs=new Thread(posAs);
                hiloposAs.start();
                
                
                
                

            } catch (InterruptedException e) {
                System.out.println("No se pone la ex");
            }
        }
    }

}
