/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Lanfor
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        File archivo;//Una referencia o variable del archivo de tipo File
        
        try {
            archivo=new File("C:\\Users\\Lanfor.LanforPORT\\Documents\\Archivos\\archivo.txt");//Dirección en la que quiero guardar el archivo
            if(archivo.createNewFile())//acá si la dirección que le damos al archivo es incorrecta se va a caer porqué no la encuentra y va a pasar al catch
            {
                System.out.println("Se ha creado el archivo");
            }
        } catch (IOException e)
        {
            System.err.println("No se ha podido crear el archivo "+ e);//la e que es la ecepción te devuelve cual fue el error
        }
    }
}
