/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlDatosautomoviles;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author Erick Mayorga
 */
public class ReportarIncidente extends JFrame{
    public Object[][] datos;
    public Object[]encabezado={"CODIGO","NOMBRE","PRECIO"};
    
    
    public JPanel PanelIncidente;

    public ReportarIncidente() throws HeadlessException{

        setSize(550, 600);
        setTitle("Solicitar seguro Automas");
        setLocationRelativeTo(null);
        IniciarComponentes();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);

    }

    private void IniciarComponentes() {

        ColocarPaneles();
        ColocarEtiquetas();
        ColocarOtros();

    }

    private void ColocarPaneles() {

        PanelIncidente = new JPanel();

        PanelIncidente.setLayout(null);

        PanelIncidente.setBackground(Color.BLACK);
        this.getContentPane().add(PanelIncidente);

    }

    private void ColocarEtiquetas() {

        JLabel Dpiasegurado = new JLabel();
        Dpiasegurado.setText("DPI Asegurado");
        Dpiasegurado.setOpaque(false);
        Dpiasegurado.setForeground(Color.WHITE);
        Dpiasegurado.setBounds(20, 20, 200, 50);
        Dpiasegurado.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
        PanelIncidente.add(Dpiasegurado);

        JLabel DpiNoasegurado = new JLabel();
        DpiNoasegurado.setText("DPI Tercero");
        DpiNoasegurado.setOpaque(false);
        DpiNoasegurado.setForeground(Color.WHITE);
        DpiNoasegurado.setBounds(20, 50, 200, 50);
        DpiNoasegurado.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
        PanelIncidente.add(DpiNoasegurado);

        JLabel TipoServicios = new JLabel();
        TipoServicios.setText("Tipo servicios");
        TipoServicios.setOpaque(false);
        TipoServicios.setForeground(Color.WHITE);
        TipoServicios.setBounds(20, 80, 200, 50);
        TipoServicios.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
        PanelIncidente.add(TipoServicios);

        JLabel Repuesto = new JLabel();
        Repuesto.setText("Repuesto");
        Repuesto.setOpaque(false);
        Repuesto.setForeground(Color.WHITE);
        Repuesto.setBounds(20, 110, 200, 50);
        Repuesto.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
        PanelIncidente.add(Repuesto);      

       
       
     
    }

    private void ColocarOtros() {

        JButton Cotizar = new JButton();
        Cotizar.setText("Cotizar");
        Cotizar.setBounds(150, 340, 100, 20);
        PanelIncidente.add(Cotizar);

        JTextField DPIAS = new JTextField();
            DPIAS.setBounds(200, 35, 150, 20);
            PanelIncidente.add(DPIAS);

            JTextField DPItercero = new JTextField();
            DPItercero.setBounds(200, 65, 150, 20);
            PanelIncidente.add(DPItercero);

        JComboBox MecanicaBox = new JComboBox();
        MecanicaBox.setBounds(200, 95, 150, 20);
        PanelIncidente.add(MecanicaBox);

        JComboBox RepuestoBox = new JComboBox();
        RepuestoBox.setBounds(200, 125, 150, 20);
        PanelIncidente.add(RepuestoBox);
             
        ControlDatosautomoviles.Mecanicaenlista(MecanicaBox);
        ControlDatosautomoviles.Repuestoenlista(RepuestoBox);
        
        JCheckBox aseguradoCulpable= new JCheckBox();
        aseguradoCulpable.setBounds(360,95, 150,20);
        aseguradoCulpable.setText("Asegurado Culpable");
        aseguradoCulpable.setForeground(Color.white);
        aseguradoCulpable.setOpaque(false);
        PanelIncidente.add(aseguradoCulpable);
        
        JCheckBox terceroasegurado= new JCheckBox();
        terceroasegurado.setBounds(360,125, 200,20);
        terceroasegurado.setText("El tercero tiene seguro");
        terceroasegurado.setForeground(Color.white);
        terceroasegurado.setOpaque(false);
        PanelIncidente.add(terceroasegurado);
        
        JTable lista = new JTable(datos, encabezado);       
        lista.setBounds(20, 400, 500, 180);    
        
        PanelIncidente.add(lista);
        

        
        

      

        JButton SolicitarSeguro = new JButton();
        SolicitarSeguro.setText("<html><centrer>Solicitar Seguro<html>");
        SolicitarSeguro.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        SolicitarSeguro.setBounds(220, 480, 70, 50);
        PanelIncidente.add(SolicitarSeguro);

        JButton Cancelar = new JButton();
        Cancelar.setText("Cancelar");
        Cancelar.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        Cancelar.setBounds(300, 490, 80, 20);
        PanelIncidente.add(Cancelar);

    
}
}