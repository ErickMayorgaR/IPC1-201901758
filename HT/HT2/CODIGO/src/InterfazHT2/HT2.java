/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazHT2;

/**
 *
 * @author Erick Mayorga
 */
public class HT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Controlador controlador= new Controlador();
        
       controlador.getCarga().avanzar();
       controlador.getCarga().frenar();
        
        
        controlador.getNegro().avanzar();
        controlador.getNegro().frenar();
        
        controlador.getComercial().avanzar();
         controlador.getComercial().frenar();
         
         controlador.getPrivado().avanzar();
                 controlador.getPrivado().frenar();

        
        controlador.getDeportivo().avanzar();
                controlador.getDeportivo().frenar();
        
        controlador.getEconomico().avanzar();
                controlador.getEconomico().frenar();

        
                
       

    }
    
}
