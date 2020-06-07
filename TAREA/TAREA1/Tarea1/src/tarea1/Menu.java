/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Scanner;

/**
 *
 * @author Erick Mayorga
 */
public class Menu {
    public static Seccion seccion;
    
    

    public Menu() {
        this.seccion = new Seccion();
        menu1();
    }
    public static void menu1(){
        
        Scanner lector =new Scanner(System.in);
        
        System.out.println("1.Asignar");
        
        System.out.println("2.Reporte Secciones\n\n");
        try{
        int opcion= lector.nextInt();
        
        switch(opcion){
            case 1:
               seccion.asignar();
               
               break;
               
            case 2:
            seccion.reportesecciones();
            
            
            
            break;
            
            default:
                
                System.out.println("Ingrese un numero valido\n\n");
                menu1();
        
           
            
                
        }
        }catch(Exception e){
            System.out.println("Ingrese un campo valido\n");
            
            menu1();
        }
        
        
        
    }
}
