package kenny.thirtydays;

import java.util.Scanner;

public class Day25RunningTimeAndComplexity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int inputNumber = in.nextInt();
            // Write code here
            detectPrimeNumber(inputNumber);
        }
    }

    public static void detectPrimeNumber(int inputNumber) {
        if (inputNumber < 2) {
            System.out.println("Not prime");
            return;
        }

        for (int i = 2; i < Math.sqrt(inputNumber); i++) {
            if (inputNumber % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
