package kenny.thirtydays;

import kenny.thirtydays.Day8PhoneAFriend;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class Day8PhoneAFriendTest {

    @Test
    public void testPhoneBook() {
        String input = "3\nJohn 123\nJane 456\nAlice 789\nJohn\nJane\nBob\n";
        String expectedOutput = "John=123\r\nJane=456\r\nNot found\r\n";

        InputStream sysInBackup = System.in;
        PrintStream sysOutBackup = System.out;

        try {
            ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();

            System.setIn(inContent);
            System.setOut(new PrintStream(outContent));

            Day8PhoneAFriend.main(null);

            assertEquals(expectedOutput, outContent.toString());
        } finally {
            System.setIn(sysInBackup);
            System.setOut(sysOutBackup);
        }
    }
}
