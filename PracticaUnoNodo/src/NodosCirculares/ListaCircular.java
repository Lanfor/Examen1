/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NodosCirculares;

/**
 *
 * @author Lanfor
 */
public class ListaCircular 
{
    private Nodo lc;
    public ListaCircular()
    {
        lc=null;
    }
    
    public  ListaCircular insertar(Object entrada)
    {
        
        Nodo nuevo=new Nodo(entrada);
        
        if(lc!=null)//ListaCircular no vacía
        {
            nuevo.enlace=lc.enlace;
            lc.enlace=nuevo;
        }
        else
        {
            nuevo.enlace=nuevo;
        }
        lc=nuevo;
        return this;
    }
    
    
    public void visualizar()
    {
        Nodo n;
        int k=0;
        n=lc;
        do
        {
            System.out.println(n.dato+" ");
            n=n.enlace;
            System.out.println( "\n" );
            
        } while(n!= lc);
    }
    
    public void eliminar (Object entrada)
    {
        Nodo actual;
        boolean encontrado = false;
        //bucle de busqueda
        actual = lc;
        while ((actual.enlace != lc) && (!encontrado))
        {
            encontrado = (actual.enlace.dato == entrada);
            if (!encontrado)
            {
                actual = actual.enlace;
            }
        }
        encontrado = (actual.enlace.dato == entrada);
        
        //enlcace de nodo anterior con el siguiente
        
        if (encontrado)
        {
            Nodo p;
            p= actual.enlace;
            if (lc == lc.enlace)
                lc = null;
            else
            {
                if (p == lc)
                {
                    lc= actual;  //Se borra el elemento referenciado por lc
                                 //el nuevo acceso a la lista es el anterior
                }
                actual.enlace = p.enlace;
                      
            }
            p= null;
        }
    }
}
