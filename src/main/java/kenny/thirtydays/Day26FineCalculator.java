package kenny.thirtydays;

import java.util.Scanner;

public class Day26FineCalculator {
    private static final int YEAR_FINE = 10000;
    private static final int MONTH_FINE = 500;
    private static final int DAY_FINE = 15;
    public static int calculateFine(int returnedDay, int returnedMonth, int returnedYear, int expectedDay, int expectedMonth, int expectedYear) {
        if (returnedYear > expectedYear) {
            return YEAR_FINE;
        } else if (returnedYear < expectedYear) {
            return 0;
        } else { // returnedYear == expectedYear
            if (returnedMonth > expectedMonth) {
                return MONTH_FINE * (returnedMonth - expectedMonth);
            } else if (returnedMonth < expectedMonth) {
                return 0;
            } else { // returnedMonth == expectedMonth
                if (returnedDay > expectedDay) {
                    return DAY_FINE * (returnedDay - expectedDay);
                } else {
                    return 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int returnedDay = scanner.nextInt();
        int returnedMonth = scanner.nextInt();
        int returnedYear = scanner.nextInt();
        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();

        int fine = calculateFine(returnedDay, returnedMonth, returnedYear, expectedDay, expectedMonth, expectedYear);

        System.out.println(fine);
        scanner.close();
    }
}
