package sistema_nuevo;

import funciones.funciones;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.sql.Connection;
import sistema_nuevo.conexion;
import sistema_nuevo.conexion;
import sistema_nuevo.principal;
import sistema_nuevo.principal;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        this.getContentPane().setBackground(new Color(21, 138, 162));
            setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        entrar = new javax.swing.JButton();
        labelUser = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setBackground(new java.awt.Color(21, 138, 162));
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        login.setBackground(new java.awt.Color(21, 138, 162));
        login.setLayout(null);
        getContentPane().add(login);
        login.setBounds(91, 100, 0, 0);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 28)); // NOI18N
        jLabel1.setText("Iniciar Sesión");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(103, 24, 166, 38);

        txtusuario.setMinimumSize(new java.awt.Dimension(6, 31));
        txtusuario.setPreferredSize(new java.awt.Dimension(6, 31));
        getContentPane().add(txtusuario);
        txtusuario.setBounds(120, 90, 160, 31);

        password.setMinimumSize(new java.awt.Dimension(6, 31));
        password.setPreferredSize(new java.awt.Dimension(6, 31));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(120, 140, 160, 31);

        entrar.setText("Ingresar");
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
        });
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar);
        entrar.setBounds(150, 200, 112, 32);

        labelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatar.png"))); // NOI18N
        getContentPane().add(labelUser);
        labelUser.setBounds(60, 90, 51, 32);

        labelPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/key.png"))); // NOI18N
        getContentPane().add(labelPassword);
        labelPassword.setBounds(70, 140, 40, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
//        String usuario = "admin";
//        String contraseña = "admin";
        String user= txtusuario.getText();
         String pass =new String(password.getPassword());
         
conexion objcn= new conexion();
            Connection conexion= objcn.conexion();
   boolean existe= funciones.validaUsuario(user,pass, conexion);
                    System.out.println(existe);
        if (existe) {
            principal pri = new principal();
            pri.getContentPane().setBackground(new Color(21,138,162));
           
            pri.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrecta");
        }
    }//GEN-LAST:event_entrarMouseClicked

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
