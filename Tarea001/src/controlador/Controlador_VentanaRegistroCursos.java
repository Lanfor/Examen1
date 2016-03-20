package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FRM_VentanaRegistroCursos;

/**
 *
 * @author Lanfor, Profe ya entendí como hacerlo bien, para la proxima vez
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
