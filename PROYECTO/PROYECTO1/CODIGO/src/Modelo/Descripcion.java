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
public class Descripcion {
    String tipovehiculo;
    String modelo;
    String marca;
    String linea;
    String Uso;

    public Descripcion(String tipovehiculo, String modelo, String marca, String linea, String Uso) {
        this.tipovehiculo = tipovehiculo;
        this.modelo = modelo;
        this.marca = marca;
        this.linea = linea;
        this.Uso = Uso;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getUso() {
        return Uso;
    }

    public void setUso(String Uso) {
        this.Uso = Uso;
    }

    @Override
    public String toString() {
        return tipovehiculo + "," + modelo + "," + marca + "," + linea + "" + Uso;
            
            
    }       
                    
    
}
