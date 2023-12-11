package kenny.thirtydays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testPower() throws Exception {
        Calculator calculator = new Calculator();

        // Test with positive values
        int result = calculator.power(2, 3);
        Assertions.assertEquals(8, result);

        // Test with zero values
        result = calculator.power(0, 0);
        Assertions.assertEquals(1, result);

        // Test with negative base value
        try {
            calculator.power(-2, 3);
            Assertions.fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            Assertions.assertEquals("n and p should be non-negative", e.getMessage());
        }

        // Test with negative exponent value
        try {
            calculator.power(2, -3);
            Assertions.fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            Assertions.assertEquals("n and p should be non-negative", e.getMessage());
        }
    }
}
