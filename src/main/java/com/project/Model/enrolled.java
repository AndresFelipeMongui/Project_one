package Model;

public class enrolled {
    private int id_course;
    private int id_student;
    
    public enrolled() {
    }

    public enrolled(int id_course, int id_student) {
        this.id_course = id_course;
        this.id_student = id_student;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }


    
}
