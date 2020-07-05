/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.Datos.Piladatos;
import finallab.Interfaz;
import static finallab.Interfaz.codigoG;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Erick Mayorga
 */
public class Mover implements Runnable {

    JButton boton;

    public Mover(JButton boton) {
        this.boton = boton;
    }

    @Override
    public void run() {
        while (Interfaz.contadorLabel>1) {
            if (boton!=null) {
                boton.setBounds(boton.getX(), boton.getY() + 5, boton.getWidth(), boton.getHeight());
                if (boton.getY() >= 450) {
                    boton.setBounds(20, -100, 100, 50);
                }
               
                
                ActionListener botonListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        while (boton != null) {
                            String texto = boton.getText();
                            Piladatos.push(texto);
                            boton.setVisible(false);
                            boton.setFocusable(false);
                            boton = null;

                            codigoG.setText(Piladatos.generagraph());

                        }

                    }

                };
                boton.addActionListener(botonListener);
            }

            try {
                Thread.sleep(62);
            } catch (InterruptedException ie) {
                System.out.println("Se trabo");

            }
        }
    }
}
