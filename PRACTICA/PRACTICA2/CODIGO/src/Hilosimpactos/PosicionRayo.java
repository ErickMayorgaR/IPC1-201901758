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
public class PosicionRayo implements Runnable {

    JLabel etiqueta;

    public PosicionRayo(JLabel etiquetas) {
        this.etiqueta = etiquetas;
    }

    @Override
    public void run() {

        try {
            while (true) {

                if (areaMisil == null) {
                } else {
                    Area rayoArea = new Area(etiqueta.getBounds());

                    if (areaMisil.intersects(rayoArea.getBounds())) {
                        if (TableroJ.velocidad < 5) {
                            TableroJ.velocidad++;
                            TableroJ.velocidadField.setText(String.valueOf(TableroJ.velocidad));
                            TableroJ.panelTablero.repaint();
                        }
                        this.etiqueta.setVisible(false);

                        return;
                    } else if (TableroJ.areaNave.intersects(rayoArea.getBounds())) {
                        if (TableroJ.velocidad < 5) {
                            TableroJ.velocidad++;
                            TableroJ.velocidadField.setText(String.valueOf(TableroJ.velocidad));
                            TableroJ.panelTablero.repaint();
                        }
                        this.etiqueta.setVisible(false);
                        return;
                    }

                }
                Thread.sleep(150);
            }
        } catch (InterruptedException e) {

        }
    }

}
