package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FRM_VentanaPrincipal;
import vista.FRM_VentanaRegistroCursos;
import vista.FRM_VentanaRegistroEstudiantes;


/**
 *
* @author Lanfor, Profe ya entendí como hacerlo bien, para la proxima vez
 */
public class ControladorPrincipal implements ActionListener{
    
    FRM_VentanaRegistroEstudiantes frm_Registro;
    FRM_VentanaRegistroCursos fRM_VentanaRegistroCursos;
    public ControladorPrincipal()
    {
        this.frm_Registro=new FRM_VentanaRegistroEstudiantes();
        this.fRM_VentanaRegistroCursos=new FRM_VentanaRegistroCursos();
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
        if(e.getActionCommand().equalsIgnoreCase("Registrar"))
        {
        }
        if(e.getActionCommand().equals("Salir"))
        {
           System.exit(0);
        }
    }
    
}