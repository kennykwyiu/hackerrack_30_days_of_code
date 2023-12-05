package kenny.thirtydays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day112DArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int maxSum = Integer.MIN_VALUE;

        // Iterate over the array and calculate the maximum hourglass sum
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = calculateHourglassSum(arr, i, j);
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);

        bufferedReader.close();
    }

    // Calculate the hourglass sum for a given starting position
    public static int calculateHourglassSum(List<List<Integer>> arr, int startRow, int startCol) {
        int sum = 0;
        for (int i = startRow; i <= startRow + 2; i++) {
            for (int j = startCol; j <= startCol + 2; j++) {
                if (i == startRow + 1 && (j == startCol || j == startCol + 2)) {
                    continue; // Skip the middle element of the hourglass
                }
                sum += arr.get(i).get(j);
            }
        }
        return sum;
    }
}
