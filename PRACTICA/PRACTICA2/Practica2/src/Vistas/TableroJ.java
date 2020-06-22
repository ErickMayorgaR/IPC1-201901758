/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import practica2.Corazon;
import practica2.Rayo;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import practica2.Asteroide;
import practica2.Caracol;
import practica2.Ojo;
import practica2.Utilidades;

/**
 *
 * @author Erick Mayorga
 */
public class TableroJ extends JFrame {

    public JPanel panelTablero;

    public TableroJ() {

        setSize(800, 700);
        setTitle("Esto es el juego");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        IniciarComponentes();

    }

    private void IniciarComponentes() {

        ColocarPaneles();

        ColocarOtros();

    }

    private void ColocarPaneles() {

        panelTablero = new JPanel();
        panelTablero.setFocusable(true);

        panelTablero.setLayout(null);

        panelTablero.setBackground(Color.BLACK);
        this.getContentPane().add(panelTablero);

    }

    public void ColocarOtros() {
        
        JButton nave = Utilidades.CreaNave();
        nave.setFocusable(true);
       
              
        
        panelTablero.add(nave);

        Rayo crearRayos = new Rayo(panelTablero);

        Thread hiloR = new Thread(crearRayos);
        hiloR.start();

        Corazon crearCora = new Corazon(panelTablero);
        Thread hilocora = new Thread(crearCora);
        hilocora.start();

        Caracol crearCaracol = new Caracol(panelTablero);
        Thread hiloCaracol = new Thread(crearCaracol);
        hiloCaracol.start();

        Asteroide crearAsteroide = new Asteroide(panelTablero);
        Thread hiloasteroide = new Thread(crearAsteroide);
        hiloasteroide.start();

        Ojo crearOjo = new Ojo(panelTablero);
        Thread hiloOjo = new Thread(crearOjo);
        hiloOjo.start();
        
        

        
        
  

        
        

        KeyListener navKeyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                 switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        nave.setBounds(nave.getX() - 100, nave.getY(), nave.getWidth(), nave.getHeight());
                        repaint();
                        break;
                    case KeyEvent.VK_RIGHT:
                        nave.setBounds(nave.getX() + 100, nave.getY(), nave.getWidth(), nave.getHeight());
                        repaint();
                        break;
                    default:
                        System.out.println("No es una tecla valida");
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
               
            }
        };
        panelTablero.addKeyListener(navKeyListener);
    }
}

