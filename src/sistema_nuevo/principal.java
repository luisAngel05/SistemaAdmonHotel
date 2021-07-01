package sistema_nuevo;

//import views.Factura;
import Procesos.Propiedades;
import funciones.funciones;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.security.util.Length;
//import javax.swing.event*;
public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
        this.getContentPane().setBackground(new Color(21, 138, 162));
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Menu = new javax.swing.JTabbedPane();
        panelClientes = new javax.swing.JPanel();
        mostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idcliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rfc = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        registrarCliente = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panelReservaciones = new javax.swing.JPanel();
        idReservacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        fecha_re = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        fecha_en = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        fecha_sa = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        observaciones = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        id_habi = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        id_cli = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mostrarReservaciones = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaR = new javax.swing.JTable();
        registrarReservacion = new javax.swing.JButton();
        consultarReservacion = new javax.swing.JButton();
        modificarReservacion = new javax.swing.JButton();
        eliminarReservacion = new javax.swing.JButton();
        cerrarVentana = new javax.swing.JButton();
        estadoCB = new javax.swing.JComboBox<>();
        panelHabitaciones = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        idhabitaciones = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        estado1 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        mostrarHabitaciones = new javax.swing.JButton();
        registrarHabitacion = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaH = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        consultarHabitacion = new javax.swing.JButton();
        cerrarVtnHabitaciones = new javax.swing.JButton();
        modificarHabitacion = new javax.swing.JButton();
        eliminarHabitacion = new javax.swing.JButton();
        piso = new javax.swing.JComboBox();
        tipohabitacion = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        caracteristicas = new javax.swing.JTextField();
        descripcionH = new javax.swing.JTextField();
        panelFacturacion = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        folio = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        direccionFacturacion = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        rfcFacturacion = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        id_cliF = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        nombreFacturacion = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        mas = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaF = new javax.swing.JTable();
        subtotal = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        iva = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        salirVtnFacturacion = new javax.swing.JButton();
        guardarFacturacion = new javax.swing.JButton();
        consultarFacturacion = new javax.swing.JButton();
        panelConfiguracion = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        usuarioBD = new javax.swing.JTextField();
        passBD = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        gestorBD = new javax.swing.JTextField();
        nombreBD = new javax.swing.JTextField();
        puertoBD = new javax.swing.JTextField();
        hostBD = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        btnGuardarDtsBD = new javax.swing.JButton();
        cerrarVtnSeguridad = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Hotel");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        Menu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Menu.setPreferredSize(new java.awt.Dimension(6005, 4028));
        Menu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MenuStateChanged(evt);
            }
        });

        panelClientes.setBackground(new java.awt.Color(21, 138, 162));
        panelClientes.setMaximumSize(new java.awt.Dimension(6000, 4000));
        panelClientes.setPreferredSize(new java.awt.Dimension(6000, 4000));
        panelClientes.setRequestFocusEnabled(false);
        panelClientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelClientesMouseMoved(evt);
            }
        });
        panelClientes.setLayout(null);

        mostrar.setBackground(new java.awt.Color(148, 158, 158));
        mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrar.png"))); // NOI18N
        mostrar.setText("Buscar");
        mostrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mostrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mostrar.setIconTextGap(5);
        mostrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mostrarMouseMoved(evt);
            }
        });
        mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrarMouseExited(evt);
            }
        });
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        panelClientes.add(mostrar);
        mostrar.setBounds(16, 200, 120, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Id Cliente:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelClientes.add(jLabel2);
        jLabel2.setBounds(161, 10, 100, 27);

        idcliente.setPreferredSize(new java.awt.Dimension(6, 31));
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
        panelClientes.add(idcliente);
        idcliente.setBounds(268, 11, 88, 27);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("RFC:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelClientes.add(jLabel3);
        jLabel3.setBounds(463, 10, 70, 27);

        rfc.setPreferredSize(new java.awt.Dimension(6, 31));
        rfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfcActionPerformed(evt);
            }
        });
        rfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rfcKeyTyped(evt);
            }
        });
        panelClientes.add(rfc);
        rfc.setBounds(540, 11, 140, 27);

        nombre.setMinimumSize(new java.awt.Dimension(6, 31));
        nombre.setPreferredSize(new java.awt.Dimension(6, 31));
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
        panelClientes.add(nombre);
        nombre.setBounds(268, 58, 182, 27);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre: ");
        panelClientes.add(jLabel4);
        jLabel4.setBounds(164, 58, 100, 27);

        direccion.setPreferredSize(new java.awt.Dimension(6, 31));
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
        panelClientes.add(direccion);
        direccion.setBounds(268, 107, 232, 27);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Dirección:");
        panelClientes.add(jLabel5);
        jLabel5.setBounds(161, 108, 100, 27);

        telefono.setPreferredSize(new java.awt.Dimension(6, 31));
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
        panelClientes.add(telefono);
        telefono.setBounds(541, 58, 140, 27);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefono:");
        panelClientes.add(jLabel6);
        jLabel6.setBounds(466, 60, 70, 27);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Correo Electrónico:");
        panelClientes.add(jLabel7);
        jLabel7.setBounds(123, 150, 140, 27);

        email.setPreferredSize(new java.awt.Dimension(6, 31));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        panelClientes.add(email);
        email.setBounds(268, 152, 230, 27);

        registrarCliente.setBackground(new java.awt.Color(148, 158, 158));
        registrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        registrarCliente.setText("Registrar");
        registrarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        registrarCliente.setIconTextGap(5);
        registrarCliente.setMaximumSize(new java.awt.Dimension(110, 40));
        registrarCliente.setMinimumSize(new java.awt.Dimension(110, 40));
        registrarCliente.setPreferredSize(new java.awt.Dimension(110, 40));
        registrarCliente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                registrarClienteMouseMoved(evt);
            }
        });
        registrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarClienteMouseExited(evt);
            }
        });
        registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarClienteActionPerformed(evt);
            }
        });
        panelClientes.add(registrarCliente);
        registrarCliente.setBounds(154, 200, 120, 40);

        consultar.setBackground(new java.awt.Color(148, 158, 158));
        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        consultar.setText("Consultar");
        consultar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        consultar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        consultar.setIconTextGap(0);
        consultar.setMaximumSize(new java.awt.Dimension(115, 40));
        consultar.setMinimumSize(new java.awt.Dimension(115, 40));
        consultar.setPreferredSize(new java.awt.Dimension(115, 40));
        consultar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                consultarMouseMoved(evt);
            }
        });
        consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultarMouseExited(evt);
            }
        });
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        panelClientes.add(consultar);
        consultar.setBounds(293, 200, 120, 40);

        modificar.setBackground(new java.awt.Color(148, 158, 158));
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.setPreferredSize(new java.awt.Dimension(115, 41));
        modificar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                modificarMouseMoved(evt);
            }
        });
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarMouseExited(evt);
            }
        });
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        panelClientes.add(modificar);
        modificar.setBounds(428, 200, 120, 40);

        eliminar.setBackground(new java.awt.Color(148, 158, 158));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                eliminarMouseMoved(evt);
            }
        });
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarMouseExited(evt);
            }
        });
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        panelClientes.add(eliminar);
        eliminar.setBounds(564, 200, 120, 40);

        salir.setBackground(new java.awt.Color(148, 158, 158));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.setToolTipText("");
        salir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        salir.setIconTextGap(5);
        salir.setMaximumSize(new java.awt.Dimension(110, 40));
        salir.setMinimumSize(new java.awt.Dimension(110, 40));
        salir.setPreferredSize(new java.awt.Dimension(110, 40));
        salir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                salirMouseMoved(evt);
            }
        });
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        panelClientes.add(salir);
        salir.setBounds(699, 200, 120, 40);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO_CLIENTE", "RFC", "NOMBRE", "DIRECCION", "TELEFONO", "EMAIL"
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
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
        }

        panelClientes.add(jScrollPane1);
        jScrollPane1.setBounds(10, 250, 860, 250);

        Menu.addTab("Clientes", panelClientes);

        panelReservaciones.setBackground(new java.awt.Color(21, 138, 162));
        panelReservaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelReservaciones.setLayout(null);

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
        panelReservaciones.add(idReservacion);
        idReservacion.setBounds(160, 10, 99, 27);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Id reservacion: ");
        panelReservaciones.add(jLabel8);
        jLabel8.setBounds(42, 10, 115, 27);

        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo 1 ", "Tipo 2", "Tipo 3", " " }));
        tipo.setToolTipText("");
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        panelReservaciones.add(tipo);
        tipo.setBounds(400, 10, 70, 27);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Tipo de reservacion:");
        panelReservaciones.add(jLabel9);
        jLabel9.setBounds(270, 10, 120, 27);

        fecha_re.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecha_rePropertyChange(evt);
            }
        });
        panelReservaciones.add(fecha_re);
        fecha_re.setBounds(160, 50, 131, 27);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Fecha de reservación:");
        panelReservaciones.add(jLabel10);
        jLabel10.setBounds(13, 49, 140, 27);

        fecha_en.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecha_enPropertyChange(evt);
            }
        });
        panelReservaciones.add(fecha_en);
        fecha_en.setBounds(640, 50, 131, 27);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Fecha de entrada: ");
        panelReservaciones.add(jLabel11);
        jLabel11.setBounds(520, 50, 120, 27);
        panelReservaciones.add(fecha_sa);
        fecha_sa.setBounds(400, 50, 131, 27);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Fecha de salida: ");
        panelReservaciones.add(jLabel12);
        jLabel12.setBounds(285, 50, 110, 27);

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
        panelReservaciones.add(costo);
        costo.setBounds(640, 10, 130, 27);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Costo:");
        panelReservaciones.add(jLabel13);
        jLabel13.setBounds(580, 10, 60, 27);

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
        panelReservaciones.add(observaciones);
        observaciones.setBounds(560, 90, 210, 70);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Observaciones:");
        panelReservaciones.add(jLabel14);
        jLabel14.setBounds(440, 100, 110, 27);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Estado:");
        panelReservaciones.add(jLabel15);
        jLabel15.setBounds(52, 90, 100, 27);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Id Habitacion:");
        panelReservaciones.add(jLabel16);
        jLabel16.setBounds(40, 130, 110, 27);

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
        panelReservaciones.add(id_habi);
        id_habi.setBounds(160, 131, 100, 27);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Id Cliente:");
        panelReservaciones.add(jLabel17);
        jLabel17.setBounds(324, 130, 70, 27);

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
        panelReservaciones.add(id_cli);
        id_cli.setBounds(400, 130, 80, 27);

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
        panelReservaciones.add(jButton1);
        jButton1.setBounds(270, 131, 47, 27);

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelReservaciones.add(jButton2);
        jButton2.setBounds(490, 131, 47, 27);

        mostrarReservaciones.setBackground(new java.awt.Color(148, 158, 158));
        mostrarReservaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrar.png"))); // NOI18N
        mostrarReservaciones.setText("Buscar");
        mostrarReservaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mostrarReservaciones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mostrarReservaciones.setIconTextGap(0);
        mostrarReservaciones.setMaximumSize(new java.awt.Dimension(110, 41));
        mostrarReservaciones.setMinimumSize(new java.awt.Dimension(110, 41));
        mostrarReservaciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mostrarReservacionesMouseMoved(evt);
            }
        });
        mostrarReservaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrarReservacionesMouseExited(evt);
            }
        });
        mostrarReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarReservacionesActionPerformed(evt);
            }
        });
        panelReservaciones.add(mostrarReservaciones);
        mostrarReservaciones.setBounds(20, 200, 120, 40);

        tablaR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO_RESERVA", "RESERVACION", "ENTRADA", "SALIDA", "COSTO", "OBSERVACIONES", "ESTADO", "ID_HABITACION", "ID_CLIENTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaR);
        if (tablaR.getColumnModel().getColumnCount() > 0) {
            tablaR.getColumnModel().getColumn(0).setResizable(false);
            tablaR.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaR.getColumnModel().getColumn(1).setResizable(false);
            tablaR.getColumnModel().getColumn(2).setResizable(false);
            tablaR.getColumnModel().getColumn(3).setResizable(false);
            tablaR.getColumnModel().getColumn(4).setResizable(false);
            tablaR.getColumnModel().getColumn(5).setResizable(false);
            tablaR.getColumnModel().getColumn(6).setResizable(false);
            tablaR.getColumnModel().getColumn(7).setResizable(false);
            tablaR.getColumnModel().getColumn(8).setResizable(false);
            tablaR.getColumnModel().getColumn(9).setResizable(false);
        }

        panelReservaciones.add(jScrollPane3);
        jScrollPane3.setBounds(10, 250, 863, 450);

        registrarReservacion.setBackground(new java.awt.Color(148, 158, 158));
        registrarReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        registrarReservacion.setText("Registrar");
        registrarReservacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrarReservacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        registrarReservacion.setIconTextGap(0);
        registrarReservacion.setMaximumSize(new java.awt.Dimension(110, 41));
        registrarReservacion.setMinimumSize(new java.awt.Dimension(110, 41));
        registrarReservacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                registrarReservacionMouseMoved(evt);
            }
        });
        registrarReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarReservacionMouseExited(evt);
            }
        });
        registrarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarReservacionActionPerformed(evt);
            }
        });
        panelReservaciones.add(registrarReservacion);
        registrarReservacion.setBounds(155, 200, 120, 40);

        consultarReservacion.setBackground(new java.awt.Color(148, 158, 158));
        consultarReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        consultarReservacion.setText("Consultar");
        consultarReservacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        consultarReservacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        consultarReservacion.setIconTextGap(0);
        consultarReservacion.setMaximumSize(new java.awt.Dimension(110, 41));
        consultarReservacion.setMinimumSize(new java.awt.Dimension(110, 41));
        consultarReservacion.setPreferredSize(new java.awt.Dimension(110, 41));
        consultarReservacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                consultarReservacionMouseMoved(evt);
            }
        });
        consultarReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultarReservacionMouseExited(evt);
            }
        });
        consultarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarReservacionActionPerformed(evt);
            }
        });
        panelReservaciones.add(consultarReservacion);
        consultarReservacion.setBounds(292, 200, 120, 40);

        modificarReservacion.setBackground(new java.awt.Color(148, 158, 158));
        modificarReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        modificarReservacion.setText("Modificar");
        modificarReservacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        modificarReservacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        modificarReservacion.setMaximumSize(new java.awt.Dimension(110, 41));
        modificarReservacion.setMinimumSize(new java.awt.Dimension(110, 41));
        modificarReservacion.setPreferredSize(new java.awt.Dimension(110, 41));
        modificarReservacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                modificarReservacionMouseMoved(evt);
            }
        });
        modificarReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarReservacionMouseExited(evt);
            }
        });
        modificarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarReservacionActionPerformed(evt);
            }
        });
        panelReservaciones.add(modificarReservacion);
        modificarReservacion.setBounds(428, 200, 120, 40);

        eliminarReservacion.setBackground(new java.awt.Color(148, 158, 158));
        eliminarReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        eliminarReservacion.setText("Eliminar");
        eliminarReservacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        eliminarReservacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        eliminarReservacion.setIconTextGap(0);
        eliminarReservacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                eliminarReservacionMouseMoved(evt);
            }
        });
        eliminarReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarReservacionMouseExited(evt);
            }
        });
        eliminarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarReservacionActionPerformed(evt);
            }
        });
        panelReservaciones.add(eliminarReservacion);
        eliminarReservacion.setBounds(564, 200, 120, 40);

        cerrarVentana.setBackground(new java.awt.Color(148, 158, 158));
        cerrarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        cerrarVentana.setText("Salir");
        cerrarVentana.setToolTipText("");
        cerrarVentana.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cerrarVentana.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cerrarVentana.setIconTextGap(0);
        cerrarVentana.setMaximumSize(new java.awt.Dimension(110, 40));
        cerrarVentana.setMinimumSize(new java.awt.Dimension(110, 40));
        cerrarVentana.setPreferredSize(new java.awt.Dimension(110, 40));
        cerrarVentana.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cerrarVentanaMouseMoved(evt);
            }
        });
        cerrarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarVentanaMouseExited(evt);
            }
        });
        cerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarVentanaActionPerformed(evt);
            }
        });
        panelReservaciones.add(cerrarVentana);
        cerrarVentana.setBounds(699, 200, 120, 40);

        estadoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "aguascalientes", "Baja California", "Baja California sur", "Campeche", "Coahuila", "Colima", "Chiapas", "Chihuahua ", "Distrito Federal", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Mexico", "Michoacan", "Morelos", "Nayarit", "Nuevo Leon", "Oaxaca", "Puebla", "Queretaro", "Quintana Roo", "San Luis Potosi", "Sonora ", "Sinaloa", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatan", "Zacatecas" }));
        panelReservaciones.add(estadoCB);
        estadoCB.setBounds(160, 90, 115, 27);

        Menu.addTab("Reservaciones", panelReservaciones);

        panelHabitaciones.setBackground(new java.awt.Color(21, 138, 162));
        panelHabitaciones.setMaximumSize(new java.awt.Dimension(40, 40));
        panelHabitaciones.setPreferredSize(new java.awt.Dimension(40, 40));
        panelHabitaciones.setLayout(null);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Id Habitación:");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelHabitaciones.add(jLabel18);
        jLabel18.setBounds(70, 10, 100, 27);

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
        panelHabitaciones.add(idhabitaciones);
        idhabitaciones.setBounds(175, 10, 160, 27);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Precio:");
        panelHabitaciones.add(jLabel19);
        jLabel19.setBounds(356, 10, 60, 27);

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
        panelHabitaciones.add(precio);
        precio.setBounds(420, 10, 64, 27);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Numero de Habitación:");
        panelHabitaciones.add(jLabel20);
        jLabel20.setBounds(40, 55, 130, 27);

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
        panelHabitaciones.add(numero);
        numero.setBounds(175, 57, 160, 27);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Estado:");
        panelHabitaciones.add(jLabel21);
        jLabel21.setBounds(546, 58, 60, 27);

        estado1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Ocupado", "Mantenimiento", " " }));
        estado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado1ActionPerformed(evt);
            }
        });
        panelHabitaciones.add(estado1);
        estado1.setBounds(610, 57, 100, 27);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Piso:");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelHabitaciones.add(jLabel22);
        jLabel22.setBounds(366, 58, 50, 27);

        mostrarHabitaciones.setBackground(new java.awt.Color(148, 158, 158));
        mostrarHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrar.png"))); // NOI18N
        mostrarHabitaciones.setText("Buscar");
        mostrarHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mostrarHabitaciones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mostrarHabitaciones.setIconTextGap(0);
        mostrarHabitaciones.setMaximumSize(new java.awt.Dimension(110, 41));
        mostrarHabitaciones.setMinimumSize(new java.awt.Dimension(110, 41));
        mostrarHabitaciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mostrarHabitacionesMouseMoved(evt);
            }
        });
        mostrarHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrarHabitacionesMouseExited(evt);
            }
        });
        mostrarHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarHabitacionesActionPerformed(evt);
            }
        });
        panelHabitaciones.add(mostrarHabitaciones);
        mostrarHabitaciones.setBounds(16, 200, 120, 40);
        mostrarHabitaciones.getAccessibleContext().setAccessibleName("");

        registrarHabitacion.setBackground(new java.awt.Color(148, 158, 158));
        registrarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        registrarHabitacion.setText("Registrar");
        registrarHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrarHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        registrarHabitacion.setIconTextGap(0);
        registrarHabitacion.setMaximumSize(new java.awt.Dimension(110, 41));
        registrarHabitacion.setMinimumSize(new java.awt.Dimension(110, 41));
        registrarHabitacion.setPreferredSize(new java.awt.Dimension(110, 41));
        registrarHabitacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                registrarHabitacionMouseMoved(evt);
            }
        });
        registrarHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarHabitacionMouseExited(evt);
            }
        });
        registrarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarHabitacionActionPerformed(evt);
            }
        });
        panelHabitaciones.add(registrarHabitacion);
        registrarHabitacion.setBounds(154, 200, 120, 40);
        registrarHabitacion.getAccessibleContext().setAccessibleName("");

        tablaH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NO HABITACION", "PISO", "DESCRIPCION", "CARACTERISTICAS", "PRECIO", "ESTADO", "TIPO_HABITACION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaHMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaH);
        if (tablaH.getColumnModel().getColumnCount() > 0) {
            tablaH.getColumnModel().getColumn(0).setResizable(false);
            tablaH.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaH.getColumnModel().getColumn(1).setResizable(false);
            tablaH.getColumnModel().getColumn(2).setResizable(false);
            tablaH.getColumnModel().getColumn(3).setResizable(false);
            tablaH.getColumnModel().getColumn(4).setResizable(false);
            tablaH.getColumnModel().getColumn(5).setResizable(false);
            tablaH.getColumnModel().getColumn(6).setResizable(false);
            tablaH.getColumnModel().getColumn(7).setResizable(false);
        }

        panelHabitaciones.add(jScrollPane4);
        jScrollPane4.setBounds(10, 250, 855, 360);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Caracteristicas:");
        panelHabitaciones.add(jLabel25);
        jLabel25.setBounds(67, 110, 100, 27);

        consultarHabitacion.setBackground(new java.awt.Color(148, 158, 158));
        consultarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        consultarHabitacion.setText("Consultar");
        consultarHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        consultarHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        consultarHabitacion.setIconTextGap(0);
        consultarHabitacion.setMaximumSize(new java.awt.Dimension(110, 41));
        consultarHabitacion.setMinimumSize(new java.awt.Dimension(110, 41));
        consultarHabitacion.setPreferredSize(new java.awt.Dimension(110, 41));
        consultarHabitacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                consultarHabitacionMouseMoved(evt);
            }
        });
        consultarHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultarHabitacionMouseExited(evt);
            }
        });
        consultarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarHabitacionActionPerformed(evt);
            }
        });
        panelHabitaciones.add(consultarHabitacion);
        consultarHabitacion.setBounds(292, 200, 120, 40);
        consultarHabitacion.getAccessibleContext().setAccessibleName("");

        cerrarVtnHabitaciones.setBackground(new java.awt.Color(148, 158, 158));
        cerrarVtnHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        cerrarVtnHabitaciones.setText("Salir");
        cerrarVtnHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cerrarVtnHabitaciones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cerrarVtnHabitaciones.setIconTextGap(0);
        cerrarVtnHabitaciones.setMaximumSize(new java.awt.Dimension(110, 41));
        cerrarVtnHabitaciones.setMinimumSize(new java.awt.Dimension(110, 41));
        cerrarVtnHabitaciones.setPreferredSize(new java.awt.Dimension(110, 41));
        cerrarVtnHabitaciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cerrarVtnHabitacionesMouseMoved(evt);
            }
        });
        cerrarVtnHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarVtnHabitacionesMouseExited(evt);
            }
        });
        cerrarVtnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarVtnHabitacionesActionPerformed(evt);
            }
        });
        panelHabitaciones.add(cerrarVtnHabitaciones);
        cerrarVtnHabitaciones.setBounds(699, 200, 120, 40);
        cerrarVtnHabitaciones.getAccessibleContext().setAccessibleName("");

        modificarHabitacion.setBackground(new java.awt.Color(148, 158, 158));
        modificarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        modificarHabitacion.setText("Modificar");
        modificarHabitacion.setAlignmentX(3.0F);
        modificarHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        modificarHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        modificarHabitacion.setIconTextGap(0);
        modificarHabitacion.setMaximumSize(new java.awt.Dimension(110, 41));
        modificarHabitacion.setMinimumSize(new java.awt.Dimension(110, 41));
        modificarHabitacion.setPreferredSize(new java.awt.Dimension(110, 41));
        modificarHabitacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                modificarHabitacionMouseMoved(evt);
            }
        });
        modificarHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarHabitacionMouseExited(evt);
            }
        });
        modificarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarHabitacionActionPerformed(evt);
            }
        });
        panelHabitaciones.add(modificarHabitacion);
        modificarHabitacion.setBounds(428, 200, 120, 40);
        modificarHabitacion.getAccessibleContext().setAccessibleName("");

        eliminarHabitacion.setBackground(new java.awt.Color(148, 158, 158));
        eliminarHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        eliminarHabitacion.setText("Eliminar");
        eliminarHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        eliminarHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        eliminarHabitacion.setIconTextGap(0);
        eliminarHabitacion.setMaximumSize(new java.awt.Dimension(110, 41));
        eliminarHabitacion.setMinimumSize(new java.awt.Dimension(110, 41));
        eliminarHabitacion.setPreferredSize(new java.awt.Dimension(110, 41));
        eliminarHabitacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                eliminarHabitacionMouseMoved(evt);
            }
        });
        eliminarHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarHabitacionMouseExited(evt);
            }
        });
        eliminarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarHabitacionActionPerformed(evt);
            }
        });
        panelHabitaciones.add(eliminarHabitacion);
        eliminarHabitacion.setBounds(564, 200, 120, 40);
        eliminarHabitacion.getAccessibleContext().setAccessibleName("");

        piso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        piso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pisoActionPerformed(evt);
            }
        });
        panelHabitaciones.add(piso);
        piso.setBounds(420, 57, 40, 27);

        tipohabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Individual", "Matrimonial", "Familiar", "Residencial" }));
        tipohabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipohabitacionActionPerformed(evt);
            }
        });
        panelHabitaciones.add(tipohabitacion);
        tipohabitacion.setBounds(610, 10, 100, 27);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Tipo de Habitación:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelHabitaciones.add(jLabel1);
        jLabel1.setBounds(486, 10, 120, 27);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Descripción: ");
        panelHabitaciones.add(jLabel23);
        jLabel23.setBounds(450, 110, 90, 27);

        caracteristicas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                caracteristicasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        panelHabitaciones.add(caracteristicas);
        caracteristicas.setBounds(174, 100, 160, 50);

        descripcionH.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                descripcionHAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        panelHabitaciones.add(descripcionH);
        descripcionH.setBounds(549, 100, 160, 50);

        Menu.addTab("Habitaciones", panelHabitaciones);

        panelFacturacion.setBackground(new java.awt.Color(21, 138, 162));
        panelFacturacion.setLayout(null);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("No de folio:");
        jLabel24.setAlignmentY(25.0F);
        panelFacturacion.add(jLabel24);
        jLabel24.setBounds(86, 10, 100, 27);

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
        panelFacturacion.add(folio);
        folio.setBounds(190, 10, 100, 27);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Fecha:");
        panelFacturacion.add(jLabel26);
        jLabel26.setBounds(343, 10, 100, 27);
        panelFacturacion.add(fecha);
        fecha.setBounds(450, 10, 120, 27);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Razon Social");
        panelFacturacion.add(jLabel28);
        jLabel28.setBounds(100, 90, 80, 27);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Dirección:");
        jLabel29.setAlignmentY(25.0F);
        panelFacturacion.add(jLabel29);
        jLabel29.setBounds(90, 130, 90, 27);

        direccionFacturacion.setEditable(false);
        panelFacturacion.add(direccionFacturacion);
        direccionFacturacion.setBounds(190, 130, 150, 27);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("RFC: ");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelFacturacion.add(jLabel30);
        jLabel30.setBounds(378, 90, 70, 20);

        rfcFacturacion.setEditable(false);
        panelFacturacion.add(rfcFacturacion);
        rfcFacturacion.setBounds(450, 90, 120, 27);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText(" ID Cliente:");
        jLabel27.setAlignmentY(25.0F);
        panelFacturacion.add(jLabel27);
        jLabel27.setBounds(86, 50, 100, 27);

        id_cliF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                id_cliFMouseExited(evt);
            }
        });
        id_cliF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_cliFActionPerformed(evt);
            }
        });
        id_cliF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_cliFKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_cliFKeyTyped(evt);
            }
        });
        panelFacturacion.add(id_cliF);
        id_cliF.setBounds(190, 50, 100, 27);

        jButton5.setText("...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panelFacturacion.add(jButton5);
        jButton5.setBounds(300, 50, 47, 23);

        nombreFacturacion.setEditable(false);
        panelFacturacion.add(nombreFacturacion);
        nombreFacturacion.setBounds(190, 90, 150, 27);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Código: ");
        jLabel31.setAlignmentY(25.0F);
        panelFacturacion.add(jLabel31);
        jLabel31.setBounds(330, 50, 115, 27);

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
        panelFacturacion.add(codigo);
        codigo.setBounds(450, 50, 120, 27);

        mas.setText("+");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });
        panelFacturacion.add(mas);
        mas.setBounds(530, 140, 43, 23);

        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });
        panelFacturacion.add(menos);
        menos.setBounds(590, 140, 39, 23);

        tablaF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID RESERVACIÓN", "TIPO HABITACIÓN", "DESCRIPCIÓN", "COSTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaF);
        if (tablaF.getColumnModel().getColumnCount() > 0) {
            tablaF.getColumnModel().getColumn(0).setResizable(false);
            tablaF.getColumnModel().getColumn(1).setResizable(false);
            tablaF.getColumnModel().getColumn(2).setResizable(false);
            tablaF.getColumnModel().getColumn(3).setResizable(false);
        }

        panelFacturacion.add(jScrollPane2);
        jScrollPane2.setBounds(70, 170, 570, 160);

        subtotal.setEditable(false);
        subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalActionPerformed(evt);
            }
        });
        panelFacturacion.add(subtotal);
        subtotal.setBounds(550, 340, 90, 25);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Subtotal $");
        panelFacturacion.add(jLabel32);
        jLabel32.setBounds(440, 340, 100, 27);

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("IVA     $");
        panelFacturacion.add(jLabel33);
        jLabel33.setBounds(450, 370, 90, 27);

        iva.setEditable(false);
        panelFacturacion.add(iva);
        iva.setBounds(550, 376, 90, 25);

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Total   $");
        panelFacturacion.add(jLabel34);
        jLabel34.setBounds(470, 410, 70, 27);

        total.setEditable(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        panelFacturacion.add(total);
        total.setBounds(550, 412, 90, 25);

        salirVtnFacturacion.setBackground(new java.awt.Color(148, 158, 158));
        salirVtnFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salirVtnFacturacion.setText("Salir");
        salirVtnFacturacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                salirVtnFacturacionMouseMoved(evt);
            }
        });
        salirVtnFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirVtnFacturacionMouseExited(evt);
            }
        });
        salirVtnFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirVtnFacturacionActionPerformed(evt);
            }
        });
        panelFacturacion.add(salirVtnFacturacion);
        salirVtnFacturacion.setBounds(650, 270, 124, 40);

        guardarFacturacion.setBackground(new java.awt.Color(148, 158, 158));
        guardarFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        guardarFacturacion.setText("Guardar");
        guardarFacturacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                guardarFacturacionMouseMoved(evt);
            }
        });
        guardarFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarFacturacionMouseExited(evt);
            }
        });
        guardarFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFacturacionActionPerformed(evt);
            }
        });
        panelFacturacion.add(guardarFacturacion);
        guardarFacturacion.setBounds(650, 220, 125, 40);

        consultarFacturacion.setBackground(new java.awt.Color(148, 158, 158));
        consultarFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        consultarFacturacion.setText("Consultar");
        consultarFacturacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                consultarFacturacionMouseMoved(evt);
            }
        });
        consultarFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultarFacturacionMouseExited(evt);
            }
        });
        consultarFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFacturacionActionPerformed(evt);
            }
        });
        consultarFacturacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultarFacturacionKeyPressed(evt);
            }
        });
        panelFacturacion.add(consultarFacturacion);
        consultarFacturacion.setBounds(650, 170, 125, 40);

        Menu.addTab("Facturación", panelFacturacion);

        panelConfiguracion.setBackground(new java.awt.Color(21, 138, 162));
        panelConfiguracion.setLayout(null);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Usuario:");
        panelConfiguracion.add(jLabel35);
        jLabel35.setBounds(310, 160, 115, 27);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Contraseña:");
        panelConfiguracion.add(jLabel36);
        jLabel36.setBounds(450, 160, 115, 27);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Base de Datos");
        panelConfiguracion.add(jLabel37);
        jLabel37.setBounds(540, 90, 115, 27);
        panelConfiguracion.add(usuarioBD);
        usuarioBD.setBounds(310, 190, 115, 27);
        panelConfiguracion.add(passBD);
        passBD.setBounds(450, 190, 115, 27);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Host:");
        panelConfiguracion.add(jLabel38);
        jLabel38.setBounds(220, 90, 115, 27);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Puerto:");
        panelConfiguracion.add(jLabel39);
        jLabel39.setBounds(370, 90, 115, 27);

        gestorBD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelConfiguracion.add(gestorBD);
        gestorBD.setBounds(330, 40, 200, 35);
        panelConfiguracion.add(nombreBD);
        nombreBD.setBounds(540, 120, 115, 27);
        panelConfiguracion.add(puertoBD);
        puertoBD.setBounds(380, 120, 115, 27);
        panelConfiguracion.add(hostBD);
        hostBD.setBounds(220, 120, 115, 27);

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Gestor de Base de Datos:");
        panelConfiguracion.add(jLabel40);
        jLabel40.setBounds(330, 10, 200, 27);

        btnGuardarDtsBD.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnGuardarDtsBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardaBD.png"))); // NOI18N
        btnGuardarDtsBD.setText("Guardar");
        btnGuardarDtsBD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnGuardarDtsBD.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardarDtsBD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnGuardarDtsBDMouseMoved(evt);
            }
        });
        btnGuardarDtsBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarDtsBDMouseExited(evt);
            }
        });
        btnGuardarDtsBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDtsBDActionPerformed(evt);
            }
        });
        panelConfiguracion.add(btnGuardarDtsBD);
        btnGuardarDtsBD.setBounds(300, 260, 124, 40);

        cerrarVtnSeguridad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cerrarVtnSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        cerrarVtnSeguridad.setText("Salir");
        cerrarVtnSeguridad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cerrarVtnSeguridad.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cerrarVtnSeguridad.setIconTextGap(7);
        cerrarVtnSeguridad.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cerrarVtnSeguridadMouseMoved(evt);
            }
        });
        cerrarVtnSeguridad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarVtnSeguridadMouseExited(evt);
            }
        });
        cerrarVtnSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarVtnSeguridadActionPerformed(evt);
            }
        });
        panelConfiguracion.add(cerrarVtnSeguridad);
        cerrarVtnSeguridad.setBounds(460, 260, 124, 40);

        Menu.addTab("Seguridad", panelConfiguracion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
          mostrardatos("");
    }//GEN-LAST:event_mostrarActionPerformed

    private void idclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idclienteActionPerformed
        idcliente.transferFocus();
     
    }//GEN-LAST:event_idclienteActionPerformed

    private void idclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idclienteKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_idclienteKeyTyped

    private void rfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfcActionPerformed
        rfc.transferFocus();
    }//GEN-LAST:event_rfcActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        nombre.transferFocus();
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char a = evt.getKeyChar();
        if ((a < 'a' || a > 'z') && (a < 'A' | a > 'Z') && a != ' ' && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Letras", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_nombreKeyTyped

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        direccion.transferFocus();
    }//GEN-LAST:event_direccionActionPerformed

    private void direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionKeyTyped

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        telefono.transferFocus();
    }//GEN-LAST:event_telefonoActionPerformed

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        }
         if(telefono.getText().length()== 10){
          evt.consume();
      }
    }//GEN-LAST:event_telefonoKeyTyped

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        email.transferFocus();
    }//GEN-LAST:event_emailActionPerformed

    private void registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarClienteActionPerformed
         conexion conexion = new conexion();
        Connection cn = conexion.conexion();
        if (idcliente.getText().isEmpty() || rfc.getText().isEmpty() || nombre.getText().isEmpty() || direccion.getText().isEmpty() || telefono.getText().isEmpty() || email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            clientes clie;
            clie = new clientes(funciones.getParametroInteger(idcliente.getText()), rfc.getText().toUpperCase(), nombre.getText().toUpperCase(), direccion.getText().toUpperCase(), (int) Long.parseLong(telefono.getText()), email.getText().toUpperCase(), cn);

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
    }//GEN-LAST:event_registrarClienteActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        if (idcliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escribe el ID", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            mostrardatos(idcliente.getText());
            limpiar();
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        conexion cc = new conexion();
    Connection cn = cc.conexion();
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
       conexion cc = new conexion();
    Connection cn = cc.conexion();
        if (idcliente.getText().isEmpty() || rfc.getText().isEmpty() || nombre.getText().isEmpty() || direccion.getText().isEmpty() || telefono.getText().isEmpty() || email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!idcliente.getText().equals("")) {
                int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro que quieres Eliminar?", "Confirmar", 2);
                if (confirmacion == 0) {
                    int fila = tabla.getSelectedRow();
                    String eliminar = "";
                    eliminar = tabla.getValueAt(fila, 0).toString();
                    try {
                        PreparedStatement pst = cn.prepareStatement("DELETE FROM clientes WHERE id_cliente='" + eliminar + "'");
                        pst.executeUpdate();
                        mostrardatos("");
                        limpiar();
                    } catch (SQLException e) {
                    }
                }
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        cerrarVentana();
    }//GEN-LAST:event_salirActionPerformed

    private void MenuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MenuStateChanged
       conexion conexion = new conexion();
        Connection cn = conexion.conexion();
        switch (Menu.getSelectedIndex()) {
            case 0:
                System.out.println("Pestaña clientes");
                
                break;
            case 1:
                System.out.println("Pestaña Reservaciones");
                break;
            case 2:
                System.out.println("Pestaña Habitaciones");
                break;
            case 3:
                System.out.println("Pestaña Facturacion");
                break;
                case 4:
                System.out.println("Pestaña Seguridad");
                conexion.datosConexion(gestorBD,puertoBD,hostBD,nombreBD,usuarioBD, passBD);
                    
                break;
            default:
                break;
        }
    }//GEN-LAST:event_MenuStateChanged

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

    private void observacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_observacionesKeyTyped
        char a = evt.getKeyChar();
        if ((a < 'a' || a > 'z') && (a < 'A' | a > 'Z') && a != ' ' && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Letras", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_observacionesKeyTyped

    private void observacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionesActionPerformed
        observaciones.transferFocus();
    }//GEN-LAST:event_observacionesActionPerformed

    private void costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_costoKeyTyped

    private void costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoActionPerformed
        costo.transferFocus();
    }//GEN-LAST:event_costoActionPerformed

    private void fecha_enPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecha_enPropertyChange

        fecha_sa.setMinSelectableDate(fecha_en.getDate());
    }//GEN-LAST:event_fecha_enPropertyChange

    private void fecha_rePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecha_rePropertyChange
        // TODO add your handling code here:

        fecha_en.setMinSelectableDate(fecha_re.getDate());
    }//GEN-LAST:event_fecha_rePropertyChange

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        tipo.transferFocus();
    }//GEN-LAST:event_tipoActionPerformed

    private void idReservacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idReservacionKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
        }
    }//GEN-LAST:event_idReservacionKeyTyped

    private void idReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idReservacionActionPerformed
        idReservacion.transferFocus();
    }//GEN-LAST:event_idReservacionActionPerformed

    private void id_habiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_habiActionPerformed
        id_habi.transferFocus();
    }//GEN-LAST:event_id_habiActionPerformed

    private void id_habiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_habiKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_id_habiKeyTyped

    private void id_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_cliActionPerformed
        id_cli.transferFocus();
    }//GEN-LAST:event_id_cliActionPerformed

    private void id_cliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_cliKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_id_cliKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        habitacion form = new habitacion();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cliente form = new cliente();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mostrarReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarReservacionesActionPerformed
        mostrardatosReservacion("");
        limpiarDatosReservacion();
        
    }//GEN-LAST:event_mostrarReservacionesActionPerformed

    private void tablaRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRMouseClicked
       funciones fecha= new funciones();
        int fila = tablaR.getSelectedRow();
        System.out.println("fila:"+fila);
        if (fila >= 0) {
            idReservacion.setText((String) tablaR.getValueAt(fila, 0));
            tipo.setSelectedItem(tablaR.getValueAt(fila, 1));
            fecha_re.setDate(fecha.StringADate(tablaR.getValueAt(fila, 2).toString()));
            fecha_en.setDate(fecha.StringADate(tablaR.getValueAt(fila, 3).toString()));
            fecha_sa.setDate(fecha.StringADate(tablaR.getValueAt(fila, 4).toString()));
            costo.setText((String) tablaR.getValueAt(fila, 5));
            observaciones.setText((String) tablaR.getValueAt(fila, 6));
            estadoCB.setSelectedItem( tablaR.getValueAt(fila, 7));
            id_habi.setText((String) tablaR.getValueAt(fila, 8));
            
            String arrId_cli=(String)tablaR.getValueAt(fila, 9);
           String[] partes = arrId_cli.split("-");
            id_cli.setText(partes[0]);
        } else {

            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_tablaRMouseClicked

    private void registrarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarReservacionActionPerformed
        conexion cc= new conexion();
        Connection cn= cc.conexion();
        if (idReservacion.getText().isEmpty() || fecha_re.getDate() == null || fecha_en.getDate() == null || fecha_sa.getDate() == null || costo.getText().isEmpty() || observaciones.getText().isEmpty() || id_habi.getText().isEmpty() || id_cli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            fecha_re.getDate();
            fecha_en.getDate();
            fecha_sa.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechas = sdf.format(fecha_re.getDate());
            String fecha = sdf.format(fecha_en.getDate());
            String fech = sdf.format(fecha_sa.getDate());
            reservaciones objRes;
            System.out.println("estafoInserta:"+estadoCB.getSelectedItem());
            objRes = new reservaciones(Integer.parseInt(idReservacion.getText()), tipo.getSelectedItem() + "",
                    fechas, fecha, fech, costo.getText(), observaciones.getText(), estadoCB.getSelectedItem()+"",
                    Integer.parseInt(id_habi.getText()), Integer.parseInt(id_cli.getText()), cn);
             System.out.println("estafoInserta:"+objRes.getEstado());
            try {
                int n;
                n = objRes.alta();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, " Registro guardado con exito ");
                    mostrardatosReservacion("");
                    limpiarDatosReservacion();
                } else {
                    JOptionPane.showMessageDialog(null, " Registro no guardado ");
                }

            } catch (SQLException ex) {
                Logger.getLogger(reservacion.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }//GEN-LAST:event_registrarReservacionActionPerformed

    private void consultarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarReservacionActionPerformed

        if (idReservacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escribe el ID", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            mostrardatosReservacion(idReservacion.getText());
            limpiarDatosReservacion();
        }
    }//GEN-LAST:event_consultarReservacionActionPerformed

    private void modificarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarReservacionActionPerformed
        
        if (idReservacion.getText().isEmpty() || fecha_re.getDate() == null || fecha_en.getDate() == null || fecha_sa.getDate() == null || costo.getText().isEmpty() || observaciones.getText().isEmpty() || id_habi.getText().isEmpty() || id_cli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            conexion cone= new conexion();
            Connection cn= cone.conexion();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechas = sdf.format(fecha_re.getDate());
            String fecha = sdf.format(fecha_en.getDate());
            String fech = sdf.format(fecha_sa.getDate());
            try {
                    String query="UPDATE reservaciones SET idReservaciones='" + idReservacion.getText() + "',Tipo_reserva='" + tipo.getSelectedItem() + "',Fecha_reserva='" + fechas + "',Fecha_entrada='" + fecha + "',Fecha_salida='" + fech + "',Costo='" + costo.getText() + "',Observaciones='" + observaciones.getText() + "',Estado='" + estadoCB.getSelectedItem() + "',idHabitaciones='" + id_habi.getText() + "',idcliente='" + id_cli.getText() + "' WHERE idReservaciones='" + idReservacion.getText() + "'";
                PreparedStatement pst = cn.prepareStatement(query);
                System.out.println(query);
                pst.executeUpdate();
                limpiarDatosReservacion();
                mostrardatosReservacion("");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_modificarReservacionActionPerformed

    private void eliminarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarReservacionActionPerformed
       conexion cc= new conexion();
       Connection cn=cc.conexion();
        if (idReservacion.getText().isEmpty() || fecha_re.getDate() == null || fecha_en.getDate() == null || fecha_sa.getDate() == null || costo.getText().isEmpty() || observaciones.getText().isEmpty() || id_habi.getText().isEmpty() || id_cli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!idReservacion.getText().equals("")) {
                int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro que quieres Elimar?", "Confirmar", 2);
                if (confirmacion == 0) {

                    int fila = tablaR.getSelectedRow();
                    String eliminar = "";
                    eliminar = tablaR.getValueAt(fila, 0).toString();
                    try {
                        PreparedStatement pst = cn.prepareStatement("DELETE FROM reservaciones WHERE idReservaciones='" + eliminar + "'");
                        pst.executeUpdate();
                        mostrardatosReservacion("");
                        limpiarDatosReservacion();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }//GEN-LAST:event_eliminarReservacionActionPerformed

    private void idhabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idhabitacionesActionPerformed
        idhabitaciones.transferFocus();
    }//GEN-LAST:event_idhabitacionesActionPerformed

    private void idhabitacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idhabitacionesKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9')&& a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_idhabitacionesKeyTyped

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        precio.transferFocus();
    }//GEN-LAST:event_precioActionPerformed

    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9')&& a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_precioKeyTyped

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        numero.transferFocus();
    }//GEN-LAST:event_numeroActionPerformed

    private void numeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

        }
    }//GEN-LAST:event_numeroKeyTyped

    private void estado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado1ActionPerformed
        estadoCB.transferFocus();
    }//GEN-LAST:event_estado1ActionPerformed

    private void mostrarHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarHabitacionesActionPerformed
        mostrardatosHabitaciones("");
        limpiardatosHabitaciones();
    }//GEN-LAST:event_mostrarHabitacionesActionPerformed

    private void tablaHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHMouseClicked
        int fila = tablaH.getSelectedRow();
        if (fila >= 0) {
            idhabitaciones.setText((String) tablaH.getValueAt(fila, 0));
            numero.setText((String) tablaH.getValueAt(fila, 1));
            piso.setSelectedItem(tablaH.getValueAt(fila, 2));
            descripcionH.setText((String) tablaH.getValueAt(fila, 3));
            caracteristicas.setText((String) tablaH.getValueAt(fila, 4));
            precio.setText((String) tablaH.getValueAt(fila, 5));
            estado1.setSelectedItem((String) tablaH.getValueAt(fila, 6));
            tipohabitacion.setSelectedItem((String) tablaH.getValueAt(fila, 7));
        } else {

            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_tablaHMouseClicked

    private void registrarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarHabitacionActionPerformed
       conexion cc= new conexion();
       Connection cn= cc.conexion();
        if (idhabitaciones.getText().isEmpty() || numero.getText().isEmpty() || descripcionH.getText().isEmpty() || caracteristicas.getText().isEmpty() || precio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Sistema_nuevo objH;
            objH = new Sistema_nuevo(funciones.getParametroInteger(idhabitaciones.getText()), numero.getText(), piso.getSelectedItem() + "", descripcionH.getText(), caracteristicas.getText(), precio.getText(), estado1.getSelectedItem() + "", tipohabitacion.getSelectedItem() + "", cn);

            try {
                int n;
                n = objH.alta();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, " Registro guardado con exito ");
                    mostrardatosHabitaciones("");
                    limpiardatosHabitaciones();
                } else {
                    JOptionPane.showMessageDialog(null, " Registro no guardado ");
                }
            } catch (SQLException ex) {
                Logger.getLogger(habitacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_registrarHabitacionActionPerformed

    private void cerrarVtnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVtnHabitacionesActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrarVtnHabitacionesActionPerformed

    private void consultarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarHabitacionActionPerformed
       if (idReservacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escribe el ID", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            mostrardatosReservacion(idReservacion.getText());
            limpiardatosHabitaciones();
        }
    }//GEN-LAST:event_consultarHabitacionActionPerformed

    private void modificarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarHabitacionActionPerformed
        conexion conec=new conexion();
       Connection cn=conec.conexion();
        if (idhabitaciones.getText().isEmpty() || numero.getText().isEmpty() || descripcionH.getText().isEmpty() || caracteristicas.getText().isEmpty() || precio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String lsQuery= new String("UPDATE habitaciones SET idHabitaciones='" + idhabitaciones.getText() + "',Numero_habitacion='" + numero.getText() + "',Piso='" + piso.getSelectedItem() + "',Descripcion='" + descripcionH.getText() + "',Caracteristicas='" + caracteristicas.getText() + "',Precio='" + precio.getText() + "',Estado='" + estado1.getSelectedItem() + "',Tipo_habitacion='" + tipohabitacion.getSelectedItem() + "' WHERE idHabitaciones='" + idhabitaciones.getText() + "'");
                System.out.println(lsQuery); 
                PreparedStatement pst = cn.prepareStatement(lsQuery);
                pst.executeUpdate();
                limpiardatosHabitaciones();
                mostrardatosHabitaciones("");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_modificarHabitacionActionPerformed

    private void eliminarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarHabitacionActionPerformed
       
        conexion cc= new conexion();
        Connection cn=cc.conexion();
        if (idhabitaciones.getText().isEmpty() || numero.getText().isEmpty() || descripcionH.getText().isEmpty() || caracteristicas.getText().isEmpty() || precio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!idhabitaciones.getText().equals("")) {
                int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro que quieres Elimar?", "Confirmar", 2);
                if (confirmacion == 0) {
                    int fila = tablaH.getSelectedRow();
                    String eliminar = "";
                    eliminar = tablaH.getValueAt(fila, 0).toString();
                    try {
                        String lsQuery= new String("DELETE FROM habitaciones WHERE idHabitaciones='" + eliminar + "'");
                        PreparedStatement pst = cn.prepareStatement(lsQuery);
                        pst.executeUpdate();
                        System.out.println(lsQuery);
                        mostrardatosHabitaciones("");
                        limpiardatosHabitaciones();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } 
        
    }//GEN-LAST:event_eliminarHabitacionActionPerformed

    private void pisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pisoActionPerformed
        piso.transferFocus();
    }//GEN-LAST:event_pisoActionPerformed

    private void tipohabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipohabitacionActionPerformed
        tipohabitacion.transferFocus();
    }//GEN-LAST:event_tipohabitacionActionPerformed

    private void subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalActionPerformed
        conexion cc= new conexion();
        Connection cn= cc.conexion();
        reservaciones ar = new reservaciones();
        ar.setIdReservacion(Integer.parseInt(codigo.getText()));
        ar.setCn(cn);
        ar.consultar();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.getValueAt(1, 4);
        subtotal.setText(ar.getCosto() + "");
    }//GEN-LAST:event_subtotalActionPerformed

    private void tablaFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFMouseClicked
        limpiarDatosFacturacion();
    }//GEN-LAST:event_tablaFMouseClicked

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablaF.getModel();
        int fila = tablaF.getSelectedRow();
        if (fila >=0){
        modelo.removeRow(fila);
        }else{
        JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_menosActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        if(folio.getText().isEmpty()||id_cliF.getText().isEmpty() || fecha.getDate()== null || codigo.getText().isEmpty()  ){
        JOptionPane.showMessageDialog(null,"El formulario no puede quedar vacio");
        }else{
        
        conexion cc= new conexion();
        Connection cn= cc.conexion();
        DefaultTableModel modelo = (DefaultTableModel) tablaF.getModel();

        reservaciones reservacion = new reservaciones();
        
        reservacion.setIdReservacion(funciones.getParametroInteger(codigo.getText()));
        System.out.println("codigo::"+reservacion.getIdReservacion());
        reservacion.setCn(cn);
        
        if (reservacion.consultar()) {
            String[] datos = new String[4];
            Sistema_nuevo al = new Sistema_nuevo();
            al.setId_habitaciones(reservacion.getId_habi());
           
            al.setCn(cn);
            al.consultar();
            datos[0] = reservacion.getIdReservacion() + "";
            datos[1] = al.getTipo_habitacion();
            datos[2] = al.getDescripcion();
            datos[3] = reservacion.getCosto();
            modelo.addRow(datos);
            
            subtotal();
        } else {
            JOptionPane.showMessageDialog(null, "Registro no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_masActionPerformed

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        funciones.validaSiEsNumero(evt);
        
    }//GEN-LAST:event_codigoKeyTyped

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        codigo.transferFocus();
    }//GEN-LAST:event_codigoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cliente form = new cliente();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void id_cliFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_cliFKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8 && a != 10) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
        }
    }//GEN-LAST:event_id_cliFKeyTyped

    private void id_cliFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_cliFKeyPressed
        conexion cc=new conexion();
        Connection cn= cc.conexion();
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
    }//GEN-LAST:event_id_cliFKeyPressed

    private void id_cliFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_cliFActionPerformed

    }//GEN-LAST:event_id_cliFActionPerformed

    private void folioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_folioKeyTyped
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
        }
    }//GEN-LAST:event_folioKeyTyped

    private void folioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folioActionPerformed
        folio.transferFocus();
    }//GEN-LAST:event_folioActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed

    }//GEN-LAST:event_totalActionPerformed

    private void salirVtnFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirVtnFacturacionActionPerformed
        cerrarVentana();
    }//GEN-LAST:event_salirVtnFacturacionActionPerformed

    private void guardarFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarFacturacionActionPerformed
conexion objConexion = new conexion();
Connection cn =objConexion.conexion();
        
        if (folio.getText().isEmpty() || fecha.getDate() == null || id_cliF.getText().isEmpty() || codigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            fecha.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechas = sdf.format(fecha.getDate());
            facturacion objFactu;
            System.out.println("sistema_nuevo.principal.guardarFacturacionActionPerformed()");
            objFactu = new facturacion(funciones.getParametroInteger(folio.getText()), fechas, Double.parseDouble(subtotal.getText()), 
                    Double.parseDouble(iva.getText()), Double.parseDouble(total.getText()), Integer.parseInt(id_cliF.getText()), cn);
            System.out.println("folio:"+objFactu.getFolio()+" fecha:"+objFactu.getFecha()+" id_cliF:"+objFactu.getSubtotal()+" codigo:"+codigo.getText());
            if (objFactu.consultar()) {
                JOptionPane.showMessageDialog(null, "Ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int n;
                n = objFactu.registrar();
                int l;
                DefaultTableModel modelo = (DefaultTableModel) tablaF.getModel();
                int idReser;
                double costo;
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    idReser = Integer.parseInt(modelo.getValueAt(i, 0).toString());

                    costo = Double.parseDouble(modelo.getValueAt(i, 3).toString());

                    cuerpofactura cp = new cuerpofactura(0, costo, idReser, Integer.parseInt(folio.getText()), cn);

                    cp.setCn(cn);
                    cp.registrar();

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
    }//GEN-LAST:event_guardarFacturacionActionPerformed

    private void consultarFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFacturacionActionPerformed
       conexion cc=  new conexion();
       Connection cn= cc.conexion();
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
//                    Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
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
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Registro no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_consultarFacturacionActionPerformed

    private void consultarFacturacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultarFacturacionKeyPressed
        conexion cc= new conexion();
        Connection cn=cc.conexion();
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
    }//GEN-LAST:event_consultarFacturacionKeyPressed

    private void cerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVentanaActionPerformed
      cerrarVentana();
    }//GEN-LAST:event_cerrarVentanaActionPerformed

    private void btnGuardarDtsBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDtsBDActionPerformed
     conexion m= new conexion();
      m.actualizaDatos(gestorBD.getText(),hostBD.getText(),puertoBD.getText(),nombreBD.getText(),usuarioBD.getText(),passBD.getText());
    }//GEN-LAST:event_btnGuardarDtsBDActionPerformed

    private void cerrarVtnSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVtnSeguridadActionPerformed
       cerrarVentana();
    }//GEN-LAST:event_cerrarVtnSeguridadActionPerformed

    private void mostrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarMouseExited
        funciones.regresaColor(mostrar);
    }//GEN-LAST:event_mostrarMouseExited

    private void mostrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarMouseMoved
       funciones.cambiaFondoBlanco(mostrar);
    }//GEN-LAST:event_mostrarMouseMoved

    private void registrarClienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarClienteMouseMoved
       funciones.cambiaFondoBlanco(registrarCliente);
    }//GEN-LAST:event_registrarClienteMouseMoved

    private void registrarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarClienteMouseExited
     funciones.regresaColor(registrarCliente);
    }//GEN-LAST:event_registrarClienteMouseExited

    private void consultarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarMouseMoved
         funciones.cambiaFondoBlanco(consultar);
    }//GEN-LAST:event_consultarMouseMoved

    private void consultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarMouseExited
       funciones.regresaColor(consultar);
    }//GEN-LAST:event_consultarMouseExited

    private void modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseExited
        funciones.regresaColor(modificar);
    }//GEN-LAST:event_modificarMouseExited

    private void modificarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseMoved
       funciones.cambiaFondoBlanco(modificar);
    }//GEN-LAST:event_modificarMouseMoved

    private void eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseExited
      funciones.regresaColor(eliminar);
    }//GEN-LAST:event_eliminarMouseExited

    private void eliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseMoved
       funciones.cambiaFondoBlanco(eliminar);
    }//GEN-LAST:event_eliminarMouseMoved

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        funciones.regresaColor(salir);
    }//GEN-LAST:event_salirMouseExited

    private void salirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseMoved
        funciones.cambiaFondoBlanco(salir);
    }//GEN-LAST:event_salirMouseMoved

    private void mostrarReservacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarReservacionesMouseExited
       funciones.regresaColor(mostrarReservaciones);
    }//GEN-LAST:event_mostrarReservacionesMouseExited

    private void mostrarReservacionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarReservacionesMouseMoved
        funciones.cambiaFondoBlanco(mostrarReservaciones);
    }//GEN-LAST:event_mostrarReservacionesMouseMoved

    private void registrarReservacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarReservacionMouseExited
       funciones.regresaColor(registrarReservacion);
    }//GEN-LAST:event_registrarReservacionMouseExited

    private void registrarReservacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarReservacionMouseMoved
        funciones.cambiaFondoBlanco(registrarReservacion);
    }//GEN-LAST:event_registrarReservacionMouseMoved

    private void consultarReservacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarReservacionMouseExited
        funciones.regresaColor(consultarReservacion);
    }//GEN-LAST:event_consultarReservacionMouseExited

    private void consultarReservacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarReservacionMouseMoved
        funciones.cambiaFondoBlanco(consultarReservacion);
    }//GEN-LAST:event_consultarReservacionMouseMoved

    private void modificarReservacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarReservacionMouseExited
      funciones.regresaColor(modificarReservacion);
    }//GEN-LAST:event_modificarReservacionMouseExited

    private void modificarReservacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarReservacionMouseMoved
         funciones.cambiaFondoBlanco(modificarReservacion);
    }//GEN-LAST:event_modificarReservacionMouseMoved

    private void eliminarReservacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarReservacionMouseExited
      funciones.regresaColor(eliminarReservacion);
    }//GEN-LAST:event_eliminarReservacionMouseExited

    private void eliminarReservacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarReservacionMouseMoved
          funciones.cambiaFondoBlanco(eliminarReservacion);
    }//GEN-LAST:event_eliminarReservacionMouseMoved

    private void cerrarVentanaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarVentanaMouseExited
        funciones.regresaColor(cerrarVentana);
    }//GEN-LAST:event_cerrarVentanaMouseExited

    private void cerrarVentanaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarVentanaMouseMoved
       funciones.cambiaFondoBlanco(cerrarVentana);
    }//GEN-LAST:event_cerrarVentanaMouseMoved

    private void btnGuardarDtsBDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarDtsBDMouseExited
     funciones.regresaColor(btnGuardarDtsBD);
    }//GEN-LAST:event_btnGuardarDtsBDMouseExited

    private void btnGuardarDtsBDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarDtsBDMouseMoved
        funciones.cambiaFondoBlanco(btnGuardarDtsBD);
    }//GEN-LAST:event_btnGuardarDtsBDMouseMoved

    private void cerrarVtnSeguridadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarVtnSeguridadMouseExited
       funciones.regresaColor(cerrarVtnSeguridad);
    }//GEN-LAST:event_cerrarVtnSeguridadMouseExited

    private void cerrarVtnSeguridadMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarVtnSeguridadMouseMoved
        funciones.cambiaFondoBlanco(cerrarVtnSeguridad);
    }//GEN-LAST:event_cerrarVtnSeguridadMouseMoved

    private void mostrarHabitacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarHabitacionesMouseExited
    funciones.regresaColor(mostrarHabitaciones);
    }//GEN-LAST:event_mostrarHabitacionesMouseExited

    private void mostrarHabitacionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarHabitacionesMouseMoved
      funciones.cambiaFondoBlanco(mostrarHabitaciones);
    }//GEN-LAST:event_mostrarHabitacionesMouseMoved

    private void registrarHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarHabitacionMouseExited
      funciones.regresaColor(registrarHabitacion);
    }//GEN-LAST:event_registrarHabitacionMouseExited

    private void registrarHabitacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarHabitacionMouseMoved
       funciones.cambiaFondoBlanco(registrarHabitacion);
    }//GEN-LAST:event_registrarHabitacionMouseMoved

    private void consultarHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarHabitacionMouseExited
         funciones.regresaColor(consultarHabitacion);
    }//GEN-LAST:event_consultarHabitacionMouseExited

    private void consultarHabitacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarHabitacionMouseMoved
        funciones.cambiaFondoBlanco(consultarHabitacion);
    }//GEN-LAST:event_consultarHabitacionMouseMoved

    private void modificarHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarHabitacionMouseExited
      funciones.regresaColor(modificarHabitacion);
    }//GEN-LAST:event_modificarHabitacionMouseExited

    private void modificarHabitacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarHabitacionMouseMoved
       funciones.cambiaFondoBlanco(modificarHabitacion);
    }//GEN-LAST:event_modificarHabitacionMouseMoved

    private void eliminarHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarHabitacionMouseExited
       funciones.regresaColor(eliminarHabitacion);
    }//GEN-LAST:event_eliminarHabitacionMouseExited

    private void eliminarHabitacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarHabitacionMouseMoved
         funciones.cambiaFondoBlanco(eliminarHabitacion);
    }//GEN-LAST:event_eliminarHabitacionMouseMoved

    private void cerrarVtnHabitacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarVtnHabitacionesMouseExited
       funciones.regresaColor(cerrarVtnHabitaciones);
    }//GEN-LAST:event_cerrarVtnHabitacionesMouseExited

    private void cerrarVtnHabitacionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarVtnHabitacionesMouseMoved
       funciones.cambiaFondoBlanco(cerrarVtnHabitaciones);
    }//GEN-LAST:event_cerrarVtnHabitacionesMouseMoved

    private void consultarFacturacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarFacturacionMouseExited
        funciones.regresaColor(consultarFacturacion);
    }//GEN-LAST:event_consultarFacturacionMouseExited

    private void consultarFacturacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarFacturacionMouseMoved
            funciones.cambiaFondoBlanco(consultarFacturacion);
    }//GEN-LAST:event_consultarFacturacionMouseMoved

    private void guardarFacturacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarFacturacionMouseExited
         funciones.regresaColor(guardarFacturacion);
    }//GEN-LAST:event_guardarFacturacionMouseExited

    private void guardarFacturacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarFacturacionMouseMoved
      funciones.cambiaFondoBlanco(guardarFacturacion);
    }//GEN-LAST:event_guardarFacturacionMouseMoved

    private void salirVtnFacturacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirVtnFacturacionMouseExited
          funciones.regresaColor(salirVtnFacturacion);
    }//GEN-LAST:event_salirVtnFacturacionMouseExited

    private void salirVtnFacturacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirVtnFacturacionMouseMoved
       funciones.cambiaFondoBlanco(salirVtnFacturacion);
    }//GEN-LAST:event_salirVtnFacturacionMouseMoved

    private void panelClientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelClientesMouseMoved
       
    }//GEN-LAST:event_panelClientesMouseMoved

    private void id_cliFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_cliFMouseExited
        if(funciones.getParametroInteger(id_cliF.getText())>0){
            try {
              boolean existe= sistema_nuevo.facturacion.consultaDatosCliente(id_cliF.getText(),nombreFacturacion, direccionFacturacion,rfcFacturacion);
               if(!existe){
                 JOptionPane.showMessageDialog(null, "El cliente "+id_cliF.getText()+" no existe", "Error", JOptionPane.ERROR_MESSAGE);
               }
            } catch (SQLException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_id_cliFMouseExited

    private void caracteristicasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_caracteristicasAncestorAdded
    caracteristicas.transferFocus();
    }//GEN-LAST:event_caracteristicasAncestorAdded

    private void descripcionHAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_descripcionHAncestorAdded
       descripcionH.transferFocus();
    }//GEN-LAST:event_descripcionHAncestorAdded

    private void rfcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rfcKeyTyped
      if(rfc.getText().length()== 13){
          evt.consume();
      }
    }//GEN-LAST:event_rfcKeyTyped

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Menu;
    private javax.swing.JButton btnGuardarDtsBD;
    private javax.swing.JTextField caracteristicas;
    private javax.swing.JButton cerrarVentana;
    private javax.swing.JButton cerrarVtnHabitaciones;
    private javax.swing.JButton cerrarVtnSeguridad;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton consultar;
    private javax.swing.JButton consultarFacturacion;
    private javax.swing.JButton consultarHabitacion;
    private javax.swing.JButton consultarReservacion;
    private javax.swing.JTextField costo;
    private javax.swing.JTextField descripcionH;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField direccionFacturacion;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminarHabitacion;
    private javax.swing.JButton eliminarReservacion;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox estado1;
    private javax.swing.JComboBox<String> estadoCB;
    private com.toedter.calendar.JDateChooser fecha;
    private com.toedter.calendar.JDateChooser fecha_en;
    private com.toedter.calendar.JDateChooser fecha_re;
    private com.toedter.calendar.JDateChooser fecha_sa;
    private javax.swing.JTextField folio;
    private javax.swing.JTextField gestorBD;
    private javax.swing.JButton guardarFacturacion;
    private javax.swing.JTextField hostBD;
    private javax.swing.JTextField idReservacion;
    private javax.swing.JTextField id_cli;
    private javax.swing.JTextField id_cliF;
    private javax.swing.JTextField id_habi;
    private javax.swing.JTextField idcliente;
    private javax.swing.JTextField idhabitaciones;
    private javax.swing.JTextField iva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JButton modificar;
    private javax.swing.JButton modificarHabitacion;
    private javax.swing.JButton modificarReservacion;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton mostrarHabitaciones;
    private javax.swing.JButton mostrarReservaciones;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombreBD;
    private javax.swing.JTextField nombreFacturacion;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField observaciones;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelConfiguracion;
    private javax.swing.JPanel panelFacturacion;
    private javax.swing.JPanel panelHabitaciones;
    private javax.swing.JPanel panelReservaciones;
    private javax.swing.JTextField passBD;
    private javax.swing.JComboBox piso;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField puertoBD;
    private javax.swing.JButton registrarCliente;
    private javax.swing.JButton registrarHabitacion;
    private javax.swing.JButton registrarReservacion;
    private javax.swing.JTextField rfc;
    private javax.swing.JTextField rfcFacturacion;
    private javax.swing.JButton salir;
    private javax.swing.JButton salirVtnFacturacion;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaF;
    private javax.swing.JTable tablaH;
    private javax.swing.JTable tablaR;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox tipo;
    private javax.swing.JComboBox tipohabitacion;
    private javax.swing.JTextField total;
    private javax.swing.JTextField usuarioBD;
    // End of variables declaration//GEN-END:variables

    private void mostrardatos(String valor) {
              conexion cc = new conexion();
    Connection cn = cc.conexion();
     tabla.getTableHeader().setBackground(Color.red);
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        
        modelo.setRowCount(0);
//        tabla.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM clientes";
        } else {
            sql = "SELECT * FROM clientes WHERE id_cliente='" + valor + "'";
        }
        System.out.println("BUSCAR"+sql);
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

    private void limpiar() {
   
        idcliente.setText("");
        rfc.setText("");
        nombre.setText("");
        direccion.setText("");
        telefono.setText("");
        email.setText("");

    
    }

    private void mostrardatosReservacion(String valor) {
         conexion cc = new conexion();
    Connection cn = cc.conexion();
  DefaultTableModel modelo = (DefaultTableModel) tablaR.getModel();
     
        modelo.setRowCount(0);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT `idReservaciones`,`Tipo_reserva`,`Fecha_reserva`,`Fecha_entrada`,`Fecha_salida`,`Costo`,`Observaciones`,`Estado`,`idHabitaciones`,`idcliente`,clientes.Nombre FROM `reservaciones`,`clientes`WHERE reservaciones.idcliente=clientes.id_cliente";
        } else {
            sql = "SELECT `idReservaciones`,`Tipo_reserva`,`Fecha_reserva`,`Fecha_entrada`,`Fecha_salida`,`Costo`,`Observaciones`,`Estado`,`idHabitaciones`,`idcliente`,clientes.Nombre FROM `reservaciones`,`clientes` WHERE idReservaciones='" + valor + "'AND reservaciones.idcliente=clientes.id_cliente";
        }
        System.out.println(sql);
        String[] datos = new String[11];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
//                System.out.println("datos[0]"+rs);
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10)+"-"+rs.getString(11);
//                datos[10] = rs.getString(11);
                modelo.addRow(datos);
            }
            
            tablaR.setModel(modelo);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Registro no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(reservacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mostrardatosHabitaciones(String valor) {
    conexion cc= new conexion();
        Connection cn= cc.conexion();
 DefaultTableModel modelo =  (DefaultTableModel) tablaH.getModel();
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
            tablaH.setModel(modelo);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Registro no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(habitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limpiardatosHabitaciones() {
       
        idhabitaciones.setText("");
        numero.setText("");
        piso.setSelectedItem("");
        descripcionH.setText("");
        caracteristicas.setText("");
        precio.setText("");
        estado1.setSelectedItem("");
        tipohabitacion.setSelectedItem("");
    
    }

    private void limpiarDatosReservacion() {
       idReservacion.setText("");
        tipo.setSelectedItem("");
        fecha_re.setDate(null);
        fecha_en.setDate(null);
        fecha_sa.setDate(null);
        costo.setText("");
        observaciones.setText("");
        estadoCB.setSelectedItem(0);
        id_habi.setText("");
        id_cli.setText("");
    }

    private void subtotal() {
        conexion cc= new conexion();
        Connection cn= cc.conexion();
        DefaultTableModel modelo2 = (DefaultTableModel) tablaF.getModel();
        reservaciones objRes = new reservaciones();
        objRes.setIdReservacion(Integer.parseInt(codigo.getText()));
        objRes.setCn(cn);
        objRes.consultar();

        Double acu = 0.0;
        for (int i = 0; i < modelo2.getRowCount(); i++) {
            acu = acu + Double.parseDouble(modelo2.getValueAt(i, 3).toString());

        }
        subtotal.setText(acu + "");
        iva.setText((acu * 0.16) + "");
        total.setText(acu + (acu * 0.16) + "");


    }

    private void limpiarDatosFacturacion() {
        folio.setText("");
        codigo.setText("");
        fecha.setDate(null);
        id_cliF.setText("");
        subtotal.setText(null);
        iva.setText(null);
        total.setText(null);

    }

    private void cerrarVentana() {
           this.dispose();
    }
}
