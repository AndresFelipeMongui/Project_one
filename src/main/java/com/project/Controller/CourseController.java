package Controller;

import java.util.ArrayList;

import Model.Course;

public class CourseController {
    private Course course;
    private static CourseController newInstance;


    public CourseController() {
        course=new Course();
    }

    public static CourseController getInstance(){
        if(newInstance==null){
            newInstance=new CourseController();
        }
        return newInstance;
    }

    public void saveCourse(int code, String name, int credits, int slot, int codeTeacher){
        course.setCode(code);
        course.setName(name);
        course.setCredits(credits);
        course.setSlot(slot);
        course.setCodeTeacher(codeTeacher);
        course.setStudents(new ArrayList<>());
        
    }

    public void addCourse(int code,String name,int credits, int slot, int codeTeacher)  {
        course.setCode(code);
        course.setName(name);
        course.setCredits(credits);
        course.setSlot(slot);
        course.setCodeTeacher(codeTeacher);
    }

    public void editCourse(int code,String name,int credits, int slot, int codeTeacher)  {
        course.setCode(code);
        course.setName(name);
        course.setCredits(credits);
        course.setSlot(slot);
        course.setCodeTeacher(codeTeacher);
    }

    public void deleteCourse(){
        course=null;
    }
    public Course getCourse(){
        return course;
    }
}
