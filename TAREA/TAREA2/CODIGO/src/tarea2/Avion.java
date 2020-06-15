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
public class Avion extends Transporte {
    
    private int cantidadpasajeros;
    private String marca;
    private String modelo;

    public Avion(int cantidadpasajeros, String marca, String modelo) {
         super(marca);
        this.cantidadpasajeros = cantidadpasajeros;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    
     @Override
    public void avanzar() { 
            m();
        
        System.out.println("AVANCE-AVION  "+this.getCantidadpasajeros()+"-"+this.getMarca()+"-"+this.getModelo() );
                }

    @Override
    public void frenar() {
        System.out.println("FRENE--AVION  "+this.getCantidadpasajeros()+"-"+this.getMarca()+"-"+this.getModelo()+"\n" );
    }

    /**
     * @return the cantidadpasajeros
     */
    public int getCantidadpasajeros() {
        return cantidadpasajeros;
    }

    /**
     * @param cantidadpasajeros the cantidadpasajeros to set
     */
    public void setCantidadpasajeros(int cantidadpasajeros) {
        this.cantidadpasajeros = cantidadpasajeros;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
