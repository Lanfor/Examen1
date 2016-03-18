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
public class ArrayCurso {
    
    ArrayList <Curso> array;
    int posicion;

    public ArrayCurso() {
        array=new ArrayList<Curso>();
    }
    
    public  void agregar(Curso objeto)
    {
        array.add(objeto);
    }
    public Curso verificar(String sigla)
    {
        
        Curso objeto=null;
        for (int i = 0; i < array.size(); i++) 
        {
            if (array.get(i).getSiglas().equalsIgnoreCase(sigla)) 
            {
                objeto=array.get(i);
                posicion=i;
                break;
            }
        }
        return objeto;
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
