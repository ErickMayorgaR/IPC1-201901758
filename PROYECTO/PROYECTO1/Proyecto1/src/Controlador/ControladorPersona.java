/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Mayorga
 */

 public class ControladorPersona {

    Persona[] solicitantes;
    int contadorpersonas;

    public ControladorPersona() {
        this.solicitantes = new Persona[20];
    }

    public void insertarPersona(Persona solicitanteSeguro) {
        if (this.contadorpersonas <= 19) {
            this.solicitantes[this.contadorpersonas] = solicitanteSeguro;
            this.contadorpersonas++;
        } else {
            JOptionPane.showMessageDialog(null, "Ya se lleno");

        }
    }
}
