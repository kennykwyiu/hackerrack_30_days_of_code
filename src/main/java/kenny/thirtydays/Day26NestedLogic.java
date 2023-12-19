package kenny.thirtydays;

import java.util.Scanner;

public class Day26NestedLogic {
    private static final int YEAR_FINE = 10000;
    private static final int MONTH_FINE = 500;
    private static final int DAY_FINE = 15;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int returnedDay = scanner.nextInt();
        int returnedMonth = scanner.nextInt();
        int returnedYear = scanner.nextInt();
        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();

        int fine = 0;
        if (returnedYear > expectedYear) {
            fine = YEAR_FINE;
        } else if (returnedYear == expectedYear) {
            if (returnedMonth > expectedMonth) {
                fine = MONTH_FINE * (returnedMonth - expectedMonth);
            } else if (returnedMonth == expectedMonth && returnedDay > expectedDay) {
                fine = DAY_FINE * (returnedDay - expectedDay);
            }
        }

        System.out.println(fine);
        scanner.close();
    }
}
