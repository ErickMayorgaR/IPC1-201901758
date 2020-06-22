/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import javax.swing.JLabel;
import javax.swing.JPanel;
import static practica2.Asteroide.asteroideLabel;
import static practica2.Corazon.corazonLabel;
import static practica2.Ojo.ojoLabel;
import static practica2.Rayo.rayoLabel;

/**
 *
 * @author Erick Mayorga
 */
public class Caracol implements Runnable {
    public static JLabel caracolLabel;
      JPanel tablero;
    public Caracol( JPanel tablero) {           
        this.tablero = tablero;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(15000);
                caracolLabel = Utilidades.CreaCaracolLabel();
                 if (rayoLabel != null && asteroideLabel != null && ojoLabel != null && corazonLabel != null) {
                    
                    caracolLabel = Utilidades.posicionesLabelCarac(caracolLabel);
                    
                    tablero.add(caracolLabel);
                }
                tablero.add(caracolLabel);

                Mover procesoMover = new Mover(caracolLabel);
                Thread hilocaracol = new Thread(procesoMover);
                hilocaracol.start();

            } catch (InterruptedException e) {
                System.out.println("No se pone la ex");
            }
        }
    }

    
}
