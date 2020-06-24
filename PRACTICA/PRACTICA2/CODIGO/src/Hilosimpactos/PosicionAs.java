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
import javax.swing.JOptionPane;
import static practica2.Asteroide.asteroideLabel;

/**
 *
 * @author Erick Mayorga
 */
public class PosicionAs implements Runnable {

    JLabel etiqueta;

    public PosicionAs(JLabel etiquetas) {
        this.etiqueta = etiquetas;
    }

    @Override
    public void run() {

        try {
            while (true) {
                Area asteroideArea = new Area(etiqueta.getBounds());
                if (areaMisil == null) {
                    if (TableroJ.areaNave.intersects(asteroideArea.getBounds())) {
                        TableroJ.vidas--;
                        System.out.println(TableroJ.vidas);
                        TableroJ.vidaField.setText(String.valueOf(TableroJ.vidas));
                        TableroJ.panelTablero.repaint();
                        return;
                    }
                } else {

                    if (areaMisil.intersects(asteroideArea.getBounds())) {
                        TableroJ.puntos+=100;
                        TableroJ.punteoField.setText(String.valueOf(TableroJ.puntos));
                        
                        this.etiqueta.setVisible(false);
                        return;

                    } else if (TableroJ.areaNave.intersects(asteroideArea.getBounds())) {
                        TableroJ.vidas--;
                        System.out.println(TableroJ.vidas);
                        TableroJ.vidaField.setText(String.valueOf(TableroJ.vidas));
                        TableroJ.panelTablero.repaint();
                        if(TableroJ.vidas<1){
                            JOptionPane.showMessageDialog(null, "JuegoTerminado");
                            System.exit(0);
                        }
                        return;

                    }
                }
                Thread.sleep(150);
            }
        } catch (InterruptedException e) {

        }
    }

}
