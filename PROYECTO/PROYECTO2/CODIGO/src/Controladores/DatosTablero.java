/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Cola.Cola;
import ListaCircularDoble.ListaCircularDoble;
import ListaDoble.ListaDoble;
import ListaSimple.ListaSimple;
import ListaSimple.NodoLSData;
import ListaSimpleUtiles.ListaSimpleL;
import ListaSimpleUtiles.ListaSimpleN;
import ListaSimpleUtiles.NodoLS;
import ListaSimpleUtiles.NodoLSl;
import Pila.Pila;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Erick Mayorga
 */
public class DatosTablero {

    String datosenDoc;
    ListaSimpleN listaSNodos = new ListaSimpleN();

    ListaSimpleL listaetiqueta = new ListaSimpleL();

    public static Pila pilaDatos = new Pila();
    public static Cola colaDatos = new Cola();
    public static ListaSimple listaSDatos = new ListaSimple();
    public static ListaDoble listaDDatos = new ListaDoble();
    public static ListaCircularDoble lCircularDatos = new ListaCircularDoble();

    public ListaSimpleL getListaetiqueta() {
        return listaetiqueta;
    }

    public ListaSimpleN getListaSNodos() {
        return listaSNodos;
    }

    public void almacenarDatos(File archivo) throws IOException {
        File datosFile = archivo;
        FileReader lector = null;
        BufferedReader buffer = null;
        try {
            lector = new FileReader(archivo);
            buffer = new BufferedReader(lector);

            String linea;
            String textoignore = "Fila,Columna,Valor,Color";
            String todoString = "";

            while ((linea = buffer.readLine()) != null) {
                if (linea.contains(textoignore)) {

                } else {
                    todoString += linea + "\n";
                }
            }
            datosenDoc = todoString;
        } catch (FileNotFoundException e) {
            System.out.println("No estaba");
        }
        llenarListaNodos();
        
        llenarListaSimple();
    }

    public void llenarListaNodos() {
        String[] lineadatos = datosenDoc.split("\n");
        for (String datos : lineadatos) {
            
            String[] espacioL = datos.split(",");
            NodoLS nodoDato = new NodoLS(espacioL[0], espacioL[1], espacioL[2], espacioL[3]);
            listaSNodos.insertarNodo(nodoDato);
        }
    }

    public void llenarListaSimple() {
        NodoLS actual = listaSNodos.primerNodo;

        while (actual != null) {
            listaSDatos.insertarNodo(new NodoLSData(actual.getValor(), actual.getColor()));
            actual = actual.getSiguiente();
        }
    }
    public void reiniciarTodo(){
        ocultarEtiquetas();
        listaetiqueta=new ListaSimpleL();
        listaSNodos=new ListaSimpleN();
        listaSDatos=new ListaSimple();
        listaDDatos=new ListaDoble();
        pilaDatos=new Pila();
        colaDatos=new Cola();
        lCircularDatos=new ListaCircularDoble();
        
    }
    public void ocultarEtiquetas(){
        NodoLSl actual = listaetiqueta.primerNodo;    
          while (actual != null) {
            
            actual.getLabel().setVisible(false);
            actual = actual.getSiguiente();
            
        }
    }

}
