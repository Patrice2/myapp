package nuigalway.app;

import org.joda.time.DateTime;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class CourseTest {
    @Test
    public void testGetters() {
        //test the getters get the correct values
        Student student1 = new Student("Patrice", 21, "24/11/1997", 12345);
        Student student2 = new Student("Callum", 21, "14/12/1998", 12368);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        Module module1 = new Module("Machine Learning", "CT4101");
        Module module2 = new Module("Software Engineering", "CT417");
        ArrayList<Module> modules = new ArrayList();
        modules.add(module1);
        modules.add(module2);
        DateTime start = new DateTime().withDate(2019, 9,9);
        DateTime end = new DateTime().withDate(2019, 12,6);
        CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", modules, students, start, end);

        assert course.getCourseName() == "Electronic and Computer Engineering" : "The course name getter returns the wrong value";
        assertEquals(module1, course.getModules().get(0));
        assertEquals(module2, course.getModules().get(1));
        assertEquals(student1, course.getStudents().get(0));
        assertEquals(student2, course.getStudents().get(1));
        assertEquals(start, course.getStartDate());
        assertEquals(end, course.getEndDate());
    }

    @Test
    public void testSetters() {
        //test the setters using the getters tested above
        DateTime start = new DateTime().withDate(2018, 9,12);
        DateTime end = new DateTime().withDate(2018, 11,7);
        CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", start, end);
        course.setCourseName("Computer Science");
        Student student1 = new Student("Patrice", 21, "24/11/1997", 12345);
        Student student2 = new Student("Callum", 21, "14/12/1998", 12368);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        course.setStudents(students);
        Module module1 = new Module("Machine Learning", "CT4101");
        Module module2 = new Module("Software Engineering", "CT417");
        ArrayList<Module> modules = new ArrayList();
        modules.add(module1);
        modules.add(module2);
        course.setModule(modules);
        DateTime newStart = new DateTime().withDate(2019, 9,9);
        course.setStartDate(newStart);
        DateTime newEnd = new DateTime().withDate(2019, 12,6);
        course.setEndDate(newEnd);

        assert course.getCourseName() == "Computer Science" : "The  course name getter returns the wrong value";
        assertEquals(module1, course.getModules().get(0));
        assertEquals(module2, course.getModules().get(1));
        assertEquals(student1, course.getStudents().get(0));
        assertEquals(student2, course.getStudents().get(1));
        assertEquals(newStart, course.getStartDate());
        assertEquals(newEnd, course.getEndDate());
    }

    @Test
    public void testAdders() {
        //test the adders by adding elements to the arrays with the class adder methods
        DateTime start = new DateTime().withDate(2018, 9,12);
        DateTime end = new DateTime().withDate(2018, 11,7);
        CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", start, end);
        Student student1 = new Student("Patrice", 21, "24/11/1997", 12345);
        Student student2 = new Student("Callum", 21, "14/12/1998", 12368);
        course.addStudent(student1);
        course.addStudent(student2);
        Module module1 = new Module("Machine Learning", "CT4101");
        Module module2 = new Module("Software Engineering", "CT417");
        course.addModule(module1);
        course.addModule(module2);

        assertEquals(module1, course.getModules().get(0));
        assertEquals(module2, course.getModules().get(1));
        assertEquals(student1, course.getStudents().get(0));
        assertEquals(student2, course.getStudents().get(1));
    }

    @Test
    public void testDeletes() {
        //test the deleters by showing the first element added to the arraylist has been removed
        DateTime start = new DateTime().withDate(2018, 9,12);
        DateTime end = new DateTime().withDate(2018, 11,7);
        CourseProgramme course = new CourseProgramme("Electronic and Computer Engineering", start, end);
        Student student1 = new Student("Patrice", 21, "24/11/1997", 12345);
        Student student2 = new Student("Callum", 21, "14/12/1998", 12368);
        course.addStudent(student1);
        course.addStudent(student2);
        course.removeStudent(student1);
        Module module1 = new Module("Machine Learning", "CT4101");
        Module module2 = new Module("Software Engineering", "CT417");
        course.addModule(module1);
        course.addModule(module2);
        course.removeModule(module1);

        assertEquals(module2, course.getModules().get(0));
        assertEquals(student2, course.getStudents().get(0));
    }
}
