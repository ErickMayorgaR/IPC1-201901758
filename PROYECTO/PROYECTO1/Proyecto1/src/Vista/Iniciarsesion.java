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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Erick Mayorga
 */
public class Iniciarsesion extends JFrame {

    public JPanel IniciarSesion;

    public Iniciarsesion() {
        IniciarComponentes();

        setSize(400, 200);
        setTitle("IniciarSesion");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void IniciarComponentes() {

        ColocarPaneles();

        ColocarBotones();
        ColocarEtiquetas();

    }

    private void ColocarPaneles() {

        IniciarSesion = new JPanel();

        IniciarSesion.setLayout(null);

        IniciarSesion.setBackground(Color.BLACK);
        this.getContentPane().add(IniciarSesion);

    }

    private void ColocarEtiquetas() {

        JLabel DpiJLabel = new JLabel();

        DpiJLabel.setText("Ingrese el DPI del usuario");
        DpiJLabel.setOpaque(false);
        DpiJLabel.setForeground(Color.WHITE);
        DpiJLabel.setBounds(20, 20, 200, 50);
        DpiJLabel.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
        IniciarSesion.add(DpiJLabel);

    }

    private void ColocarBotones() {

        JTextField Datos = new JTextField();
        Datos.setBounds(200, 35, 150, 20);
        IniciarSesion.add(Datos);

        JButton InicioS = new JButton();
        InicioS.setText("Ingresar");
        InicioS.setBounds(200, 100, 150, 40);
        IniciarSesion.add(InicioS);

        JButton Ingresar = new JButton();
        Ingresar.setText("Salir");
        Ingresar.setBounds(20, 100, 150, 40);
        IniciarSesion.add(Ingresar);
        
        
        ActionListener iniciar= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String inicio=Datos.getText();
                System.out.println(inicio);
                if("ADMIN".equals(inicio)){
                    System.out.println("IniciarSesion");
                    Administrador ad= new Administrador(); 
                   
                }else{
                    System.out.println("Error");
                }
            }
        }; InicioS.addActionListener(iniciar);
        
        
        
        
    }
    
    }
