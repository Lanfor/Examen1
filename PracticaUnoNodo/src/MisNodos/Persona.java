/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisNodos;

/**
 *
 * @author Lanfor
 */
public class Persona 
{
    String nombre, cedula, edad;

    public Persona(String nombre, String cedula, String edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public String getInformacion()
    {
        return "Nombre: "+nombre+"\nCédula: "+cedula+"\nEdad: "+edad;
    }
}
