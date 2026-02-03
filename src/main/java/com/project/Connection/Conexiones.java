package com.project.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexiones {
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String usuario = "system";
    private static final String pass = "1234";
    

    public Connection Conectar(){
        Connection conexion = null;
        try {
            //establecer conexion
            conexion=DriverManager.getConnection(url,usuario,pass);
                System.out.println("Conexion correcta");
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error en la conexion");
        }
        return conexion;
    }
}
