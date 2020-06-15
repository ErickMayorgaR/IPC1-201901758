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
import javax.swing.Painter;
import jdk.nashorn.api.tree.ReturnTree;


/**
 *
 * @author Erick Mayorga
 *
 */
public class ControlDatosautomoviles {

    public static Tipo[] tipos = new Tipo[20];
    public static Modelo[] modelos = new Modelo[20];
    public static Marca[] marcas = new Marca[20];
    public static Linea[] lineas = new Linea[20];
    public static Uso[] usos = new Uso[20];
    public static Mecanica[] mecanicas = new Mecanica[20];
    public static Repuesto[] repuestos = new Repuesto[20];
    int contadortipo;
    int contadormodelo;
    int contadoruso;
    int contadormarca;
    int contadorlinea;
    int contadormecanica;
    int contadorrepuesto;
    public static int Tarreglos=20;


  

    public static void cargadatos(JTextArea campotexto) {
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

    public static void agregartipo(Tipo untipo) {
        for (int i = 0; i < Tarreglos; i++) {
            if (tipos[i] == null) {
                tipos[i] = untipo;
                return;
            }
        }

    }

    public static void agregarmodelo(Modelo unModelo) {
        for (int i = 0; i < Tarreglos; i++) {
            if (modelos[i] == null) {
                modelos[i] = unModelo;
                return;
            }
        }

    }

    public static void agregarmarca(Marca unaMarca) {
        for (int i = 0; i < Tarreglos; i++) {
            if (marcas[i] == null) {
                marcas[i] = unaMarca;
                return;
            }
        }
    }

    public static void agregarlinea(Linea unaLinea) {
        for (int i = 0; i < Tarreglos; i++) {
            if (lineas[i] == null) {
                lineas[i] = unaLinea;
                return;
            }
        }
    }

    public static void agregaruso(Uso unUso) {
        for (int i = 0; i < Tarreglos; i++) {
            if (usos[i] == null) {
                usos[i] = unUso;
                return;
            }
        }
    }

    public static void agregarmecanica(Mecanica unaMecanica) {
        for (int i = 0; i < Tarreglos; i++) {
            if (mecanicas[i] == null) {
                mecanicas[i] = unaMecanica;
                return;
            }

        }
    }

    public static void agregarrepuesto(Repuesto unRepuesto) {
        for (int i = 0; i < Tarreglos; i++) {
            if (repuestos[i] == null) {
                repuestos[i] = unRepuesto;
                return;
            }
        }
    }

    public static void Tipoenlista(JComboBox lista) {
        lista.removeAllItems();
        
        for (int i = 0; i < Tarreglos; i++) {
            if (tipos[i]!= null) {
                
                lista.addItem(tipos[i]);
               
                
            }

        }
    }

    public static  void Usoenlista(JComboBox lista) {
        lista.removeAllItems();
        for (int i = 0; i < Tarreglos; i++) {
            if (usos[i] != null) {
                lista.addItem(usos[i]);
            }
        }
    }
    
    public static void Marcaenlista(JComboBox lista) {
        lista.removeAllItems();
        for (int i = 0; i < Tarreglos; i++) {
            if (marcas[i] != null) {
                lista.addItem(marcas[i]);
            }
        }
    }
    
    public static void Lineaenlista(JComboBox lista) {
        lista.removeAllItems();
        for (int i = 0; i < Tarreglos; i++) {
            if (lineas[i] != null) {
                lista.addItem(lineas[i]);
            }
        }
    }
    
    public static void Modeloenlista(JComboBox lista) {
        lista.removeAllItems();
        for (int i = 0; i < Tarreglos; i++) {
            if (modelos[i] != null) {
                lista.addItem(modelos[i]);
            }
        }
    }
    
    public static double calculoPTR(JComboBox j1, JComboBox j2, JComboBox j3){
       
      Marca marcaseleccionada= (Marca)j1.getSelectedItem();
      Linea lineaseleccionada=(Linea)j2.getSelectedItem();
      Uso usoseleccionado=(Uso)j3.getSelectedItem();
      
      double PTR= marcaseleccionada.getPorcentajeaumentom()+lineaseleccionada.getValor()+usoseleccionado.getPorcentajeaumentoU();
        System.out.println(PTR);
        return PTR;
        
        
    }
    
    public static double valorreal(JComboBox j1, JComboBox j2){
      Tipo tiposelect=(Tipo)j1.getSelectedItem();
      Modelo modeloselect=(Modelo)j2.getSelectedItem();
      
      double valorreal=  tiposelect.getValormaximo()-(modeloselect.getValor()*tiposelect.getValormaximo());
      
        return valorreal;
    }
       
        
        
      
    
   }
