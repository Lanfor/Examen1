/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NodosCirculares;

import NodoDobleEnlace.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lanfor
 */
public class PruebaNodoCircular 
{
    public static void main(String[] args) 
    {
        ListaCircular lista=new ListaCircular();
        for (int i = 20; i >= 1; i--) 
        {
            lista.insertar(i);
        }
        lista.visualizar();
        
        int aleatorio=(int)Math.floor(Math.random()*(1-10)+10);
        lista.eliminar(aleatorio);
        System.out.println("Numero a eliminar: "+aleatorio);
        lista.visualizar();
        
    }  
}