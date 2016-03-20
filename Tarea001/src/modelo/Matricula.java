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
public class Matricula 
{
    private String nombEstudiante, nombCurso, siglas, carnet;
    private int creditos;

    public Matricula(String nombEstudiante, String nombCurso, String Siglas, String Carnet, int creditos) {
        this.nombEstudiante = nombEstudiante;
        this.nombCurso = nombCurso;
        this.siglas = Siglas;
        this.carnet = Carnet;
        this.creditos = creditos;
    }

    public String getNombEstudiante() {
        return nombEstudiante;
    }

    public void setNombEstudiante(String nombEstudiante) {
        this.nombEstudiante = nombEstudiante;
    }

    public String getNombCurso() {
        return nombCurso;
    }

    public void setNombCurso(String nombCurso) {
        this.nombCurso = nombCurso;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String Siglas) {
        this.siglas = Siglas;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String Carnet) {
        this.carnet = Carnet;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public String getInformacion()
    {
        return "Carnet: "+carnet+"\nNombre: "+nombEstudiante+"\n Curso: "+nombCurso+"\nSiglas: "+siglas+"\nCreditos: "+creditos+"\n\n";
    }
}
