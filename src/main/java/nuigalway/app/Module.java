package nuigalway.app;

public class Module {
    private String name;
    private int id;
    private Student[] students;
    private CourseProgramme[] courses;

    public Module(String name, int id, Student[] students, CourseProgramme[] courses){
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

    public Student[] addStudent(Student newStudent){
        // add a student to the array
        return students;
    }
}
