package com.project.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.util.ArrayList;
import java.util.List;

import com.project.Model.Student;

public class Conexiones {
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String usuario = "system";
    private static final String pass = "1234";
    Connection conexion = null;
    
    public Connection initConnect(){
        
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


    public void desConnection(){
        
try {
    if(conexion !=null) {conexion.close();}
  
} catch (Exception e) {
    // TODO: handle exception
    e.printStackTrace();
}
    }



    
public Connection getConexion(){
    return conexion;
}
}
