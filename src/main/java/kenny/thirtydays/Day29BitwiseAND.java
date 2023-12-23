package kenny.thirtydays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Day29BitwiseAND {
    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int findMaxBitwiseAnd(int N, int K) {
        // Write your code here
        int maxValue = 0;
        for (int a = 0; a <= N; a++) {
            for (int b = a + 1; b <= N; b++) {
                int bitwiseAnd = a & b;
                if (bitwiseAnd < K && bitwiseAnd > maxValue) {
                    maxValue = bitwiseAnd;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Day29BitwiseAND.findMaxBitwiseAnd(count, lim);

                System.out.println(res);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
