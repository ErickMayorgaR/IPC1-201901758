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
    String anio;
    double porcentajeaumentom;

    public Marca(String anio, String porcentajeaumentom) {
        this.anio = anio;
        this.porcentajeaumentom =Double.parseDouble(porcentajeaumentom);
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public double getPorcentajeaumentom() {
        return porcentajeaumentom;
    }

    public void setPorcentajeaumentom(double porcentajeaumentom) {
        this.porcentajeaumentom = porcentajeaumentom;
    }
    
    
}
