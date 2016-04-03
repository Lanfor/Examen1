/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaDeArchivos;

/**
 *
 * @author Lanfor
 */
public class Persona {
    
    String nombre;
    float peso, estatura;

    public Persona(String nombre, float peso, float estatura) {
        this.nombre = nombre;
        this.peso = peso;
        this.estatura=estatura;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
}
