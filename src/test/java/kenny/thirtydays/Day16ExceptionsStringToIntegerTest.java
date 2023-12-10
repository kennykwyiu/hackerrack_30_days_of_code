package kenny.thirtydays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class Day16ExceptionsStringToIntegerTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @Test
    public void testValidInput() throws IOException {
        String input = "42";
        provideInput(input);

        Day16ExceptionsStringToInteger.main(new String[]{});

        String expectedOutput = "42";
        assertEquals(expectedOutput, getOutput());
    }

    @Test
    public void testInvalidInput() throws IOException {
        String input = "abc";
        provideInput(input);

        Day16ExceptionsStringToInteger.main(new String[]{});

        String expectedOutput = "Bad String";
        assertEquals(expectedOutput, getOutput());
    }
}
