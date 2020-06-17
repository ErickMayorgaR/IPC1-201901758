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
public class PersonaSeguro {
    String nombre;
    String apellidos;
    long dpi;
    int telefono;
    String Poliza;
    String deducible;
    String valorvehiculo;
    Descripcion descripcion;

    public PersonaSeguro(String nombre, String apellidos, long dpi,
            int telefono, String Poliza, String deducible, String valorvehiculo, Descripcion descripcion 
            ) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dpi = dpi;
        this.telefono = telefono;
        this.Poliza = Poliza;
        this.deducible = deducible;
        this.valorvehiculo = valorvehiculo;
      this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getDpi() {
        return dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPoliza() {
        return Poliza;
    }

    public void setPoliza(String Poliza) {
        this.Poliza = Poliza;
    }

    public String getDeducible() {
        return deducible;
    }

    public void setDeducible(String deducible) {
        this.deducible = deducible;
    }

    public String getValorvehiculo() {
        return valorvehiculo;
    }

    public void setValorvehiculo(String valorvehiculo) {
        this.valorvehiculo = valorvehiculo;
    }

    public Descripcion getDescripcion() {
     return descripcion;
   }

    public void setDescripcion(Descripcion descripcion) {
      this.descripcion = descripcion;
    }

       
    public String[] Creararreglos() {
        
        String[] info ={String.valueOf(dpi),this.nombre+this.apellidos,String.valueOf(telefono),"Automas",this.descripcion.toString(),this.valorvehiculo,this.Poliza,this.deducible};
        
        return info;
    }

    @Override
    public String toString() {
        return "nombre" + nombre + ", apellidos" + apellidos + ", dpi" + dpi + ", telefono" + telefono + ", Poliza" + Poliza + ", deducible" + deducible + ", valorvehiculo" + valorvehiculo;
    }

    
    
    
    
}
