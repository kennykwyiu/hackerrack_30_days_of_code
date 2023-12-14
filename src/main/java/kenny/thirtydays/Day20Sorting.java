package kenny.thirtydays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day20Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        sort(a);

        bufferedReader.close();
    }

    public static void sort(List<Integer> a) {
        int numberOfSwaps = 0;
        // Write your code here
        for (int i = 0; i < a.size(); i++) {
            // Track number of elements swapped during a single array traversal

            for (int j = 0; j < a.size() - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    swap(a, j, j + 1);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                printOutResult(numberOfSwaps, a);
                break;
            }
            if (i == a.size() -1) {
                printOutResult(numberOfSwaps, a);

            }
        }
    }

    private static void printOutResult(int numberOfSwaps, List<Integer> a) {
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));
    }

    private static void swap(List<Integer> a, int biggerIndex, int smallerIndex) {
        int temp = a.get(biggerIndex);
        a.set(biggerIndex, a.get(smallerIndex));
        a.set(smallerIndex, temp);
    }
}
