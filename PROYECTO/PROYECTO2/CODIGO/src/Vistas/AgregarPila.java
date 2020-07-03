/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static Controladores.DatosTablero.pilaDatos;
import static Vistas.Utiles.crearBotonInterfaz;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Erick Mayorga
 */
public class AgregarPila extends JFrame{
     JTextArea cod;
       public JPanel panelInterfaz;
    
     public AgregarPila (JTextArea codField) throws HeadlessException {
         cod=codField;
        IniciarComponentes();
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        super.setSize(250, 240);
        super.setTitle("Pila");        
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

       

        JButton agregarButton = crearBotonInterfaz("Agregar", 50, 150);
        panelInterfaz.add(agregarButton);
        

        JTextField valorField = new JTextField();
        valorField.setBounds(80, 70, 100, 20);
        panelInterfaz.add(valorField);
        
         ActionListener agregarListener = new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!"".equals(valorField.getText())){
                String agregarValor = valorField.getText();                
                pilaDatos.push((agregarValor));
                cod.setText(pilaDatos.generagraph());
                valorField.setText(null);
                
                }
            }

            
        };
        agregarButton.addActionListener(agregarListener);

    }

      
    
}
