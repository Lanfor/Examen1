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
public class MetodosNodo
{
    Lista array;
    int pos;
    public  MetodosNodo()
    {
        array=new Lista();
    }
    
    public void agregarPersona(Persona objeto)
    {
        array.add(objeto);
    }
    
    public boolean consultar(String cedula)
    {
        boolean existe=false;
        
        for (int i = 0; i < array.size(); i++) 
        {
            if(array.get(i).getCedula().equalsIgnoreCase(cedula))
            {
                existe=true;
                pos=i;
            }
        }
        return existe;
    }
    public Persona consultar()
    {
        return array.get(pos);
    }
    
    public void eliminar()
    {
        array.remove(pos);
    }
}
