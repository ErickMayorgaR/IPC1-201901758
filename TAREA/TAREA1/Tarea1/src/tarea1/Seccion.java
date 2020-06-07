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
public class Seccion {

    Estudiante[] secciona = new Estudiante[5];
    Estudiante[] seccionb = new Estudiante[5];
    Estudiante[] seccionc = new Estudiante[5];
    int contadora;
    int contadorb;
    int contadorc;
    int contador;

    public Seccion() {
        this.secciona = secciona;
        this.seccionb = seccionb;
        this.seccionc = seccionc;

    }

    public void asignar() {
        Scanner lector = new Scanner(System.in);

        while (contador < 10) {
            System.out.println("¿A que seccion desea asignarse?");
            System.out.println("1.Seccion A");
            System.out.println("2.Seccion B");
            System.out.println("3.Menu Principal\n\n");
            try {
            int opcion = lector.nextInt();
            
                switch (opcion) {
                    case 1:
                        Scanner lectora = new Scanner(System.in);
                        Scanner lectoraa = new Scanner(System.in);

                        if (contadora < 5) {
                            contadora++;
                            contador++;
                            System.out.println("Ingrese su su nombre y un apellido");
                            String nombre = lectora.next();

                            System.out.println("Ingrese su carnet");
                            String carnet = lectoraa.next();

                            secciona[contadora - 1] = new Estudiante(nombre, carnet);

                        } else {
                            System.out.println("seccion llena, intente con alguna otra\n\n");
                        }

                        break;

                    case 2:

                        Scanner lectorb = new Scanner(System.in);
                        Scanner lectorbb = new Scanner(System.in);

                        if (contadorb < 5) {
                            contador++;
                            contadorb++;
                            System.out.println("Ingrese su nombre y un apellido");
                            String nombre = lectorb.next();

                            System.out.println("Ingrese su carnet");
                            String carnet = lectorbb.next();

                            seccionb[contadorb - 1] = new Estudiante(nombre, carnet);

                        } else {
                            System.out.println("seccion llena, intente con alguna otra");
                        }
                        break;

                    case 3:
                        Menu.menu1();

                    default:
                        System.out.println("");
                        break;
                }
                System.out.println("Hay  " + contador + " asignados\n\n");
                
            } catch (Exception e) {
                System.out.println("Ingrese un campo valido\n");
                Menu.menu1();

            }

        }

        if (contador >= 10) {
            System.out.println("Seccion llena, intente abrir una nueva");
            Menu.menu1();

        }

    }

    public void reportesecciones() {
        System.out.println("Estudiantes seccion A:");
        if (contadora > 0) {
            for (int i = 0; i < contadora; i++) {
                System.out.println(secciona[i].toString());
            }
            System.out.println("\n");
        } else {
            System.out.println("Aun no hay asignados en seccion A");
        }
   System.out.println("Estudiantes seccion B:");
        if(contadorb > 0) {
            
            
            
            for (int j = 0; j < contadorb; j++) {
                System.out.println(seccionb[j].toString());
            }
            System.out.println("\n");
        } else {
            System.out.println("Aun no hay asignados en seccion B\n\n");

        }
        System.out.println("\n");
 Menu.menu1();
    }

}
