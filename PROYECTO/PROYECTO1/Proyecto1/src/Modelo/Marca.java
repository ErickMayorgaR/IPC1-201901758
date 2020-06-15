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
public class Marca {
    String nombre;
    double porcentajeaumentom;

    public Marca(String anio, String porcentajeaumentom) {
        this.nombre = anio;
        this.porcentajeaumentom =Double.parseDouble(porcentajeaumentom);
    }

    public String getAnio() {
        return nombre;
    }

    public void setAnio(String anio) {
        this.nombre = anio;
    }

    public double getPorcentajeaumentom() {
        return porcentajeaumentom;
    }

    public void setPorcentajeaumentom(double porcentajeaumentom) {
        this.porcentajeaumentom = porcentajeaumentom;
    }
     @Override
    public String toString() {
        return  nombre;
    }
    
}
