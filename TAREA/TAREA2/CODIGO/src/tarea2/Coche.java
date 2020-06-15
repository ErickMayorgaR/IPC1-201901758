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
public class Coche extends Transporte{
    
    private String marca;            
    private int modelo;            
    private String tipovehiculo;
    
    

    public Coche(String marca, int modelo, String tipovehiculo) {
         super(marca);
        this.marca = marca;
        this.modelo = modelo;
        this.tipovehiculo = tipovehiculo;
    }
    
   
    
     @Override
    public void avanzar() {
            m();
        System.out.println("AVANCE-COCHE   "+this.getMarca()+"-"+this.getModelo()+"-"+this.getTipovehiculo() );
    }

    @Override
    public void frenar() {
        System.out.println("FRENE-COCHE   "+this.getMarca()+"-"+this.getModelo()+"-"+this.getTipovehiculo()+"\n" );
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
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tipovehiculo
     */
    public String getTipovehiculo() {
        return tipovehiculo;
    }

    /**
     * @param tipovehiculo the tipovehiculo to set
     */
    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }
}
