package kenny;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Day2OperatorsTest {

    @Test
    public void testSolveWithSampleValues() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the solve method with sample input values
        Day2Operators.solve(12.00, 20, 8);

        // Get the actual output
        String actualOutput = outputStream.toString().trim();

        // Assert the expected output with the actual output
        assertEquals("15", actualOutput);
    }

    @Test
    public void testSolveWithDifferentValues() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Test case 2: meal_cost = 15.50, tip_percent = 15, tax_percent = 10
        Day2Operators.solve(15.50, 15, 10);
        String actualOutput = outputStream.toString().trim();
        assertEquals("19", actualOutput);
    }

    @Test
    public void testSolveWithZeroTipPercent() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Test case 3: meal_cost = 10.25, tip_percent = 0, tax_percent = 5
        Day2Operators.solve(10.25, 0, 5);
        String actualOutput = outputStream.toString().trim();
        assertEquals("11", actualOutput);
    }

    @Test
    public void testSolveWithZeroTaxPercent() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Test case 4: meal_cost = 20.00, tip_percent = 25, tax_percent = 0
        Day2Operators.solve(20.00, 25, 0);
        String actualOutput = outputStream.toString().trim();
        assertEquals("25", actualOutput);
    }
}