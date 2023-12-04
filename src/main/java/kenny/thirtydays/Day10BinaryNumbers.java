package kenny.thirtydays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10BinaryNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int maxCount = 0;
        int currentCount = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
           n = n / 2;
        }
        System.out.println(maxCount);
        bufferedReader.close();
    }

    public static int maxConsecutiveOnes(int n) {
        int maxCount = 0;
        int currentCount = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
            n = n / 2;
        }
        return maxCount;
    }
}
