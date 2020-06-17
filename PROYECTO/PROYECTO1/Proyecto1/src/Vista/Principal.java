/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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

        setSize(750, 400);
        setTitle("Menu Principal");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void IniciarComponentes() {

        ColocarPaneles();

        ColocarBotones();

    }

    private void ColocarPaneles() {

        principal = new JPanel();

        principal.setLayout(null);

        principal.setBackground(Color.BLACK);
        this.getContentPane().add(principal);

    }

    private void ColocarBotones() {

        JButton Cargardatos = new JButton();
        Cargardatos.setText("Cargar Datos");
        Cargardatos.setOpaque(false);
        Cargardatos.setBounds(20, 20, 100, 20);
        Cargardatos.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        principal.add(Cargardatos);

        JButton Solicitar = new JButton();
        Solicitar.setText("Solicitar Seguro");
        Solicitar.setBounds(100, 250, 150, 40);
        principal.add(Solicitar);

        JButton login = new JButton();
        login.setText("Iniciar Sesion");
        login.setBounds(300, 250, 150, 40);
        principal.add(login);

        JButton salir = new JButton();
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

        ActionListener CargarDatosListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CargarDatos carga = new CargarDatos();

            }

        };
        Cargardatos.addActionListener(CargarDatosListener);
        
        ActionListener iniciars=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Iniciarsesion IS= new Iniciarsesion();
                
                
            }
            
        }; login.addActionListener(iniciars);
                
                
    }
    
    
    
}
