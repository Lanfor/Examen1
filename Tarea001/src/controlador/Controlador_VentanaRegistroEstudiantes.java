package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ArrayEstudiante;
import vista.FRM_VentanaRegistroEstudiantes;

/**
 *
 * @author Lanfor, Profe ya entendí como hacerlo bien, para la proxima vez
 */
public class Controlador_VentanaRegistroEstudiantes implements ActionListener{
    
    FRM_VentanaRegistroEstudiantes frm_VentanaRegistroEstudiantes;
    ArrayEstudiante metodosEstudiante;
    public Controlador_VentanaRegistroEstudiantes(FRM_VentanaRegistroEstudiantes frm_VentanaRegistroEstudiantes) 
    {
        this.frm_VentanaRegistroEstudiantes=frm_VentanaRegistroEstudiantes;
        metodosEstudiante=new ArrayEstudiante();
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
