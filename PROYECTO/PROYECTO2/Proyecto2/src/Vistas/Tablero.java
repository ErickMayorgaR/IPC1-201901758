/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.DatosTablero;
import ListaSimple.NodoLS;
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
    NodoLS unNodo;
    
    DatosTablero controlDatos=new DatosTablero();

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

        JLabel imagen = new JLabel();
        imagen.setText("una etiqueta");
        imagen.setBackground(Color.BLACK);
        imagen.setBounds(0, 0, 100, 100);
        imagen.setOpaque(true);
        imagen.setVisible(true);
        panelTablero.add(imagen);

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
        
        JButton PilaB=utiles.CrearBoton(380,60, "Pila");
        panelCabecera.add(PilaB);
        
        
        JButton ColaB=utiles.CrearBoton(560,60,"Cola");
        panelCabecera.add(ColaB);
              
            
                
                
                
                
                

        KeyListener navKeyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (imagen.getX() > 1) {
                            imagen.setBounds(imagen.getX() - 100, imagen.getY(), imagen.getWidth(), imagen.getHeight());
                        }

                        break;
                    case KeyEvent.VK_RIGHT:
                        if (imagen.getX() < 600) {
                            imagen.setBounds(imagen.getX() + 100, imagen.getY(), imagen.getWidth(), imagen.getHeight());
                        }

                        break;

                    case KeyEvent.VK_DOWN:
                        if (imagen.getY() < 400) {
                            imagen.setBounds(imagen.getX(), imagen.getY() + 100, imagen.getWidth(), imagen.getHeight());
                        }
                        break;

                    case KeyEvent.VK_UP:
                        if (imagen.getY() > 1) {
                            imagen.setBounds(imagen.getX(), imagen.getY() - 100, imagen.getWidth(), imagen.getHeight());
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
                JFileChooser dataChooser= new JFileChooser ();
                
                dataChooser.setVisible(true);
                
                int select = dataChooser.showOpenDialog(rootPane);
                
                if(select==JFileChooser.APPROVE_OPTION){
                    File archivo =dataChooser.getSelectedFile();
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
        
        
    }
    
   public void CrearNodoLabel() {      
       
        NodoLS actual = controlDatos.getListaSDatos().primerNodo;    
          while (actual != null) {            
         JLabel algunNodo= utiles.crearLabel(Integer.parseInt(actual.getFila()), Integer.parseInt(actual.getColumna()),actual.getValor(),actual.getColor());
         panelTablero.add(algunNodo);
          repaint();
              revalidate();
            actual=actual.getSiguiente();
        }
     }
    
    
    
    
}
