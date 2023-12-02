package kenny.thirtydays;

import org.junit.Test;
import static org.junit.Assert.*;

public class Day9Recursion3Test {

    @Test
    public void testFactorialWithZero() {
        // Test case: factorial of 0 is 1
        int result = Day9Recursion3.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialWithOne() {
        // Test case: factorial of 1 is 1
        int result = Day9Recursion3.factorial(1);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialWithPositiveNumber() {
        // Test case: factorial of 5 is 120
        int result = Day9Recursion3.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialWithLargeNumber() {
        // Test case: factorial of 10 is 3628800
        int result = Day9Recursion3.factorial(10);
        assertEquals(3628800, result);
    }
}
