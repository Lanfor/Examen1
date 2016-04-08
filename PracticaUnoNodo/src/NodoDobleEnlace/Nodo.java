/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NodoDobleEnlace;

/**
 *
 * @author Lanfor
 */
public class Nodo 
{
    Object dato;
    
    Nodo adelante;
    Nodo atras;

    public Nodo(Object dato) 
    {
        this.dato = dato;
        adelante=atras=null;
    }
    
    
    
}
