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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Erick Mayorga
 */
public class Administrador extends JFrame {

    public JPanel Admin;

    public Administrador() {
        IniciarComponentes();

        setSize(785, 600);
        setTitle("Menu Administrador");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    private void IniciarComponentes() {

        ColocarPaneles();

        ColocarBotones();

    }

    private void ColocarPaneles() {

        Admin = new JPanel();
        Admin.setLayout(null);
        Admin.setBackground(Color.BLACK);
        this.getContentPane().add(Admin);
    }

    private void ColocarBotones() {

        JButton Solicitudes = new JButton();
        Solicitudes.setText("Solicitudes Seguro");
        Solicitudes.setBounds(50, 250, 150, 40);
        //Solicitudes.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        Admin.add(Solicitudes);
        
        JButton Reportar = new JButton();
        Reportar.setText("Reportar Incidente");
        Reportar.setBounds(225, 250, 150, 40);
       // Reportar.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        Admin.add(Reportar);
        
        JButton Taller = new JButton();
        Taller.setText("Cola Taller");
        Taller.setBounds(400, 250, 150, 40);
        //Taller.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        Admin.add(Taller);            
        
        
        JButton Clinica = new JButton();
        Clinica.setText("Cola clinica");
        Clinica.setBounds(575, 250, 150, 40);
        //Clinica.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        Admin.add(Clinica);

        JButton Asegurados = new JButton();
        Asegurados.setText("Asegurados");
        Asegurados.setBounds(50, 500, 150, 40);
        Admin.add(Asegurados);

        JButton noasegurados = new JButton();
        noasegurados.setText("No asegurados");
        noasegurados.setBounds(225, 500, 150, 40);
        Admin.add(noasegurados);

        JButton reportes = new JButton();
        reportes.setText("Reportes");
        reportes.setBounds(400, 500, 150, 40);
        Admin.add(reportes);
                
        JButton cerrarsesion = new JButton();
        cerrarsesion.setText("Cerrar Sesion");
        cerrarsesion.setBounds(20, 20, 150, 20);
        cerrarsesion.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        Admin.add(cerrarsesion);
        
        
        
        ActionListener SolSeguro= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SolicitudesSeguro SS = new SolicitudesSeguro(); 
                setVisible(true);
            }
        }; Solicitudes.addActionListener(SolSeguro);  
        
        ActionListener reportarIncidenteListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReportarIncidente ri= new ReportarIncidente();
                
            }
        };Reportar.addActionListener(reportarIncidenteListener);
        
        
     }        
    
    
  }
