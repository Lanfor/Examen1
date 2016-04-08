/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NodoDobleEnlace;

import javax.swing.JOptionPane;

/**
 *
 * @author Lanfor
 */
public class PruebaNodoDobleEnlace 
{
    public static void main(String[] args) 
    {
        ListaDoble lista=new ListaDoble();
        for (int i = 20; i >= 1; i--) 
        {
            lista.insertarCabeza(i);
        }
        lista.visualizar();
        
        System.out.println("\n\n");
        
        String valores=JOptionPane.showInputDialog("******Digite el rango a eliminar de 1 al 20 ******\n separado por un guíon (numMenos-numMayor)");
        String rango[]=valores.split("-");
        
        for(int i=1;i<=20; i++)
        {
            if(i>=Integer.parseInt(rango[0]) && i<=Integer.parseInt(rango[1]))
            {
                lista.eliminar(i);
            }
        }
        lista.visualizar();
    }
    
    
}
