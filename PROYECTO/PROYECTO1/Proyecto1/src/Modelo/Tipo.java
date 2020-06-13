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
public class Tipo {
    String nombre;
    double valormaximo;

    public Tipo(String nombre, String valormaximo) {
        this.nombre = nombre;
        this.valormaximo = Double.parseDouble(valormaximo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValormaximo() {
        return valormaximo;
    }

    public void setValormaximo(double valormaximo) {
        this.valormaximo = valormaximo;
    }
    
    
    
}
