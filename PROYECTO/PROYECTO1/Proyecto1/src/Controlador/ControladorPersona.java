/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.PersonaNoAsegurada;
import Modelo.PersonaSeguro;
import java.io.ObjectOutput;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Mayorga
 */
public class ControladorPersona {

    public static PersonaSeguro[] solicitantes = new PersonaSeguro[10];
    public static PersonaSeguro[] personaAsegurada= new PersonaSeguro[10];
    public static int contadorpersonas;

    public static void insertarSolPersona(PersonaSeguro unSolicitanteSeguro) {

        for (int i = 0; i < 10; i++) {
            if (solicitantes[i] == null) {
                solicitantes[i] = unSolicitanteSeguro;

                System.out.println(solicitantes[i].toString());
                System.out.println(solicitantes[i]);
                contadorpersonas++;
                return;
            }
        }
    }

    public static Object[][] tabla() {
        String[][] sss = new String[10][8];
        for (int i = 0; i < 10; i++) {
            if (solicitantes[i] != null) {
                for (int j = 0; j < 8; j++) {
                    if (solicitantes[i].Creararreglos() != null);
                    {
                        String[] solicita;
                        solicita = solicitantes[i].Creararreglos();
                        String ss = solicita[j];
                        if (ss != null) {
                            sss[i][j] = ss;
                        }
                    }
                }
            }
        }
        Object[][] tabla = sss;
        return tabla;
    }



public static void aceptarSolicitud(String DPI){
     for (int i = 0; i < 10; i++) {
            if (solicitantes[i] != null) {
             if (String.valueOf(solicitantes[i].getDpi()).equals(DPI)){
                    personaAsegurada[i] = solicitantes[i];
                    solicitantes[i]= null;
                    return;
             }
            }
               
                
            }
    
}



}