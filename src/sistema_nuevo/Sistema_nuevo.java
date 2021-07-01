package sistema_nuevo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sistema_nuevo {

    private int id_habitaciones;
    private String numero;
    private String piso;
    private String Descripcion;
    private String Caracteristicas;
    private String precio;
    private String estado;
    private String tipo_habitacion;
    private Connection cn;
//    private int tabla;
//    private String eliminar;

    public Sistema_nuevo(int idHabitaciones, String Numero_habitacion, String Piso, String Descripcion, String Caracteristicas, String Precio, String Estado, String Tipo_habitacion, Connection cn) {
        this.id_habitaciones = idHabitaciones;
        this.numero = Numero_habitacion;
        this.piso = Piso;
        this.Descripcion = Descripcion;
        this.Caracteristicas = Caracteristicas;
        this.precio = Precio;
        this.estado = Estado;
        this.tipo_habitacion = Tipo_habitacion;
        this.cn = cn;
//        this.tabla = tabla;
//        this.eliminar = eliminar;
    }

    public Sistema_nuevo() {
        this.id_habitaciones = 0;
        this.numero = "";
        this.piso = "";
        this.Descripcion = "";
        this.Caracteristicas = "";
        this.precio = "";
        this.estado = "";
        this.tipo_habitacion = "";
    }

    public int alta() throws SQLException {
        String sql = "";
        sql = "INSERT INTO habitaciones (idHabitaciones,Numero_habitacion,Piso,Descripcion,Caracteristicas,Precio,Estado,Tipo_habitacion) VALUES (?,?,?,?,?,?,?,?)";
        String ara = "";
        ara = "SELECT * FROM habitaciones WHERE idHabitaciones= \"" + id_habitaciones + "\"";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(ara);
        if (!rs.next()) {
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, id_habitaciones);
                pst.setString(2, numero);
                pst.setString(3, piso);
                pst.setString(4, Descripcion);
                pst.setString(5, Caracteristicas);
                pst.setString(6, precio);
                pst.setString(7, estado);
                pst.setString(8, tipo_habitacion);
                int n = pst.executeUpdate();
                return n;
            } catch (SQLException ex) {
                Logger.getLogger(Sistema_nuevo.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No puede Registrar con el mismo ID");
                return 0;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puede Registrar con el mismo ID");
            return 0;
        }
    }

    public void modificar() {
        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE habitaciones SET idHabitaciones='" + id_habitaciones + "', Numero_habitacion='" + numero + "',Piso='" + piso + "',Descripcion='" + Descripcion + "',Caracteristicas='" + Caracteristicas + "',Precio='" + precio + "',Estado='" + estado + "',Tipo_habitacion='" + tipo_habitacion + "' WHERE idHabitaciones='" + id_habitaciones + "'");
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminar() {
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM habitaciones WHERE idHabitaciones='" + id_habitaciones + "'");
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void consultar() {
        try {
            Statement st = cn.createStatement();
            String query=  new String("SELECT * FROM habitaciones WHERE idHabitaciones='" + id_habitaciones + "'"); 
            System.out.print(query);
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                id_habitaciones = rs.getInt(1);
                numero = rs.getString(2);
                piso = rs.getString(3);
                Descripcion = rs.getString(4);
                Caracteristicas = rs.getString(5);
                precio = rs.getString(6);
                estado = rs.getString(7);
                tipo_habitacion = rs.getString(8);

            } else {

            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public int getId_habitaciones() {
        return id_habitaciones;
    }

    public void setId_habitaciones(int id_habitaciones) {
        this.id_habitaciones = id_habitaciones;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

}
