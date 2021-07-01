package sistema_nuevo;

import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class habitacion extends javax.swing.JFrame {

    private String accion = "Guardar";

    public habitacion() {
        initComponents();
        this.getContentPane().setBackground(new Color(0, 153, 153));
        limpiar();
        mostrardatos("");
    }

    void limpiar() {
        idhabitaciones.setText("");
        numero.setText("");
        piso.setSelectedItem("");
        descripcion.setText("");
        caracteristicas.setText("");
        precio.setText("");
        estado.setSelectedItem("");
        tipohabitacion.setSelectedItem("");
    }

    void mostrardatos(String valor) {
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("ID");
//        modelo.addColumn("NUMERO");
//        modelo.addColumn("PISO");
//        modelo.addColumn("DESCRIPCION");
//        modelo.addColumn("CARACTERISTICAS");
//        modelo.addColumn("PRECIO");
//        modelo.addColumn("ESTADO");
//        modelo.addColumn("TIPO DE HABITACION");
//        tabla.setModel(modelo);
        DefaultTableModel modelo =  (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM habitaciones";
        } else {
            sql = "SELECT * FROM habitaciones WHERE idHabitaciones='" + valor + "'";
        }
        String[] datos = new String[8];
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
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Registro no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(habitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idhabitaciones = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        piso = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        caracteristicas = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox();
        tipohabitacion = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        mostrar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setText("Numero de Habitacion :");

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setText("Registro de Habitaciones");

        idhabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idhabitacionesActionPerformed(evt);
            }
        });
        idhabitaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idhabitacionesKeyTyped(evt);
            }
        });

        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });
        numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroKeyTyped(evt);
            }
        });

        piso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        piso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pisoActionPerformed(evt);
            }
        });

        jLabel3.setText("Piso :");

        jLabel4.setText("Descripcion :");

        descripcion.setColumns(20);
        descripcion.setRows(5);
        descripcion.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                descripcionAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(descripcion);

        caracteristicas.setColumns(20);
        caracteristicas.setRows(5);
        caracteristicas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                caracteristicasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(caracteristicas);

        jLabel5.setText("Caracteristicas :");

        jLabel6.setText("Precio :");

        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });

        jLabel7.setText("Estado :");

        estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Ocupado", "Mantenimiento", " " }));
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        tipohabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Individual", "Matrimonial", "Familiar", "Residencial" }));
        tipohabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipohabitacionActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo de Habitacion :");

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

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NO.HABITACION", "PISO", "DESCRIPCION", "CARACTERISTICAS", "PRECIO", "ESTADO", "TIPO_HABITACION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        jScrollPane4.setViewportView(tabla);

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel9.setText("Id Cliente :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(piso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tipohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(numero, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                        .addComponent(idhabitaciones))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(precio)
                                        .addComponent(estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(consultar, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(registrar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(mostrar))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(registrar)
                        .addGap(18, 18, 18)
                        .addComponent(consultar)
                        .addGap(18, 18, 18)
                        .addComponent(modificar)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel6)
                                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(idhabitaciones))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(numero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(piso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(tipohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idhabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idhabitacionesActionPerformed
        idhabitaciones.transferFocus();
    }//GEN-LAST:event_idhabitacionesActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        numero.transferFocus();
    }//GEN-LAST:event_numeroActionPerformed

    private void pisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pisoActionPerformed
        piso.transferFocus();
    }//GEN-LAST:event_pisoActionPerformed

    private void descripcionAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_descripcionAncestorAdded
        descripcion.transferFocus();
    }//GEN-LAST:event_descripcionAncestorAdded

    private void caracteristicasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_caracteristicasAncestorAdded
        caracteristicas.transferFocus();
    }//GEN-LAST:event_caracteristicasAncestorAdded

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        precio.transferFocus();
    }//GEN-LAST:event_precioActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        estado.transferFocus();
    }//GEN-LAST:event_estadoActionPerformed

    private void tipohabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipohabitacionActionPerformed
        tipohabitacion.transferFocus();
    }//GEN-LAST:event_tipohabitacionActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (idhabitaciones.getText().isEmpty() || numero.getText().isEmpty() || descripcion.getText().isEmpty() || caracteristicas.getText().isEmpty() || precio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Sistema_nuevo che;
            che = new Sistema_nuevo(Integer.parseInt(idhabitaciones.getText()), numero.getText(), piso.getSelectedItem() + "", descripcion.getText(), caracteristicas.getText(), precio.getText(), estado.getSelectedItem() + "", tipohabitacion.getSelectedItem() + "", cn);

            try {
                int n;
                n = che.alta();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, " Registro guardado con exito ");
                    mostrardatos("");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, " Registro no guardado ");
                }
            } catch (SQLException ex) {
                Logger.getLogger(habitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_registrarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        if (idhabitaciones.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escribe el ID", "Error", JOptionPane.ERROR_MESSAGE);   
       } else {
        mostrardatos(idhabitaciones.getText());
        limpiar();
}

    }//GEN-LAST:event_consultarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        mostrardatos("");
        limpiar();

    }//GEN-LAST:event_mostrarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (idhabitaciones.getText().isEmpty() || numero.getText().isEmpty() || descripcion.getText().isEmpty() || caracteristicas.getText().isEmpty() || precio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE habitaciones SET idHabitaciones='" + idhabitaciones.getText() + "',Numero_habitacion='" + numero.getText() + "',Piso='" + piso.getSelectedItem() + "',Descripcion='" + descripcion.getText() + "',Caracteristicas='" + caracteristicas.getText() + "',Precio='" + precio.getText() + "',Estado='" + estado.getSelectedItem() + "',Tipo_habitacion='" + tipohabitacion.getSelectedItem() + "' WHERE idHabitaciones='" + idhabitaciones.getText() + "'");
                pst.executeUpdate();
                limpiar();
                mostrardatos("");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (idhabitaciones.getText().isEmpty() || numero.getText().isEmpty() || descripcion.getText().isEmpty() || caracteristicas.getText().isEmpty() || precio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!idhabitaciones.getText().equals("")) {
                int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro que quieres Elimar?", "Confirmar", 2);
                if (confirmacion == 0) {
                    int fila = tabla.getSelectedRow();
                    String eliminar = "";
                    eliminar = tabla.getValueAt(fila, 0).toString();
                    try {
                        PreparedStatement pst = cn.prepareStatement("DELETE FROM habitaciones WHERE idHabitaciones='" + eliminar + "'");
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
            idhabitaciones.setText((String) tabla.getValueAt(fila, 0));
            numero.setText((String) tabla.getValueAt(fila, 1));
            piso.setSelectedItem(tabla.getValueAt(fila, 2));
            descripcion.setText((String) tabla.getValueAt(fila, 3));
            caracteristicas.setText((String) tabla.getValueAt(fila, 4));
            precio.setText((String) tabla.getValueAt(fila, 5));
            estado.setSelectedItem((String) tabla.getValueAt(fila, 6));
            tipohabitacion.setSelectedItem((String) tabla.getValueAt(fila, 7));
        } else {

            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }

    }//GEN-LAST:event_tablaMouseClicked

    private void idhabitacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idhabitacionesKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9')&& a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_idhabitacionesKeyTyped

    private void numeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_numeroKeyTyped

    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9')&& a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_precioKeyTyped

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
            java.util.logging.Logger.getLogger(habitacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(habitacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(habitacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(habitacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new habitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea caracteristicas;
    private javax.swing.JButton consultar;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox estado;
    private javax.swing.JTextField idhabitaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField numero;
    private javax.swing.JComboBox piso;
    private javax.swing.JTextField precio;
    private javax.swing.JButton registrar;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox tipohabitacion;
    // End of variables declaration//GEN-END:variables
conexion cc = new conexion();
    Connection cn = cc.conexion();
}
