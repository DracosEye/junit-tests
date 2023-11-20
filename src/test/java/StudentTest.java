import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    Student stud;

    @Before
    public void setup() {
        stud = new Student(123456789, "Joe");
    }

    @Test
    public void testCreateStudent() {
        Assert.assertEquals(new ArrayList<>(), stud.getGrades());
    }

    @Test
    public void testGetters() {
        Assert.assertEquals(stud.getID(), 123456789);
        Assert.assertEquals(stud.getName(), "Joe");
    }

    @Test
    public void testAddGrade() {
        stud.addGrade(80);
        stud.addGrade(90);
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(80);
        testList.add(90);
        Assert.assertEquals(stud.getGrades(), testList);
    }

    @Test
    public void testAverage() {
        stud.addGrade(85);
        stud.addGrade(90);
        Assert.assertTrue(stud.getGradeAverage() == 87.5);
    }
}
