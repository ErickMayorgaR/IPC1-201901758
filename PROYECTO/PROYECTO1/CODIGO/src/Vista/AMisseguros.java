/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorPersona;
import static Controlador.ControladorPersona.personaAsegurada;
import Modelo.PersonaAsegurada;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Erick Mayorga
 */
public class AMisseguros extends JFrame {

    String[] encabezadocolumna = {"CORRELATIVO", "TIPO", "TOTAL", "INICIO", "FIN "};
    Object[][] datos;
    int numerorefs;

    public void setNumerorefs(int numerorefs) {
        this.numerorefs = numerorefs;
    }

    public JPanel Solicitud;

    public AMisseguros() throws HeadlessException {

        IniciarComponentes();

        setSize(640, 400);
        setTitle("Mis Seguros");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

    }

    private void IniciarComponentes() {

        ColocarPaneles();
        ColocarOtros();

    }

    private void ColocarPaneles() {

        Solicitud = new JPanel();

        Solicitud.setLayout(null);

        Solicitud.setBackground(Color.BLACK);
        this.getContentPane().add(Solicitud);

    }

    private void ColocarOtros() {

        Object tabla[][] = personaAsegurada[numerorefs].tablaSolAS();
        datos = tabla;
        Object[] encabezado = encabezadocolumna;

        JButton AprobarButton = new JButton();
        AprobarButton.setText("Renovar");
        AprobarButton.setBounds(500, 80, 100, 25);
        Solicitud.add(AprobarButton);

        JTextArea CargaDatosArea = new JTextArea();
        CargaDatosArea.setBounds(20, 30, 200, 70);
        CargaDatosArea.append("nombre: " + personaAsegurada[numerorefs].getNombre() + " " + personaAsegurada[numerorefs].getApellido() + "\n");
        CargaDatosArea.append("Telefono: " + personaAsegurada[numerorefs].getTelefono() + "\n");
        CargaDatosArea.append("DPI:  " + personaAsegurada[numerorefs].getDpi() + "\n");
        Solicitud.add(CargaDatosArea);

        JTextField fecha = new JTextField();
        fecha.setBounds(500, 30, 100, 25);
        fecha.setText(ControladorPersona.fechasistemavar.toString());
        Solicitud.add(fecha);

        JLabel precioP = new JLabel();

        precioP.setText("Precio Prima \n");

        precioP.setOpaque(false);
        precioP.setForeground(Color.WHITE);
        precioP.setBounds(250, 10, 200, 50);
        precioP.setFont(new Font("TimesNewRoman", Font.PLAIN, 10));
        Solicitud.add(precioP);

        JLabel PrecioDeducible = new JLabel();

        PrecioDeducible.setText("Precio Deducible");
        PrecioDeducible.setOpaque(false);
        PrecioDeducible.setForeground(Color.WHITE);
        PrecioDeducible.setBounds(400, 10, 200, 60);
        PrecioDeducible.setFont(new Font("TimesNewRoman", Font.PLAIN, 10));
        Solicitud.add(PrecioDeducible);

        JLabel montoAsegurado = new JLabel();
        montoAsegurado.setText("Monto Asegurado\n");
        montoAsegurado.setOpaque(false);
        montoAsegurado.setForeground(Color.WHITE);
        montoAsegurado.setBounds(250, 80, 200, 50);
        montoAsegurado.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
        Solicitud.add(montoAsegurado);

        JLabel estadolaJLabel = new JLabel();
        estadolaJLabel.setText("Apellido");
        estadolaJLabel.setOpaque(false);
        estadolaJLabel.setForeground(Color.WHITE);
        estadolaJLabel.setBounds(400, 80, 200, 50);
        estadolaJLabel.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
        Solicitud.add(estadolaJLabel);

        JTable lista = new JTable(datos, encabezado);
        lista.setBounds(20, 150, 600, 150);

        Solicitud.add(lista);

        ActionListener AprobarS = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fila = lista.getSelectedRow();
                int columna = 0;
                Object obj = lista.getValueAt(fila, columna);
                String datoString = String.valueOf(obj);

                ControladorPersona.aceptarSolicitud(datoString);

            }
        };
        AprobarButton.addActionListener(AprobarS);

    }

}
