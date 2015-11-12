/**
 * 
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase encargada de leer un archivo 
 * @author Ariel
 */
public class LectorArchivoTexto {
    String archivo;
    
    
    /**
     * Instancia un Objeto LectorArchivo 
     * @param RutaArchivo
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public LectorArchivoTexto(String RutaArchivo) throws FileNotFoundException, IOException{
        this.archivo = RutaArchivo;
       
    }
    
    /**
     * Muesta el contenido de un archivo de texto
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void muestraContenido() throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(this.archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }

    /**
     * Cuenta los registros de un archivo de texto
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void contadorRegistro() throws FileNotFoundException, IOException {
        int contador = 0;
        String cadena;        
        FileReader f = new FileReader(this.archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            contador = contador+1;            
        }
        b.close();
        System.out.println(contador);  
    }
    
    /**
     * Cuenta la longitud de cada registro de un archivo de texto
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void contadorLongitudPorRegistro() throws FileNotFoundException, IOException {
        int contador = 0;
        String cadena;        
        FileReader f = new FileReader(this.archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            contador = cadena.length();
            System.out.println(contador);    
        }
        b.close();
    }    

    /**
     * Valida el numero de Orden del archivo de Exportacion
     * posicion inicial 1
     * posicion final 6
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void validarNumeroDeVIN() throws FileNotFoundException, IOException {        
        String cadena;        
        FileReader f = new FileReader(this.archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {            
        System.out.println(cadena.substring(0, 6));   
        }
        b.close();
    } 
        
 
    /**
     * Valida el numero de ORDEN del archivo de Exportacion
     * posicion inicial 0
     * posicion final 6
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void validarNumeroDeOrden() throws FileNotFoundException, IOException {                
        String cadena;        
        FileReader f = new FileReader(this.archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {  
            if (Integer.parseInt(cadena.substring(1,6))>=22000&&Integer.parseInt(cadena.substring(1,6))<=22500) {
                System.out.println(cadena.substring(0, 6)); 
            }else{
                System.out.println(cadena.substring(0, 6)+"  fuera de rango");  
            }        
        }
        b.close();
    } 
    
    /**
     * Metodo principal de ejecucion, indica el inicio del sistema
     * @param args
     * @throws IOException 
     */    
    public static void main(String[] args) throws IOException {
        //muestraContenido("C:/Users/Ariel/Documents/NetBeansProjects/LectorArchivoTexto/MisOrdenes17102015024452PDAS.TXT");
        //String rutaArchivo = "C:/Users/Ariel/Documents/NetBeansProjects/LectorArchivoTexto/MisOrdenes17102015024452PDAS.TXT";
        String rutaArchivo ="C:/Users/DamiánAriel/Documents/GitHub/lectorOrdenes/MisOrdenes17102015024452PDAS.TXT";
        LectorArchivoTexto l1 = new LectorArchivoTexto(rutaArchivo);
        l1.validarNumeroDeOrden();
    }
}
