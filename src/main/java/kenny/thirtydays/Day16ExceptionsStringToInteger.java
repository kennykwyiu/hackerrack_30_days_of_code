package kenny.thirtydays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16ExceptionsStringToInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String S = bufferedReader.readLine();
            System.out.print(Integer.parseInt(S));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            System.out.print("Bad String");
        }

        bufferedReader.close();
    }
}
