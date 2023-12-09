package kenny.thirtydays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Day15LinkedListTest {

    @Test
    public void testInsertAndDisplay() {
        // Create a linked list with nodes: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Insert a new node with data 5
        head = Day15LinkedList.insert(head, 5);

        // Expected output: 1 2 3 4 5
        String expectedOutput = "1 2 3 4 5";

        // Redirect System.out to capture the printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the display method
        Day15LinkedList.display(head);

        // Restore System.out
        System.setOut(System.out);

        // Get the actual printed output
        String actualOutput = outputStream.toString().trim();

        // Assert the expected and actual output match
        assertEquals(expectedOutput, actualOutput);
    }
}
