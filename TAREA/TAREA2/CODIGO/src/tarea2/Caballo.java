/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Erick Mayorga
 */
public class Caballo extends Transporte {
String nombre;
String raza;
int edad;

    public Caballo(String nombre, String raza, int edad) {
         super(nombre);
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    
    }

  

    @Override
    public void avanzar() {
               m();
        System.out.println("AVANCE-CABALLO  "+this.getNombre()+"-"+this.getRaza()+"-"+this.getEdad() );
    }

    @Override
    public void frenar() {
            
        System.out.println("FRENE-CABALLO  "+this.getNombre()+"-"+this.getRaza()+"-"+this.getEdad()+"\n"  );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
