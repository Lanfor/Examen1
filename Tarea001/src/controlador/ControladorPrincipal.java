/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FRM_VentanaRegistroCursos;
import vista.FRM_VentanaRegistroEstudiantes;


/**
 *
 * @author Lanfor
 */
public class ControladorPrincipal implements ActionListener{
    
    FRM_VentanaRegistroEstudiantes frm_Registro;
    FRM_VentanaRegistroCursos fRM_VentanaRegistroCursos;
    public ControladorPrincipal() 
    {
        frm_Registro=new FRM_VentanaRegistroEstudiantes();
        fRM_VentanaRegistroCursos=new FRM_VentanaRegistroCursos();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("estudiantes"))
        {
            frm_Registro.show();
        }
        if(e.getActionCommand().equalsIgnoreCase("cursos"))
        {
            fRM_VentanaRegistroCursos.show();
        }
         
        if(e.getActionCommand().equalsIgnoreCase("Matricula"))
        {
            
        }
        if(e.getActionCommand().equals("Salir"))
        {
           System.exit(0);
        }
    }
    
}