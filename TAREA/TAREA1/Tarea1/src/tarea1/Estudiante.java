/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Erick Mayorga
 */
public class Estudiante {
    String nombre;
    String carnet;

    public Estudiante(String nombre, String carnet) {
        this.nombre = nombre;
        this.carnet=carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarne(String carne) {
        this.carnet = carne;
    }

    @Override
    public String toString() {
        return nombre + "  carnet:" + carnet;
    }
    
    
}
