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
public class Controlador {
    private Avion comercial;
    private Avion privado;
    
    private Caballo negro;
    private Caballo carga;
    
    private Coche deportivo;
    private Coche economico;
    
    public Controlador(){
        this.comercial= new Avion(500, "Airbus", "A320");
        this.privado= new Avion(8, "Airbus special edition", "F15");
        
        this.negro=new Caballo("Chimuelo", "Frizon",5);
        this.carga=new Caballo("Andaluz", "Pura", 6);
        
        this.deportivo=new Coche("Laxus", 2020,"Sedan");
        this.economico=new Coche("Nissan", 2018, "Deportivo");
    }  

    /**
     * @return the comercial
     */
    public Avion getComercial() {
        return comercial;
    }

    /**
     * @param comercial the comercial to set
     */
    public void setComercial(Avion comercial) {
        this.comercial = comercial;
    }

    /**
     * @return the privado
     */
    public Avion getPrivado() {
        return privado;
    }

    /**
     * @param privado the privado to set
     */
    public void setPrivado(Avion privado) {
        this.privado = privado;
    }

    /**
     * @return the negro
     */
    public Caballo getNegro() {
        return negro;
    }

    /**
     * @param negro the negro to set
     */
    public void setNegro(Caballo negro) {
        this.negro = negro;
    }

    /**
     * @return the carga
     */
    public Caballo getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(Caballo carga) {
        this.carga = carga;
    }

    /**
     * @return the deportivo
     */
    public Coche getDeportivo() {
        return deportivo;
    }

    /**
     * @param deportivo the deportivo to set
     */
    public void setDeportivo(Coche deportivo) {
        this.deportivo = deportivo;
    }

    /**
     * @return the economico
     */
    public Coche getEconomico() {
        return economico;
    }

    /**
     * @param economico the economico to set
     */
    public void setEconomico(Coche economico) {
        this.economico = economico;
    }
    
}
