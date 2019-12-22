package nuigalway.app;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class CourseProgramme {

    private ArrayList<Module> modules = new ArrayList();
    private ArrayList<Student> students = new ArrayList();
    private DateTime startDate;
    private DateTime endDate;

    //constructor option 1 all information
    public CourseProgramme(String courseName, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.modules = modules;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //constructor option 2
    public CourseProgramme(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
    }

    //methods of setters, getters, adders and removers

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private String courseName;

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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime newStartDate) {
        startDate = newStartDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime newEndDate) {
        endDate = newEndDate;
    }
}
