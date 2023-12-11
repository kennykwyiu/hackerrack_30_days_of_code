package kenny.thirtydays;

import java.util.Scanner;

public class Day17MoreExceptions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

class Calculator {

    int power(int n, int p) throws Exception {
        double result = 0;
        if (n < 0 || p < 0) {
            example();
        }

        try {
            result = Math.pow(n, p);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return (int) result;
    }

    void example() throws Exception {
        throw new Exception("n and p should be non-negative");
    }
}