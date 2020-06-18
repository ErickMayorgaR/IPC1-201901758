/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorPersona;
import static Controlador.ControladorPersona.solicitantes;
import Modelo.PersonaSeguro;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Erick Mayorga
 */
public class SolicitudesSeguro extends JFrame {

    String[] encabezadocolumna = {"DPI", "NOMBRE", "TELEFONO", "TIPO", "DESCRIPCION", "MONTO", "POLIZA", "DEDUCIBLE"};
    Object[][] datos;

    public JPanel Solicitud;

    public SolicitudesSeguro(){

        IniciarComponentes();

        setSize(1055, 400);
        setTitle("Solicitudes Seguros");
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

    private void ColocarOtros(){

        datos = ControladorPersona.tablaSol();
        Object[] encabezado = encabezadocolumna;

        JButton AprobarButton = new JButton();
        AprobarButton.setText("Aprobar");
        AprobarButton.setBounds(240, 300, 150, 40);
        Solicitud.add(AprobarButton);

        JButton login = new JButton();
        login.setText("Rechazar");
        login.setBounds(440, 300, 150, 40);
        Solicitud.add(login);

        JButton salir = new JButton();
        salir.setText("Cancelar");
        salir.setBounds(640, 300, 150, 40);
        Solicitud.add(salir);

        
        JLabel Encabezado = new JLabel();
        Encabezado.setText("            DPI                    NOMBRE             TELEFONO                TIPO             DESCRIPCION             MONTO                POLIZA              DEDUCIBLE");
        Encabezado.setOpaque(false);
        Encabezado.setForeground(Color.WHITE);
        Encabezado.setBounds(20, 20, 1000, 50);
        Encabezado.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
        Solicitud.add(Encabezado);
        
        
        JTable lista = new JTable(datos, encabezado);       
        lista.setBounds(20, 70, 1000, 180);     
        
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
