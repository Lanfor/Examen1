/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador_FRM_Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author Lanfor
 */
public class Panel_Informacion extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Informacion
     */
    Controlador_FRM_Principal controlador_FRM_Principal;
    public Panel_Informacion() {
        initComponents();
    }
    public void colocarCodigo(String codigo)
    {
       this.jt_NumeroPrestamo.setText(codigo);
    }
    public String devolverNumPrestamo()
    {
       return jt_NumeroPrestamo.getText();
    }
    public int mostrarMensajeOpcional(String msj)
    {
        return JOptionPane.showConfirmDialog(this, msj);
    }
    public void desabilitarCampos()
    {
        jt_NombreUsuario.setEnabled(false);
        jt_Cedula.setEnabled(false);
        jt_Isbn.setEnabled(false);
    }
    public void habilitarCampos()
    {
        jt_NombreUsuario.setEnabled(true);
        jt_Cedula.setEnabled(true);
        jt_Isbn.setEnabled(true);
    }
    public void resetearVentana()
    {
        jt_NombreUsuario.setText("");
        jt_Cedula.setText("");
        jt_Isbn.setText("");
    }
    public void mostarMensaje(String msj)
    {
        JOptionPane.showMessageDialog(this, msj);
    }
    public void recibirControlador(Controlador_FRM_Principal controlador_FRM_Principal)
    {
        this.controlador_FRM_Principal=controlador_FRM_Principal;
    }
    public void colocarInformacion(String[] informacion)
    {
        jt_NombreUsuario.setText(informacion[0]);
        jt_Cedula.setText(informacion[1]);
        jt_Isbn.setText(informacion[2]);
    }
    public String[] informacionFormulario()
    {
        String arreglo[]={jt_NumeroPrestamo.getText(),jt_NombreUsuario.getText(),jt_Cedula.getText(),jt_Isbn.getText()};
        return arreglo;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_NumeroPrestamo = new javax.swing.JLabel();
        jt_NumeroPrestamo = new javax.swing.JTextField();
        jl_NombreUsuario = new javax.swing.JLabel();
        jt_NombreUsuario = new javax.swing.JTextField();
        jl_Cedula = new javax.swing.JLabel();
        jt_Cedula = new javax.swing.JTextField();
        jl_Isbn = new javax.swing.JLabel();
        jt_Isbn = new javax.swing.JTextField();

        jl_NumeroPrestamo.setText("Numero de préstamo:");

        jt_NumeroPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_NumeroPrestamoKeyPressed(evt);
            }
        });

        jl_NombreUsuario.setText("Nombre del usuario:");

        jl_Cedula.setText("Cédula del usuario:");

        jl_Isbn.setText("ISBN del libro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jl_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_Isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jt_Isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_NumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jt_NumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NumeroPrestamo)
                    .addComponent(jt_NumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NombreUsuario)
                    .addComponent(jt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Cedula)
                    .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Isbn)
                    .addComponent(jt_Isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_NumeroPrestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_NumeroPrestamoKeyPressed
        if(evt.getKeyCode()==10)
        controlador_FRM_Principal.buscar();
    }//GEN-LAST:event_jt_NumeroPrestamoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Isbn;
    private javax.swing.JLabel jl_NombreUsuario;
    private javax.swing.JLabel jl_NumeroPrestamo;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Isbn;
    private javax.swing.JTextField jt_NombreUsuario;
    private javax.swing.JTextField jt_NumeroPrestamo;
    // End of variables declaration//GEN-END:variables
}
