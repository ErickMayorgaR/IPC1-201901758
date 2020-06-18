/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorPersona;
import static Controlador.ControladorPersona.personaAsegurada;
import Modelo.PersonaAsegurada;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.TextField;
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
public class Asegurado extends JFrame {

    public int numeroref;
    public JPanel PanelAsegurado;

    public int getNumeroref() {
        return numeroref;
    }

    public void setNumeroref(int numeroref) {
        this.numeroref = numeroref;
    }

    public Asegurado() throws HeadlessException {

        IniciarComponentes();
        setSize(670, 400);
        setTitle("Menu Asegurado");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

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

        JTextArea CargaDatosArea = new JTextArea();
        CargaDatosArea.setBounds(20, 30, 400, 100);
        CargaDatosArea.append("nombre: " + personaAsegurada[numeroref].getNombre() + " " + personaAsegurada[numeroref].getApellido() + "\n");
        CargaDatosArea.append("Telefono: " + personaAsegurada[numeroref].getTelefono() + "\n");
        CargaDatosArea.append("DPI:  " + personaAsegurada[numeroref].getDpi() + "\n");
        PanelAsegurado.add(CargaDatosArea);

        JTextField fecha = new JTextField();
        fecha.setBounds(460, 30, 100, 25);
        fecha.setText(ControladorPersona.fechasistemavar.toString());
        PanelAsegurado.add(fecha);

        ActionListener SegurosListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AMisseguros AMS = new AMisseguros();
                AMS.setNumerorefs(numeroref);

            }
        };
        MisSeguros.addActionListener(SegurosListener);
        
        

        ActionListener cerrarListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        };
        cerrarSesionB.addActionListener(cerrarListener);
    }
}
