/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Area;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import practica2.Corazon;
import practica2.Rayo;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import practica2.Asteroide;
import static practica2.Asteroide.asteroideLabel;
import practica2.Caracol;
import practica2.Mover;
import practica2.MoverMisil;
import practica2.Ojo;
import practica2.Utilidades;

/**
 *
 * @author Erick Mayorga
 */
public class TableroJ extends JFrame {

    public static JPanel panelTablero;
    public static JTextField punteoField;
    public static JTextField vidaField;
    public static JTextField velocidadField;
    public static JTextField poderField;
    public static int puntos=0;
    public static int vidas = 3;
    public static int poder=0;
    public static int velocidad = 1;
    public static Area areaNave;
    public static JLabel misilnv;
    public static Area areaMisil;
    public static int punteo;

    public TableroJ() {

        setSize(800, 600);
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

        misilnv = new JLabel();
        misilnv.setText("Vidas");
        misilnv.setBounds(700, 700, 100, 10);

        misilnv.setOpaque(false);
        misilnv.setForeground(Color.WHITE);
        panelTablero.add(misilnv);

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

        JButton nave = Utilidades.CreaNave();
        nave.setFocusable(true);
        panelTablero.add(nave);

        areaNave = new Area(nave.getBounds());

        MatteBorder b = new MatteBorder(0, 5, 5, 5, Color.WHITE);

        JLabel blanco = new JLabel();
        blanco.setText("");
        blanco.setForeground(Color.BLACK);
        blanco.setOpaque(false);
        blanco.setBorder(b);
        blanco.setBounds(500, 0, 280, 800);
        panelTablero.add(blanco);

        JLabel Nombre = new JLabel();
        Nombre.setText("Nombre de Usuario");
        Nombre.setBounds(550, 50, 200, 10);
        Nombre.setOpaque(false);
        Nombre.setForeground(Color.WHITE);
        panelTablero.add(Nombre);

        JLabel Vidas = new JLabel();
        Vidas.setText("Vidas");
        Vidas.setBounds(550, 100, 100, 10);
        Vidas.setOpaque(false);
        Vidas.setForeground(Color.WHITE);
        panelTablero.add(Vidas);

        vidaField = new JTextField();
        vidaField.setText(String.valueOf(vidas));
        vidaField.setBounds(600, 95, 100, 20);
        vidaField.setEditable(false);
        panelTablero.add(vidaField);

        JLabel Poder = new JLabel();
        Poder.setText("Poder");
        Poder.setBounds(550, 150, 100, 10);
        Poder.setForeground(Color.WHITE);
        Poder.setOpaque(false);
       
        panelTablero.add(Poder);

        poderField = new JTextField();
        poderField.setText(String.valueOf(poder)); 
        poderField.setBounds(600, 145, 100, 20);
        poderField.setEditable(false);
        poderField.setBackground(Color.white);
        panelTablero.add(poderField);

        JLabel velocidadLabel = new JLabel();
        velocidadLabel.setText("Velocidad");
        velocidadLabel.setBounds(550, 200, 100, 20);
        velocidadLabel.setOpaque(false);
        velocidadLabel.setForeground(Color.WHITE);
        panelTablero.add(velocidadLabel);

        velocidadField = new JTextField();
        velocidadField.setBounds(650, 195, 100, 20);
        velocidadField.setText(String.valueOf(velocidad));
        velocidadField.setEditable(false);
        panelTablero.add(velocidadField);
        
        punteoField= new JTextField();
        punteoField.setBounds(650,245,100,20);
        punteoField.setText(String.valueOf(punteo)); 
        punteoField.setEditable(false);
        panelTablero.add(punteoField);

        JLabel punteo = new JLabel();
        punteo.setText("Punteo");
        punteo.setBounds(550, 250, 100, 10);
        punteo.setOpaque(false);
        punteo.setForeground(Color.WHITE);
        panelTablero.add(punteo);

        repaint();

        KeyListener navKeyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        
                        nave.setBounds(nave.getX() - 100, nave.getY(), nave.getWidth(), nave.getHeight());
                        areaNave = null;

                        areaNave = new Area(nave.getBounds());

                        repaint();
                        
                        break;
                    case KeyEvent.VK_RIGHT:
                        
                        nave.setBounds(nave.getX() + 100, nave.getY(), nave.getWidth(), nave.getHeight());
                        areaNave = null;
                        areaNave = new Area(nave.getBounds());
                        repaint();
                
                        break;
                    case KeyEvent.VK_SPACE:

                        misilnv = Utilidades.CreaMisil(nave);
                        panelTablero.add(misilnv);

                        MoverMisil procesoMover = new MoverMisil(misilnv);

                        Thread hilocora = new Thread(procesoMover);
                        hilocora.start();

                    default:

                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        panelTablero.addKeyListener(navKeyListener);

    }
}
