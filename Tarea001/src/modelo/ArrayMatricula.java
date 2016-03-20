/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Lanfor
 */
public class ArrayMatricula {
    
    ArrayList<Matricula> array;
    
    public ArrayMatricula()
    {
        array=new ArrayList<Matricula>();
    }
    
    public void agregarMatricula(String[] informacion)
    {
        Matricula objeto=new Matricula(informacion[1], informacion[3], informacion[2], informacion[0], Integer.parseInt(informacion[4]));
        array.add(objeto);
    }
    
    
    
}
