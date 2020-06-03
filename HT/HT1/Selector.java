/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht1;

import java.util.Scanner;

/**
 *
 * @author Erick Mayorga
 */
public class Selector {

    int A = 15;
    int B = 10;
    int C=0;
    int auxa;
    int auxb;
    int auxc;
            
    String sa;
    String sb;
    Scanner lector;
    String sa1 = "A";
    String sa2 = "B";
    boolean asignado = false;

    public Selector() {
        lector = new Scanner(System.in);
        Asignar();

    }

    public void Asignar() {

        while (asignado == false) {

            System.out.println("Por Favor seleccione la seccion a la que desea Entrar'A' o 'B'");

            sa = lector.nextLine();

            if (sa1 == null ? sa == null : sa1.equals(sa)) {

                if (A < 15) {
                    System.out.println("Se ha asignado de la seccion A");
                    auxa = A + 1;
                    A=auxa;
                    asignado = true;

                } else {
                    System.out.println("Intente con la seccion B");
                }
                
            } else if (sa2 == null ? sb == null : sa2.equals(sa)) {
                
                  if (B < 15) {
                    System.out.println("Se ha asignado de la seccion B");
                    auxb = B + 1;
                    B=auxb;
                    
                    asignado = true;
                    

                } else {
                    System.out.println("Se abrira la seccion C");
                    auxc=C+1;
                    C=auxc;
                    asignado = true;
                    

            }
        }

    }

}
}
