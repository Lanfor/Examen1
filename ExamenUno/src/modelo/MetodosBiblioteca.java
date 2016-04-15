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
public class MetodosBiblioteca 
{
    private ArrayList<Biblioteca> array;
    private int pos;
    private String[] arregloInformacionConsultada=new String[3];
    public  MetodosBiblioteca()
    {
        array=new ArrayList<Biblioteca>();
    }
    public void agregarPrestamo(String informacion[])
    {
        int posicion=0;
        boolean localizado=false;
        Biblioteca objeto=new Biblioteca(informacion[0], informacion[1], informacion[2], informacion[3]);
        //[001][003][004][005][][][][][][][]
        //i=0
        for (int i = array.size()-1; i >=0; i--) 
        {
            if(Integer.parseInt(array.get(i).getNumeroPrestamo())<Integer.parseInt(informacion[0]) )
            {
                array.add(i+1, objeto);
            }
        }
       if(array.size()==0)
           array.add(objeto);
    }
    
    public boolean verificar(String numPrestamo)
    {
        boolean existencia=false;
        for (int i = 0; i < array.size(); i++) 
        {
            if(array.get(i).getNumeroPrestamo().equalsIgnoreCase(numPrestamo))
            {
                arregloInformacionConsultada[0]=array.get(i).getNombreUsuario();
                arregloInformacionConsultada[1]=array.get(i).getCedulaUsuario();
                arregloInformacionConsultada[2]=array.get(i).getIsbnLibro();
                existencia=true;
                pos=i;
            }
        }
        return existencia;
    }
    public void eliminar()
    {
        array.remove(pos);
        System.out.println("Eliminado");
    }
    public void modificar(String[] informacion)
    {
        array.get(pos).setNombreUsuario(informacion[1]);
        array.get(pos).setCedulaUsuario(informacion[2]);
        array.get(pos).setIsbnLibro(informacion[3]);
        System.out.println("Modificado");
    }
    public String[] getInformacionConsultada()
    {
        return arregloInformacionConsultada;
    }
    public  String devolverCodigo()
    {
        String codigo="0000";
        
        if(array.size()==0)
        {
           codigo+=1;
        }
        else
        {
            int numero=Integer.parseInt((array.get(array.size()-1).getNumeroPrestamo()));
            numero++;
            
            codigo="0000"+numero;
        }
        codigo=codigo.substring(codigo.length()-5, codigo.length());
        
        return codigo;
    }
}
