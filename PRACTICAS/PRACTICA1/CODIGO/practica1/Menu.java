/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

public class Menu {

    public boolean status;
    public int ejemplo = 3;
    public int opcion;
    public Scanner lector;
    
    
    
    public Menu (){
        
        this.status=false;
        this.lector= new Scanner(System.in);
        
    }

    public void iniciarM() {
        
        

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
opcion= this.lector.nextInt();
//poner la excepcion
            switch (opcion) {
                case 0:
                     menuprincipal();
                    break;
                case 1:
                    iniciarjuego();
                    
                    break;
                case 2:
                    reportes();
                    
                    break;
                case 3:
                    salida();
                    
                    break;
                case 4:
                    break;

            }

        } while (status);
        {
        }
    }

    private void menuprincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void iniciarjuego() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void reportes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void salida() {
        System.exit(0);
    }
}
