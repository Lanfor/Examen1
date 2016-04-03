/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaDeArchivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lanfor
 */
public class CargarArchivosTexto 
{
    public static void main(String[] args) {
        
        ArrayList <Persona> personas;
        
        personas=new ArrayList<Persona>();
        
        FileReader lectorArchivo;
        try {
            lectorArchivo=new FileReader("C:/Users/Lanfor.LanforPORT/Documents/NetBeansProjects/Archivos/archivo.txt");
            System.err.println("Archivo encontrado");
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado"+ e.getMessage());
            return;
        }
        
        BufferedReader textoArchivo;
        textoArchivo=new BufferedReader(lectorArchivo);
        
        for (int i = 0; i < 2; i++) 
        {
            String lineaTexto="";
            try {
                lineaTexto=textoArchivo.readLine();
                
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
            
            String[] valores;
            valores= lineaTexto.split(";");
            float peso=Float.parseFloat(valores[1]);
            float estatura=Float.parseFloat(valores[2]);
            Persona persona=new Persona(valores[0], peso, estatura);
            personas.add(persona);
            JOptionPane.showMessageDialog(null,"Nombre: "+ personas.get(i).getNombre()+"\nPeso: "+personas.get(i).getPeso()+"\nEstatura: "+personas.get(i).getEstatura());
        }
    }
}
