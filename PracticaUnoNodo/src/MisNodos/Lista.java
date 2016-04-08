/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisNodos;

import com.sun.jndi.toolkit.ctx.Continuation;
import javax.swing.JOptionPane;

/**
 *
 * @author Lanfor
 */
public class Lista 
{
    protected Nodo primero;
    Nodo nuevo;
    int tamano;  // ---------De YouTube------------
    public Lista() 
    {
        this.primero = null;
        tamano=0; //---------De YouTube------------
    }
    
    public void add(Persona x)
    {
        nuevo=new Nodo(x);
        
        Nodo temporal=primero;
        //[]]--> []]--> []]--> []]
        if(temporal==null)
        {
            primero=nuevo;
        }
        else
        {
            for (int i = 0; i < tamano; i++) 
            {
                if(i==tamano-1)
                {
                    temporal.setEnlace(nuevo);
                    break;
                }
                temporal=temporal.enlace;
            }
        }
        
        tamano++;   // ---------De YouTube------------
    }
    
    public void visualizar()
    {
        Nodo n;
        int k=0;
        n=primero;
        
        while(n !=null)
        {
            System.out.println(n.dato+" ");
            n=n.enlace;
            k++;
            System.out.println((k % 15 != 0 ? " " : "\n" ));
        }
    }
    
    
    public int size()
    {
     //---------De YouTube------------//
        return tamano;
    }

    
    public void remove(int posicion)
    {
        Nodo temporal=primero;
        //[]]--> []]--> []]--> []]--> []]
        // i=0
        for (int i = 0; i < tamano; i++) 
        {
            if (i==posicion-1)
            {
                temporal.setEnlace(temporal.getEnlace().getEnlace());
                temporal.getEnlace().setEnlace(null);
                tamano--;
                break;
            }
            else if(posicion==0)
            {
                primero=temporal.getEnlace();
                temporal.setEnlace(null);
                tamano--;
                break;
            }
            temporal=temporal.getEnlace();
        }
    }
    
    
    public Persona get(int posicion)
    {
        Nodo temporal=primero;
        //[]]--> []]--> []]--> []]--> []]
        for (int i = 0; i < tamano; i++) 
        {
            if (i==posicion) 
                break;
            temporal=temporal.getEnlace();
        }
        return temporal.getDato();
    }
}
