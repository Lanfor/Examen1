/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lanfor
 */
public class Curso {
    
    String nombre, siglas;
    int creditos;

    public Curso(String nombre, String siglas, int creditos) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public String getInformacion(){
        return"Nombre: "+ nombre+"\nSiglas: "+siglas+"\nCreditos: "+creditos+"\n\n";
    }
}
