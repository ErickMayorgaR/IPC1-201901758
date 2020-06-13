/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.ControlDatosautomoviles.*;
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
public class CargarDatos extends JFrame {
    public JPanel Cargardatos;
    
    public CargarDatos() throws HeadlessException{
        IniciarComponentes();
        
        setSize(750,400);
        setTitle("Cargar Datos");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        

    }

    private void IniciarComponentes() {

        ColocarPaneles();
        
        ColocarBotones();
        
    }
    
 private void ColocarPaneles(){
        
        Cargardatos=new JPanel();
    
    Cargardatos.setLayout(null);
    
    Cargardatos.setBackground(Color.BLACK);
    this.getContentPane().add(Cargardatos);
    
    }
    
    
    
    

    
    private void ColocarBotones(){
        
       
        
        JButton CancelarButton= new JButton();
        CancelarButton.setText("Cancelar");
        CancelarButton.setBounds(100, 250, 150, 40);
        this.Cargardatos.add(CancelarButton);
        
        JButton CargaDatosButton= new JButton();
        CargaDatosButton.setText("Cargar Datos");
        CargaDatosButton.setBounds(300, 250, 150, 40);
        this.Cargardatos.add(CargaDatosButton);
        
        JTextArea CargaDatosArea=new JTextArea();
        CargaDatosArea.setBounds(100, 100,200 , 200);
        Cargardatos.add(CargaDatosArea);
        
        ActionListener CargaDat=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             Controlador.ControlDatosautomoviles.cargadatos(CargaDatosArea);
             
            }
        }
        
        
        
       
    
}
}
