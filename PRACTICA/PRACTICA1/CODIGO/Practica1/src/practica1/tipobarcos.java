/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.text.Normalizer;
import java.util.Scanner;
import static practica1.Menu.contadorb;
import static practica1.Menu.nd;
import static practica1.Menu.negg;
import static practica1.tablero.casilla;
import static practica1.Menu.np;
import static practica1.Menu.nsb;
import static practica1.Menu.nf;
import static practica1.Menu.ntot;

/**
 *
 * @author Erick Mayorga
 */
public class tipobarcos {

    int[] ax1 = new int[9];
    int[] ay1 = new int[9];
    int[] ax2 = new int[9];
    int[] ay2 = new int[9];

    int eggnx;
    int eggny;
    String easteregg;

    public void ingresarportaaviones(int x1, int x2, int y1, int y2) {

        if (x2 - x1 == 3 && y1 - y2 == 0) {

            int contador = 0;
            for (int i = x1; i <= x2; i++) {

                if ("|o|".equals(casilla[i][y1])) {
                    contador++;
                }
            }
            if (contador < 1) {

                ax1[ntot] = x1;
                ay1[ntot] = y1;
                ax2[ntot] = x2;
                ay2[ntot] = y2;

                np++;
                ntot++;
                for (int i = x1; i <= x2; i++) {
                    casilla[i][y1] = "|o|";

                }
            } else {
                System.out.println("Espacio ya ocupado");

            }

        } else if (x1 - x2 == 3 && y1 - y2 == 0) {
            int contador = 0;
            for (int i = x2; i <= x1; i++) {

                if (casilla[i][y1] == "|o|") {
                    contador++;
                }

            }
            if (contador < 1) {

                ax1[ntot] = x1;
                ay1[ntot] = y1;
                ax2[ntot] = x2;
                ay2[ntot] = y2;

                np++;
                ntot++;

                for (int i = x2; i <= x1; i++) {
                    casilla[i][y1] = "|o|";

                }

            } else {
                System.out.println("Espacio ya ocupado");

            }

        } else if (y2 - y1 == 3 && x1 - x2 == 0) {
            int contador = 0;
            for (int i = y1; i <= y2; i++) {

                if ("|o|".equals(casilla[x1][i])) {
                    contador++;
                }
            }
            if (contador < 1) {
                ax1[ntot] = x1;
                ay1[ntot] = y1;
                ax2[ntot] = x2;
                ay2[ntot] = y2;
                np++;
                ntot++;
                for (int i = y1; i <= y2; i++) {
                    casilla[x1][i] = "|o|";
                }
            } else {
                System.out.println("Espacio ya ocupado");

            }

        } else if (y1 - y2 == 3 && x1 - x2 == 0) {

            int contador = 0;
            for (int i = y2; i <= y1; i++) {
                if ("|o|".equals(casilla[x1][i])) {
                    contador++;
                }
            }
            if (contador < 1) {

                ax1[ntot] = x1;
                ay1[ntot] = y1;
                ax2[ntot] = x2;
                ay2[ntot] = y2;

                np++;
                ntot++;
                for (int i = y2; i <= y1; i++) {
                    casilla[x1][i] = "|o|";

                }
            } else {
                System.out.println("Espacio ya ocupado");

            }
        } else {
            System.out.println("Ingrese una coordenada correcta");

        }

        System.out.println("Existen   " + np + "   Porta Aviones");

        for (int a = 0;
                a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.print(casilla[a][b] + " ");
            }
            System.out.println("\n");
        }

    }

    public void ingresarsubmarino(int x1, int x2, int y1, int y2) {

        if (x2 - x1 == 2 && y1 - y2 == 0) {

            int contador = 0;
            for (int i = x1; i <= x2; i++) {

                if ("|o|".equals(casilla[i][y1])) {
                    contador++;
                }
            }
            if (contador < 1) {
                ax1[ntot] = x1;
                ay1[ntot] = y1;
                ax2[ntot] = x2;
                ay2[ntot] = y2;

                nsb++;
                ntot++;
                for (int i = x1; i <= x2; i++) {
                    casilla[i][y1] = "|o|";

                }
            } else {
                System.out.println("Espacio ya ocupado");

            }

        } else if (x1 - x2 == 2 && y1 - y2 == 0) {
            int contador = 0;
            for (int i = x2; i <= x1; i++) {
                if (casilla[i][y1] == "|o|") {
                    contador++;
                }
            }
            if (contador < 1) {

                ax1[ntot] = x1;
                ay1[ntot] = y1;
                ax2[ntot] = x2;
                ay2[ntot] = y2;

                nsb++;
                ntot++;

                for (int i = x2; i <= x1; i++) {
                    casilla[i][y1] = "|o|";

                }

            } else {
                System.out.println("Espacio ya ocupado");

            }

        } else if (y2 - y1 == 2 && x1 - x2 == 0) {
            int contador = 0;

            for (int i = y1; i <= y2; i++) {

                if ("|o|".equals(casilla[x1][i])) {

                    contador++;
                }

            }

            if (contador < 1) {

                ax1[ntot] = x1;
                ay1[ntot] = y1;
                ax2[ntot] = x2;
                ay2[ntot] = y2;

                nsb++;
                ntot++;
                for (int i = y1; i <= y2; i++) {
                    casilla[x1][i] = "|o|";

                }
            } else {
                System.out.println("Espacio ya ocupado");

            }

        } else if (y1 - y2 == 2 && x1 - x2 == 0) {

            int contador = 0;
            for (int i = y2; i <= y1; i++) {
                if ("|o|".equals(casilla[x1][i])) {
                    contador++;
                }
            }
            if (contador < 1) {

                ax1[ntot] = x1;
                ay1[ntot] = y1;
                ax2[ntot] = x2;
                ay2[ntot] = y2;

                nsb++;
                ntot++;
                for (int i = y2; i <= y1; i++) {
                    casilla[x1][i] = "|o|";

                }
            } else {
                System.out.println("Espacio ya ocupado");

            }
        } else {
            System.out.println("Ingrese una coordenada correcta");

        }

        System.out.println("Existen   " + nsb + "   Submarinos");

        for (int a = 0;
                a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.print(casilla[a][b] + " ");
            }
            System.out.println("\n");

        }
    }

    public void ingresardestructores(int x1, int x2, int y1, int y2) {

        if (x2 - x1 == 1 && y1 - y2 == 0) {

            int contador = 0;
            for (int i = x1; i <= x2; i++) {
                if ("|o|".equals(casilla[i][y1])) {
                    contador++;
                }
            }
            if (contador < 1) {
                ax1[ntot] = x1;
                ay1[ntot] = y1;
                ax2[ntot] = x2;
                ay2[ntot] = y2;
                nd++;
                ntot++;
                for (int i = x1; i <= x2; i++) {
                    casilla[i][y1] = "|o|";

                }
            } else {
                System.out.println("Espacio ya ocupado");

            }
            

        } else if (x1 - x2 == 1 && y1 - y2 == 0) {

            int contador = 0;
            for (int i = x2; i <= x1; i++) {

                if (casilla[i][y1] == "|o|") {
                    contador++;
                }

            }
            if (contador < 1) {

                ax1[ntot] = x1;
                ay1[ntot] = y1;
                ax2[ntot] = x2;
                ay2[ntot] = y2;

                nd++;
                ntot++;

                for (int i = x2; i <= x1; i++) {
                    casilla[i][y1] = "|o|";

                }

            } else {
                System.out.println("Espacio ya ocupado");

            }

        } else if (y2 - y1 == 1 && x1 - x2 == 0) {

            int contador = 0;

            for (int i = y1; i <= y2; i++) {
                if ("|o|".equals(casilla[x1][i])) {
                    contador++;
                }

            }

            if (contador < 1) {

              
                    ax1[ntot] = x1;
                    ay1[ntot] = y1;
                    ax2[ntot] = x2;
                    ay2[ntot] = y2;

                    nd++;
                    ntot++;
                    
                      for (int i = y1; i <= y2; i++) {
                    casilla[x1][i] = "|o|";
                      }
            } else {

                System.out.println("Espacio ya ocupado");

            }

        } else if (y1 - y2 == 1 && x1 - x2 == 0) {

            int contador = 0;
            for (int i = y2; i <= y1; i++) {
                if ("|o|".equals(casilla[x1][i])) {
                    contador++;
                }
            }
            if (contador < 1) {

                ax1[ntot] = x1;
                ay1[ntot] = y1;
                ax2[ntot] = x2;
                ay2[ntot] = y2;

                nd++;
                ntot++;
                for (int i = y2; i <= y1; i++) {
                    casilla[x1][i] = "|o|";

                }
            } else {
                System.out.println("Espacio ya ocupado");

            }
        } else {
            System.out.println("Ingrese una coordenada correcta");

        }

        System.out.println("Existen   " + nd + "  Destructores");

        for (int a = 0;
                a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.print(casilla[a][b] + " ");
            }
            System.out.println("\n");

        }

    }

    public void ingresarfragatas(int x1, int y1) {
        int contador = 0;
        int x2 = x1;
        int y2 = y1;

        if ("|o|".equals(casilla[x1][y1])) {
            contador++;

        }

        if (contador < 1) {

            ax1[ntot] = x1;
            ay1[ntot] = y1;
            ax2[ntot] = x2;
            ay2[ntot] = y2;

            nf++;
            ntot++;

            casilla[x1][y1] = "|o|";

        } else {
            System.out.println("Espacio ya ocupado");

        }
        System.out.println("Existen   " + nf + "  Fragatas");
        imprimirtablero();
    }

    public void ingresareasteregg(int x1, int y1) {
        int contador = 0;

        if ("|o|".equals(casilla[x1][y1])) {
            contador++;

        }

        if (contador < 1) {

            eggnx = x1;
            eggny = y1;

            casilla[x1][y1] = "|$|";

            System.out.println("Ingrese lo que desea colocar en el easteregg");
            Scanner egg = new Scanner(System.in);

            easteregg = egg.next();

            negg++;

        } else {
            System.out.println("Espacio ya ocupado");

        }
        imprimirtablero();

    }

    public void eastereggdefault() {
        casilla[9][9] = "|$|";

        easteregg = "201901758 Erick Ivan MayorgaRodriguez";

        negg++;

    }

    public void comprobarintento(int x1, int y1) {

        for (int i = 0; i < 9; i++) {

            if (ax1[i] < ax2[i]) {

                for (int w = ax1[i]; w <= ax2[i]; w++) {

                    if (x1 == w && y1 == ay1[i]) {

                        if (ax2[i] - ax1[i] == 1 && ay1[i] - ay2[i] == 0) {
                            for (int a = ax1[i]; a <= ax2[i]; a++) {
                                casilla[a][ay1[i]] = "|x|";

                            }

                        } else if (ax2[i] - ax1[i] == 2 && ay1[i] - ay2[i] == 0) {
                            for (int a = ax1[i]; a <= ax2[i]; a++) {
                                casilla[a][ay1[i]] = "|x|";

                            }

                        } else if (ax2[i] - ax1[i] == 3 && ay1[i] - ay2[i] == 0) {
                            for (int a = ax1[i]; a <= ax2[i]; a++) {
                                casilla[a][ay1[i]] = "|x|";

                            }
                        }
                        System.out.println("Le has dado a un barco");

                        contadorb++;
                    }
                }

            } else if (ax2[i] < ax1[i]) {

                for (int w = ax2[i]; w <= ax1[i]; w++) {

                    if (x1 == w && y1 == ay1[i]) {

                        if (ax1[i] - ax2[i] == 1 && ay1[i] - ay2[i] == 0) {
                            for (int a = ax2[i]; a <= ax1[i]; a++) {
                                casilla[a][ay1[i]] = "|x|";

                            }

                        } else if (ax1[i] - ax2[i] == 2 && ay1[i] - ay2[i] == 0) {
                            for (int a = ax2[i]; a <= ax1[i]; a++) {
                                casilla[a][ay1[i]] = "|x|";

                            }

                        } else if (ax1[i] - ax2[i] == 3 && ay1[i] - ay2[i] == 0) {
                            for (int a = ax2[i]; a <= ax1[i]; a++) {
                                casilla[a][ay1[i]] = "|x|";

                            }

                        }
                        System.out.println("Le has dado a un barco");
                        contadorb++;
                    }
                }
            } else if (ay1[i] < ay2[i]) {

                for (int w = ay1[i]; w <= ay2[i]; w++) {

                    if (y1 == w && x1 == ax1[i]) {

                        if (ay2[i] - ay1[i] == 1 && ax1[i] - ax2[i] == 0) {
                            for (int a = ay1[i]; a <= ay2[i]; a++) {
                                casilla[ax1[i]][a] = "|x|";

                            }

                        } else if (ay2[i] - ay1[i] == 2 && ax1[i] - ax2[i] == 0) {
                            for (int a = ay1[i]; a <= ay2[i]; a++) {
                                casilla[ax1[i]][a] = "|x|";

                            }

                        } else if (ay2[i] - ay1[i] == 3 && ax1[i] - ax2[i] == 0) {
                            for (int a = ay1[i]; a <= ay2[i]; a++) {
                                casilla[ax1[i]][a] = "|x|";

                            }

                        }
                        System.out.println("Le has dado a un barco");
                        contadorb++;
                    }
                }
            } else if (ay2[i] < ay1[i]) {

                for (int w = ay2[i]; w <= ay1[i]; w++) {

                    if (y1 == w && x1 == ax1[i]) {

                        if (ay1[i] - ay2[i] == 1 && ax1[i] - ax2[i] == 0) {
                            for (int a = ay2[i]; a <= ay1[i]; a++) {
                                casilla[ax1[i]][a] = "|x|";

                                
                            }
                        } else if (ay1[i] - ay2[i] == 2 && ax1[i] - ax2[i] == 0) {
                            for (int a = ay2[i]; a <= ay1[i]; a++) {
                                casilla[ax1[i]][a] = "|x|";

                               
                            }
                        } else if (ay1[i] - ay2[i] == 3 && ax1[i] - ax2[i] == 0) {
                            for (int a = ay2[i]; a <= ay1[i]; a++) {
                                casilla[ax1[i]][a] = "|x|";

                                
                            }
                        }
                        System.out.println("Le has dado a un barco");
                        contadorb++;
                    }
                }
            } else if (x1 == ax1[i] && x1 == ax2[i] && y1 == ay1[i] && y1 == ay2[i]) {
                casilla[x1][y1] = "|x|";
                System.out.println("Le has dado a un barco");
            }  
             else if (x1 == eggnx && y1 == eggny) {
                casilla[x1][y1] = "|$|";
                System.out.println(easteregg);

            }else if (((x1 != ax1[i] && x1 != ax2[i]) && y1 != ay1[i]) && y1 != ay2[i]) {
                casilla[x1][y1] = "|#|";
                
            }  

        }
        
        System.out.println("\n");

    }

    public void imprimirtablero() {
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.print(casilla[a][b] + " ");
            }
            System.out.println("\n");

        }
    }
}
