/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static practica2.Asteroide.asteroideLabel;
import static practica2.Caracol.caracolLabel;
import static practica2.Corazon.corazonLabel;
import static practica2.Ojo.ojoLabel;
import static practica2.Rayo.rayoLabel;

/**
 *
 * @author Erick Mayorga
 */
public class Utilidades {

//    public static JLabel posicionesLabelAs(JLabel elemento) {
//
//        while (elemento.getX() == rayoLabel.getX()
//               || elemento.getX() == caracolLabel.getX()
//               || elemento.getX() == corazonLabel.getX()
//               || elemento.getX() == ojoLabel.getX()) {
//            
//               int a = (int) (Math.random() * 5);
//            elemento.setBounds((0 + (100 * a)), elemento.getY(), 100, 100);
//
//        }
//        return elemento;
//    }

    public static JLabel posicionesLabelCora(JLabel elemento) {

        while (elemento.getX() == rayoLabel.getX() ||
                elemento.getX() == caracolLabel.getX() ||
                elemento.getX() == ojoLabel.getX() ||
                elemento.getX() == asteroideLabel.getX()) {
            int a = (int) (Math.random() * 5);
            elemento.setBounds((0 + (100 * a)), elemento.getY(), 100, 100);

        }

        return elemento;
    }

    public static JLabel posicionesLabelCarac(JLabel elemento) {

        while (elemento.getX() == rayoLabel.getX() ||
                elemento.getX() == corazonLabel.getX() ||
                elemento.getX() == ojoLabel.getX() ||
                elemento.getX() == asteroideLabel.getX()) {
            int a = (int) (Math.random() * 5);
            elemento.setBounds((0 + (100 * a)), elemento.getY(), 100, 100);

        }
        return elemento;
    }

    public static JLabel posicionesLabelrayo(JLabel elemento) {

        while (elemento.getX() == caracolLabel.getX() || 
                elemento.getX() == corazonLabel.getX() || 
                elemento.getX() == ojoLabel.getX() ||
                elemento.getX() == asteroideLabel.getX()) {
            int a = (int) (Math.random() * 5);
            elemento.setBounds((0 + (100 * a)), elemento.getY(), 100, 100);

        }
        return elemento;
    }

    public static JLabel posicionesLabelOjo(JLabel elemento) {

        while (elemento.getX() == rayoLabel.getX() || 
                elemento.getX() == caracolLabel.getX() ||
                elemento.getX() == corazonLabel.getX() || 
                elemento.getX() == asteroideLabel.getX()) {
            int a = (int) (Math.random() * 5);
            elemento.setBounds((0 + (100 * a)), elemento.getY(), 100, 100);

        }
        return elemento;
    }

    public static JLabel CreaRayoLabel() {
        int a = (int) (Math.random() * 5);
        JLabel Nombre = new JLabel();
        Nombre.setText("<html><center>Un Rayo<html>");
        Nombre.setForeground(Color.red);
        Nombre.setOpaque(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setBounds((0 + (100 * a)), 0, 100, 100);

        return Nombre;
    }

    public static JLabel CreaCorazonLabel() {
        int a = (int) (Math.random() * 5);
        JLabel Nombre = new JLabel();
        Nombre.setText("Corazon");
        Nombre.setOpaque(true);

        Nombre.setBackground(Color.CYAN);
        Nombre.setBounds((0 + (100 * a)), 0, 100, 100);

        return Nombre;
    }

    public static JLabel CreaCaracolLabel() {
        int a = (int) (Math.random() * 5);
        JLabel Nombre = new JLabel();

        Nombre.setText("Caracol");
        Nombre.setOpaque(true);

        Nombre.setBackground(Color.LIGHT_GRAY);
        Nombre.setBounds((0 + (100 * a)), 0, 100, 100);

        return Nombre;
    }

    public static JLabel CreaOjoLabel() {
        int a = (int) (Math.random() * 5);
        JLabel Nombre = new JLabel();

        Nombre.setText("Ojo");
        Nombre.setOpaque(true);
        Nombre.setBackground(Color.ORANGE);
        Nombre.setBounds((0 + (100 * a)), 0, 100, 100);

        return Nombre;
    }

    public static JLabel CreaAsteroideLabel() {
        int a = (int) (Math.random() * 5);
        JLabel Nombre = new JLabel();

        Nombre.setText("Asteroide");
        Nombre.setOpaque(true);
        Nombre.setBackground(Color.PINK);
        Nombre.setBounds((0 + (100 * a)), 0, 100, 100);

        return Nombre;
    }

    public static JLabel CreaCohete() {
        int a = (int) (Math.random() * 5);
        JLabel Nombre = new JLabel();
        Nombre.setText("<html><center><html>");
        Nombre.setForeground(Color.red);
        Nombre.setOpaque(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setBounds((0 + (100 * a)), 0, 100, 100);

        return Nombre;
    }
       public static JLabel CreaMisil(JButton nave) {
        
        JLabel Nombre = new JLabel();
        Nombre.setText("un misil");        
        Nombre.setOpaque(true);
        Nombre.setBackground(Color.BLUE);
        Nombre.setBounds(nave.getX(), nave.getY(), 100, 100);
        

        return Nombre;
    }

    public static JButton CreaNave() {

        JButton Nombre = new JButton();
        Nombre.setText("una Nave");
        Nombre.setForeground(Color.red);
        Nombre.setOpaque(true);
        Nombre.setBackground(Color.BLUE);
        Nombre.setBounds(200, 455, 100, 100);

        return Nombre;

    }

}
