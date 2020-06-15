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
public class PersonaSolicitante {
    String nombre;
    String apellidos;
    long dpi;
    int telefono;

    public PersonaSolicitante(String nombres, String apellitos, long dpi, int telefono) {
        this.nombre = nombres;
        this.apellidos = apellitos;
        this.dpi = dpi;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nombres) {
        this.nombre = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellitos) {
        this.apellidos = apellitos;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
  
    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombre + ", apellitos=" + apellidos + ", dpi=" + dpi + ", telefono=" + telefono + '}';
    }
    
    
    
}
