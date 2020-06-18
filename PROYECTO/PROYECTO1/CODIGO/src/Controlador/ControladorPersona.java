/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import Modelo.PersonaNoAsegurada;
import Modelo.PersonaSeguro;
import java.io.ObjectOutput;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Mayorga
 */
public class ControladorPersona {

    public static Fecha fechasistemavar;

    public static PersonaSeguro[] solicitantes = new PersonaSeguro[10];
    public static PersonaAsegurada[] personaAsegurada = new PersonaAsegurada[10];
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

    public static Object[][] tablaAsegurados() {
        String[][] sss = new String[10][8];
        for (int i = 0; i < 10; i++) {
            if (solicitantes[i].Creararreglos()!= null) {
                for (int j = 0; j < 8; j++) {
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

    public static void aceptarSolicitud(String DPI) {
        for (int i = 0; i < 10; i++) {
            if (personaAsegurada[i] != null) {                
                if(personaAsegurada[i].getDpi().equals(DPI)){
                    
                     Fecha fechafin = new Fecha(fechasistemavar.getDia(), fechasistemavar.getMes() + 1, fechasistemavar.getAnio());
                    Seguro seguro = new Seguro(solicitantes[i].getDescripcion().getTipovehiculo(), solicitantes[i].getDescripcion().getUso(), solicitantes[i].getDescripcion().getMarca(), solicitantes[i].getDescripcion().getLinea(), solicitantes[i].getDescripcion().getModelo(), solicitantes[i].getPoliza(), solicitantes[i].getDeducible(), fechasistemavar, fechafin);
                    personaAsegurada[i].agregarSeguro(seguro);

                    
                    solicitantes[i] = null;
                    System.out.println("Si estaba un registrado");
                    return;
                }   
                }else if (solicitantes[i] != null) {
                if (String.valueOf(solicitantes[i].getDpi()).equals(DPI)) {
                    PersonaAsegurada pa = new PersonaAsegurada(solicitantes[i].getNombre(), solicitantes[i].getApellidos(), String.valueOf(solicitantes[i].getDpi()), String.valueOf(solicitantes[i].getTelefono()));

                    Fecha fechafin = new Fecha(fechasistemavar.getDia(), fechasistemavar.getMes() + 1, fechasistemavar.getAnio());
                    Seguro seguro = new Seguro(solicitantes[i].getDescripcion().getTipovehiculo(), solicitantes[i].getDescripcion().getUso(), solicitantes[i].getDescripcion().getMarca(), solicitantes[i].getDescripcion().getLinea(), solicitantes[i].getDescripcion().getModelo(), solicitantes[i].getPoliza(), solicitantes[i].getDeducible(), fechasistemavar, fechafin);
                    pa.agregarSeguro(seguro);

                    personaAsegurada[i] = pa;
                    solicitantes[i] = null;
                    System.out.println("Si estaba una solicitud");

                    return;
               
                }
            }

        }

    }
    
    public static Object[][] tablaSol() {
        String[][] sss = new String[10][8];
        for (int i = 0; i < 10; i++) {
                if (solicitantes[i] != null) {
                for (int j = 0; j < 8; j++) {
                    
                        String[] solicita;
                        solicita = solicitantes[i].Creararreglos();
                        String ss = solicita[j];
                        if (ss != null) {
                            sss[i][j] = ss;
                        
                    }
                }
            }
        }
        Object[][] tabla = sss;
        return tabla;
    }

    public static void fechasistema() {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = new GregorianCalendar();

        int dia = c2.get(Calendar.DATE);
        int mes = c2.get(Calendar.MONTH);
        int anio = c2.get(Calendar.YEAR);

        fechasistemavar.setAnio(anio);
        fechasistemavar.setDia(dia);
        fechasistemavar.setMes(mes);
        

    }
}



