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
public class Incidente {
    Eventualidad[] eventos=new Eventualidad[10];
    

    public Eventualidad[] getEventos() {
        return eventos;
    }

    public void setEventos(Eventualidad[] eventos) {
        this.eventos = eventos;
    }

   
    
    
    public void agregarEvento(Eventualidad ev) {

        for (int i = 0; i < 10; i++) {
            if (eventos[i] == null) {
                eventos[i] = ev;
                return;
            }
        }

    }

    public Object[][] tablaEv() {
        String[][] Evss = new String [10][3];              
        for (int i = 0; i < 10; i++) {
           if(eventos[i]!= null) {                
                for (int j = 0; j < 3; j++) {
                    
                    String[] eventosString;
                    eventosString = eventos[i].CreararreglosEv();
                    String ss = eventosString[j];
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
                    System.out.println(ss);
                    if (ss != null) {
                        Evss[i][j] = ss;
                    }
                    
                }
            }            

        }Object[][] tabla = Evss;
        return tabla;
        
    }

}
    

