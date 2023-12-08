package kenny.thirtydays;
import org.junit.Test;
import static org.junit.Assert.*;

public class Day14ScopeTest {

    @Test
    public void testComputeDifference() {
        int[] a = {1, 2, 5};
        Difference difference = new Difference(a);
        difference.computeDifference();
        assertEquals(4, difference.maximumDifference);
    }

    @Test
    public void testComputeDifferenceEmptyArray() {
        int[] a = {};
        Difference difference = new Difference(a);
        difference.computeDifference();
        assertEquals(0, difference.maximumDifference);
    }

    @Test
    public void testComputeDifferenceNegativeNumbers() {
        int[] a = {-2, -5, -1, -8};
        Difference difference = new Difference(a);
        difference.computeDifference();
        assertEquals(7, difference.maximumDifference);
    }
    @Test
    public void testComputeDifferenceWithSorted() {
        int[] a = {1, 2, 5};
        Difference difference = new Difference(a);
        difference.computeDifferenceWithSort();
        assertEquals(4, difference.maximumDifference);
    }

    @Test
    public void testComputeDifferenceEmptyArrayWithSorted() {
        int[] a = {};
        Difference difference = new Difference(a);
        difference.computeDifferenceWithSort();
        assertEquals(0, difference.maximumDifference);
    }

    @Test
    public void testComputeDifferenceNegativeNumbersWithSorted() {
        int[] a = {-2, -5, -1, -8};
        Difference difference = new Difference(a);
        difference.computeDifferenceWithSort();
        assertEquals(7, difference.maximumDifference);
    }
}
