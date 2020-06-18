/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class Noasegurado extends JFrame {

    public JPanel PanelNoAsegurado;

    public Noasegurado() throws HeadlessException {

        IniciarComponentes();
        setSize(670, 400);
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

        PanelNoAsegurado = new JPanel();

        PanelNoAsegurado.setLayout(null);

        PanelNoAsegurado.setBackground(Color.BLACK);
        this.getContentPane().add(PanelNoAsegurado);

    }

    private void ColocarBotones() {

        JButton cerrarSesionB = new JButton();
        cerrarSesionB.setText("CerrarSesion");
        cerrarSesionB.setOpaque(false);
        cerrarSesionB.setBounds(20, 0, 100, 20);
        cerrarSesionB.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        PanelNoAsegurado.add(cerrarSesionB);

        

        JButton Incidentes = new JButton();
        Incidentes.setText("Mis Incidentes");
        Incidentes.setBounds(100, 300, 150, 30);
        PanelNoAsegurado.add(Incidentes);

        JButton salir = new JButton();
        salir.setText("Pagos");
        salir.setBounds(400, 300, 150, 30);
        PanelNoAsegurado.add(salir);

        JTextArea CargaDatosArea = new JTextArea();
        CargaDatosArea.setBounds(20, 30, 400, 100);
        PanelNoAsegurado.add(CargaDatosArea);

        JTextField fecha = new JTextField();
        fecha.setBounds(460, 30, 100, 25);
        PanelNoAsegurado.add(fecha);
        
         ActionListener cerrarListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        };
        cerrarSesionB.addActionListener(cerrarListener);

    }

}
