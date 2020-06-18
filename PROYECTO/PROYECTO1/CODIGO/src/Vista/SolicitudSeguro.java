/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.PersonaSeguro;
import java.awt.Color;
import java.awt.Font;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import Controlador.*;
import Modelo.*;
import Modelo.Descripcion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Mayorga
 */
public class SolicitudSeguro extends JFrame {

    ControladorPersona ControlSolicitud = new ControladorPersona();
    ControlDatosautomoviles controlData = new ControlDatosautomoviles();

        public JPanel PanelSolicitud;

        public SolicitudSeguro() {

            setSize(400, 600);
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

            PanelSolicitud = new JPanel();

            PanelSolicitud.setLayout(null);

            PanelSolicitud.setBackground(Color.BLACK);
            this.getContentPane().add(PanelSolicitud);

        }

        private void ColocarEtiquetas() {

            JLabel Nombre = new JLabel();

            Nombre.setText("Nombre");
            Nombre.setOpaque(false);
            Nombre.setForeground(Color.WHITE);
            Nombre.setBounds(20, 20, 200, 50);
            Nombre.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(Nombre);

            JLabel Apellido = new JLabel();

            Apellido.setText("Apellido");
            Apellido.setOpaque(false);
            Apellido.setForeground(Color.WHITE);
            Apellido.setBounds(20, 50, 200, 50);
            Apellido.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(Apellido);

            JLabel DPI = new JLabel();

            DPI.setText("DPI");
            DPI.setOpaque(false);
            DPI.setForeground(Color.WHITE);
            DPI.setBounds(20, 80, 200, 50);
            DPI.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(DPI);

            JLabel Telefono = new JLabel();
            Telefono.setText("Telefono");
            Telefono.setOpaque(false);
            Telefono.setForeground(Color.WHITE);
            Telefono.setBounds(20, 110, 200, 50);
            Telefono.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(Telefono);

            JLabel TipodeVehiculo = new JLabel();
            TipodeVehiculo.setText("Tipo de Vehiculo");
            TipodeVehiculo.setOpaque(false);
            TipodeVehiculo.setForeground(Color.WHITE);
            TipodeVehiculo.setBounds(20, 140, 200, 50);
            TipodeVehiculo.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(TipodeVehiculo);

            JLabel UsodeVehiculo = new JLabel();
            UsodeVehiculo.setText("Uso de Vehiculo");
            UsodeVehiculo.setOpaque(false);
            UsodeVehiculo.setForeground(Color.WHITE);
            UsodeVehiculo.setBounds(20, 170, 200, 50);
            UsodeVehiculo.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(UsodeVehiculo);

            JLabel Marca = new JLabel();
            Marca.setText("Marca");
            Marca.setOpaque(false);
            Marca.setForeground(Color.WHITE);
            Marca.setBounds(20, 200, 200, 50);
            Marca.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(Marca);

            JLabel Linea = new JLabel();
            Linea.setText("Linea");
            Linea.setOpaque(false);
            Linea.setForeground(Color.WHITE);
            Linea.setBounds(20, 230, 200, 50);
            Linea.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(Linea);

            JLabel Modelo = new JLabel();
            Modelo.setText("Modelo");
            Modelo.setOpaque(false);
            Modelo.setForeground(Color.WHITE);
            Modelo.setBounds(20, 260, 200, 50);
            Modelo.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(Modelo);

            JLabel Valordevehiculo = new JLabel();
            Valordevehiculo.setText("Valor del vehiculo");
            Valordevehiculo.setOpaque(false);
            Valordevehiculo.setForeground(Color.WHITE);
            Valordevehiculo.setBounds(20, 290, 200, 50);
            Valordevehiculo.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(Valordevehiculo);

            JLabel CostoPrima = new JLabel();
            CostoPrima.setText("Costo Prima");
            CostoPrima.setOpaque(false);
            CostoPrima.setForeground(Color.WHITE);
            CostoPrima.setBounds(20, 370, 100, 50);
            CostoPrima.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(CostoPrima);

            JLabel Deducible = new JLabel();
            Deducible.setText("Deducible");
            Deducible.setOpaque(false);
            Deducible.setForeground(Color.WHITE);
            Deducible.setBounds(200, 370, 100, 50);
            Deducible.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(Deducible);

            JLabel PosibleCostoP = new JLabel();
            PosibleCostoP.setText("Posible Costo Prima");
            PosibleCostoP.setOpaque(false);
            PosibleCostoP.setForeground(Color.WHITE);
            PosibleCostoP.setBounds(40, 400, 200, 50);
            PosibleCostoP.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(PosibleCostoP);

            JLabel PosibleDeducible = new JLabel();
            PosibleDeducible.setText("Posible Deducible");
            PosibleDeducible.setOpaque(false);
            PosibleDeducible.setForeground(Color.WHITE);
            PosibleDeducible.setBounds(40, 430, 200, 50);
            PosibleDeducible.setFont(new Font("TimesNewRoman", Font.PLAIN, 16));
            PanelSolicitud.add(PosibleDeducible);

        }

        private void ColocarOtros() {

            JButton Cotizar = new JButton();
            Cotizar.setText("Cotizar");
            Cotizar.setBounds(150, 340, 100, 20);
            PanelSolicitud.add(Cotizar);

            JTextField NombreTextField = new JTextField();
            NombreTextField.setBounds(200, 35, 150, 20);
            PanelSolicitud.add(NombreTextField);

            JTextField ApellidoTextField = new JTextField();
            ApellidoTextField.setBounds(200, 65, 150, 20);
            PanelSolicitud.add(ApellidoTextField);

            JTextField DpiTextField = new JTextField();
            DpiTextField.setBounds(200, 95, 150, 20);
            PanelSolicitud.add(DpiTextField);

            JTextField TelefonoTextField = new JTextField();
            TelefonoTextField.setBounds(200, 125, 150, 20);
            PanelSolicitud.add(TelefonoTextField);

            JComboBox TipoBox = new JComboBox();
            TipoBox.setBounds(200, 155, 150, 20);
            PanelSolicitud.add(TipoBox);

            JComboBox UsoBox = new JComboBox();
            UsoBox.setBounds(200, 185, 150, 20);
            PanelSolicitud.add(UsoBox);

            JComboBox MarcaBox = new JComboBox();
            MarcaBox.setBounds(200, 215, 150, 20);
            PanelSolicitud.add(MarcaBox);

            JComboBox LineaBox = new JComboBox();
            LineaBox.setBounds(200, 245, 150, 20);
            PanelSolicitud.add(LineaBox);

            JComboBox ModeloBox = new JComboBox();
            ModeloBox.setBounds(200, 275, 150, 20);
            PanelSolicitud.add(ModeloBox);

            ControlDatosautomoviles.Usoenlista(UsoBox);
            ControlDatosautomoviles.Tipoenlista(TipoBox);
            ControlDatosautomoviles.Lineaenlista(LineaBox);
            ControlDatosautomoviles.Marcaenlista(MarcaBox);
            ControlDatosautomoviles.Modeloenlista(ModeloBox);

            JTextField ValorVehiculoTextField = new JTextField();
            ValorVehiculoTextField.setBounds(200, 305, 150, 20);
            PanelSolicitud.add(ValorVehiculoTextField);

            JTextField CostoPrimaTextField = new JTextField();
            CostoPrimaTextField.setBounds(110, 385, 80, 20);
            CostoPrimaTextField.setEditable(false);
            PanelSolicitud.add(CostoPrimaTextField);

            JTextField DeducibleTextField = new JTextField();
            DeducibleTextField.setBounds(280, 385, 80, 20);
            DeducibleTextField.setEditable(false);
            PanelSolicitud.add(DeducibleTextField);

            JTextField PosibleCostoPTextField = new JTextField();
            PosibleCostoPTextField.setBounds(200, 415, 140, 20);
            PosibleCostoPTextField.setEditable(false);
            PanelSolicitud.add(PosibleCostoPTextField);

            JTextField PosibleDeducibleTextField = new JTextField();
            PosibleDeducibleTextField.setBounds(200, 445, 140, 20);
            PosibleDeducibleTextField.setEditable(false);
            PanelSolicitud.add(PosibleDeducibleTextField);

            JButton menosdeducible = new JButton();
            menosdeducible.setText("<html><center>-Deducible<html>");
            menosdeducible.setBounds(20, 490, 90, 20);
            menosdeducible.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
            PanelSolicitud.add(menosdeducible);

            JButton masdeducible = new JButton();
            masdeducible.setText("<html><center>+Deducible<html>");
            masdeducible.setBounds(120, 490, 90, 20);
            masdeducible.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
            PanelSolicitud.add(masdeducible);

            JButton SolicitarSeguro = new JButton();
            SolicitarSeguro.setText("<html><centrer>Solicitar Seguro<html>");
            SolicitarSeguro.setFont(new Font("TimesNewRoman", Font.BOLD, 10));

            SolicitarSeguro.setBounds(220, 480, 70, 50);
            PanelSolicitud.add(SolicitarSeguro);

            JButton Cancelar = new JButton();
            Cancelar.setText("Cancelar");
            Cancelar.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
            Cancelar.setBounds(300, 490, 80, 20);
            PanelSolicitud.add(Cancelar);

        ActionListener cotizarActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor = ValorVehiculoTextField.getText();

                double valorvehiculo = Double.parseDouble(valor);
                double valorreal = ControlDatosautomoviles.valorreal(TipoBox, ModeloBox);
                double primatot = valorvehiculo * (0.1 + ControlDatosautomoviles.calculoPTR(MarcaBox, LineaBox, UsoBox));
                if (valorvehiculo > valorreal) {
                    JOptionPane.showMessageDialog(null, "ingreso un valor de vehiculo no aceptable");
                } else {
                    double cp = primatot / 12;
                    double cd = 0.07 * valorvehiculo;
                    CostoPrimaTextField.setText(String.valueOf(cp));
                    DeducibleTextField.setText(String.valueOf(cd));
                    PosibleCostoPTextField.setText(String.valueOf(cp));
                    PosibleDeducibleTextField.setText(String.valueOf(cd));
                }
            }
        };
        Cotizar.addActionListener(cotizarActionListener);

        ActionListener menosdeducibleAL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cprima = Double.parseDouble(CostoPrimaTextField.getText());
                double cdeducible = Double.parseDouble(DeducibleTextField.getText());

                double menosd = cdeducible - (cdeducible / 10);
                double masd = cdeducible + (cdeducible / 10);
                double maspr = cprima + (0.03 * cprima);
                double menospr = cprima - (0.03 * cprima);
                double PC = Double.parseDouble(PosibleDeducibleTextField.getText());

                if (PC == masd) {
                    PosibleCostoPTextField.setText(String.valueOf(cprima));
                    PosibleDeducibleTextField.setText(String.valueOf(cdeducible));

                } else {

                    PosibleCostoPTextField.setText(String.valueOf(maspr));
                    PosibleDeducibleTextField.setText(String.valueOf(menosd));
                }
            }
        };
        menosdeducible.addActionListener(menosdeducibleAL);

        ActionListener masdeducibleAL = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double cprima = Double.parseDouble(CostoPrimaTextField.getText());
                double cdeducible = Double.parseDouble(DeducibleTextField.getText());

                double masd = cdeducible + (cdeducible / 10);
                double menosd = cdeducible - (cdeducible / 10);
                double maspr = cprima + (0.03 * cprima);
                double menospr = cprima - (0.03 * cprima);
                double PC = Double.parseDouble(PosibleDeducibleTextField.getText());

                if (PC == menosd) {
                    PosibleCostoPTextField.setText(String.valueOf(cprima));
                    PosibleDeducibleTextField.setText(String.valueOf(cdeducible));

                } else {

                    PosibleCostoPTextField.setText(String.valueOf(menospr));
                    PosibleDeducibleTextField.setText(String.valueOf(masd));
                }

            }
        };
        masdeducible.addActionListener(masdeducibleAL);

        ActionListener SolicitarSeguroListener;
        SolicitarSeguroListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Nombre = NombreTextField.getText();
                String Apellido = ApellidoTextField.getText();
                
                String DPIS = DpiTextField.getText();
                long DPI = Long.parseLong(DPIS);
                
                String telefonoS = TelefonoTextField.getText();
                int telefono = Integer.parseInt(telefonoS);
                
                String Poliza= PosibleCostoPTextField.getText();
                String Deducible=PosibleDeducibleTextField.getText();
                
                String valorvehiculo=ValorVehiculoTextField.getText();

                Tipo estetipo = (Tipo) TipoBox.getSelectedItem();
                String TipoS = estetipo.getNombre();
                
                Modelo estemodelo = (Modelo) ModeloBox.getSelectedItem();
                String modeloS = estemodelo.getAnio();
                Marca estamarca = (Marca) MarcaBox.getSelectedItem();
                String marcaS = estamarca.getNombre();
                Linea estalinea = (Linea) LineaBox.getSelectedItem();
                String lineaS = estalinea.getNombre();
                Uso esteuso = (Uso) UsoBox.getSelectedItem();
                String usoS = esteuso.getNombre();

                Descripcion descripcionS= new Descripcion(TipoS, modeloS, marcaS, lineaS, usoS);
                
                
                
                
                ControladorPersona.insertarSolPersona(new PersonaSeguro(Nombre, Apellido, DPI, telefono, Poliza, Deducible, valorvehiculo,descripcionS));

            }
        };
SolicitarSeguro.addActionListener(SolicitarSeguroListener);
                
      
       ActionListener CancelarListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
       };
       
    }

}
