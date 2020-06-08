/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Erick Mayorga
 */
public class ReporteJugador {
    String nombre;
    int intentos;
    int puntuacion;

    public ReporteJugador(String nombre, int intentos, int puntuacion) {
        this.nombre = nombre;
        this.intentos = intentos;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "nombre:   " + nombre + "  intentos  " + intentos + " puntuacion " + puntuacion;
    }
    
    
    
    
    
    
}
