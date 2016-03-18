/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.FRM_VentanaRegistroEstudiantes;

/**
 *
 * @author Lanfor
 */
public class Controlador_VentanaRegistroEstudiantes implements ActionListener{
    
    FRM_VentanaRegistroEstudiantes frm_VentanaRegistroEstudiantes;
    public Controlador_VentanaRegistroEstudiantes(FRM_VentanaRegistroEstudiantes frm_VentanaRegistroEstudiantes) 
    {
        this.frm_VentanaRegistroEstudiantes=frm_VentanaRegistroEstudiantes;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
           frm_VentanaRegistroEstudiantes.agregar();
        }
        if(e.getActionCommand().equalsIgnoreCase("Buscar"))
        {
           frm_VentanaRegistroEstudiantes.buscar();
        }
        if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
           frm_VentanaRegistroEstudiantes.modificar();
        }
        if(e.getActionCommand().equalsIgnoreCase("Eliminar"))
        {
           frm_VentanaRegistroEstudiantes.eliminar();
        }
    }
    
}
