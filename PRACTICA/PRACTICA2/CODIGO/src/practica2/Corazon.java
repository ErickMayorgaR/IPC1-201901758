/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import Hilosimpactos.PosicionOjo;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static practica2.Asteroide.asteroideLabel;
import static practica2.Caracol.caracolLabel;
import static practica2.Ojo.ojoLabel;
import static practica2.Rayo.rayoLabel;

/**
 *
 * @author Erick Mayorga
 */
public class Corazon implements Runnable {

    public static JLabel corazonLabel;
    JPanel tablero;

    public Corazon(JPanel tablero) {
        this.tablero = tablero;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(14000);
                corazonLabel = Utilidades.CreaCorazonLabel();
                if (rayoLabel != null && asteroideLabel != null && ojoLabel != null && caracolLabel != null) {

                    corazonLabel = Utilidades.posicionesLabelCora(corazonLabel);

                    tablero.add(corazonLabel);
                }else{
                tablero.add(corazonLabel);
                }
                
                Mover procesoMover = new Mover(corazonLabel);
                Thread hilocora = new Thread(procesoMover);
                hilocora.start();
                
                 PosicionOjo posOjo=new PosicionOjo(corazonLabel);          
                Thread hiloposcora=new Thread(posOjo);
                hiloposcora.start();
            } catch (InterruptedException e) {
                System.out.println("No se pone la ex");
            }
        }
    }

}
