package nuigalway.app;

import org.joda.time.DateTime;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testGetters() {
        //test the getters get the correct values
        Module module1 = new Module("Machine Learning", "CT4101");
        Module module2 = new Module("Software Engineering", "CT417");
        ArrayList<Module> modules = new ArrayList();
        modules.add(module1);
        modules.add(module2);
        DateTime start = new DateTime().withDate(2019, 9,9);
        DateTime end = new DateTime().withDate(2019, 12,6);
        CourseProgramme course1 = new CourseProgramme("Electronic and Computer Engineering", start, end);
        CourseProgramme course2 = new CourseProgramme("Computer Science", start, end);
        ArrayList<CourseProgramme> courses = new ArrayList();
        courses.add(course1);
        courses.add(course2);
        Student student = new Student("Patrice", 21, "24/11/1997", 12345, courses, modules);

        assert student.getName() == "Patrice" : "The name getter returns the wrong value";
        assert student.getAge() == 21 : "The age getter returns the wrong value";
        assert student.getDoB() == "24/11/1997" : "The DoB getter returns the wrong value";
        assert student.getId() == 12345 : "The id getter returns the wrong value";
        assertEquals("Patrice21", student.getUsername());
        assertEquals(module1, student.getModules().get(0));
        assertEquals(module2, student.getModules().get(1));
        assertEquals(course1, student.getCourseProgrammes().get(0));
        assertEquals(course2, student.getCourseProgrammes().get(1));
    }

    @Test
    public void testSetters() {
        //test the setters using the getters tested above
        Student student2 = new Student("Patrice", 21, "24/11/1997", 12345);
        student2.setName("Callum");
        student2.setAge(22);
        student2.setDoB("14/02/1996");
        student2.setId(65432);
        Module module1 = new Module("Machine Learning", "CT4101");
        Module module2 = new Module("Software Engineering", "CT417");
        ArrayList<Module> modules = new ArrayList();
        modules.add(module1);
        modules.add(module2);
        student2.setModule(modules);
        DateTime start = new DateTime().withDate(2019, 9,9);
        DateTime end = new DateTime().withDate(2019, 12,6);
        CourseProgramme course1 = new CourseProgramme("Electronic and Computer Engineering", start, end);
        CourseProgramme course2 = new CourseProgramme("Computer Science", start, end);
        ArrayList<CourseProgramme> courses = new ArrayList();
        courses.add(course1);
        courses.add(course2);
        student2.setCourseProgramme(courses);

        assert student2.getName() == "Callum" : "The name getter returns the wrong value";
        assert student2.getAge() == 22 : "The age getter returns the wrong value";
        assert student2.getDoB() == "14/02/1996" : "The DoB getter returns the wrong value";
        assert student2.getId() == 65432 : "The id getter returns the wrong value";
        assertEquals("Callum22", student2.getUsername());
        assertEquals(module1, student2.getModules().get(0));
        assertEquals(module2, student2.getModules().get(1));
        assertEquals(course1, student2.getCourseProgrammes().get(0));
        assertEquals(course2, student2.getCourseProgrammes().get(1));
    }

    @Test
    public void testAdders() {
        //test the adders by adding elements to the arrays with the class adder methods
        Student student2 = new Student("Patrice", 21, "24/11/1997", 12345);
        Module module1 = new Module("Machine Learning", "CT4101");
        Module module2 = new Module("Software Engineering", "CT417");
        student2.addModule(module1);
        student2.addModule(module2);
        DateTime start = new DateTime().withDate(2019, 9,9);
        DateTime end = new DateTime().withDate(2019, 12,6);
        CourseProgramme course1 = new CourseProgramme("Electronic and Computer Engineering", start, end);
        CourseProgramme course2 = new CourseProgramme("Computer Science", start, end);
        student2.addCourseProgramme(course1);
        student2.addCourseProgramme(course2);

        assertEquals(module1, student2.getModules().get(0));
        assertEquals(module2, student2.getModules().get(1));
        assertEquals(course1, student2.getCourseProgrammes().get(0));
        assertEquals(course2, student2.getCourseProgrammes().get(1));
    }

    @Test
    public void testDeletes() {
        //test the deleters by showing the first element added to the arraylist has been removed
        Student student2 = new Student("Patrice", 21, "24/11/1997", 12345);
        Module module1 = new Module("Machine Learning", "CT4101");
        Module module2 = new Module("Software Engineering", "CT417");
        student2.addModule(module1);
        student2.addModule(module2);
        student2.removeModule(module1);
        DateTime start = new DateTime().withDate(2019, 9,9);
        DateTime end = new DateTime().withDate(2019, 12,6);
        CourseProgramme course1 = new CourseProgramme("Electronic and Computer Engineering", start, end);
        CourseProgramme course2 = new CourseProgramme("Computer Science", start, end);
        student2.addCourseProgramme(course1);
        student2.addCourseProgramme(course2);
        student2.removeCourseProgramme(course1);

        assertEquals(module2, student2.getModules().get(0));
        assertEquals(course2, student2.getCourseProgrammes().get(0));
    }
}