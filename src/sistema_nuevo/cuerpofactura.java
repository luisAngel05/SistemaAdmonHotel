
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

public class cuerpofactura {
    private int idcuerpo;
    private double precio;
    private int id_rese;
    private int folio;
    private Connection cn;

    public cuerpofactura(int idcuerpo, double precio, int id_rese, int folio, Connection cn) {
        this.idcuerpo = idcuerpo;
        this.precio = precio;
        this.id_rese = id_rese;
        this.folio = folio;
        this.cn = cn;
    }
    
    public cuerpofactura() {
        this.idcuerpo = 0;
        this.precio = 0;
        this.id_rese = 0;
        this.folio = 0;
    }
    public int registrar() {

        String sql = "";
        sql = "INSERT INTO cuerpo (idCuerpo,Precio,idReservaciones,Folio) VALUES (?,?,?,?)";
        String and = "";
        and = "SELECT * FROM cuerpo WHERE idCuerpo \"" + idcuerpo + "\"";
                try {
                    PreparedStatement pst = cn.prepareStatement(sql);
                    pst.setInt(1, idcuerpo);
                    pst.setDouble(2, precio);
                    pst.setInt(3, id_rese);
                    pst.setInt(4, folio);
                    System.out.println(pst.toString());
                    int n = pst.executeUpdate();
                    return n;
                } catch (SQLException ex) {
                    Logger.getLogger(cuerpofactura.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "No puede Registrar con el mismo numero de FOLIO");
                    return 0;
                }
}
   public boolean consultar() {
       try {
            Statement st = cn.createStatement();
            System.out.println(folio);
            ResultSet rs = st.executeQuery("SELECT * FROM cuerpo WHERE Folio='" + folio + "'");  
            if(rs.next()){
            idcuerpo = rs.getInt(1);
            precio= rs.getInt(2);
            id_rese = rs.getInt(3);
            folio = rs.getInt(4);
            return true;
            }
            else{
               return false;
            }

        } catch (Exception e) {
        }
       return false;
    }
   public void eliminar() {
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM cuerpo WHERE Folio='" + folio + "'");
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }
    public ResultSet consultarvarios() {
       try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM cuerpo WHERE Folio='" + folio + "'");  
           return rs;

        } catch (Exception e) {
            System.out.println("Error: " + e); 
            return null;
        }
    }
    public int getIdcuerpo() {
        return idcuerpo;
    }

    public void setIdcuerpo(int idcuerpo) {
        this.idcuerpo = idcuerpo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_rese() {
        return id_rese;
    }

    public void setId_rese(int id_rese) {
        this.id_rese = id_rese;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
}
