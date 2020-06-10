/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

/**
 *
 * @author Erick Mayorga
 */
public class SolicitudSeguro extends JFrame{
    
        public JPanel PanelSolicitud;
        
    public SolicitudSeguro (){
            
    
     setSize(400,700);
     setTitle("Solicitar seguro Automas");
     setLocationRelativeTo(null); 
     IniciarComponentes();
     setDefaultCloseOperation(HIDE_ON_CLOSE);
     setVisible(true);
    
    
    }
    
    private void IniciarComponentes(){
    
    ColocarPaneles();
    ColocarEtiquetas();
    ColocarOtros();
   
    }
    
    private void ColocarPaneles(){
        
        PanelSolicitud=new JPanel();
    
    PanelSolicitud.setLayout(null);
    
    PanelSolicitud.setBackground(Color.BLACK);
    this.getContentPane().add(PanelSolicitud);
    
    }
    
    private void ColocarEtiquetas(){
    
    JLabel Nombre= new JLabel();
    
    Nombre.setText("Nombre");
    Nombre.setOpaque(false);
    Nombre.setForeground(Color.WHITE);
    Nombre.setBounds(20, 20, 200, 50);
    Nombre.setFont(new Font("TimesNewRoman",Font.PLAIN,16));   
    PanelSolicitud.add(Nombre);
    
    JLabel Apellido= new JLabel();
    
    Apellido.setText("Apellido");
    Apellido.setOpaque(false);
    Apellido.setForeground(Color.WHITE);
    Apellido.setBounds(20, 50, 200, 50);
    Apellido.setFont(new Font("TimesNewRoman",Font.PLAIN,16));    
    PanelSolicitud.add(Apellido);
    
    
     JLabel DPI= new JLabel();
    
    DPI.setText("DPI");
    DPI.setOpaque(false);
    DPI.setForeground(Color.WHITE);
    DPI.setBounds(20, 80, 200, 50);
    DPI.setFont(new Font("TimesNewRoman",Font.PLAIN,16));    
    PanelSolicitud.add(DPI);
    
    JLabel Telefono= new JLabel();
     Telefono.setText("Telefono");
    Telefono.setOpaque(false);
    Telefono.setForeground(Color.WHITE);
    Telefono.setBounds(20, 110, 200, 50);
    Telefono.setFont(new Font("TimesNewRoman",Font.PLAIN,16));
    PanelSolicitud.add(Telefono);
    
    JLabel TipodeVehiculo= new JLabel();
     TipodeVehiculo.setText("Tipo de Vehiculo");
    TipodeVehiculo.setOpaque(false);
    TipodeVehiculo.setForeground(Color.WHITE);
    TipodeVehiculo.setBounds(20, 140, 200, 50);
    TipodeVehiculo.setFont(new Font("TimesNewRoman",Font.PLAIN,16));
    PanelSolicitud.add(TipodeVehiculo);
    
    JLabel UsodeVehiculo= new JLabel();
     UsodeVehiculo.setText("Uso de Vehiculo");
    UsodeVehiculo.setOpaque(false);
    UsodeVehiculo.setForeground(Color.WHITE);
    UsodeVehiculo.setBounds(20, 170, 200, 50);
    UsodeVehiculo.setFont(new Font("TimesNewRoman",Font.PLAIN,16));
    PanelSolicitud.add(UsodeVehiculo);
    
    JLabel Marca= new JLabel();
     Marca.setText("Marca");
    Marca.setOpaque(false);
    Marca.setForeground(Color.WHITE);
    Marca.setBounds(20, 200, 200, 50);
    Marca.setFont(new Font("TimesNewRoman",Font.PLAIN,16));
    PanelSolicitud.add(Marca);
    
    JLabel Linea= new JLabel();
     Linea.setText("Linea");
    Linea.setOpaque(false);
    Linea.setForeground(Color.WHITE);
    Linea.setBounds(20, 230, 200, 50);
    Linea.setFont(new Font("TimesNewRoman",Font.PLAIN,16));
    PanelSolicitud.add(Linea);
    
    
    JLabel Modelo= new JLabel();
     Modelo.setText("Modelo");
    Modelo.setOpaque(false);
    Modelo.setForeground(Color.WHITE);
    Modelo.setBounds(20, 260, 200, 50);
    Modelo.setFont(new Font("TimesNewRoman",Font.PLAIN,16));
    PanelSolicitud.add(Modelo);
    
    JLabel Valordevehiculo= new JLabel();
     Valordevehiculo.setText("Valor del vehiculo");
    Valordevehiculo.setOpaque(false);
    Valordevehiculo.setForeground(Color.WHITE);
    Valordevehiculo.setBounds(20, 290, 200, 50);
    Valordevehiculo.setFont(new Font("TimesNewRoman",Font.PLAIN,16));
    PanelSolicitud.add(Valordevehiculo);
   
    
    
    
    
    
}

    private void ColocarOtros(){
        
        
        
      JButton Cotizar= new JButton();
        Cotizar.setText("Cotizar");
        Cotizar.setBounds(150, 420, 100, 40);
        PanelSolicitud.add(Cotizar);
        
        JButton Cancelar= new JButton();
        Cancelar.setText("Cancelar");
        Cancelar.setBounds(300, 650, 80, 40);
        PanelSolicitud.add(Cancelar);
    
    
    
    
    JTextField NombreTextField = new JTextField();
    
    NombreTextField.setBounds(200, 20, 100, 30);
    PanelSolicitud.add(NombreTextField);
    
    JTextField ApellidoTextField = new JTextField();
    ApellidoTextField.setBounds(200, 70, 100, 30);
    PanelSolicitud.add(ApellidoTextField);
    
    JTextField DpiTextField = new JTextField();
    DpiTextField.setBounds(200, 170, 100, 30);
    PanelSolicitud.add(DpiTextField);
    
    JTextField TelefonoTextField = new JTextField();
    TelefonoTextField.setBounds(200, 220, 100, 30);
    PanelSolicitud.add(TelefonoTextField);
    
    
    
      JComboBox TipoBox= new JComboBox();
      TipoBox.setBounds(200, 120, 100, 30);
      PanelSolicitud.add(TipoBox);
      
       JComboBox UsoBox= new JComboBox();
      UsoBox.setBounds(200, 120, 100, 30);
      PanelSolicitud.add(UsoBox);
      
       JComboBox Marca= new JComboBox();
      Marca.setBounds(200, 120, 100, 30);
      PanelSolicitud.add(Marca);
      
       JComboBox Linea= new JComboBox();
      Linea.setBounds(200, 120, 100, 30);
      PanelSolicitud.add(Linea);
      
       JComboBox Modelo= new JComboBox();
      Modelo.setBounds(200, 120, 100, 30);
      PanelSolicitud.add(Modelo);
      
      

    
    }
    
    
}
    

