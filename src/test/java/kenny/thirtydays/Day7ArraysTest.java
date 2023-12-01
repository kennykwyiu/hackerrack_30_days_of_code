package kenny.thirtydays;
import kenny.thirtydays.Day7Arrays;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Day7ArraysTest {

    @Test
    public void testReverseAndPrintOutArray() throws IOException {
        // Prepare test input
        int n = 5;
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        String input = n + "\n" + String.join(" ", arr.stream().map(Object::toString).collect(toList()));
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect System.out to capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Execute the code under test
        Day7Arrays.main(new String[]{});

        // Restore original System.out
        System.out.flush();
        System.setOut(originalOut);

        // Get the captured output as a string
        String consoleOutput = outputStream.toString().trim();

        // Define the expected output
        String expectedOutput = "5 4 3 2 1";

        // Assert the expected output matches the console output
        Assert.assertEquals(expectedOutput, consoleOutput);
    }

    @Test
    public void testReverseAndPrintOutArrayMethod() {
        // Prepare test input
        int n = 5;
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);

        // Redirect System.out to capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Execute the code under test
        Day7Arrays.reverseAndPrintOutArray(n, arr);

        // Restore original System.out
        System.out.flush();
        System.setOut(originalOut);

        // Get the captured output as a string
        String consoleOutput = outputStream.toString().trim();

        // Define the expected output
        String expectedOutput = "5 4 3 2 1";

        // Assert the expected output matches the console output
        Assert.assertEquals(expectedOutput, consoleOutput);
    }
}