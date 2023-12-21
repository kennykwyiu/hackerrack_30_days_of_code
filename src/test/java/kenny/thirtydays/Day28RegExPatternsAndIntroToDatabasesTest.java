package kenny.thirtydays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day28RegExPatternsAndIntroToDatabasesTest {

    @Test
    public void testMain() throws IOException {
        String input = "6\n" +
                "riya riya@gmail.com\n" +
                "julia julia@julia.me\n" +
                "julia sjulia@gmail.com\n" +
                "julia julia@gmail.com\n" +
                "samantha samantha@gmail.com\n" +
                "tanya tanya@gmail.com\n";
        String expectedOutput = "julia\n" +
                "julia\n" +
                "riya\n" +
                "samantha\n" +
                "tanya\n";

        InputStream sysInBackup = System.in;
        PrintStream sysOutBackup = System.out;

        try {
            ByteArrayInputStream inStream = new ByteArrayInputStream(input.getBytes());
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            System.setIn(inStream);
            System.setOut(new PrintStream(outStream));

            Day28RegExPatternsAndIntroToDatabases.main(null);

            String actualOutput = outStream.toString();
            List<String> expectedNames = Arrays.asList(expectedOutput.split("\n"));
            List<String> actualNames = Arrays.stream(actualOutput.split("\n"))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .collect(Collectors.toList());

            Assertions.assertEquals(expectedNames, actualNames);

        } finally {
            System.setIn(sysInBackup);
            System.setOut(sysOutBackup);
        }
    }
}
