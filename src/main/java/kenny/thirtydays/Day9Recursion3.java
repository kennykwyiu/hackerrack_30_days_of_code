package kenny.thirtydays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day9Recursion3 {

    /**
     * Complete the 'factorial' function below.
     * <p>
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        // Write your code here
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * factorial(n - 1);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = factorial(n);

        System.out.println(result);

        bufferedReader.close();
    }
}
