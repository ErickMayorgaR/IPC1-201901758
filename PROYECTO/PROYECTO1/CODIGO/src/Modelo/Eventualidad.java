/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.management.StringValueExp;

/**
 *
 * @author Erick Mayorga
 */
public class Eventualidad {
    String nombre;
    double costo;
    int registro;

    public Eventualidad(String nombre, double costo, int registro) {
        this.nombre = nombre;
        this.costo = costo;
        this.registro = registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
     public String[] CreararreglosEv() {
        
        String[] info ={String.valueOf(this.getRegistro()),getNombre(),String.valueOf(this.getCosto())};
        
        return info;
    }
    
}

   
