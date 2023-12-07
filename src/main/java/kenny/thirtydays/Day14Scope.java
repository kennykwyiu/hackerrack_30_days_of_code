package kenny.thirtydays;

import java.util.Arrays;
import java.util.Scanner;

public class Day14Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        this.elements = a;
    }

    public void computeDifference() {
        if (elements.length == 0) {
            return;
        }

        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
            int difference = Math.abs(elements[i] - elements[j]);
                if (difference > maximumDifference) {
                    maximumDifference = difference;
                }
            }
        }
    }

    public void computeDifferenceWithSort() {
        if (elements.length == 0) {
            return;
        }

        Arrays.sort(elements);
        maximumDifference = elements[elements.length - 1] - elements[0];
    }

    // Add your code here

} // End of Difference class
