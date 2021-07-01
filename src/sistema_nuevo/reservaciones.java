package sistema_nuevo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class reservaciones {

    private int idReservacion;
    private String tipo_reserva;
    private String fecha_reserva;
    private String fecha_entrada;
    private String fecha_salida;
    private String costo;
    private String observaciones;
    private String estado;
    private int id_habi;
    private int id_cli;
    private Connection cn;

    public reservaciones(int idReservacion, String tipo_reserva, String fecha_reserva, String fecha_entrada, String fecha_salida, String costo, String observaciones, String estado, int id_habi, int id_cli, Connection cn) {
        this.idReservacion = idReservacion;
        this.tipo_reserva = tipo_reserva;
        this.fecha_reserva = fecha_reserva;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.costo = costo;
        this.observaciones = observaciones;
        this.estado = estado;
        this.id_habi = id_habi;
        this.id_cli = id_cli;
        this.cn = cn;
    }

    public reservaciones() {
        this.idReservacion = 0;
        this.tipo_reserva = "";
        this.fecha_reserva = "1990/02/01";
        this.fecha_entrada = "1990/02/01";
        this.fecha_salida = "1990/02/01";
        this.costo = "";
        this.observaciones = "";
        this.estado = "";
        this.id_habi = 0;
        this.id_cli = 0;
    }

    public int alta() throws SQLException {
      
        String sql = "";
        sql = "INSERT INTO reservaciones (idReservaciones,Tipo_reserva,Fecha_reserva,Fecha_entrada,Fecha_salida,Costo,Observaciones,Estado,idHabitaciones,idcliente) VALUES (?,?,?,?,?,?,?,?,?,?)";
        String lsQueryExiste = "";
        lsQueryExiste = "SELECT * FROM reservaciones WHERE idReservaciones= \"" + idReservacion + "\"";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(lsQueryExiste);
        ;
        if (!rs.next()) {
            System.out.println(sql);
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                System.out.println("idReservacion"+idReservacion);
                 System.out.println("id_habi"+id_habi);
                pst.setInt(1, idReservacion);
                pst.setString(2, tipo_reserva);
                pst.setString(3, fecha_reserva);
                pst.setString(4, fecha_entrada);
                pst.setString(5, fecha_salida);
                pst.setString(6, costo);
                pst.setString(7, observaciones);
                pst.setString(8, estado);
                pst.setInt(9, id_habi);
                pst.setInt(10, id_cli);
                int n = pst.executeUpdate();
                return n;
            } catch (SQLException ex) {
                Logger.getLogger(reservaciones.class.getName()).log(Level.SEVERE, null, ex);
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
            PreparedStatement pst = cn.prepareStatement("UPDATE reservaciones SET idReservaciones='" + idReservacion + "', Tipo_reserva='" + tipo_reserva + "',Fecha_reserva='" + fecha_reserva + "',Fecha_entrada='" + fecha_entrada + "',Fecha_salida='" + fecha_salida + "',Costo='" + costo + "',Observaciones='" + observaciones + "',Estado='" + estado + "',idHabitaciones='" + id_habi +  "',idcliente='" + id_cli + "' WHERE idReservacion='" + idReservacion + "'");
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminar() {
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM reservaciones WHERE idReservaciones='" + idReservacion + "'");
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }

    public boolean consultar() {
        boolean bndExiste=false;
        try {
            Statement st = cn.createStatement();
            String lsQuery= "SELECT * FROM reservaciones WHERE idReservaciones='" + idReservacion + "'";
            System.out.println("query:"+lsQuery);
            ResultSet rs = st.executeQuery(lsQuery);  
            if(rs.next()){
            idReservacion = rs.getInt(1);
            tipo_reserva = rs.getString(2);
            fecha_reserva = rs.getString(3);
            fecha_entrada = rs.getString(4);
            fecha_salida = rs.getString(5);
            costo = rs.getString(6);
            observaciones = rs.getString(7);
            estado = rs.getString(8);
            id_habi = rs.getInt(9);
            id_cli = rs.getInt(10);
            bndExiste= true;
            }

        } catch (Exception e) {
           e.printStackTrace();
        }
        return bndExiste;
    }
//    public void consultarmu(){
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery("SELECT `idReservaciones`,`Tipo_reserva`,`Fecha_reserva`,`Fecha_entrada`,`Fecha_salida`,`Costo`,`Observaciones`,`Estado`,`idHabitaciones`,`idliente`,clientes.Nombre FROM `reservaciones`,`clientes`WHERE reservaciones.idcliente=clientes.id_cliente");
//    } catch (Exception e) {
//        }
//    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getTipo_reserva() {
        return tipo_reserva;
    }

    public void setTipo_reserva(String tipo_reserva) {
        this.tipo_reserva = tipo_reserva;
    }

    public String getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_habi() {
        return id_habi;
    }

    public void setId_habi(int id_habi) {
        this.id_habi = id_habi;
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

}
