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
public class Modelo {

    String anio;
    double porcentajedep;

    public Modelo(String anio, String porcentaje){
        this.anio = anio;
        this.porcentajedep = Double.parseDouble(porcentaje);
    }

    /**
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * @return the porcentajedep
     */
    public double getValor() {
        return porcentajedep;
    }

    /**
     * @param valor the porcentajedep to set
     */
    public void setValor(double valor) {
        this.porcentajedep = valor;
    }

     @Override
    public String toString() {
        return  anio;
    }
}
