package kenny.thirtydays;

import org.junit.Assert;
import org.junit.Test;

public class Day19InterfacesTest {

    @Test
    public void testDivisorSum() {
        AdvancedArithmetic calculator = new Day19Calculator();
        int n = 10;
        int expectedSum = 18;
        int actualSum = calculator.divisorSum(n);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testDivisorSumWithZero() {
        AdvancedArithmetic calculator = new Day19Calculator();
        int n = 0;
        int expectedSum = 0;
        int actualSum = calculator.divisorSum(n);
        Assert.assertEquals(expectedSum, actualSum);
    }
}
