/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FRM_VentanaRegistroCursos;

/**
 *
 * @author Lanfor
 */
public class Controlador_VentanaRegistroCursos implements ActionListener{
    
    FRM_VentanaRegistroCursos frm_VentanaRegistroCursos;
    public Controlador_VentanaRegistroCursos(FRM_VentanaRegistroCursos frm_VentanaRegistroCursos) 
    {
        this.frm_VentanaRegistroCursos=frm_VentanaRegistroCursos;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
           frm_VentanaRegistroCursos.agregar();
        }
        if(e.getActionCommand().equalsIgnoreCase("Buscar"))
        {
           frm_VentanaRegistroCursos.buscar();
        }
    }
    
}
