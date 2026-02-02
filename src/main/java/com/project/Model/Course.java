 package Model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    
    private int code;
    private String name;
    private int credits;
    private int slot;
    private int codeTeacher;
    private List<Student> students;
    
    public Course() {
    }

    public Course(int code, String name, int credits, int slot, int codeTeacher) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.slot=slot;
        this.codeTeacher=codeTeacher;
        this.students = new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    
@Override
public String toString(){
    return name + 
    ", " + code +
    ", " + credits;
}

public int getSlot() {
    return slot;
}

public void setSlot(int slot) {
    this.slot = slot;

}

public int getCodeTeacher() {
    return codeTeacher;
}

public void setCodeTeacher(int codeTeacher) {
    this.codeTeacher = codeTeacher;
}



    
}