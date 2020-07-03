/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.DatosTablero;
import ListaSimpleUtiles.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Erick Mayorga
 */
public class Tablero extends JFrame {
    
    

    JLabel cuadroIni;

    NodoLS unNodo;

    DatosTablero controlDatos = new DatosTablero();

    Utiles utiles = new Utiles();
    public JPanel panelTablero;
    public JPanel panelCabecera;

    public Tablero() throws HeadlessException {
        IniciarComponentes();
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setSize(716, 640);
        super.setTitle("");
        super.setLayout(null);
        super.setLocationRelativeTo(null);
        super.setVisible(true);
    }

    private void IniciarComponentes() {

        ColocarPaneles();
        ColocarOtros();

    }

    private void ColocarPaneles() {

        panelTablero = new JPanel();
        panelTablero.setBounds(0, 100, 700, 500);
        panelTablero.setFocusable(true);
        panelTablero.setLayout(null);
        panelTablero.setBackground(Color.gray);

        add(panelTablero);

        panelCabecera = new JPanel();
        panelCabecera.setBounds(0, 0, 700, 200);
        panelCabecera.setFocusable(false);
        panelCabecera.setLayout(null);
        panelCabecera.setBackground(Color.BLACK);

        add(panelCabecera);

    }

    public void ColocarOtros() {

        cuadroIni = new JLabel();
        cuadroIni.setText("");
        cuadroIni.setBackground(Color.BLACK);
        cuadroIni.setBounds(0, 0, 100, 100);
        cuadroIni.setOpaque(true);
        cuadroIni.setVisible(true);
        panelTablero.add(cuadroIni);

        JButton cargaButton = utiles.CrearBoton(20, 20, "Cargar Datos");
        panelCabecera.add(cargaButton);

        JButton reiniciarButton = utiles.CrearBoton(20, 60, "Reiniciar");
        panelCabecera.add(reiniciarButton);

        JButton LCircularB = utiles.CrearBoton(200, 40, "Lista Circular");
        panelCabecera.add(LCircularB);

        JButton LSimpleB = utiles.CrearBoton(380, 20, "Lista Simple");
        panelCabecera.add(LSimpleB);

        JButton LDobleB = utiles.CrearBoton(560, 20, "Lista Doble");
        panelCabecera.add(LDobleB);

        JButton PilaB = utiles.CrearBoton(380, 60, "Pila");
        panelCabecera.add(PilaB);

        JButton ColaB = utiles.CrearBoton(560, 60, "Cola");
        panelCabecera.add(ColaB);

        KeyListener navKeyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (cuadroIni.getX() > 1) {
                            cuadroIni.setBounds(cuadroIni.getX() - 100, cuadroIni.getY(), cuadroIni.getWidth(), cuadroIni.getHeight());
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (cuadroIni.getX() < 600) {
                            cuadroIni.setBounds(cuadroIni.getX() + 100, cuadroIni.getY(), cuadroIni.getWidth(), cuadroIni.getHeight());
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if (cuadroIni.getY() < 400) {
                            cuadroIni.setBounds(cuadroIni.getX(), cuadroIni.getY() + 100, cuadroIni.getWidth(), cuadroIni.getHeight());
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if (cuadroIni.getY() > 1) {
                            cuadroIni.setBounds(cuadroIni.getX(), cuadroIni.getY() - 100, cuadroIni.getWidth(), cuadroIni.getHeight());
                        }
                        break;
                    default:
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
        panelTablero.addKeyListener(navKeyListener);

        ActionListener cargaListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser dataChooser = new JFileChooser();
                dataChooser.setVisible(true);
                int select = dataChooser.showOpenDialog(rootPane);
                if (select == JFileChooser.APPROVE_OPTION) {
                    File archivo = dataChooser.getSelectedFile();
                    try {
                        controlDatos.almacenarDatos(archivo);
                    } catch (IOException ex) {
                        Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                CrearNodoLabel();
            }
        };
        cargaButton.addActionListener(cargaListener);

        ActionListener listaSListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ListaSimpleVista lsv = new ListaSimpleVista();
                lsv.setVisible(true);
            }
        };
        LSimpleB.addActionListener(listaSListener);

        ActionListener colaListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ColaVista cV = new ColaVista();

            }
        };
        ColaB.addActionListener(colaListener);

        ActionListener pilaListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PilaVista pV = new PilaVista();

            }
        };
        PilaB.addActionListener(pilaListener);
        
        ActionListener listaDobleListener =new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              ListaDobleVista ldV=new ListaDobleVista();
            }
            
        };LDobleB.addActionListener(listaDobleListener);
        
        ActionListener listaCircularListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListaCircularVista lcV=new ListaCircularVista();
            }
        };LCircularB.addActionListener(listaCircularListener);
        
        ActionListener reiniciarListener =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlDatos.reiniciarTodo();
                cuadroIni.setBounds(0, 0, 100, 100);
                
            }
        };reiniciarButton.addActionListener(reiniciarListener);
        
                
    }

    public void CrearNodoLabel() {
        NodoLS actual = controlDatos.getListaSNodos().primerNodo;
        while (actual != null) {

            JLabel label = utiles.crearLabel(Integer.parseInt(actual.getFila()), Integer.parseInt(actual.getColumna()), actual.getValor(), actual.getColor());
            NodoLSl nodoLabel = new NodoLSl(label, actual.getValor(), actual.getColor());
            controlDatos.getListaetiqueta().insertarNodo(nodoLabel);
            panelTablero.add(controlDatos.getListaetiqueta().buscaNodo(nodoLabel).getLabel());
            repaint();

            actual = actual.getSiguiente();
        }
        HiloPosicion hilop = new HiloPosicion(cuadroIni, controlDatos, panelCabecera);
        Thread esteHilop = new Thread(hilop);
        esteHilop.start();
    }
}
