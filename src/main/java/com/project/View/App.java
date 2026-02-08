package com.project.View;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.Connection.Conexiones;

import com.project.Connection.StudentQuery;
import com.project.Model.Student;

public class App {
    public static void main(String[] args) {
       StudentQuery sq=new StudentQuery();

        List<Student> students = sq.readStudent();

        for (Student student : students) {
            System.out.println(student);
        }

       //AppAdmin.main(args);

    }
}
