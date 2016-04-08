
package NodosCirculares;

import practicaNodo.*;

public class Nodo 
{
    Object dato;
    Nodo enlace;

    public Nodo(Object x) 
    {
        this.dato = x;
        enlace=null;
    }

    public Object getDato() 
    {
        return dato;
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
