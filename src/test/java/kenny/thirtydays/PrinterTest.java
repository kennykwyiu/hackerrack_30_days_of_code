package kenny.thirtydays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrinterTest {

    @Test
    public void testPrintArray() {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World"};

        Printer<Integer> intPrinter = new Printer<>();
        Printer<String> stringPrinter = new Printer<>();

        // Test printing Integer array
        Assertions.assertDoesNotThrow(() -> intPrinter.printArray(intArray));

        // Test printing String array
        Assertions.assertDoesNotThrow(() -> stringPrinter.printArray(stringArray));
    }
}
