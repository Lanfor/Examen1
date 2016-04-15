/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MetodosBiblioteca;
import vista.FRM_Principal;

/**
 *
 * @author Lanfor
 */
public class Controlador_FRM_Principal implements ActionListener
{
    FRM_Principal frm_Principal;
    public MetodosBiblioteca metodosBiblioteca;
    public Controlador_FRM_Principal(FRM_Principal frm_Principal) 
    {
        this.frm_Principal=frm_Principal;
        metodosBiblioteca=new MetodosBiblioteca();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equalsIgnoreCase("Buscar"))
        {
            buscar();
        }
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            metodosBiblioteca.agregarPrestamo(frm_Principal.informacionFormulario());
            frm_Principal.colocarCodigo();
            frm_Principal.desabilitarBotones();
            frm_Principal.resetarVentana();
            frm_Principal.desabilitarCampos();
        }
        if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
            metodosBiblioteca.modificar(frm_Principal.informacionFormulario());
            frm_Principal.resetarVentana();
            frm_Principal.colocarCodigo();
            frm_Principal.desabilitarCampos();
            frm_Principal.mostrarMensaje("Seha modificado");
        }
        if(e.getActionCommand().equalsIgnoreCase("Eliminar"))
        {
            metodosBiblioteca.eliminar();
            frm_Principal.resetarVentana();
            frm_Principal.colocarCodigo();
            frm_Principal.desabilitarCampos();
            frm_Principal.mostrarMensaje("Se ha eliminado");
        }
    }
    public void buscar()
    {
        if(metodosBiblioteca.verificar(frm_Principal.devolverNumPrestamo()))
        {
            frm_Principal.colocarInformacion(metodosBiblioteca.getInformacionConsultada());
            frm_Principal.habilitarBotones();
            frm_Principal.habilitarCampos();
        }
        else
        {
            if(frm_Principal.mostrarMensajeOpcional("Este # de préstamo no se encuentra registrado, desea agregarlo")==0)
            {
                frm_Principal.habilitarAgregar();
                frm_Principal.habilitarCampos();
            }
            else
            {
                frm_Principal.resetarVentana();
            }
        }
    }
}
