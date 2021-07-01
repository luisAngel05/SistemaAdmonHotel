package sistema_nuevo;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.text.ParseException;

public class reservacion extends javax.swing.JFrame {

    funcionfecha fecha = new funcionfecha();
    private String accion = "Guardar";

    public reservacion() {
        initComponents();
        this.getContentPane().setBackground(new Color(0, 153, 153));
        limpiar();
        
//        mostrardatos("");
    }

    public class funcionfecha {

        public java.util.Date StringADate(String fecha) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date fechaE = null;
            try {
                fechaE = sdf.parse(fecha);
                return fechaE;
            } catch (ParseException ex) {
                return null;
            }
        }
    }

    void limpiar() {
        idReservacion.setText("");
        tipo.setSelectedItem("");
        fecha_re.setDate(null);
        fecha_en.setDate(null);
        fecha_sa.setDate(null);
        costo.setText("");
        observaciones.setText("");
        estado.setText("");
        id_habi.setText("");
        id_cli.setText("");
    }

    void mostrardatos(String valor) {
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.addColumn("ID");
//        modelo.addColumn("TIPO RESERVA");
//        modelo.addColumn("FECHA RESERVA");
//        modelo.addColumn("FECHA ENTRADA");
//        modelo.addColumn("FECHA SALIDA");
//        modelo.addColumn("COSTO");
//        modelo.addColumn("OBSERVACIONES");
//        modelo.addColumn("ESTADO");
//        modelo.addColumn("ID HABITACION");
//        modelo.addColumn("ID CLIENTE");
//        modelo.addColumn("NOMBRE");
//        tabla.setModel(modelo);
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT `idReservaciones`,`Tipo_reserva`,`Fecha_reserva`,`Fecha_entrada`,`Fecha_salida`,`Costo`,`Observaciones`,`Estado`,`idHabitaciones`,`idcliente`,clientes.Nombre FROM `reservaciones`,`clientes`WHERE reservaciones.idcliente=clientes.id_cliente";
        } else {
            sql = "SELECT `idReservaciones`,`Tipo_reserva`,`Fecha_reserva`,`Fecha_entrada`,`Fecha_salida`,`Costo`,`Observaciones`,`Estado`,`idHabitaciones`,`idcliente`,clientes.Nombre FROM `reservaciones`,`clientes` WHERE idReservaciones='" + valor + "'AND reservaciones.idcliente=clientes.id_cliente";
        }
        String[] datos = new String[11];
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
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Registro no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(reservacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idReservacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        observaciones = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        registrar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        fecha_re = new com.toedter.calendar.JDateChooser();
        fecha_en = new com.toedter.calendar.JDateChooser();
        fecha_sa = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id_habi = new javax.swing.JTextField();
        id_cli = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setText("Registro de reservaciones");

        jLabel2.setText("Id reservacion : ");

        idReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idReservacionActionPerformed(evt);
            }
        });
        idReservacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idReservacionKeyTyped(evt);
            }
        });

        jLabel3.setText("Tipo de reservacion :");

        jLabel4.setText("Fecha de reservacion :");

        jLabel5.setText("Fecha de entrada : ");

        jLabel6.setText("Fecha de salida : ");

        jLabel7.setText("Costo :");

        jLabel8.setText("Observaciones :");

        jLabel9.setText("Estado :");

        costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoActionPerformed(evt);
            }
        });
        costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                costoKeyTyped(evt);
            }
        });

        observaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionesActionPerformed(evt);
            }
        });
        observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                observacionesKeyTyped(evt);
            }
        });

        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo 1 ", "Tipo 2", "Tipo 3", " " }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO_RESERVA", "FECHA_RESERVA", "FECHA_ENTRADA", "FECHA_SALIDA", "COSTO", "OBSERVACIONES", "ESTADO", "ID_HABITACION", "ID_CLIENTE", "NOMBRE_CLIENTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
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

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
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

        fecha_re.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecha_rePropertyChange(evt);
            }
        });

        fecha_en.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecha_enPropertyChange(evt);
            }
        });

        jLabel10.setText("Id Cliente");

        jLabel11.setText("Id Habitacion");

        id_habi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_habiActionPerformed(evt);
            }
        });
        id_habi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_habiKeyTyped(evt);
            }
        });

        id_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_cliActionPerformed(evt);
            }
        });
        id_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_cliKeyTyped(evt);
            }
        });

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fecha_re, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fecha_en, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fecha_sa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(observaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(estado)
                                    .addComponent(costo)
                                    .addComponent(id_habi)
                                    .addComponent(id_cli))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(mostrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registrar)
                                    .addComponent(consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(idReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(fecha_re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addComponent(fecha_en, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(fecha_sa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(id_habi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(jButton1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(mostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(registrar)
                                .addGap(18, 18, 18)
                                .addComponent(consultar)
                                .addGap(18, 18, 18)
                                .addComponent(modificar)
                                .addGap(18, 18, 18)
                                .addComponent(eliminar)
                                .addGap(18, 18, 18)
                                .addComponent(salir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idReservacionActionPerformed
        idReservacion.transferFocus();
    }//GEN-LAST:event_idReservacionActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        tipo.transferFocus();
    }//GEN-LAST:event_tipoActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (idReservacion.getText().isEmpty() || fecha_re.getDate() == null || fecha_en.getDate() == null || fecha_sa.getDate() == null || costo.getText().isEmpty() || observaciones.getText().isEmpty() || estado.getText().isEmpty() || id_habi.getText().isEmpty() || id_cli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!idReservacion.getText().equals("")) {
                int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro que quieres Elimar?", "Confirmar", 2);
                if (confirmacion == 0) {

                    int fila = tabla.getSelectedRow();
                    String eliminar = "";
                    eliminar = tabla.getValueAt(fila, 0).toString();
                    try {
                        PreparedStatement pst = cn.prepareStatement("DELETE FROM reservaciones WHERE idReservaciones='" + eliminar + "'");
                        pst.executeUpdate();
                        mostrardatos("");
                        limpiar();

                    } catch (Exception e) {
                    }
                }
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        mostrardatos("");
        limpiar();

    }//GEN-LAST:event_mostrarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed

        if (idReservacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escribe el ID", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            mostrardatos(idReservacion.getText());
            limpiar();
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (idReservacion.getText().isEmpty() || fecha_re.getDate() == null || fecha_en.getDate() == null || fecha_sa.getDate() == null || costo.getText().isEmpty() || observaciones.getText().isEmpty() || estado.getText().isEmpty() || id_habi.getText().isEmpty() || id_cli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechas = sdf.format(fecha_re.getDate());
            String fecha = sdf.format(fecha_en.getDate());
            String fech = sdf.format(fecha_sa.getDate());
            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE reservaciones SET idReservaciones='" + idReservacion.getText() + "',Tipo_reserva='" + tipo.getSelectedItem() + "',Fecha_reserva='" + fechas + "',Fecha_entrada='" + fecha + "',Fecha_salida='" + fech + "',Costo='" + costo.getText() + "',Observaciones='" + observaciones.getText() + "',Estado='" + estado.getText() + "',idHabitaciones='" + id_habi.getText() + "',idcliente='" + id_cli.getText() + "' WHERE idReservaciones='" + idReservacion.getText() + "'");
                pst.executeUpdate();
                limpiar();
                mostrardatos("");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            idReservacion.setText((String) tabla.getValueAt(fila, 0));
            tipo.setSelectedItem(tabla.getValueAt(fila, 1));
            fecha_re.setDate(fecha.StringADate(tabla.getValueAt(fila, 2).toString()));
            fecha_en.setDate(fecha.StringADate(tabla.getValueAt(fila, 3).toString()));
            fecha_sa.setDate(fecha.StringADate(tabla.getValueAt(fila, 4).toString()));
            costo.setText((String) tabla.getValueAt(fila, 5));
            observaciones.setText((String) tabla.getValueAt(fila, 6));
            estado.setText((String) tabla.getValueAt(fila, 7));
            id_habi.setText((String) tabla.getValueAt(fila, 8));
            id_cli.setText((String) tabla.getValueAt(fila, 9));
        } else {

            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoActionPerformed
        costo.transferFocus();
    }//GEN-LAST:event_costoActionPerformed

    private void observacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionesActionPerformed
        observaciones.transferFocus();
    }//GEN-LAST:event_observacionesActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        estado.transferFocus();
    }//GEN-LAST:event_estadoActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (idReservacion.getText().isEmpty() || fecha_re.getDate() == null || fecha_en.getDate() == null || fecha_sa.getDate() == null || costo.getText().isEmpty() || observaciones.getText().isEmpty() || estado.getText().isEmpty() || id_habi.getText().isEmpty() || id_cli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            fecha_re.getDate();
            fecha_en.getDate();
            fecha_sa.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechas = sdf.format(fecha_re.getDate());
            String fecha = sdf.format(fecha_en.getDate());
            String fech = sdf.format(fecha_sa.getDate());
            reservaciones che;
            che = new reservaciones(Integer.parseInt(idReservacion.getText()), tipo.getSelectedItem() + "", fechas, fecha, fech, costo.getText(), observaciones.getText(), estado.getText(), Integer.parseInt(id_habi.getText()), Integer.parseInt(id_cli.getText()), cn);

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
                Logger.getLogger(reservacion.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }//GEN-LAST:event_registrarActionPerformed

    private void id_habiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_habiActionPerformed
        id_habi.transferFocus();
    }//GEN-LAST:event_id_habiActionPerformed

    private void id_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_cliActionPerformed
        id_cli.transferFocus();
    }//GEN-LAST:event_id_cliActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cliente form = new cliente();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        habitacion form = new habitacion();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

    }//GEN-LAST:event_jButton1KeyPressed

    private void idReservacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idReservacionKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
        }
    }//GEN-LAST:event_idReservacionKeyTyped

    private void observacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_observacionesKeyTyped
        char a = evt.getKeyChar();
        if ((a < 'a' || a > 'z') && (a < 'A' | a > 'Z') && a != ' ' && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Letras", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }

    }//GEN-LAST:event_observacionesKeyTyped

    private void costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }


    }//GEN-LAST:event_costoKeyTyped

    private void id_habiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_habiKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_id_habiKeyTyped

    private void id_cliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_cliKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_id_cliKeyTyped

    private void fecha_enPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecha_enPropertyChange
        
        
        fecha_sa.setMinSelectableDate(fecha_en.getDate());
    }//GEN-LAST:event_fecha_enPropertyChange

    private void fecha_rePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecha_rePropertyChange
        // TODO add your handling code here:
        fecha_en.setMinSelectableDate(fecha_re.getDate());
       
    }//GEN-LAST:event_fecha_rePropertyChange

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
            java.util.logging.Logger.getLogger(reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultar;
    private javax.swing.JTextField costo;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField estado;
    private com.toedter.calendar.JDateChooser fecha_en;
    private com.toedter.calendar.JDateChooser fecha_re;
    private com.toedter.calendar.JDateChooser fecha_sa;
    private javax.swing.JTextField idReservacion;
    private javax.swing.JTextField id_cli;
    private javax.swing.JTextField id_habi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField observaciones;
    private javax.swing.JButton registrar;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox tipo;
    // End of variables declaration//GEN-END:variables
conexion cc = new conexion();
    Connection cn = cc.conexion();
}
