package kenny.thirtydays;

import java.util.Scanner;

public class Day6OperatorsStringsAndLoops {

    public static void printEvenAndOddCharacters() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < input; i++) {
            String word1 = scanner.nextLine();
            StringBuilder evenWord1 = new StringBuilder();
            StringBuilder oddWord1 = new StringBuilder();

            for (int j = 0; j < word1.length(); j++) {
                if (j % 2 == 0) {
                    evenWord1.append(word1.charAt(j));
                } else {
                    oddWord1.append(word1.charAt(j));
                }
            }
            System.out.println(evenWord1.toString() + " " + oddWord1.toString());
        }
        scanner.close();

    }

}
