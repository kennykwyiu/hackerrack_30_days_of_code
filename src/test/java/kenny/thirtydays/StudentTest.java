package kenny.thirtydays;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testCalculateGrade_O() {
        int[] scores = {90, 95, 92, 88, 91};
        Student student = new Student("John", "Doe", 123456, scores);

        char expectedGrade = 'O';
        char actualGrade = student.calculate();

        Assert.assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void testCalculateGrade_A() {
        int[] scores = {75, 82, 79, 88, 81};
        Student student = new Student("Jane", "Smith", 987654, scores);

        char expectedGrade = 'E';
        char actualGrade = student.calculate();

        Assert.assertEquals(expectedGrade, actualGrade);
    }

    @Test
    public void testCalculateGrade_T() {
        int[] scores = {50, 55, 47, 60, 58};
        Student student = new Student("Bob", "Johnson", 567890, scores);

        char expectedGrade = 'D';
        char actualGrade = student.calculate();

        Assert.assertEquals(expectedGrade, actualGrade);
    }
}
