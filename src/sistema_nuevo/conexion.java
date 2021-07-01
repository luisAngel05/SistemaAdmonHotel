package sistema_nuevo;

import Procesos.Propiedades;
import funciones.funciones;
import java.sql.*;
import javax.swing.*;

public class conexion {

   

    Connection conect = null;
     Propiedades propiedad= new Propiedades();
    public void datosConexion(){
             propiedad.setGestorBD("MySQL");
            propiedad.setPuerto(8080);
            propiedad.setConstraseñaBD("");
            propiedad.setUsuarioDB("root");
            propiedad.setHost("127.0.0.1");
            propiedad.setNombreBD("sistemaHotel");
    }
    public void actualizaDatos(String gestorDB, String hostDB, String puertoDB, String nombreDB, String usuarioBD, String passDB) {
//       datosConexion();
           propiedad.setGestorBD(gestorDB);
           propiedad.setHost(hostDB);
           propiedad.setPuerto(funciones.getParametroInteger(puertoDB));
           propiedad.setNombreBD(nombreDB);
           propiedad.setUsuarioDB(usuarioBD);
           propiedad.setConstraseñaBD(passDB);
            System.out.println("host:"+propiedad.getHost());
    }
    public Connection conexion() {
        
        try {

            Class.forName("org.gjt.mm.mysql.Driver");

            conect = DriverManager.getConnection("jdbc:mysql://localhost/sistemahotel", "root", "");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion");
            JOptionPane.showMessageDialog(null, "Error de conexion" + e);
        }
        return conect;
    }

    void datosConexion(JTextField gestorBD, JTextField puertoBD, JTextField hostBD, JTextField nombreBD, JTextField usuarioBD, JTextField passBD) {
       datosConexion();
        gestorBD.setText(propiedad.getGestorBD());
                    puertoBD.setText(propiedad.getPuerto()+"");
                    hostBD.setText(propiedad.getHost());
                    nombreBD.setText(propiedad.getNombreBD());
                    usuarioBD.setText(propiedad.getUsuarioDB());
                    passBD.setText(propiedad.getConstraseñaBD());
    }
}
