/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisNodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Lanfor
 */
public class UsarMisNodos 
{
    MetodosNodo metodos;
    
    public UsarMisNodos()
    {
        metodos=new MetodosNodo();
        menu();
    }
    public void menu()
    {
        int op;
        do {  
            op=Integer.parseInt(JOptionPane.showInputDialog("Digite una opción\n\n"+
                    "1-Agregar Persona\n2-Consultar Persona\n3-Eliminar Persona\n4-Salir"));
            
            switch(op)
            {
                case 1:
                    agregar();
                break;
                case 2:
                    consultar();
                break;
                case 3:
                    eliminar();
                break;
                case 4:
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion INVALIDA");
                break;
            }
            
        } while (op!=4);
    }
    
    public void agregar()
    {
        String nombre=JOptionPane.showInputDialog("Digite el nombre de la persona");
        String cedula=JOptionPane.showInputDialog("Digite la cedula de "+nombre);
        String edad=JOptionPane.showInputDialog("Digite la edad de "+nombre);
        Persona objeto=new Persona(nombre, cedula, edad);
        metodos.agregarPersona(objeto);
    }
    
    public void consultar()
    {
        String cedula=JOptionPane.showInputDialog("Digite la cedula de la persona a buscar");
        
        if(metodos.consultar(cedula))
        {
            Persona perona=metodos.consultar();
            JOptionPane.showMessageDialog(null, perona.getInformacion());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se encuentran registros con la Cédula "+cedula,"ERROR!!!",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void eliminar()
    {
        String cedula=JOptionPane.showInputDialog("Digite la cedula de la persona a buscar");
        
        if(metodos.consultar(cedula))
        {
            metodos.eliminar();
            JOptionPane.showMessageDialog(null, "Se ha eliminado ");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se encuentran registros con la Cédula "+cedula,"ERROR!!!",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) 
    {
        UsarMisNodos usarMisNodos=new UsarMisNodos();
    }
}
