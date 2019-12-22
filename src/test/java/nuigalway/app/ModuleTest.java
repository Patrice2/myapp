package nuigalway.app;

import org.joda.time.DateTime;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ModuleTest {
    @Test
    public void testGetters() {
        //test the getters get the correct values
        Student student1 = new Student("Patrice", 21, "24/11/1997", 12345);
        Student student2 = new Student("Callum", 21, "14/12/1998", 12368);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        DateTime start = new DateTime().withDate(2019, 9,9);
        DateTime end = new DateTime().withDate(2019, 12,6);
        CourseProgramme course1 = new CourseProgramme("Electronic and Computer Engineering", start, end);
        CourseProgramme course2 = new CourseProgramme("Computer Science", start, end);
        ArrayList<CourseProgramme> courses = new ArrayList();
        courses.add(course1);
        courses.add(course2);
        Module module = new Module("Machine Learning", "CT4101", students, courses);

        assert module.getName() == "Machine Learning" : "The name getter returns the wrong value";
        assert module.getId() == "CT4101" : "The Id getter returns the wrong value";
        assertEquals(student1, module.getStudents().get(0));
        assertEquals(student2, module.getStudents().get(1));
        assertEquals(course1, module.getCourseProgrammes().get(0));
        assertEquals(course2, module.getCourseProgrammes().get(1));
    }

    @Test
    public void testSetters() {
        //test the setters using the getters tested above
        Module module = new Module("Machine Learning", "CT4101");
        module.setName("Software Engineering");
        module.setId("CT417");
        Student student1 = new Student("Patrice", 21, "24/11/1997", 12345);
        Student student2 = new Student("Callum", 21, "14/12/1998", 12368);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        module.setStudents(students);
        DateTime start = new DateTime().withDate(2019, 9,9);
        DateTime end = new DateTime().withDate(2019, 12,6);
        CourseProgramme course1 = new CourseProgramme("Electronic and Computer Engineering", start, end);
        CourseProgramme course2 = new CourseProgramme("Computer Science", start, end);
        ArrayList<CourseProgramme> courses = new ArrayList();
        courses.add(course1);
        courses.add(course2);
        module.setCourseProgrammes(courses);

        assert module.getName() == "Software Engineering" : "The name getter returns the wrong value";
        assert module.getId() == "CT417" : "The Id getter returns the wrong value";
        assertEquals(student1, module.getStudents().get(0));
        assertEquals(student2, module.getStudents().get(1));
        assertEquals(course1, module.getCourseProgrammes().get(0));
        assertEquals(course2, module.getCourseProgrammes().get(1));
    }

    @Test
    public void testAdders() {
        //test the adders by adding elements to the arrays with the class adder methods
        Module module = new Module("Machine Learning", "CT4101");
        Student student1 = new Student("Patrice", 21, "24/11/1997", 12345);
        Student student2 = new Student("Callum", 21, "14/12/1998", 12368);
        module.addStudent(student1);
        module.addStudent(student2);
        DateTime start = new DateTime().withDate(2019, 9,9);
        DateTime end = new DateTime().withDate(2019, 12,6);
        CourseProgramme course1 = new CourseProgramme("Electronic and Computer Engineering", start, end);
        CourseProgramme course2 = new CourseProgramme("Computer Science", start, end);
        module.addCourseProgramme(course1);
        module.addCourseProgramme(course2);

        assertEquals(student1, module.getStudents().get(0));
        assertEquals(student2, module.getStudents().get(1));
        assertEquals(course1, module.getCourseProgrammes().get(0));
        assertEquals(course2, module.getCourseProgrammes().get(1));
    }

    @Test
    public void testDeletes() {
        //test the deleters by showing the first element added to the arraylist has been removed
        Module module = new Module("Machine Learning", "CT4101");
        Student student1 = new Student("Patrice", 21, "24/11/1997", 12345);
        Student student2 = new Student("Callum", 21, "14/12/1998", 12368);
        module.addStudent(student1);
        module.addStudent(student2);
        module.removeStudent(student1);
        DateTime start = new DateTime().withDate(2019, 9,9);
        DateTime end = new DateTime().withDate(2019, 12,6);
        CourseProgramme course1 = new CourseProgramme("Electronic and Computer Engineering", start, end);
        CourseProgramme course2 = new CourseProgramme("Computer Science", start, end);
        module.addCourseProgramme(course1);
        module.addCourseProgramme(course2);
        module.removeCourseProgramme(course1);

        assertEquals(student2, module.getStudents().get(0));
        assertEquals(course2, module.getCourseProgrammes().get(0));
    }
}
