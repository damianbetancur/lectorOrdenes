/**
 * 
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de leer un archivo 
 * @author Ariel
 */
public class LectorArchivoTexto {
    String archivo;
    private ArrayList <OrdenMBA>  ordenes;
    
    /**
     * Instancia un Objeto LectorArchivo 
     * @param RutaArchivo
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public LectorArchivoTexto(String RutaArchivo) throws FileNotFoundException, IOException{
        this.archivo = RutaArchivo;
        ordenes = new ArrayList();
        cargarOrdenes();        
    }
        
    /**
     * Muesta la lista de Ordenes
     * @return ArrayList <OrdenMBA>
     */
    public ArrayList <OrdenMBA> getOrdenes() {
        return ordenes;
    }
        
    /**
     * Muesta el contenido de un archivo de texto
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void muestrarContenido() throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(this.archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }

    /**clase
     * Cuenta los registros de un archivo de texto
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void contarRegistros() throws FileNotFoundException, IOException {
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
    public void MostrarLongitudRegistros() throws FileNotFoundException, IOException {
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
     * Carga cada linea como un Objeto, guardando los mismos en una lista de Objetos del tipo Ordene
     * @throws FileNotFoundException
     * @throws IOException 
     */
    private void cargarOrdenes() throws FileNotFoundException, IOException {
        String cadena;         
        FileReader f = new FileReader(this.archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {  
           OrdenMBA OrdenAuxiliar = new OrdenMBA();
           OrdenAuxiliar.setNumeroOrden(cadena.substring(1,6));
           OrdenAuxiliar.setNumeroVIN(cadena.substring(1,6));
           OrdenAuxiliar.setDescripcionDelModelo(cadena.substring(1,6));
           OrdenAuxiliar.setAnioModelo(cadena.substring(1,6));
           OrdenAuxiliar.setActividadDelVehiculo(cadena.substring(1,6));
           OrdenAuxiliar.setFechaInicioOR(cadena.substring(1,6));
           OrdenAuxiliar.setHoraInicioOR(cadena.substring(1,6));
           OrdenAuxiliar.setRecorridoIngreso(cadena.substring(1,6));
           OrdenAuxiliar.setFechaFinOR(cadena.substring(1,6));
           OrdenAuxiliar.setHoraFinOR(cadena.substring(1,6));
           OrdenAuxiliar.setRecorridoSalida(cadena.substring(1,6));
           OrdenAuxiliar.setUnidadMedida(cadena.substring(1,6));
           OrdenAuxiliar.setDescripcionDefecto(cadena.substring(1,6));
           OrdenAuxiliar.setTipoCliente(cadena.substring(1,6));
           OrdenAuxiliar.setRazonSocial(cadena.substring(1,6));
           OrdenAuxiliar.setNombre(cadena.substring(1,6));
           OrdenAuxiliar.setCuitEmpresa(cadena.substring(1,6));
           OrdenAuxiliar.setDireccion(cadena.substring(1,6));
           OrdenAuxiliar.setLocalidad(cadena.substring(1,6));
           OrdenAuxiliar.setCodigoPostal(cadena.substring(1,6));           
           OrdenAuxiliar.setProvincia(cadena.substring(1,6));           
           OrdenAuxiliar.setPais(cadena.substring(1,6));           
           OrdenAuxiliar.setPrefijo1(cadena.substring(1,6));           
           OrdenAuxiliar.setTelefono1(cadena.substring(1,6));           
           OrdenAuxiliar.setPrefijo2(cadena.substring(1,6));           
           OrdenAuxiliar.setTelefono2(cadena.substring(1,6));         
           OrdenAuxiliar.setEmail(cadena.substring(1,6));           
           OrdenAuxiliar.setApellidoContacto(cadena.substring(1,6));           
           OrdenAuxiliar.setNombreContacto(cadena.substring(1,6));           
           OrdenAuxiliar.setPrefijoContacto(cadena.substring(1,6));           
           OrdenAuxiliar.setTelefonoContacto(cadena.substring(1,6));           
           OrdenAuxiliar.setTipoCargo(cadena.substring(1,6));           
           OrdenAuxiliar.setValorManoDeObra(cadena.substring(1,6));           
           OrdenAuxiliar.setImporteManoDeObra(cadena.substring(1,6));           
           OrdenAuxiliar.setImportesAdicionales(cadena.substring(1,6));           
           OrdenAuxiliar.setHorasFacturadas(cadena.substring(1,6));           
           OrdenAuxiliar.setImportesMateriales(cadena.substring(1,6));           
           OrdenAuxiliar.setImporteLubricantes(cadena.substring(1,6));    
           OrdenAuxiliar.setMarca(cadena.substring(1,6));           
           OrdenAuxiliar.setTipo(cadena.substring(1,6));           
           OrdenAuxiliar.setPreEntrega(cadena.substring(1,6));           
           OrdenAuxiliar.setTallerMovil(cadena.substring(1,6));           
           
           ordenes.add(OrdenAuxiliar);
           
        }
        b.close();
    }

}
