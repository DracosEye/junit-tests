import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CohortTest {

    private Cohort testCohort;
    private Student testStud1;
    private Student testStud2;
    private Student testStud3;

    @Before
    public void setup() {
        testCohort = new Cohort();
        testStud1 = new Student(1, "Trinity");
        testStud2 = new Student(2, "Enzo");
        testStud3 = new Student(3, "Maritza");
    }

    @Test
    public void testAddStudent() {
        Student testStud4 = new Student(4, "Finch");
        testCohort.addStudent(testStud4);
        Assert.assertTrue(testCohort.getStudents().lastIndexOf(testStud4) != -1);
    }

    @Test
    public void testGetAverage() {
        testStud1.addGrade(90);
        testStud2.addGrade(85);
        testStud3.addGrade(77);

        testCohort.addStudent(testStud1);
        testCohort.addStudent(testStud2);
        testCohort.addStudent(testStud3);

        Assert.assertTrue(testCohort.getCohortAverage() == (double)(90+85+77) / 3);
    }
}
