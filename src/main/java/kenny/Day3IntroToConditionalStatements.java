package kenny;

public class Day3IntroToConditionalStatements {
    public static String checkNumber(int N) {

        if (N % 2 == 1 || N >= 6 && N <= 20) {
            return "Weird";
        } else {
            return "Not Weird";
        }

//        if (N % 2 == 0 && (N < 5 || N > 20)) {
//            return "Not Weird";
//        } else {
//            return "Weird";
//        }
    }
}
