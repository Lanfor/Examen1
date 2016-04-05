
package practicaNodo;

public class Lista 
{
    protected Nodo primero;
    Nodo nuevo;
    //int tamano;   ---------De YouTube------------
    public Lista() 
    {
        this.primero = null;
        //tamano=0; ---------De YouTube------------
    }
    
    public Lista insertarCabezaLista(int x)
    {
        nuevo=new Nodo(x);
        
        nuevo.setEnlace(primero);
        
        primero=nuevo;
        //tamano++;     ---------De YouTube------------
        return this;
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
    
    /*
    public int getTamano()
    {
        ---------De YouTube------------
        return tamano;
    }
    
    public Tipo obtenerValor(int posicion)
    {   
        ---------De YouTube------------
    
        int contador=0;
    
        if(posicion < 0)//Posicion ha de ser mayor que 0
        {
            return  null;
        }
        
        Nodo temporal= primero;
        
        whie(contador < posicion)
        {
              temporal=temporal.enlace
        }
    
        return temporal;
    }
    
    public int devolverPosicion(Objet entrada)
    {
        Nodo temporal=primero;
        int pos=0;
        while(entrada != temporal)
        {
            pos++;
            temporal=temporal.enlace;
        }
        return posicion;
    }
    */
    public Nodo devolverPosicion (int posicion)
    {
        Nodo indice;
        
        int i;
        if(posicion < 0)//Posicion ha de ser mayor que 0
        {
            return  null;
        }
        
        indice=primero;
        
        for (i=1; (i  < posicion) && (indice != null) ; i ++) 
        {
            indice=indice.enlace;
        }
        
        return indice;
    }
    
    public  void eliminar(int entrada)
    {
        Nodo actual, anterior;
        boolean encontrado;
        //Inicializa los punteros
        actual=primero;
        anterior=null;
        encontrado=false;
        //Busqueda del nodo y del anterior
        while((actual!=null) && (!encontrado))
        {
            encontrado=(actual.dato==entrada);
             //Con objetos: actual.dato.equals(entrada)
             if(!encontrado)
             {
                 anterior=actual;
                 actual=actual.enlace;
             }
        }
        
        
    }
    
    
    
    
    
}
