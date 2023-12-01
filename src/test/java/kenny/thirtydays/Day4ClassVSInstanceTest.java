package kenny.thirtydays;

import kenny.thirtydays.Day4ClassVSInstance;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Day4ClassVSInstanceTest {
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        // Redirect System.out to capture the console output
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        originalOut = System.out;
        System.setOut(printStream);
    }

    @Test
    public void testPersonClassWithAgeEqualToEighteen() {
        // Create a Person object with an initial age of 18
        Day4ClassVSInstance.Person person = new Day4ClassVSInstance.Person(18);

        // Call the amIOld() method
        person.amIOld();

        // Get the captured output as a string
        String consoleOutput = getConsoleOutput();

        // Assert the expected output
        Assert.assertEquals("You are old.", consoleOutput);
    }

    @Test
    public void testPersonClassWithAgeLessThanThirteen() {
        // Create a Person object with an initial age of 10
        Day4ClassVSInstance.Person person = new Day4ClassVSInstance.Person(10);

        // Call the amIOld() method
        person.amIOld();

        // Get the captured output as a string
        String consoleOutput = getConsoleOutput();

        // Assert the expected output
        Assert.assertEquals("You are young.", consoleOutput);
    }

    @Test
    public void testPersonClassWithAgeBetweenThirteenAndSeventeen() {
        // Create a Person object with an initial age of 15
        Day4ClassVSInstance.Person person = new Day4ClassVSInstance.Person(15);

        // Call the amIOld() method
        person.amIOld();

        // Get the captured output as a string
        String consoleOutput = getConsoleOutput();

        // Assert the expected output
        Assert.assertEquals("You are a teenager.", consoleOutput);
    }

    @Test
    public void testPersonClassWithNegativeAge() {
        // Create a Person object with a negative initial age (-5)
        Day4ClassVSInstance.Person person = new Day4ClassVSInstance.Person(-5);

        // Call the amIOld() method
        person.amIOld();

        // Get the captured output as a string
        String consoleOutput = getConsoleOutput();

        // Assert the expected output
        Assert.assertEquals("Age is not valid, setting age to 0.\nYou are young.", consoleOutput);
    }

    // Helper method to retrieve console output
    private String getConsoleOutput() {
        // Flush the output stream and reset System.out
        System.out.flush();
        System.setOut(originalOut);

        // Get the captured output as a string
        return outputStream.toString().trim();
    }
}