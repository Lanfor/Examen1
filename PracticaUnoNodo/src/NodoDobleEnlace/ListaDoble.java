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
public class ListaDoble {
    
  protected Nodo cabeza;
  Nodo nuevo;
  int tamano;   //---------De YouTube------------
    public ListaDoble() 
    {
      this.cabeza = null;
      tamano=0; //---------De YouTube------------
    }
    
    public ListaDoble insertarCabeza(Object entrada)
    {
        Nodo nuevo=new Nodo(entrada);
        nuevo.adelante=cabeza;
        if(cabeza!=null)
        {
            cabeza.atras=nuevo;
        }
        cabeza=nuevo;
        tamano++;
        return this;
    }
    
    public void eliminar(Object entrada)
    {
        System.out.println("Numero a eliminar: "+entrada);
        Nodo actual;
        boolean encontrado=false;
        actual=cabeza;
        //Bucle busqueda
        while ((actual!=null) && (!encontrado)) 
        {
            /*La comparación se realiza con el metodo equals depende del elemento
            
            */
            encontrado=(actual.dato==entrada);
            if(!encontrado)
            {
                actual=actual.adelante;
                tamano--;
            }
        }
        
        if(actual!=null)
        {
            //Distingue entre nodo cabecera o resto de a lista
            if(actual==cabeza)
            {
                cabeza=cabeza.adelante;
                if(actual.adelante!=null)
                {
                    actual.adelante.atras=null;
                    tamano--;
                }
            }
            else if(actual.adelante!=null)
                {
                    actual.atras.adelante=actual.adelante;
                    actual.adelante.atras=actual.atras;
                    tamano--;
                }
            else
                {
                    actual.atras.adelante=null;
                    tamano--;
                }
            actual=null;
            
        }
    }
    
    public void visualizar()
    {
        Nodo n;
        int k=0;
        n=cabeza;
        
        while(n !=null)
        {
            System.out.println(n.dato+" ");
            n=n.adelante;
            k++;
            System.out.println((k % 15 != 0 ? " " : "\n" ));
        }
    }    
    
    public int size()
    {
        return tamano;
    }
}
