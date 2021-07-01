/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.NumberFormatException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author luis_
 */
public class funciones {

   

    public static boolean validaUsuario(String usuario, String contraseña, Connection conexion) {
       String lsQuery="";
       String respuesta="";
       boolean existe= false;
        try {
            lsQuery="SELECT id_Cliente From usuario where Usuario='"+usuario+"'"+" AND Password='"+contraseña+"'";
            System.out.println("lsQuery"+lsQuery);
            Statement st = conexion.createStatement();
            ResultSet rs= st.executeQuery(lsQuery);
            System.out.println(rs.getRow());
           
            while (rs.next()) {
                respuesta = rs.getString(1);
                existe= true;
                //  ta.append(""+result.getInt("id")+"\t"+result.getString("descripcion")+"\n");
            }
            System.out.println("respuesta"+respuesta);
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
            return existe;
    }

    public static void cambiaFondoBlanco(JButton boton) {
        boton.setBackground(Color.WHITE);
    }

    public static void regresaColor(JButton boton) {
        boton.setBackground(new Color(148, 158, 158));
    }

    public static void validaSiEsNumero(java.awt.event.KeyEvent evt) {
         char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && a != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Escribe Numeros", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

   
     public Date StringADate(String fecha) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaE = null;
            try {
                fechaE = sdf.parse(fecha);
                return fechaE;
            } catch (ParseException ex) {
                return null;
            }
        }
     public static int getParametroInteger( String numero){
     int num=0;
         try {
            num=  Integer.valueOf(numero);
         } catch (Exception e) {
            e.printStackTrace();
         }
         return num;
         }
   
        
         
     
}
