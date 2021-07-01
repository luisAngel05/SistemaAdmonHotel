package views;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistema_nuevo.Sistema_nuevo;
import sistema_nuevo.Sistema_nuevo;
import sistema_nuevo.cliente;
import sistema_nuevo.cliente;
import sistema_nuevo.clientes;
import sistema_nuevo.clientes;
import sistema_nuevo.conexion;
import sistema_nuevo.conexion;
import sistema_nuevo.cuerpofactura;
import sistema_nuevo.cuerpofactura;
import sistema_nuevo.facturacion;
import sistema_nuevo.facturacion;
import sistema_nuevo.reservaciones;
import sistema_nuevo.reservaciones;

public class Factura extends javax.swing.JFrame {

    public Factura() {
        this.getContentPane().setBackground(new Color(0, 153, 153));
        initComponents();
        mostrardatos("");
        limpiar();
    }

    public class funcionfecha {

        public java.util.Date StringADate(String fecha) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date fechas = null;
            try {
                fechas = sdf.parse(fecha);
                return fechas;
            } catch (ParseException ex) {
                return null;
            }
        }
    }

    void limpiar() {
        folio.setText("");
        codigo.setText("");
        fecha.setDate(null);
        id_cli.setText("");
        subtotal.setText(null);
        iva.setText(null);
        total.setText(null);
    }

    void mostrardatos(String valor) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        folio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        id_cli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rfc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        subtotal = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        iva = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        mas = new javax.swing.JButton();
        menos = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setText("Facturacion");

        jLabel2.setText("No de folio :");

        jLabel3.setText("Fecha :");

        folio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folioActionPerformed(evt);
            }
        });
        folio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                folioKeyTyped(evt);
            }
        });

        jLabel4.setText(" ID Cliente:");

        id_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_cliActionPerformed(evt);
            }
        });
        id_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_cliKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_cliKeyTyped(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID RESERVACION", "TIPO HABITACION", "DESCRIPCION", "COSTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jLabel5.setText("Subtotal $");

        jLabel6.setText("IVA     $");

        jLabel7.setText("Total   $");

        jLabel9.setText("Direccion:");

        direccion.setEditable(false);

        jLabel14.setText("RFC ");

        rfc.setEditable(false);

        jLabel8.setText("Nombre:");

        nombre.setEditable(false);

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        consultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultarKeyPressed(evt);
            }
        });

        subtotal.setEditable(false);
        subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalActionPerformed(evt);
            }
        });

        total.setEditable(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        iva.setEditable(false);

        jButton5.setText("...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setText("Codigo: ");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });

        mas.setText("+");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(folio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(id_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(mas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                            .addComponent(nombre))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(menos)))
                            .addContainerGap(262, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(guardar)
                                .addGap(49, 49, 49)
                                .addComponent(consultar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(368, 368, 368)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(salir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(iva)
                                    .addComponent(total)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel1)))
                        .addContainerGap(287, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3))
                            .addComponent(folio, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(id_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mas)
                    .addComponent(menos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(consultar))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(salir)
                            .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7))
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cliente form = new cliente();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        if (folio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escriba el numero de Folio", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");

            facturacion alg = new facturacion();
            clientes che = new clientes();
            alg.setFolio(Integer.parseInt(folio.getText()));
            alg.setCn(cn);

            if (alg.consultar()) {

                String fechas = null;
                try {
                    fechas = sdf2.format(sdf.parse(alg.getFecha()));
                    fecha.setDate(sdf2.parse(fechas));
                } catch (ParseException ex) {
                    Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
                }

                folio.setText(alg.getFolio() + "");

                subtotal.setText(alg.getSubtotal() + "");
                iva.setText(alg.getIva() + "");
                total.setText(alg.getTotal() + "");
                id_cli.setText(alg.getId_cli() + "");

                che.setId_cliente(alg.getId_cli());
                che.setCn(cn);
                che.consultar();

                nombre.setText(che.getNombre());
                direccion.setText(che.getDireccion());
                rfc.setText(che.getRfc());

                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                ResultSet rs;

                cuerpofactura cp = new cuerpofactura();
                cp.setFolio(alg.getFolio());
                cp.setCn(cn);

                rs = cp.consultarvarios();
                try {
                    int c = 0;
                    while (rs.next()) {
                        modelo.setRowCount(c + 1);
                        modelo.setValueAt(rs.getInt(3) + "", c, 0);
                        modelo.setValueAt(rs.getDouble(2) + "", c, 3);

                        reservaciones res = new reservaciones();
                        res.setIdReservacion(rs.getInt(3));
                        res.setCn(cn);
                        res.consultar();
                        Sistema_nuevo sn = new Sistema_nuevo();
                        sn.setId_habitaciones(res.getId_habi());
                        sn.setCn(cn);
                        sn.consultar();
                        modelo.setValueAt(sn.getTipo_habitacion(), c, 1);
                        modelo.setValueAt(sn.getDescripcion(), c, 2);
                        c++;
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Registro no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_consultarActionPerformed


    private void folioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folioActionPerformed
        folio.transferFocus();
    }//GEN-LAST:event_folioActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        codigo.transferFocus();
    }//GEN-LAST:event_codigoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        reservaciones lg = new reservaciones();
        lg.setIdReservacion(Integer.parseInt(codigo.getText()));
        lg.setCn(cn);
        if (lg.consultar()) {
            String[] datos = new String[4];
            Sistema_nuevo al = new Sistema_nuevo();
            al.setId_habitaciones(lg.getId_habi());
            al.setCn(cn);
            al.consultar();
            datos[0] = lg.getIdReservacion() + "";
            datos[1] = al.getTipo_habitacion();
            datos[2] = al.getDescripcion();
            datos[3] = lg.getCosto();
            modelo.addRow(datos);
            subtotal();
        } else {
            JOptionPane.showMessageDialog(null, "Registro no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_masActionPerformed

    private void subtotal() {
        DefaultTableModel modelo2 = (DefaultTableModel) tabla.getModel();
        reservaciones ar = new reservaciones();
        ar.setIdReservacion(Integer.parseInt(codigo.getText()));
        ar.setCn(cn);
        ar.consultar();

        Double acu = 0.0;
        for (int i = 0; i < modelo2.getRowCount(); i++) {
            acu = acu + Double.parseDouble(modelo2.getValueAt(i, 3).toString());

        }
        subtotal.setText(acu + "");
        iva.setText((acu * 0.16) + "");
        total.setText(acu + (acu * 0.16) + "");

    }

    private void id_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_cliActionPerformed

    }//GEN-LAST:event_id_cliActionPerformed

    private void id_cliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_cliKeyPressed

        if (evt.getKeyCode() == 10) {
            clientes alg = new clientes();
            alg.setId_cliente(Integer.parseInt(id_cli.getText()));
            alg.setCn(cn);
            if (alg.consultar()) {
                id_cli.setText(alg.getId_cliente() + "");
                nombre.setText(alg.getNombre());
                rfc.setText(alg.getRfc());
                direccion.setText(alg.getDireccion());
            } else {
                JOptionPane.showMessageDialog(null, "Registro no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_id_cliKeyPressed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        if (folio.getText().isEmpty() || fecha.getDate() == null || id_cli.getText().isEmpty() || codigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            fecha.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechas = sdf.format(fecha.getDate());
            facturacion che;

            che = new facturacion(Integer.parseInt(folio.getText()), fechas, Double.parseDouble(subtotal.getText()), Double.parseDouble(iva.getText()), Double.parseDouble(total.getText()), Integer.parseInt(id_cli.getText()), cn);
            if (che.consultar()) {
                JOptionPane.showMessageDialog(null, "Ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int n;
                n = che.registrar();
                int l;
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                int idReser;
                double costo;
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    idReser = Integer.parseInt(modelo.getValueAt(i, 0).toString());

                    costo = Double.parseDouble(modelo.getValueAt(i, 3).toString());

                    cuerpofactura andy = new cuerpofactura(0, costo, idReser, Integer.parseInt(folio.getText()), cn);

                    andy.setCn(cn);
                    andy.registrar();

                    if (n > 0) {
                        JOptionPane.showMessageDialog(null, " Registro guardado con exito ");
                        mostrardatos("");
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, " Registro no guardado ");
                    }
                }
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int fila = tabla.getSelectedRow();
        String eliminar = "";

        modelo.removeRow(fila);

    }//GEN-LAST:event_menosActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed

    }//GEN-LAST:event_totalActionPerformed

    private void subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalActionPerformed
        reservaciones ar = new reservaciones();
        ar.setIdReservacion(Integer.parseInt(codigo.getText()));
        ar.setCn(cn);
        ar.consultar();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.getValueAt(1, 4);
        subtotal.setText(ar.getCosto() + "");

    }//GEN-LAST:event_subtotalActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        limpiar();
    }//GEN-LAST:event_tablaMouseClicked

    private void consultarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultarKeyPressed
        if (evt.getKeyCode() == 10) {
            fecha.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechas = sdf.format(fecha.getDate());

            facturacion alg = new facturacion();
            clientes che = new clientes();
            alg.setFolio(Integer.parseInt(folio.getText()));

            alg.setCn(cn);
            che.setCn(cn);
            alg.consultar();
            che.consultar();
            folio.setText(alg.getFolio() + "");

            subtotal.setText(alg.getSubtotal() + "");
            iva.setText(alg.getIva() + "");
            total.setText(alg.getTotal() + "");

        } else {

        }
    }//GEN-LAST:event_consultarKeyPressed

    private void folioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_folioKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
        }
    }//GEN-LAST:event_folioKeyTyped

    private void id_cliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_cliKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8 && a != 10) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
        }
    }//GEN-LAST:event_id_cliKeyTyped

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
        }
    }//GEN-LAST:event_codigoKeyTyped

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JButton consultar;
    private javax.swing.JTextField direccion;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JTextField folio;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField id_cli;
    private javax.swing.JTextField iva;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField rfc;
    private javax.swing.JButton salir;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
conexion cc = new conexion();
    Connection cn = cc.conexion();
}
