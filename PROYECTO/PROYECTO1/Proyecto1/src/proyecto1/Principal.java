/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Erick Mayorga
 */
public class Principal extends JFrame {
public JPanel principal;
    public Principal() {
        IniciarComponentes();
        
        setSize(750,400);
        setTitle("Menu Principal");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        

    }

    private void IniciarComponentes() {

        ColocarPaneles();
        ColocarEtiquetas();
        ColocarBotones();
        
    }
    
 private void ColocarPaneles(){
        
        principal=new JPanel();
    
    principal.setLayout(null);
    
    principal.setBackground(Color.BLACK);
    this.getContentPane().add(principal);
    
    }
    
    private void ColocarEtiquetas(){
    
    JLabel A1= new JLabel();
    
    A1.setText("Cargar Datos");
    A1.setOpaque(false);
    A1.setForeground(Color.WHITE);
    A1.setBounds(20, 20, 200, 50);
    A1.setFont(new Font("TimesNewRoman",Font.PLAIN,20));    
    principal.add(A1);
}
    
    private void ColocarBotones(){
        
        JButton Solicitar= new JButton();
        Solicitar.setText("Solicitar Seguro");
        Solicitar.setBounds(100, 250, 150, 40);
        principal.add(Solicitar);
        
        JButton login= new JButton();
        login.setText("Iniciar Sesion");
        login.setBounds(300, 250, 150, 40);
        principal.add(login);
        
        JButton salir= new JButton();
        salir.setText("Salir");
        salir.setBounds(500, 250, 150, 40);
        principal.add(salir);
        
        ActionListener SolicitarS = new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
               SolicitudSeguro solicitud = new SolicitudSeguro();
               
               
            }
        };
        Solicitar.addActionListener(SolicitarS);
         
    
    }   
}
