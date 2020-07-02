/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static Controladores.DatosTablero.listaSDatos;
import static Vistas.Utiles.crearBotonInterfaz;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import netscape.javascript.JSException;

/**
 *
 * @author Erick Mayorga
 */
public class ListaSimpleVista extends JFrame {
    public JPanel panelInterfaz;
    
     public ListaSimpleVista() throws HeadlessException {
        IniciarComponentes();
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        super.setSize(355, 450);
        super.setTitle("Lista Simple");
        
        super.setLocationRelativeTo(null);
        super.setVisible(true);
    }

    private void IniciarComponentes() {

        ColocarPaneles();
        ColocarOtros();

    }

    private void ColocarPaneles() {

        panelInterfaz = new JPanel();        
        panelInterfaz.setFocusable(true);   
        panelInterfaz.setLayout(null);
        panelInterfaz.setBackground(Color.gray);
        add(panelInterfaz);

        

    }

    public void ColocarOtros() {
        JButton agregarButton = crearBotonInterfaz("Agregar",20,350);
        panelInterfaz.add(agregarButton);
        
        JButton eliminarButton =crearBotonInterfaz("Eliminar", 200, 350);
        panelInterfaz.add(eliminarButton);
        
         String contenido= listaSDatos.generagraph();        
        JTextArea codigoG=new JTextArea();
        codigoG.setEditable(false);
        codigoG.setText(contenido);     
              
               
        JScrollPane codScroll =new JScrollPane(codigoG);        
        codScroll.setBounds(20, 20, 300, 300);
        
         panelInterfaz.add(codScroll);
    }
    
}
