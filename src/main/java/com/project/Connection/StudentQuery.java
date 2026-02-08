package com.project.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.Model.Student;

public class StudentQuery {
    Conexiones con=new Conexiones();
  Connection newConnection = con.initConnect();
  Statement sentence = null;
  ResultSet resultQuery=null;


  public List<Student> readStudent(){
    List<Student> students=new ArrayList<>();
    Student studentFirst=null;
    try {
        sentence= newConnection.createStatement();

        String sql = "Select id_student, first_name, last_name, email from student";

        resultQuery=sentence.executeQuery(sql);

        while (resultQuery.next()) {
            int id=resultQuery.getInt(1);
            String name=resultQuery.getString(2);
            String lastName=resultQuery.getString(3);
            String email=resultQuery.getString(4);
            studentFirst=new Student(id, name, lastName, email);
            students.add(studentFirst);
        }
        System.out.println("Estudiantes encontrados " + students.size());
        
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
    }finally{
try {
    if(resultQuery !=null && sentence != null){ 
    resultQuery.close();
    sentence.close();
}
} catch (Exception e) {
    // TODO: handle exception
    e.printStackTrace();
    
}

    }


    return students;
  }
  
}
