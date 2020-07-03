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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Erick Mayorga
 */
public class ListaSimpleVista extends JFrame {
    public static JTextArea codigoGLista;
    public JPanel panelInterfazLista;
    
    
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

        panelInterfazLista = new JPanel();        
        panelInterfazLista.setFocusable(true);   
        panelInterfazLista.setLayout(null);
        panelInterfazLista.setBackground(Color.gray);
        add(panelInterfazLista);

        

    }

    public void ColocarOtros() {
        JButton agregarButton = crearBotonInterfaz("Agregar",20,350);
        panelInterfazLista.add(agregarButton);
        
        JButton eliminarButton =crearBotonInterfaz("Eliminar", 200, 350);
        panelInterfazLista.add(eliminarButton);
        
         
         
        codigoGLista=new JTextArea();
        codigoGLista.setEditable(false);
        codigoGLista.setText(listaSDatos.generagraph());     
              
               
        JScrollPane codScroll =new JScrollPane(codigoGLista);        
        codScroll.setBounds(20, 20, 300, 300);
        
         panelInterfazLista.add(codScroll);
         
         ActionListener agregarListener=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AgregarLista al=new AgregarLista();
               
                
            }
             
         };agregarButton.addActionListener(agregarListener);
         
         ActionListener eliminarListener=new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                 EliminarLista eL =new EliminarLista();   

            }
         }; eliminarButton.addActionListener(eliminarListener);
    }
    
}
