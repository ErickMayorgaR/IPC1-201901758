/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static Controladores.DatosTablero.*;
import static Vistas.Utiles.crearBotonInterfaz;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Erick Mayorga
 */
public class ColaVista extends JFrame{
    JTextArea codigoG;
    public JPanel panelInterfaz;
    
     public ColaVista() throws HeadlessException {
        IniciarComponentes();
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        super.setSize(355, 450);
        super.setTitle("Cola");
        
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
        JButton agregarButton = crearBotonInterfaz("Encolar",20,350);
        panelInterfaz.add(agregarButton);
        
        JButton eliminarButton =crearBotonInterfaz("Desencolar", 200, 350);
        panelInterfaz.add(eliminarButton);
        
         String contenido= colaDatos.generagraph();        
        codigoG=new JTextArea();
        codigoG.setEditable(false);
        codigoG.setText(contenido);     
              
               
        JScrollPane codScroll =new JScrollPane(codigoG);        
        codScroll.setBounds(20, 20, 300, 300);
        
         panelInterfaz.add(codScroll);
         
          ActionListener agregarListener=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AgregarCola alC=new AgregarCola(codigoG);
               
                
            }
             
         };agregarButton.addActionListener(agregarListener);
         
         ActionListener eliminarListener=new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                 colaDatos.desencolar();
                 codigoG.setText(colaDatos.generagraph());

            }
         }; eliminarButton.addActionListener(eliminarListener);
    }
    
}
    

