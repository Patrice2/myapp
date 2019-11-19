package nuigalway.app;

public class Student {
    private String name;
    private int age;
    private String DoB;
    private String id;
    private String username;
    private CourseProgramme course;
    private Module module;

    public Student(String name, int age, String DoB, String id, CourseProgramme course, Module module) {
       this.name = name;
       this.age = age;
       this.DoB = DoB;
       this.id = id;
       this.course = course;
       this.module = module;
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

    public void setCourseProgramme(CourseProgramme newCourse){
        this.course = newCourse;
    }

    public CourseProgramme getCourseProgramme(){
        return course;
    }

    public void setModule(Module newModule){
        this.module = newModule;
    }

    public Module getModule(){
        return module;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public String getUsername(){
        return name+age;
    }
}
