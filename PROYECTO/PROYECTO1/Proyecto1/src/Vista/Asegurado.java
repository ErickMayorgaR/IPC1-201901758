/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Erick Mayorga
 */
public class Asegurado extends JFrame{
    
    public JPanel PanelAsegurado;

    public Asegurado()throws HeadlessException{
        
                
        IniciarComponentes();
        setSize(670, 400);
        setTitle("Menu Asegurado");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void IniciarComponentes() {

        ColocarPaneles();

        ColocarBotones();

    }

    private void ColocarPaneles() {

        PanelAsegurado = new JPanel();

        PanelAsegurado.setLayout(null);

        PanelAsegurado.setBackground(Color.BLACK);
        this.getContentPane().add(PanelAsegurado);

    }

    private void ColocarBotones() {

        JButton cerrarSesionB = new JButton();
        cerrarSesionB.setText("CerrarSesion");
        cerrarSesionB.setOpaque(false);
        cerrarSesionB.setBounds(20, 0, 100, 20);
        cerrarSesionB.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        PanelAsegurado.add(cerrarSesionB);
        
      

        JButton MisSeguros = new JButton();
        MisSeguros.setText("Mis Seguros");
        MisSeguros.setBounds(50, 300, 150, 30);
        PanelAsegurado.add(MisSeguros);

        JButton Incidentes = new JButton();
        Incidentes.setText("Mis Incidentes");
        Incidentes.setBounds(250, 300, 150, 30);
        PanelAsegurado.add(Incidentes);

        JButton salir = new JButton();
        salir.setText("Pagos");
        salir.setBounds(450, 300, 150, 30);
        PanelAsegurado.add(salir);
        
           JTextArea CargaDatosArea=new JTextArea();
        CargaDatosArea.setBounds(20, 30,400, 100);
        PanelAsegurado.add(CargaDatosArea);
        
        JTextField fecha= new JTextField();
        fecha.setBounds(460, 30, 100, 25);
        PanelAsegurado.add(fecha);

    }    
}
