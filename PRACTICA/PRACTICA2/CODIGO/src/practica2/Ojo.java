/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import Hilosimpactos.PosicionOjo;
import Hilosimpactos.PosicionRayo;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static practica2.Asteroide.asteroideLabel;
import static practica2.Caracol.caracolLabel;
import static practica2.Corazon.corazonLabel;
import static practica2.Rayo.rayoLabel;

/**
 *
 * @author Erick Mayorga
 */
public class Ojo implements Runnable{
    public static JLabel ojoLabel;
                   JPanel tablero;
    public Ojo( JPanel tablero) {           
        this.tablero = tablero;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
            ojoLabel = Utilidades.CreaOjoLabel();
            if (rayoLabel != null && asteroideLabel != null && corazonLabel != null && caracolLabel != null) {
                    
                    ojoLabel = Utilidades.posicionesLabelOjo(ojoLabel);
                    
                    tablero.add(ojoLabel);
                }
                tablero.add(ojoLabel);

                Mover procesoMover = new Mover(ojoLabel);
                Thread hiloOjo = new Thread(procesoMover);
                hiloOjo.start();
                
                  PosicionOjo posRayo=new PosicionOjo(ojoLabel);          
                Thread hiloposAs=new Thread(posRayo);
                hiloposAs.start();

            } catch (InterruptedException e) {
                System.out.println("No se pone la ex");
            }
        }
    }
    
}
