package kenny.thirtydays;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MyBookTest {

    @Test
    public void testDisplay() {
        String title = "The Great Gatsby";
        String author = "F. Scott Fitzgerald";
        int price = 10;

        MyBook book = new MyBook(title, author, price);

        // Create a mock System.out object
        PrintStream mockPrintStream = mock(PrintStream.class);
        System.setOut(mockPrintStream);

        // Call the display() method
        book.display();

        // Verify that the expected output was printed
        verify(mockPrintStream).println("Title: " + title);
        verify(mockPrintStream).println("Author: " + author);
        verify(mockPrintStream).println("Price: " + price);

        // Reset the System.out object
        System.setOut(null);
    }
}
