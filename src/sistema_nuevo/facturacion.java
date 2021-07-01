package sistema_nuevo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import javax.swing.table.DefaultTableModel;

public class facturacion {

    private int folio;
    private String fecha;
    private double subtotal;
    private double iva;
    private double total;
    private int id_cli;
    private Connection cn;

    public facturacion(int folio, String fecha, double subtotal, double iva, double total, int id_cli, Connection cn) {
        this.folio = folio;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.id_cli = id_cli;
        this.cn = cn;
    }

    public facturacion() {
        this.folio = 0;
        this.fecha = "1990/02/01";
        this.subtotal = 0;
        this.iva = 0;
        this.total = 0;
        this.id_cli = 0;
    }
public static boolean consultaDatosCliente(String idCliente,JTextField NombreJTF, JTextField domicilioJTF, JTextField rfcJTF) throws SQLException{
    conexion cc = new conexion();
    Connection conexion = cc.conexion();
    String query="SELECT Nombre, Direccion, RFC FROM clientes WHERE id_cliente= "+idCliente;
    boolean bndExiste=false;
    try {
        Statement st = conexion.createStatement();
        System.out.println(query);
         ResultSet rs = st.executeQuery(query);
        
        while (rs.next()) {
           NombreJTF.setText(rs.getString(1));
           domicilioJTF.setText(rs.getString(2));
           rfcJTF.setText(rs.getString(3));
           bndExiste=true;
        }
        rs.close();
        st.close();
            
    } catch (Exception e) {
        e.printStackTrace();
    }finally{
    conexion.close();
    }
    return bndExiste;
}
    public int registrar() {

        String sql = "";
        sql = "INSERT INTO factura (Folio,Fecha,Subtotal,Iva,Total,id_cliente) VALUES (?,?,?,?,?,?)";
        String query = "";
        query = "SELECT * FROM factura WHERE Folio \"" + folio + "\"";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, folio);
            pst.setString(2, fecha);
            pst.setDouble(3, subtotal);
            pst.setDouble(4, iva);
            pst.setDouble(5, total);
            pst.setInt(6, id_cli);
            System.out.println(pst.toString());
            int n = pst.executeUpdate();
            return n;
        } catch (SQLException ex) {
            Logger.getLogger(facturacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No puede Registrar con el mismo numero de FOLIO");
            return 0;
        }
    }

    public boolean consultar() {
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM factura WHERE folio='" + folio + "'");
            if (rs.next()) {
                folio = rs.getInt(1);
                fecha = rs.getString(2);
                subtotal = rs.getDouble(3);
                iva = rs.getDouble(4);
                total = rs.getDouble(5);
                id_cli = rs.getInt(6);
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
        }
        return false;
    }

    public void eliminar() {
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM factura WHERE folio='" + folio + "'");
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    int getIdcuerpo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
