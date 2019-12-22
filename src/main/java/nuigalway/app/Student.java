package nuigalway.app;

import java.util.ArrayList;

public class Student {
    //initialise all the variables
    private String name;
    private int age;
    private String DoB;
    private int id;
    private String username;
    private ArrayList<CourseProgramme> courses = new ArrayList();
    private ArrayList<Module> modules = new ArrayList();

    //constructor option 1 all information
    public Student(String name, int age, String DoB, int id, ArrayList<CourseProgramme> courses, ArrayList<Module> modules) {
       this.name = name;
       this.age = age;
       this.DoB = DoB;
       this.id = id;
       this.courses = courses;
       this.modules = modules;
    }

    //constructor option 2
    public Student(String name, int age, String DoB, int id){
        this.name = name;
        this.age = age;
        this.DoB = DoB;
        this.id = id;
    };

    //methods of setters, getters, adders and removers

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

    public void setId(int newId){
        this.id = newId;
    }

    public int getId(){
        return id;
    }

    public void setCourseProgramme(ArrayList<CourseProgramme> newCourses){
        courses = newCourses;
    }

    public ArrayList<CourseProgramme> getCourseProgrammes(){
        return courses;
    }

    public void addCourseProgramme(CourseProgramme newCourse){
        courses.add(newCourse);
    }

    public void removeCourseProgramme(CourseProgramme course){
        courses.remove(course);
    }

    public void setModule(ArrayList<Module> modules){
        this.modules = modules;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void addModule(Module newModule){
        modules.add(newModule);
    }

    public void removeModule(Module module){
        modules.remove(module);
    }

    public String getUsername(){
        return name+age;
    }
}
