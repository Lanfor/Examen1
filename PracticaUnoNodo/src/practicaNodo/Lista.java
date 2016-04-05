
package practicaNodo;

public class Lista 
{
    protected Nodo primero;
    Nodo nuevo;

    public Lista() 
    {
        this.primero = null;
    }
    
    public Lista insertarCabezaLista(int x)
    {
        nuevo=new Nodo(x);
        
        nuevo.enlace=primero;
        
        primero=nuevo;
        
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
    
    
    
    
    
    
    
    
}
