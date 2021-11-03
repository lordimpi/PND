package co.panaderia.presentation;

import co.panaderia.domain.entitys.Empleado;
import co.panaderia.domain.services.EmpleadoService;
import co.panaderia.infra.Messages;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago Acuña
 */
public class GUICrearEmpleado extends javax.swing.JFrame {    
    /**
     * Creates new form GUICreateUser
     */
    public GUICrearEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnNorte = new javax.swing.JPanel();
        jPnSur = new javax.swing.JPanel();
        jBtnRegistrar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jPnCentro = new javax.swing.JPanel();
        jLbNombre = new javax.swing.JLabel();
        jTxfNombre = new javax.swing.JTextField();
        jLbApellido = new javax.swing.JLabel();
        jTxfApellido = new javax.swing.JTextField();
        jLbDireccion = new javax.swing.JLabel();
        JTxfDireccion = new javax.swing.JTextField();
        jLbEmail = new javax.swing.JLabel();
        jTxfEmail = new javax.swing.JTextField();
        jLbTelefono = new javax.swing.JLabel();
        jTxfTelefono = new javax.swing.JTextField();
        jLbPassword = new javax.swing.JLabel();
        jTxfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPnNorte.setBackground(new java.awt.Color(54, 33, 88));
        jPnNorte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnNorte.setPreferredSize(new java.awt.Dimension(450, 50));

        javax.swing.GroupLayout jPnNorteLayout = new javax.swing.GroupLayout(jPnNorte);
        jPnNorte.setLayout(jPnNorteLayout);
        jPnNorteLayout.setHorizontalGroup(
            jPnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );
        jPnNorteLayout.setVerticalGroup(
            jPnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        getContentPane().add(jPnNorte, java.awt.BorderLayout.PAGE_START);

        jPnSur.setBackground(new java.awt.Color(54, 33, 88));
        jPnSur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnSur.setPreferredSize(new java.awt.Dimension(450, 50));

        jBtnRegistrar.setText("Registrar");
        jBtnRegistrar.setFocusPainted(false);
        jBtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistrarActionPerformed(evt);
            }
        });
        jPnSur.add(jBtnRegistrar);

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.setFocusPainted(false);
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPnSur.add(jBtnCancelar);

        getContentPane().add(jPnSur, java.awt.BorderLayout.PAGE_END);

        jPnCentro.setLayout(new java.awt.GridLayout(6, 2));

        jLbNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLbNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbNombre.setText("Nombre:");
        jPnCentro.add(jLbNombre);

        jTxfNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxfNombre.setToolTipText("Your firts name");
        jPnCentro.add(jTxfNombre);

        jLbApellido.setBackground(new java.awt.Color(255, 255, 255));
        jLbApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbApellido.setText("Apellido:");
        jPnCentro.add(jLbApellido);

        jTxfApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxfApellido.setToolTipText("Your last name");
        jPnCentro.add(jTxfApellido);

        jLbDireccion.setBackground(new java.awt.Color(255, 255, 255));
        jLbDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbDireccion.setText("Direccion:");
        jPnCentro.add(jLbDireccion);

        JTxfDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTxfDireccion.setToolTipText("Your address");
        jPnCentro.add(JTxfDireccion);

        jLbEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbEmail.setText("Email:");
        jLbEmail.setToolTipText("");
        jPnCentro.add(jLbEmail);

        jTxfEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxfEmail.setToolTipText("Your email xxxx@xxxx.com");
        jPnCentro.add(jTxfEmail);

        jLbTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTelefono.setText("Telefono:");
        jLbTelefono.setToolTipText("");
        jPnCentro.add(jLbTelefono);

        jTxfTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxfTelefono.setToolTipText("Your phone");
        jPnCentro.add(jTxfTelefono);

        jLbPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbPassword.setText("Contraseña:");
        jLbPassword.setToolTipText("");
        jPnCentro.add(jLbPassword);

        jTxfPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxfPassword.setToolTipText("Your password");
        jPnCentro.add(jTxfPassword);

        getContentPane().add(jPnCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Crea un usuario con rol de user y lo guarda en la base de datos
     * @param evt Evento del boton
     */
    private void jBtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistrarActionPerformed
        if (JTxfDireccion.getText().isEmpty() || jTxfApellido.getText().isEmpty() || jTxfEmail.getText().isEmpty()
                || jTxfNombre.getText().isEmpty() || jTxfPassword.getText().isEmpty() || jTxfTelefono.getText().isEmpty()) {
            Messages.warningMessage("ERROR: Campos vacios", "Warning");
            return;
        }
        
        EmpleadoService service = new EmpleadoService();
        Empleado user = new Empleado();
        //TO DO
        user.setRol("user");
        
        if (jTxfEmail.getText().contains("@")) {
            try {
                if (service.crear(user)) {
                    Messages.successMessage("Empleado registrado con exito", "Exito");
                }else{
                    Messages.warningMessage("ERROR: No se pudo registrar el empleado", "Error");
                }
            } catch (Exception ex) {
                Logger.getLogger(GUICrearEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Messages.warningMessage("El Email ingresado no es valido", "Warning");
        }

    }//GEN-LAST:event_jBtnRegistrarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        limpiarCampos();
        this.dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICrearEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTxfDireccion;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnRegistrar;
    private javax.swing.JLabel jLbApellido;
    private javax.swing.JLabel jLbDireccion;
    private javax.swing.JLabel jLbEmail;
    private javax.swing.JLabel jLbNombre;
    private javax.swing.JLabel jLbPassword;
    private javax.swing.JLabel jLbTelefono;
    private javax.swing.JPanel jPnCentro;
    private javax.swing.JPanel jPnNorte;
    private javax.swing.JPanel jPnSur;
    private javax.swing.JTextField jTxfApellido;
    private javax.swing.JTextField jTxfEmail;
    private javax.swing.JTextField jTxfNombre;
    private javax.swing.JPasswordField jTxfPassword;
    private javax.swing.JTextField jTxfTelefono;
    // End of variables declaration//GEN-END:variables

private void limpiarCampos(){
    this.JTxfDireccion.setText("");
    this.jTxfApellido.setText("");
    this.jTxfEmail.setText("");
    this.jTxfNombre.setText("");
    this.jTxfTelefono.setText("");
    this.jTxfPassword.setText("");
}
    
}
