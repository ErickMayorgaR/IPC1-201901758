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
public class Linea {
    String nombre;
    double porcentajeaumentoL;

    public Linea(String nombre, String valor) {
        this.nombre = nombre;
        this.porcentajeaumentoL = Double.parseDouble(valor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return porcentajeaumentoL;
    }

    public void setValor(double valor) {
        this.porcentajeaumentoL = valor;
    }
     @Override
    public String toString() {
        return  nombre;
    }
    
    
    
}
