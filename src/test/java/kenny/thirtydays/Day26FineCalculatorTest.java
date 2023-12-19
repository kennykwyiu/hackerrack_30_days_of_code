package kenny.thirtydays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day26FineCalculatorTest {

    @Test
    public void testCalculateFine_ReturnsZero_WhenReturnedDateIsBeforeExpectedDate() {
        int returnedDay = 10;
        int returnedMonth = 9;
        int returnedYear = 2023;
        int expectedDay = 15;
        int expectedMonth = 9;
        int expectedYear = 2023;

        int fine = Day26FineCalculator.calculateFine(returnedDay, returnedMonth, returnedYear, expectedDay, expectedMonth, expectedYear);

        assertEquals(0, fine);
    }

    @Test
    public void testCalculateFine_ReturnsYearFine_WhenReturnedYearIsAfterExpectedYear() {
        int returnedDay = 1;
        int returnedMonth = 1;
        int returnedYear = 2024;
        int expectedDay = 1;
        int expectedMonth = 1;
        int expectedYear = 2023;

        int fine = Day26FineCalculator.calculateFine(returnedDay, returnedMonth, returnedYear, expectedDay, expectedMonth, expectedYear);

        assertEquals(10000, fine);
    }

    @Test
    public void testCalculateFine_ReturnsMonthFine_WhenReturnedMonthIsAfterExpectedMonth() {
        int returnedDay = 10;
        int returnedMonth = 12;
        int returnedYear = 2023;
        int expectedDay = 10;
        int expectedMonth = 11;
        int expectedYear = 2023;

        int fine = Day26FineCalculator.calculateFine(returnedDay, returnedMonth, returnedYear, expectedDay, expectedMonth, expectedYear);

        assertEquals(500, fine);
    }

    @Test
    public void testCalculateFine_ReturnsDayFine_WhenReturnedDayIsAfterExpectedDay() {
        int returnedDay = 20;
        int returnedMonth = 12;
        int returnedYear = 2023;
        int expectedDay = 10;
        int expectedMonth = 12;
        int expectedYear = 2023;

        int fine = Day26FineCalculator.calculateFine(returnedDay, returnedMonth, returnedYear, expectedDay, expectedMonth, expectedYear);

        assertEquals(150, fine);
    }
}
