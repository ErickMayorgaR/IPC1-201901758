/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Erick Mayorga
 */
public class tablero {
    int contadort;
    String guia1;
    String guia2;
    
    public static String[][] casilla;
    
    
     public void iniciartablero() {

        casilla = new String[10][10];

        for (int i = 0; i < 10; i++) {
            
        
            for (int j = 0; j < 10; j++) {
                casilla[i][j] = "| |";
            }
        }
        for(int i=0;i<10;i++){
            String guia=Integer.toString(contadort);
            casilla[i][0]= "|"+ guia+"|";
            casilla[0][i]="|"+ guia+"|";
            contadort++;        
        }
}
}

    

