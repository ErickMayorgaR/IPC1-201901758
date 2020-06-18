/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.datatransfer.DataFlavor;

/**
 *
 * @author Erick Mayorga
 */
public class PersonaAsegurada {

    String nombre;
    String Apellido;
    String Dpi;
    String telefono;
    Seguro[] seguros = new Seguro[10];

    public PersonaAsegurada(String nombre, String Apellido, String Dpi, String telefono) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Dpi = Dpi;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDpi() {
        return Dpi;
    }

    public void setDpi(String Dpi) {
        this.Dpi = Dpi;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Seguro[] getSeguro() {
        return seguros;
    }

    public void setSeguro(Seguro[] seguro) {
        this.seguros = seguro;
    }

    public void agregarSeguro(Seguro unseguro) {

        for (int i = 0; i < 10; i++) {
            if (seguros[i] == null) {
                seguros[i] = unseguro;
                return;
            }
        }

    }

    public Object[][] tablaSolAS() {
        String[][] Pass = new String [10][5];
        
        for (int i = 0; i < 10; i++) {
            if(seguros[i]!= null) {
                Pass [i][0]=String.valueOf(1+i);
                for (int j = 0; j < 4; j++) {
                    {
                    String[] seguro;
                    seguro = seguros[i].CreararreglosS();
                    String ss = seguro[j];
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
                    System.out.println(ss);
                    if (ss != null) {
                        Pass[i][j+1] = ss;
                    }
                    }
                }
            }
            

        }Object[][] tabla = Pass;
        return tabla;
        
    }

}
