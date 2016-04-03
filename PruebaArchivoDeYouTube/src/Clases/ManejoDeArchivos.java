/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author Lanfor
 */
public class ManejoDeArchivos 
{
    public static void main(String[] args) 
    {
        File archivo;//Una referencia o variable del archivo de tipo File
        
        
            archivo=new File("C:\\Users\\Lanfor.LanforPORT\\Documents\\Archivos\\archivo.txt");//Dirección en la que quiero guardar el archivo
            if(!archivo.exists())//archivo.exists() Pregunta
            {
                try {
                    archivo.createNewFile();//archivo.createNewFile() esto crea un nuevo archivo
                    System.out.println("Se ha creado el archivo");
                } catch (Exception e) {
                    System.out.println("Error: "+e);
                }
            }
            else
            {
                try {
                    PrintWriter pw=new PrintWriter(archivo,"utf-8");
                    pw.println("Primer Linea");
                    pw.println("Segunda Linea");
                    pw.printf("Hola Mundo ", 10);
                    pw.close();
                    
                } catch (Exception e) {
                }
            }
        
    }
}
