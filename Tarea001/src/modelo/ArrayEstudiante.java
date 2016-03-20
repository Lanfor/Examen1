/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lanfor
 */
public class ArrayEstudiante {
    
    ArrayList <Estudiante> array;
    int posicion;

    public ArrayEstudiante() {
        array=new ArrayList<Estudiante>();
    }
    
    public  void agregar(Estudiante objeto)
    {
        array.add(objeto);
    }
    public Estudiante verificar(String carnet)
    {
        
        Estudiante objeto=null;
        for (int i = 0; i < array.size(); i++) 
        {
            if (array.get(i).getCarnet().equalsIgnoreCase(carnet)) 
            {
                objeto=array.get(i);
                posicion=i;
                break;
            }
        }
        return objeto;
    }
    public void eliminar()
    {
        array.remove(posicion);
    }
    
    public void modificar(String[] informacion)
    {
        array.get(posicion).setNombre(informacion[0]);            
    }
    
    public ArrayList<Estudiante> getArray()
    {
        return array;
    }
    public String getInformacion()
    {
        String msj="";
        for (int i = 0; i < array.size(); i++) 
        {
            msj+=array.get(i).getInformacion();
        }
        return msj;
    }
}
