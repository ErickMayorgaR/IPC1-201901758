/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import static Vistas.TableroJ.areaMisil;
import java.awt.geom.Area;
import javax.swing.JLabel;
import static practica2.Asteroide.asteroideLabel;

/**
 *
 * @author Erick Mayorga
 */
public class MoverMisil implements Runnable {

    JLabel label;

    public MoverMisil(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        while (true) {
            label.setBounds(label.getX(), label.getY() - 10, label.getWidth(), label.getHeight());
            areaMisil = new Area(label.getBounds());
            if (-100 >= label.getY()) {
                break;

            }
            try {
                Thread.sleep(80);

            } catch (InterruptedException ie) {
                System.out.println("Se trabo");

            }
        }
    }

}
