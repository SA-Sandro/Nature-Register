package Interfaces_Clases;

import java.util.Date;

public class Registros {

       private String id_registro, nombreCientifico, familia, orden, fecha, lugarObservacion, localidad, provincia, coordenadas, URLImagen;

       public Registros() {

	id_registro = "";
	nombreCientifico = "";
	familia = "";
	orden = "";
	fecha = "";
	lugarObservacion = "";
	localidad = "";
	provincia = "";
	coordenadas = "";
	URLImagen = "";
       }

       public Registros(String nombreCientifico, String familia, String orden, String fecha, String lugarObservacion, String localidad, String provincia, String coordenadas, String URLImagen) {
	this.nombreCientifico = nombreCientifico;
	this.familia = familia;
	this.orden = orden;
	this.lugarObservacion = lugarObservacion;
	this.localidad = localidad;
	this.provincia = provincia;
	this.fecha = fecha;
	this.coordenadas = coordenadas;
	this.URLImagen = URLImagen;
       }

       public String getOrden() {
	return orden;
       }

       public void setOrden(String orden) {
	this.orden = orden;
       }

       public String getCoordenadas() {
	return coordenadas;
       }

       public void setCoordenadas(String coordenadas) {
	this.coordenadas = coordenadas;
       }

       public String getURLImagen() {
	return URLImagen;
       }

       public void setURLImagen(String URLImagen) {
	this.URLImagen = URLImagen;
       }

       public String getId_registro() {
	return id_registro;
       }

       public void setId_registro(String id_registro) {
	this.id_registro = id_registro;
       }

       public String getNombreCientifico() {
	return nombreCientifico;
       }

       public void setNombreCientifico(String nombreCientifico) {
	this.nombreCientifico = nombreCientifico;
       }

       public String getFamilia() {
	return familia;
       }

       public void setFamilia(String familia) {
	this.familia = familia;
       }

       public String getLugarObservacion() {
	return lugarObservacion;
       }

       public void setLugarObservacion(String lugarObservacion) {
	this.lugarObservacion = lugarObservacion;
       }

       public String getLocalidad() {
	return localidad;
       }

       public void setLocalidad(String localidad) {
	this.localidad = localidad;
       }

       public String getProvincia() {
	return provincia;
       }

       public void setProvincia(String provincia) {
	this.provincia = provincia;
       }

       public String getFecha() {
	return fecha;
       }

       public void setFecha(String fecha) {
	this.fecha = fecha;
       }

}
