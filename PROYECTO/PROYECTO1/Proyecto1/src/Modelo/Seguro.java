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
public class Seguro {
    String Tipo;
    String Uso;
    String Marca;
    String Linea;
    String Modelo;
    String Poliza;
    String Deducible;
    String Fechainicio;
    String Fechafin;

    public Seguro(String Tipo, String Uso, String Marca, String Linea, String Modelo, String Poliza, String Deducible) {
        this.Tipo = Tipo;
        this.Uso = Uso;
        this.Marca = Marca;
        this.Linea = Linea;
        this.Modelo = Modelo;
        this.Poliza = Poliza;
        this.Deducible = Deducible;
    }   
      
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getUso() {
        return Uso;
    }

    public void setUso(String Uso) {
        this.Uso = Uso;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getLinea() {
        return Linea;
    }

    public void setLinea(String Linea) {
        this.Linea = Linea;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPoliza() {
        return Poliza;
    }

    public void setPoliza(String Poliza) {
        this.Poliza = Poliza;
    }

    public String getDeducible() {
        return Deducible;
    }

    public void setDeducible(String Deducible) {
        this.Deducible = Deducible;
    }
    
    

   
}
