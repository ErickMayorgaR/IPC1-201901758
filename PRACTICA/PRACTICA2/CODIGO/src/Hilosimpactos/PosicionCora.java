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
public class PosicionCora implements Runnable {

    JLabel etiqueta;

    public PosicionCora(JLabel etiquetas) {
        this.etiqueta = etiquetas;
    }

    @Override
    public void run() {

        try {
            while (true) {

                if (areaMisil == null) {

                } else {
                    Area coraArea = new Area(etiqueta.getBounds());

                    if (areaMisil.intersects(coraArea.getBounds())) {

                        this.etiqueta.setVisible(false);
                        if (TableroJ.vidas < 3) {
                            TableroJ.vidas++;
                            TableroJ.vidaField.setText(String.valueOf(TableroJ.vidas));
                            TableroJ.panelTablero.repaint();

                            return;
                        }
                    } else if (TableroJ.areaNave.intersects(coraArea.getBounds())) {
                         if (TableroJ.vidas < 3) {
                            TableroJ.vidas++;
                            TableroJ.vidaField.setText(String.valueOf(TableroJ.vidas));
                            TableroJ.panelTablero.repaint();

                            return;
                        }
                    }
                }
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {

        }
    }

}
