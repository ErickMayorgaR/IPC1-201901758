/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static Controladores.DatosTablero.listaSDatos;
import ListaSimple.NodoLSData;
import static Vistas.Utiles.crearBotonInterfaz;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Erick Mayorga
 */
public class AgregarLista extends JFrame {

    
    public JPanel panelInterfaz;

    public AgregarLista() throws HeadlessException {
        
        IniciarComponentes();
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        super.setSize(250, 240);
        super.setTitle("Agregar");

        super.setLocationRelativeTo(null);
        super.setVisible(true);
    }

    private void IniciarComponentes() {

        ColocarPaneles();
        ColocarOtros();

    }

    private void ColocarPaneles() {

        panelInterfaz = new JPanel();
        panelInterfaz.setFocusable(true);
        panelInterfaz.setLayout(null);
        panelInterfaz.setBackground(Color.gray);
        add(panelInterfaz);

    }

    public void ColocarOtros() {
        JLabel valorLabel = Utiles.crearLabelInterfaz("Valor", 40, 50);
        panelInterfaz.add(valorLabel);

        JLabel colorLabel = Utiles.crearLabelInterfaz("Color", 40, 100);
        panelInterfaz.add(colorLabel);

        JButton agregarButton = crearBotonInterfaz("Agregar", 50, 150);
        panelInterfaz.add(agregarButton);

        JTextField valorField = new JTextField();
        valorField.setBounds(80, 50, 100, 20);
        panelInterfaz.add(valorField);

        JTextField colorField = new JTextField();
        colorField.setBounds(80, 100, 100, 20);
        panelInterfaz.add(colorField);
        
        

        ActionListener agregarListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"".equals(valorField.getText())&&!"".equals(colorField.getText())){
                String agregarValor = valorField.getText();
                String agregarColor = colorField.getText();
                listaSDatos.insertarNodo(new NodoLSData(agregarValor, agregarColor));
                ListaSimpleVista.codigoGLista.setText(listaSDatos.generagraph());
                valorField.setText(null);
                colorField.setText(null);
                }
            }

        };
        agregarButton.addActionListener(agregarListener);

    }

}