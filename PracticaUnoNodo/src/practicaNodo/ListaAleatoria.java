/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaNodo;

import java.util.Random;

/**
 *
 * @author Lanfor
 */
public class ListaAleatoria 
{
    public static void main(String[] args) 
    {
        Random r;
        int d;
        Lista lista;
        int k;
        
        r=new Random();
        lista=new Lista();//Lista Vacia
        k=Math.abs(r.nextInt() % 55);//Numero de nodos
        
        //Seinsertan elementos a la lista
        for (; k >0 ; k--) 
        {
            d=r.nextInt()% 99;
            lista.insertarCabezaLista(d);
        }
        
        //Recorre la lista para escribir sus elementos
        System.out.println("Elementos de la lista al azar");
        lista.visualizar();
        
    }
}
