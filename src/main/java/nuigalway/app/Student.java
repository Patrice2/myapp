package nuigalway.app;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String DoB;
    private String id;
    private String username;
    private ArrayList<CourseProgramme> courses;
    private ArrayList<Module> modules;

    public Student(String name, int age, String DoB, String id, ArrayList<CourseProgramme> courses, ArrayList<Module> modules) {
       this.name = name;
       this.age = age;
       this.DoB = DoB;
       this.id = id;
       this.courses = courses;
       this.modules = modules;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public int getAge(){
        return age;
    }

    public void setDoB(String newDoB){
        this.DoB = newDoB;
    }

    public String getDoB(){
        return DoB;
    }

    public void setId(String newId){
        this.id = newId;
    }

    public String getId(){
        return id;
    }

    public void setCourseProgramme(ArrayList<CourseProgramme> newCourses){
        this.courses = newCourses;
    }

    public ArrayList<CourseProgramme> getCourseProgramme(){
        return courses;
    }

    public void setModule(ArrayList<Module> newModules){
        this.modules = newModules;
    }

    public ArrayList<Module> getModule(){
        return modules;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public String getUsername(){
        return name+age;
    }
}
