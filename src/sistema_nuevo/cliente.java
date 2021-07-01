package sistema_nuevo;

import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class cliente extends javax.swing.JFrame {

    private String accion = "Guardar";

    public cliente() {
        this.getContentPane().setBackground(new Color(0, 153, 153));
        initComponents();
        limpiar();
        mostrardatos("");
    }

    void limpiar() {
        idcliente.setText("");
        rfc.setText("");
        nombre.setText("");
        direccion.setText("");
        telefono.setText("");
        email.setText("");

    }

    void mostrardatos(String valor) {
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("ID");
//        modelo.addColumn("RFC");
//        modelo.addColumn("NOMBRE");
//        modelo.addColumn("DIRECCION");
//        modelo.addColumn("TELEFONO");
//        modelo.addColumn("EMAIL");
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
//        tabla.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM clientes";
        } else {
            sql = "SELECT * FROM clientes WHERE id_cliente='" + valor + "'";
        }
        String[] datos = new String[6];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Registro no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rfc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        idcliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        registrar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Registro Clientes");

        jLabel2.setText("Id Cliente :");

        jLabel3.setText("RFC : ");

        rfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfcActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre : ");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        jLabel5.setText("Direccion :");

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionKeyTyped(evt);
            }
        });

        jLabel6.setText("Telefono :");

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        jLabel7.setText("Correo Electronico :");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        idcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idclienteActionPerformed(evt);
            }
        });
        idcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idclienteKeyTyped(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RFC", "NOMBRRE", "DIRECCION", "TELEFONO", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registrar)
                            .addComponent(consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(mostrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(mostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(registrar)
                        .addGap(18, 18, 18)
                        .addComponent(consultar)
                        .addGap(18, 18, 18)
                        .addComponent(modificar)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar)
                        .addGap(12, 12, 12)
                        .addComponent(salir)
                        .addContainerGap(163, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(11, 11, 11))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idclienteActionPerformed
        idcliente.transferFocus();
    }//GEN-LAST:event_idclienteActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        nombre.transferFocus();
    }//GEN-LAST:event_nombreActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        telefono.transferFocus();
    }//GEN-LAST:event_telefonoActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        direccion.transferFocus();
    }//GEN-LAST:event_direccionActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        email.transferFocus();
    }//GEN-LAST:event_emailActionPerformed

    private void rfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfcActionPerformed
        rfc.transferFocus();
    }//GEN-LAST:event_rfcActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (idcliente.getText().isEmpty() || rfc.getText().isEmpty() || nombre.getText().isEmpty() || direccion.getText().isEmpty() || telefono.getText().isEmpty() || email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            clientes clie;
            clie = new clientes(Integer.parseInt(idcliente.getText()), rfc.getText(), nombre.getText(), direccion.getText(), Integer.parseInt(telefono.getText()), email.getText(), cn);

            try {
                int n;
                n = clie.registrar();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, " Registro guardado con exito ");
                    mostrardatos("");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, " Registro no guardado ");
                }
            } catch (SQLException ex) {
                Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        if (idcliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escribe el ID", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            mostrardatos(idcliente.getText());
            limpiar();
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_mostrarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (idcliente.getText().isEmpty() || rfc.getText().isEmpty() || nombre.getText().isEmpty() || direccion.getText().isEmpty() || telefono.getText().isEmpty() || email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE clientes SET id_cliente='" + idcliente.getText() + "',RFC='" + rfc.getText() + "',Nombre='" + nombre.getText() + "',Direccion='" + direccion.getText() + "',Telefono='" + telefono.getText() + "',Correo_electronico='" + email.getText() + "' WHERE id_cliente='" + idcliente.getText() + "'");
                pst.executeUpdate();
                limpiar();
                mostrardatos("");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (idcliente.getText().isEmpty() || rfc.getText().isEmpty() || nombre.getText().isEmpty() || direccion.getText().isEmpty() || telefono.getText().isEmpty() || email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!idcliente.getText().equals("")) {
                int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro que quieres Elimar?", "Confirmar", 2);
                if (confirmacion == 0) {
                    int fila = tabla.getSelectedRow();
                    String eliminar = "";
                    eliminar = tabla.getValueAt(fila, 0).toString();
                    try {
                        PreparedStatement pst = cn.prepareStatement("DELETE FROM clientes WHERE id_cliente='" + eliminar + "'");
                        pst.executeUpdate();
                        mostrardatos("");
                        limpiar();
                    } catch (Exception e) {
                    }
                }
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            idcliente.setText((String) tabla.getValueAt(fila, 0));
            rfc.setText((String) tabla.getValueAt(fila, 1));
            nombre.setText((String) tabla.getValueAt(fila, 2));
            direccion.setText((String) tabla.getValueAt(fila, 3));
            telefono.setText((String) tabla.getValueAt(fila, 4));
            email.setText((String) tabla.getValueAt(fila, 5));
        } else {

            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void idclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idclienteKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }

    }//GEN-LAST:event_idclienteKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char a = evt.getKeyChar();
        if ((a < 'a' || a > 'z') && (a < 'A' | a > 'Z') && a != ' ' && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Letras", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_nombreKeyTyped

    private void direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionKeyTyped

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
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultar;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField idcliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField rfc;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
conexion cc = new conexion();
    Connection cn = cc.conexion();
}
