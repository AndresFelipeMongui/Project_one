package Controller;

import java.util.ArrayList;

import Model.Student;

public class StudentController {
    
Student student;
private static StudentController newInstance;


public StudentController() {
    student= new Student();
}

public static StudentController getInstance(){
    if(newInstance==null){
        newInstance= new StudentController();
    }
    return newInstance;
}

public void saveStudent(int id, String firstName, String lastName, String email){
    student.setId(id);
    student.setFirstName(firstName);
    student.setLastName(lastName);
    student.setEmail(email);
    student.setCourses(new ArrayList<>());

}

public void addStudent(int id, String firstName, String lastName, String email){

    student.setId(id);
    student.setFirstName(firstName);
    student.setLastName(lastName);
    student.setEmail(email);

}

public void editStudent(String firstName,String lastName, String email){
    student.setFirstName(firstName);
    student.setLastName(lastName);
    student.setEmail(email);
}

public void deleteStudent(){
    student=null;
}

public Student getStudent(){
    return student;
}

}
