package kenny;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Question
 * Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
 * Input Format
 * The first line contains an integer, N (the size of our array).
 * The second line contains N space-separated integers describing array A's elements.
 * Output Format
 * Print the elements of array A in reverse order as a single line of space-separated numbers.
 * Sample Input
 * <p>
 * 4
 * 1 4 3 2
 * <p>
 * Constrains
 * 1 <= N <= 1000
 * 1 <= A[i] <= 10000, A[i] is the ith integer in the array
 * <p>
 * Sample Output
 * <p>
 * 2 3 4 1
 */
public class Day7Arrays {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] newArr = new String[n];

        for (int i = 0; i < arr.size(); i++) {
            newArr[i] = String.valueOf(arr.get(i));
        }

        for (int i = newArr.length -1; i >= 0; i--) {
            System.out.print(newArr[i]);
            System.out.print(" ");
        }

        bufferedReader.close();
    }

}
