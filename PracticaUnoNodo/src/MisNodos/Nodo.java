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
public class Nodo {
    Persona dato;
    Nodo enlace;

    public Nodo(Persona x) 
    {
        this.dato = x;
        enlace=null;
    }

    public Persona getDato() 
    {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }


    public Nodo getEnlace() 
    {
        return enlace;
    }

    public void setEnlace(Nodo enlace) 
    {
        this.enlace = enlace;
    }
    
    
}
