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

public class clientes {

    private int id_cliente;
    private String rfc;
    private String nombre;
    private String direccion;
    private int telefono;
    private String email;
    private Connection cn;

    public clientes(int id_cliente, String rfc, String nombre, String direccion, int telefono, String email,Connection cn) {
        this.id_cliente = id_cliente;
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.cn = cn;
    }

    public clientes() {
        this.id_cliente = 0;
        this.rfc = "";
        this.nombre = "";
        this.direccion = "";
        this.telefono = 0;
        this.email = "";
    }

    public int registrar() throws SQLException {
        String sql = "";
        sql = "INSERT INTO clientes (id_cliente,RFC,Nombre,Direccion,Telefono,Correo_electronico) VALUES (?,?,?,?,?,?)";
        String and = "";
        and = "SELECT * FROM clientes WHERE id_cliente= \"" + id_cliente + "\"";
        System.out.println("Registrar:"+sql);
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(and);
        if (!rs.next()) {
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setInt(1, id_cliente);
                pst.setString(2, rfc);
                pst.setString(3, nombre);
                pst.setString(4, direccion);
                pst.setInt(5, telefono);
                pst.setString(6, email);
                int n = pst.executeUpdate();
                return n;
            } catch (SQLException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
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
            PreparedStatement pst = cn.prepareStatement("UPDATE clientes SET id_cliente='" + id_cliente + "', RFC='" + rfc + "',nombre='" + nombre + "',direccion='" + direccion + "',telefono='" + telefono + "',Correro_electronico='" + email + "' WHERE id_cliete='" + id_cliente + "'");
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     public void eliminar() {
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM clientes WHERE id_cliente='" + id_cliente + "'");
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }
      public boolean consultar() {
          String lsQuery;
       try {
            Statement st = cn.createStatement();
            lsQuery="SELECT * FROM clientes WHERE id_cliente='" + id_cliente + "'";
            System.out.println("Consultar:"+lsQuery);
            ResultSet rs = st.executeQuery(lsQuery);  
            if(rs.next()){
            id_cliente = rs.getInt(1);
            rfc = rs.getString(2);
            nombre = rs.getString(3);
            direccion = rs.getString(4);
            telefono = rs.getInt(5);
            email = rs.getString(6);
            System.out.println(id_cliente+"");
            return true;
            }
            else{
               return false;
            }

        } catch (Exception e) {
             
            return false;
        }
    }


    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
      
}
