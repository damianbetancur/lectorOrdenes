/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Damián
 */
public class OrdenMBA {
  
private ArrayList <Integer> posicionesCampo = new ArrayList<>();  


//numero de Orden
private String numeroOrden;

private String numeroVIN;
private String descripcionDelModelo;
private String anioModelo;
private String actividadDelVehiculo;

private String fechaInicioOR;
private String horaInicioOR;
private String recorridoIngreso;
private String fechaFinOR;
private String horaFinOR;
private String recorridoSalida;
private String unidadMedida;
private String descripcionDefecto;

private String tipoCliente;
private String razonSocial;
private String nombre;
private String cuitEmpresa;
private String direccion;
private String localidad;
private String codigoPostal;
private String provincia;
private String pais;
private String prefijo1;
private String telefono1;
private String prefijo2;
private String telefono2;
private String email;

private String apellidoContacto;
private String nombreContacto;
private String prefijoContacto;
private String telefonoContacto;

private String tipoCargo;
private String valorManoDeObra;
private String importeManoDeObra;
private String importesAdicionales;
private String horasFacturadas;
private String importesMateriales;
private String importeLubricantes;
private String marca;
private String tipo;
private String preEntrega;
private String tallerMovil;

   
public void inicializarPosiciones(){

posicionesCampo.add(6);// numeroOrden
posicionesCampo.add(17);// numeroVIN
posicionesCampo.add(40);// descripcionDelModelo
posicionesCampo.add(4);// anioModelo
posicionesCampo.add(4);// actividadDelVehiculo
posicionesCampo.add(10);// fechaInicioOR
posicionesCampo.add(5);// horaInicioOR
posicionesCampo.add(8);// recorridoIngreso
posicionesCampo.add(10);// fechaFinOR
posicionesCampo.add(5);// horaFinOR
posicionesCampo.add(8);// recorridoSalida
posicionesCampo.add(2);// unidadMedida
posicionesCampo.add(255);// descripcionDefecto
posicionesCampo.add(1);// tipoCliente
posicionesCampo.add(30);// razonSocial (Apellido/razon social)
posicionesCampo.add(30);// nombre
posicionesCampo.add(13);// cuitEmpresa
posicionesCampo.add(60);// direccion
posicionesCampo.add(30);// localidad
posicionesCampo.add(15);// codigoPostal
posicionesCampo.add(30);// provincia
posicionesCampo.add(3);// pais
posicionesCampo.add(7);// prefijo1
posicionesCampo.add(12);// telefono1
posicionesCampo.add(7);// prefijo2
posicionesCampo.add(12);// telefono2
posicionesCampo.add(70);// email
posicionesCampo.add(30);// apellidoContacto
posicionesCampo.add(30);// nombreContacto
posicionesCampo.add(7);// prefijoContacto
posicionesCampo.add(12);// telefonoContacto
posicionesCampo.add(2);// tipoCargo
posicionesCampo.add(9);// valorManoDeObra
posicionesCampo.add(9);// importeManoDeObra
posicionesCampo.add(9);// importesAdicionales
posicionesCampo.add(9);// horasFacturadas
posicionesCampo.add(9);// importesMateriales
posicionesCampo.add(9);// importeLubricantes
posicionesCampo.add(5);// marca
posicionesCampo.add(5);// tipo
posicionesCampo.add(1);// preEntrega
posicionesCampo.add(1);// tallerMovil

}

}
