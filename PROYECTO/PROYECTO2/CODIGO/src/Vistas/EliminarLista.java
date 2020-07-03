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
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Erick Mayorga
 */
public class EliminarLista extends JFrame{
    public JPanel panelInterfaz;

    public EliminarLista() throws HeadlessException {
        
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
        JLabel valorLabel = Utiles.crearLabelInterfaz("Valor", 40, 70);
        panelInterfaz.add(valorLabel);

        

        JButton eliminarButton = crearBotonInterfaz("Eliminar", 50, 150);
        panelInterfaz.add(eliminarButton);

        JTextField valorField = new JTextField();
        valorField.setBounds(80, 70, 100, 20);
        panelInterfaz.add(valorField);

       
        
        

        ActionListener eliminarListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"".equals(valorField.getText())){
                
                String quitarValor = valorField.getText();
                
                listaSDatos.eliminarNodo(quitarValor);
                
                ListaSimpleVista.codigoGLista.setText(listaSDatos.generagraph());
                
                valorField.setText(null);
                
                }
            }

        };
        eliminarButton.addActionListener(eliminarListener);

    }

}

    
    
