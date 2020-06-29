/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import ListaSimple.ListaSimple;
import ListaSimple.NodoLS;
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
    ListaSimple listaSDatos = new ListaSimple();

    public ListaSimple getListaSDatos() {
        return listaSDatos;
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
            
        }catch (FileNotFoundException e) {
            System.out.println("No estaba");
        }
        llenarListaSimple();
        listaSDatos.imprimirLista();
    }

    public void llenarListaSimple() {
     String[] lineadatos= datosenDoc.split("\n");
     for(String datos: lineadatos){
         String[] espacioL= datos.split(",");
         NodoLS nodoDato=new NodoLS(espacioL[0],espacioL[1],espacioL[2],espacioL[3]);
         listaSDatos.insertarNodo(nodoDato);
     }

    }

}
