/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and ogepen the template in the editor.
 */
package Procesos;

/**
 *
 * @author luis_
 */
public class Propiedades {
    String gestorBD="";
    String host="";
    int puerto=0;
    String nombreBD="";
    String usuarioDB="";
    String constraseñaBD="";

    public String getGestorBD() {
        return gestorBD;
    }

    public void setGestorBD(String gestorBD) {
        this.gestorBD = gestorBD;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getNombreBD() {
        return nombreBD;
    }

    public void setNombreBD(String nombreBD) {
        this.nombreBD = nombreBD;
    }

    public String getUsuarioDB() {
        return usuarioDB;
    }

    public void setUsuarioDB(String usuarioDB) {
        this.usuarioDB = usuarioDB;
    }

    public String getConstraseñaBD() {
        return constraseñaBD;
    }

    public void setConstraseñaBD(String constraseñaBD) {
        this.constraseñaBD = constraseñaBD;
    }
    
}
