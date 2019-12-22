package nuigalway.app;

import java.util.ArrayList;

public class Module {
    //initialise all the variables
    private String name;
    private String id;
    private ArrayList<Student> students = new ArrayList();
    private ArrayList<CourseProgramme> courses = new ArrayList();

    //constructor option 1 all information
    public Module(String name, String id, ArrayList<Student> students, ArrayList<CourseProgramme> courses){
        this.name = name;
        this.id = id;
        this.students = students;
        this.courses = courses;
    }

    //constructor option 2
    public Module(String name, String id){
        this.name = name;
        this.id = id;
    }

    //methods of setters, getters, adders and removers

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }

    public void setId(String newId){
        this.id = newId;
    }

    public String getId(){
        return id;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student newStudent){
        students.add(newStudent);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void setCourseProgrammes(ArrayList<CourseProgramme> newCourses){
        courses = newCourses;
    }

    public ArrayList<CourseProgramme> getCourseProgrammes() {
        return courses;
    }

    public void addCourseProgramme(CourseProgramme newCourse){
        courses.add(newCourse);
    }

    public void removeCourseProgramme(CourseProgramme course){
        courses.remove(course);
    }
}
