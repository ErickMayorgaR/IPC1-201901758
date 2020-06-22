/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static practica1.tablero.casilla;

/**
 *
 * @author Erick Mayorga
 */
public class Menu {

    public boolean status;

    public int opcionM;
    ReporteJugador[] jugador = new ReporteJugador[5];
    public static int jugadores;

    tablero tablero = new tablero();

    public Menu() {

        this.status = false;

    }

    public void iniciarM() {
        tablero.iniciartablero();
        // try {
        do {
            System.out.println("1.Crear Tablero");
            System.out.println("2.Reporte Completo");
            System.out.println("3.Reporte Victorias");
            System.out.println("4.Salir");
            Scanner lectorM = new Scanner(System.in);

            opcionM = lectorM.nextInt();
            System.out.println("\n\n");
            switch (opcionM) {
                case 1:
                    creartablero();
                    break;
                case 2:
                    reportecompleto();

                    break;
                case 3:
                    reportevictorias();

                    break;
                case 4:
                    salida();
                    break;

                default:
                    System.out.println("Intente nuevamente");
            }

        } while (status == false);

        //  } catch (Exception e) {
        //    System.out.println("Ingrese un numero valido\n");
        //   iniciarM();
        //}
    }

    public void creartablero() {

        //   try{
        do{
            System.out.println("1.Ingresar Barcos");
            System.out.println("2.Cambiar Cantidad de Intentos");
            System.out.println("3.Iniciar Juego");
            System.out.println("4.Visualizar Tablero");
            System.out.println("5.Reiniciar Tablero");
            System.out.println("6.Volver al menu principal");

            Scanner lectorM = new Scanner(System.in);
            opcionM = lectorM.nextInt();
            System.out.println("\n\n");

            switch (opcionM) {
                case 1:
                    ingresarbarcos();

                    break;
                case 2:
                    cambiarcantidadintentos();

                    break;
                case 3:
                    iniciarjuego();

                    break;
                case 4:
                    visualizartablero();
                    break;
                case 5:
                    tablero.iniciartablero();
                    creartablero();
                    break;
                case 6:
                    iniciarM();
                    break;

                default:
                    System.out.println("Intente nuevamente");
            }

        } while (status == false);
        /*  
        }catch(Exception e){
            System.out.println("Ingrese un numero valido\n");
            creartablero();
        }
         */
    }

    private void reportes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void salida() {
        System.exit(0);
    }

    public void visualizartablero() {
        for (int a = 0;
                a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.print(casilla[a][b] + " ");
            }
            System.out.println("\n");
        }

    }

    tipobarcos arreglos = new tipobarcos();

    int opcion;
    boolean estado;
    tipobarcos tp2 = new tipobarcos();
    public static int np;
    public static int nsb;
    public static int nd;
    public static int nf;
    public static int negg;
    public static int intentos;
    public static int ntot;

    public void ingresarbarcos() {
        Scanner lector1 = new Scanner(System.in);

        //try{
        while (ntot < 9) {
            System.out.println("1.Insertar Porta Aviones");
            System.out.println("2.Insertar Submarino");
            System.out.println("3.Insertar Destructores");
            System.out.println("4.Insertar Fragatas");
            System.out.println("5.Insertar Easter Rgg");
            opcion = lector1.nextInt();
            System.out.println("\n\n");

            switch (opcion) {
                case 1:

                    while (np < 1) {

                        portaaviones();

                    }
                    if (np > 0) {
                        System.out.println("Ya has ingresado la capacidad maxima de portaaviones");
                        System.out.println("Hay en total  " + ntot + "  barcos");

                    }
                    break;

                case 2:

                    while (nsb < 3) {

                        submarino();
                    }
                    
                    if (nsb > 2) {
                        System.out.println("Ya has ingresado la capacidad maxima de subarinos");
                        System.out.println("Hay en total  " + ntot + "  barcos");

                    }

                    break;

                case 3:

                    while (nd < 3) {

                        destructores();
                        System.out.println("Hay en total  " + ntot + "  barcos");
                    }
                    if (nd > 2) {
                        System.out.println("Ya has ingresado la capacidad maxima de destructores");
                        System.out.println("Hay en total  " + ntot + "  barcos");

                    }

                    break;

                case 4:
                    while (nf < 2) {
                        fragatas();
                    }

                    if (nf > 1) {
                        System.out.println("Ya has ingresado la capacidad maxima de Fragatas");
                        System.out.println("Hay en total  " + ntot + "  barcos");

                    }

                    break;

                case 5:

                    while (negg < 1) {
                        easteregg();
                        System.out.println("Hay en total  " + ntot + "  barcos");
                    }

                    if (negg > 0) {
                        System.out.println("Ya has ingresado la capacidad maxima de Eastereggs");
                        System.out.println("Hay en total" + ntot + "barcos");

                    }
                    break;

                default:
                    System.out.println("Intente nuevamente");
            }
        }

        creartablero();
        /*        
}catch(Exception e){
    System.out.println("Ingrese un numero valido");
ingresarbarcos(); 

}
         */

    }

    public void portaaviones() {

        Scanner lector2 = new Scanner(System.in);
        System.out.println("La longitud es de 4 casillas");

        System.out.println("Por favor ingrese la coordenada en formato (fila,columa)-(fila,columna) ");
        String texto = lector2.nextLine();
        System.out.println("\n\n");
        String[] coordenada = texto.split("-");
        char f1 = coordenada[0].charAt(1);
        char f2 = coordenada[0].charAt(3);
        char c1 = coordenada[1].charAt(1);
        char c2 = coordenada[1].charAt(3);

        String f11 = Character.toString(f1);
        String f12 = Character.toString(f2);
        String c11 = Character.toString(c1);
        String c12 = Character.toString(c2);

        int x1 = Integer.parseInt(f11);
        int y1 = Integer.parseInt(f12);
        int x2 = Integer.parseInt(c11);
        int y2 = Integer.parseInt(c12);

        arreglos.ingresarportaaviones(x1, x2, y1, y2);

    }

    public void submarino() {

        Scanner lector2 = new Scanner(System.in);
        System.out.println("la longitud es de 3 casillas");
        System.out.println("Por favor ingrese la coordenada en formato (fila,columa)-(fila,columna) ");
        String texto = lector2.nextLine();
        System.out.println("\n\n");
        String[] coordenada = texto.split("-");

        char f1 = coordenada[0].charAt(1);
        char f2 = coordenada[0].charAt(3);
        char c1 = coordenada[1].charAt(1);
        char c2 = coordenada[1].charAt(3);

        String f11 = Character.toString(f1);
        String f12 = Character.toString(f2);
        String c11 = Character.toString(c1);
        String c12 = Character.toString(c2);

        int x1 = Integer.parseInt(f11);
        int y1 = Integer.parseInt(f12);
        int x2 = Integer.parseInt(c11);
        int y2 = Integer.parseInt(c12);

        arreglos.ingresarsubmarino(x1, x2, y1, y2);

    }

    public void destructores() {
        Scanner lector2 = new Scanner(System.in);
        System.out.println("La longitud es de dos casillas");
        System.out.println("Por favor ingrese la coordenada en formato (fila,columa)-(fila,columna) ");
        String texto = lector2.nextLine();

        System.out.println("\n\n");

        String[] coordenada = texto.split("-");

        char f1 = coordenada[0].charAt(1);
        char f2 = coordenada[0].charAt(3);
        char c1 = coordenada[1].charAt(1);
        char c2 = coordenada[1].charAt(3);

        String f11 = Character.toString(f1);
        String f12 = Character.toString(f2);
        String c11 = Character.toString(c1);
        String c12 = Character.toString(c2);

        int x1 = Integer.parseInt(f11);
        int y1 = Integer.parseInt(f12);
        int x2 = Integer.parseInt(c11);
        int y2 = Integer.parseInt(c12);

        arreglos.ingresardestructores(x1, x2, y1, y2);

    }

    public void fragatas() {
        Scanner lector2 = new Scanner(System.in);
        System.out.println("Ocupa una casilla");
        System.out.println("Por favor ingrese la coordenada en formato (fila,columna) ");
        String coordenada = lector2.nextLine();
        System.out.println("\n\n");
        char f1 = coordenada.charAt(1);
        char f2 = coordenada.charAt(3);

        String f11 = Character.toString(f1);
        String f12 = Character.toString(f2);

        int x1 = Integer.parseInt(f11);
        int y1 = Integer.parseInt(f12);

        arreglos.ingresarfragatas(x1, y1);
    }

    public void easteregg() {

        Scanner lector2 = new Scanner(System.in);

        System.out.println("Por favor ingrese la coordenada en formato (fila,columna) ");
        String coordenada = lector2.nextLine();
        System.out.println("\n\n");

        char f1 = coordenada.charAt(1);
        char f2 = coordenada.charAt(3);

        String f11 = Character.toString(f1);
        String f12 = Character.toString(f2);

        int x1 = Integer.parseInt(f11);
        int y1 = Integer.parseInt(f12);

        arreglos.ingresareasteregg(x1, y1);

    }

    public void cambiarcantidadintentos() {
        try{
        Scanner cin = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de intentos que desea");
        intentos = cin.nextInt();
            creartablero();
    }catch(Exception e){
            System.out.println("Ingrese un numero");
            creartablero();
        
    }
    }
    
     public static int contadorb;
    public static int nbarcos;
   

    public void iniciarjuego() {

        
            if (negg < 1) {
                arreglos.eastereggdefault();
                iniciarjuego();
            } else if (intentos < 1) {
                intentos = 9;
                iniciarjuego();
            }
        
            Scanner nombre = new Scanner(System.in);

            System.out.println("Ingrese su nombre");
            
            String nombr = nombre.next();

            int contadori = intentos;

            contadorb=0;            

            while (intentos > 0) {
                DateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

                Date date = new Date();
                int opt;

                System.out.println(f.format(date));
                System.out.println("");
                System.out.println("Barcos:\n");
                System.out.println(contadorb + "/9 hundidos");
                System.out.println((9-contadorb) + "/9 en accion");
                System.out.println(intentos + "/9  Intentos");
                System.out.println("");

                imprimirtablero();
                Scanner lectorI = new Scanner(System.in);
                System.out.println("1.lanzar misil");
                System.out.println("2.Salir");
                
                opt = lectorI.nextInt();
                System.out.println("\n\n");
                switch (opt) {

                    case 1:                        
                            Scanner lectorII = new Scanner(System.in);

                            System.out.println("Por favor ingrese la coordenada en formato (fila,columna)");
                            String coordenada = lectorII.nextLine();

                            char f1 = coordenada.charAt(1);
                            char f2 = coordenada.charAt(3);

                            String f11 = Character.toString(f1);
                            String f12 = Character.toString(f2);

                            int x1 = Integer.parseInt(f11);
                            int y1 = Integer.parseInt(f12);

                            arreglos.comprobarintento(x1, y1);
                            intentos--;
                            
                        

                        break;
                        

                    case 2:

                        iniciarM();

                    default:
                        
                }

            }
            System.out.println("Juego Terminado"+nombr);
            
        
    }
    

    public void imprimirtablero() {
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.print(casilla[a][b] + " ");
            }
            System.out.println("\n");

        }
    }
    public void reportecompleto(){
        
    }
    public void reportevictorias(){
        
    }

}
