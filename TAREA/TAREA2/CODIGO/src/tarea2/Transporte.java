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
public abstract class Transporte {
    String n;
    
  public Transporte(String Nombre){
     this.n =Nombre;
     
}
  abstract public void avanzar(); 
    abstract public void frenar();
    
public void m(){
    System.out.println("Me movilizo en  "+n);
}
    
    
}
