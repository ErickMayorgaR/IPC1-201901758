/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Erick Mayorga
 */
public class PersonaAsegurada {
    String nombre;
    String Apellido;
    String Dpi;
    String telefono;
    Seguro[] seguro= new Seguro[10];

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
        return seguro;
    }

    public void setSeguro(Seguro[] seguro) {
        this.seguro = seguro;
    }
    
}
