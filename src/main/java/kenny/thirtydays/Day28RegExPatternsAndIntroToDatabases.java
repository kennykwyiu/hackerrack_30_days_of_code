package kenny.thirtydays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Day28RegExPatternsAndIntroToDatabases {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> firstNames = new ArrayList<>();

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                if (emailID.contains("@gmail.com")) {
                    firstNames.add(firstName);
                }

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        Collections.sort(firstNames);
        StringBuilder output = new StringBuilder();
        for (String name : firstNames) {
            output.append(name).append("\n");
        }
        System.out.println(output.toString());

        bufferedReader.close();
    }
}
