package kenny.thirtydays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day10BinaryNumbersTest {

    @Test
    public void testMaxConsecutiveOnes() {
        assertEquals(3, Day10BinaryNumbers.maxConsecutiveOnes(439));
        assertEquals(2, Day10BinaryNumbers.maxConsecutiveOnes(101));
        assertEquals(1, Day10BinaryNumbers.maxConsecutiveOnes(2));
        assertEquals(0, Day10BinaryNumbers.maxConsecutiveOnes(0));
        assertEquals(5, Day10BinaryNumbers.maxConsecutiveOnes(503));
    }
}
