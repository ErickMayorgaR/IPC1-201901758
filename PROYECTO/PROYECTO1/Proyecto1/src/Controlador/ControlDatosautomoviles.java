/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Erick Mayorga
 *
 */
public class ControlDatosautomoviles {

    public Tipo[] tipos = new Tipo[20];
    public Modelo[] modelos = new Modelo[20];
    public Marca[] marcas = new Marca[20];
    public Linea[] lineas = new Linea[20];
    public Uso[] usos = new Uso[20];
    public Mecanica[] mecanicas = new Mecanica[20];
    public Repuesto[] repuestos = new Repuesto[20];
    int contadortipo;
    int contadormodelo;
    int contadoruso;
    int contadormarca;
    int contadorlinea;
    int contadormecanica;
    int contadorrepuesto;
    int Tarreglos = 20;
    
    

    public void cargadatos(JTextArea campotexto) {
        String datos = campotexto.getText();
        String[] arreglo = datos.split("\n");

        for (String categoria : arreglo) {
            String[] clasificar = categoria.split(",");
            switch (clasificar[0]) {
                case "TIPO":
                    agregartipo(new Tipo(clasificar[1], clasificar[2]));
                    break;
                case "MODELO":
                    agregarmodelo(new Modelo(clasificar[1], clasificar[2]));
                    break;
                case "MARCA":
                    agregarmarca(new Marca(clasificar[1], clasificar[2]));
                    break;
                case "LINEA":
                    agregarlinea(new Linea(clasificar[1], clasificar[2]));
                    break;
                case "USO":
                    agregaruso(new Uso(clasificar[1], clasificar[2]));
                    break;
                case "MECANICA":
                    agregarmecanica(new Mecanica(clasificar[1], clasificar[2]));
                    break;
                case "REPUESTO":
                    agregarrepuesto(new Repuesto(clasificar[1], clasificar[2]));
                    break;
            }
        }

    }

    public void agregartipo(Tipo untipo) {
        for (int i = 0; i < Tarreglos; i++) {
            if (tipos[i] == null) {
                tipos[i] = untipo;
            }
        }

    }

    public void agregarmodelo(Modelo unModelo) {
        for (int i = 0; i < Tarreglos; i++) {
            if (modelos[i] == null) {
                modelos[i] = unModelo;
            }
        }

    }

    public void agregarmarca(Marca unaMarca) {
        for (int i = 0; i < Tarreglos; i++) {
            if (marcas[i] == null) {
                marcas[i] = unaMarca;
            }
        }
    }

    public void agregarlinea(Linea unaLinea) {
        for (int i = 0; i < Tarreglos; i++) {
            if (lineas[i] == null) {
                lineas[i] = unaLinea;
            }
        }
    }

    public void agregaruso(Uso unUso) {
        for (int i = 0; i < Tarreglos; i++) {
            if (usos[i] == null) {
                usos[i] = unUso;
            }
        }
    }

    public void agregarmecanica(Mecanica unaMecanica) {
        for (int i = 0; i < Tarreglos; i++) {
            if (mecanicas[i] == null) {
                mecanicas[i] = unaMecanica;
            }

        }
    }

    public void agregarrepuesto(Repuesto unRepuesto) {
        for (int i = 0; i < Tarreglos; i++) {
            if (repuestos[i] == null) {
                repuestos[i] = unRepuesto;
            }
        }
    }
    
    public void Tipoenlista(JComboBox lista){
        lista.removeAllItems();
        for(int i=0; i<Tarreglos; i++){
            lista.addItem(this.tipos[i]);
        }
        
    }

}
