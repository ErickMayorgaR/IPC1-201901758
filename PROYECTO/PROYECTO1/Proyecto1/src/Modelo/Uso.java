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
public class Uso {
    String nombre;
    double porcentajeaumentoU;

    public Uso(String nombre, String porcentajeaumentoU) {
        this.nombre = nombre;
        this.porcentajeaumentoU = Double.parseDouble(porcentajeaumentoU);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentajeaumentoU() {
        return porcentajeaumentoU;
    }

    public void setPorcentajeaumentoU(double porcentajeaumentoU) {
        this.porcentajeaumentoU = porcentajeaumentoU;
    }
    
    
    
}
