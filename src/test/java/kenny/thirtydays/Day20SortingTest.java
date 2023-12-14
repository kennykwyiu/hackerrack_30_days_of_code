package kenny.thirtydays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Day20SortingTest {
    @Test
    public void testSorting() {
        List<Integer> input = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> expectedOutput = Arrays.asList(1, 2, 3, 4, 5);

        Day20Sorting.sort(input);

        Assertions.assertEquals(expectedOutput, input);
    }
}
