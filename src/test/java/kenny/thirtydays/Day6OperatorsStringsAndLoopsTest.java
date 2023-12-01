package kenny.thirtydays;
import kenny.thirtydays.Day6OperatorsStringsAndLoops;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Day6OperatorsStringsAndLoopsTest {

    @Test
    public void testPrintEvenAndOddCharacters() {
        // Prepare test input
        String input = "3\nHacker\nRank\nDay";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect System.out to capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Execute the code under test
        Day6OperatorsStringsAndLoops.printEvenAndOddCharacters();

        // Restore original System.out
        System.out.flush();
        System.setOut(originalOut);

        // Get the captured output as a string
        String consoleOutput = outputStream.toString().trim();

        // Define the expected output
        String expectedOutput = "Hce akr\nRn ak\nDy a";

        // Assert the expected output matches the console output
        Assert.assertEquals(expectedOutput, consoleOutput);
    }
}