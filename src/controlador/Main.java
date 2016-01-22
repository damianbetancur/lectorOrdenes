/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import modelo.LectorArchivoTexto;

/**
 *
 * @author Damián
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //muestraContenido("C:/Users/Ariel/Documents/NetBeansProjects/LectorArchivoTexto/MisOrdenes17102015024452PDAS.TXT");
        //String rutaArchivo = "C:/Users/Ariel/Documents/NetBeansProjects/LectorArchivoTexto/MisOrdenes17102015024452PDAS.TXT";
        String rutaArchivo ="C:/Users/Damián Ariel Betancu/Documents/GitHub/Nueva Carpeta/lectorOrdenes/MisOrdenes17102015024452PDAS.TXT";
        LectorArchivoTexto l1 = new LectorArchivoTexto(rutaArchivo);
        
        
        System.out.println(l1.getOrdenes().size());
    }
}
