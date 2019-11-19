package nuigalway.app;

import java.util.ArrayList;

public class Module {
    private String name;
    private int id;
    private ArrayList<Student> students;
    private ArrayList<CourseProgramme> courses;

    public Module(String name, int id, ArrayList<Student> students, ArrayList<CourseProgramme> courses){
        this.name = name;
        this.id = id;
        this.students = students;
        this.courses = courses;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public int getId(){
        return id;
    }

    public ArrayList<Student> addStudent(Student newStudent){
        students.add(newStudent);
        return students;
    }

    public ArrayList<CourseProgramme> addCourse(CourseProgramme newCourse){
        courses.add(newCourse);
        return courses;
    }
}
