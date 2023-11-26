package kenny;
import org.junit.Test;
import static org.junit.Assert.*;

public class Day3IntroToConditionalStatementsTest {

    @Test
    public void testOddNumber() {
        assertEquals("Weird", Day3IntroToConditionalStatements.checkNumber(3));
    }

    @Test
    public void testEvenNumberNotInRange() {
        assertEquals("Not Weird", Day3IntroToConditionalStatements.checkNumber(4));
    }

    @Test
    public void testEvenNumberInRange() {
        assertEquals("Weird", Day3IntroToConditionalStatements.checkNumber(10));
    }

    @Test
    public void testMinimumValue() {
        assertEquals("Weird", Day3IntroToConditionalStatements.checkNumber(1));
    }

    @Test
    public void testMaximumValue() {
        assertEquals("Not Weird", Day3IntroToConditionalStatements.checkNumber(100));
    }

    @Test
    public void testLargeEvenNumberOutsideRange() {
        assertEquals("Not Weird", Day3IntroToConditionalStatements.checkNumber(50));
    }
}