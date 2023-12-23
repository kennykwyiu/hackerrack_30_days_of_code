package kenny.thirtydays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day29BitwiseANDTest {
    @Test
    public void testFindMaxBitwiseAnd() {
        // Test case 1
        int result1 = Day29BitwiseAND.findMaxBitwiseAnd(5, 2);
        Assertions.assertEquals(1, result1);

        // Test case 2
        int result2 = Day29BitwiseAND.findMaxBitwiseAnd(8, 5);
        Assertions.assertEquals(4, result2);

        // Test case 3
        int result3 = Day29BitwiseAND.findMaxBitwiseAnd(2, 2);
        Assertions.assertEquals(0, result3);

        // Add more test cases as needed
    }
}
