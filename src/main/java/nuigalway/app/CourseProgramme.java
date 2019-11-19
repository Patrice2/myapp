package nuigalway.app;
import org.joda.time.DateTime;

import java.util.ArrayList;

public class CourseProgramme {
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String courseName, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.modules = modules;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private String courseName;

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
