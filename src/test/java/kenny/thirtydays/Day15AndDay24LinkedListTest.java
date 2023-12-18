package kenny.thirtydays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Day15AndDay24LinkedListTest {
    @Test
    public void testRemoveDuplicatesWithEmptyList() {
        // Test case: Empty list
        Node head = null;
        Node result = Day15AndDay24LinkedList.removeDuplicates(head);
        Assert.assertNull(result);
    }

    @Test
    public void testRemoveDuplicatesWithSingleNode() {
        // Test case: Single node
        Node head = new Node(1);
        Node result = Day15AndDay24LinkedList.removeDuplicates(head);
        Assert.assertEquals(head, result);
    }

    @Test
    public void testRemoveDuplicatesWithoutDuplicates() {
        // Test case: No duplicates
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Node result = Day15AndDay24LinkedList.removeDuplicates(head);
        Assert.assertEquals(head, result);
    }

    @Test
    public void testRemoveDuplicatesWithDuplicatesAtBeginning() {
        // Test case: Duplicates at the beginning
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        Node result = Day15AndDay24LinkedList.removeDuplicates(head);
        Assert.assertEquals(1, result.data);
        Assert.assertEquals(2, result.next.data);
        Assert.assertEquals(3, result.next.next.data);
        Assert.assertNull(result.next.next.next);
    }

    @Test
    public void testRemoveDuplicatesWithDuplicatesInMiddle() {
        // Test case: Duplicates in the middle
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        Node result = Day15AndDay24LinkedList.removeDuplicates(head);
        Assert.assertEquals(1, result.data);
        Assert.assertEquals(2, result.next.data);
        Assert.assertEquals(3, result.next.next.data);
        Assert.assertNull(result.next.next.next);
    }

    @Test
    public void testRemoveDuplicatesWithDuplicatesAtEnd() {
        // Test case: Duplicates at the end
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        Node result = Day15AndDay24LinkedList.removeDuplicates(head);
        Assert.assertEquals(1, result.data);
        Assert.assertEquals(2, result.next.data);
        Assert.assertEquals(3, result.next.next.data);
        Assert.assertNull(result.next.next.next);
    }
    @Test
    public void testInsertAndDisplay() {
        // Create a linked list with nodes: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Insert a new node with data 5
        head = Day15AndDay24LinkedList.insert(head, 5);

        // Expected output: 1 2 3 4 5
        String expectedOutput = "1 2 3 4 5";

        // Redirect System.out to capture the printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the display method
        Day15AndDay24LinkedList.display(head);

        // Restore System.out
        System.setOut(System.out);

        // Get the actual printed output
        String actualOutput = outputStream.toString().trim();

        // Assert the expected and actual output match
        assertEquals(expectedOutput, actualOutput);
    }
}
