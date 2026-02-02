package Controller;

import java.util.ArrayList;

import Model.Teacher;

public class TeacherController {
    

    Teacher teacher;
   private static TeacherController newInstance;

    public TeacherController() {
        teacher=new Teacher();
    }

    public static TeacherController getInstance(){
        if(newInstance==null){
            newInstance= new TeacherController();
        }
        return newInstance;
    }

    public void saveTeacher(int id, String firstName, String lastName, String email){

        teacher.setId(id);
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setEmail(email);
        teacher.setCourses(new ArrayList<>());
    }

    public void addTeacher(int id, String firstName, String lastName, String email){
 teacher.setId(id);
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setEmail(email);
    }

    public void editTeacher(String firstName, String lastName,String  email){
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setEmail(email);
    }
    
    public void deleteTeacher(){
        teacher=null;
    }

    public Teacher getTeacher(){
        return teacher;
    }
}
