package kenny.thirtydays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class Day25RunningTimeAndComplexityTest {
    private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testDetectPrimeNumber() {
        testPrimeNumber(7, "Prime"); // Normal case: prime number
        testPrimeNumber(10, "Not prime"); // Normal case: not a prime number
        testPrimeNumber(2, "Prime"); // Corner case: smallest prime number
        testPrimeNumber(-5, "Not prime"); // Corner case: negative number
        testPrimeNumber(997, "Prime"); // Corner case: large prime number
        testPrimeNumber(1000, "Not prime"); // Corner case: large non-prime number
    }

    private void testPrimeNumber(int inputNumber, String expectedOutput) {
        Day25RunningTimeAndComplexity.detectPrimeNumber(inputNumber);
        assertEquals(expectedOutput, outputContent.toString().trim());
        outputContent.reset();
    }
}
