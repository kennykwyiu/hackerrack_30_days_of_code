package kenny.thirtydays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Day112DArraysTest {
    @Test
    public void testCalculateHourglassSum() {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 1, 0, 0, 0, 0),
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 0, 2, 4, 4, 0),
                Arrays.asList(0, 0, 0, 2, 0, 0),
                Arrays.asList(0, 0, 1, 2, 4, 0)
        );

        int sum = Day112DArrays.calculateHourglassSum(arr, 0, 0);
        Assertions.assertEquals(7, sum);

        sum = Day112DArrays.calculateHourglassSum(arr, 1, 1);
        Assertions.assertEquals(8, sum);

        sum = Day112DArrays.calculateHourglassSum(arr, 2, 2);
        Assertions.assertEquals(7, sum);
    }
}