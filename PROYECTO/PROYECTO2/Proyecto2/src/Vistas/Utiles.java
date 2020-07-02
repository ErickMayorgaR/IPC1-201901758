/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.tree.DefaultTreeSelectionModel;

/**
 *
 * @author Erick Mayorga
 */
public class Utiles {

    public JLabel crearLabel(int fila, int columna, String valor, String ColorL) {
        String ssColor = ColorL;
        String selectColor = null;
        Color c = null;

        switch (ssColor) {
            case "ROJO":
                selectColor = "RED";
                c = Color.RED;
                break;
            case "AZUL":
                selectColor = "BLUE";
                c = Color.BLUE;
                break;
            case "VERDE":
                selectColor = "GREEN";
                c = Color.GREEN;
                break;
            case "AMARILLO":
                selectColor = "YELLOW";
                c = Color.YELLOW;
                break;

            default:
                System.out.println("No agarro el switch case");
                System.out.println(ssColor);

        }
        JLabel casilla = new JLabel();
        casilla.setLayout(null);
        casilla.setText("<html><div style='text-align: center;'>" + valor + "</div></html>");
        casilla.setHorizontalAlignment(SwingConstants.CENTER);
        casilla.setVerticalAlignment(SwingConstants.CENTER);
        casilla.setOpaque(true);
        casilla.setBackground(c);

        casilla.setBounds(0 + (100 * columna), 0 + (100 * fila), 100, 100);
        casilla.setFont(new Font("TimesNewRoman", Font.PLAIN, 32));

        return casilla;
    }

    public JButton CrearBoton(int x, int y, String texto) {
        JButton boton = new JButton();
        boton.setText(texto);
        boton.setBounds(x, y, 125, 20);
        boton.setVisible(true);

        return boton;
    }

    public static JLabel crearLabelInterfaz(String texto, int x, int y) {
        JLabel label = new JLabel();
        label.setText(texto);
        label.setBounds(x, y, 120, 20);
        return label;
    }

    public static JButton crearBotonInterfaz(String texto, int x, int y) {
        JButton boton = new JButton();
        boton.setText(texto);
        boton.setBounds(x, y, 120, 20);

        return boton;

    }
}
