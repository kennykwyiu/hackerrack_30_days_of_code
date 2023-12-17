package kenny.thirtydays;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Day22BinarySearchTreesTest {

    @Test
    public void testLevelOrder() {
        // Create a binary search tree with the following values:
        //       4
        //      / \
        //     2   6
        //    / \   \
        //   1   3   7
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Redirect the standard output to capture the printed level order traversal
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalPrintStream = System.out;
        System.setOut(printStream);

        // Call the levelOrder method
        Day22AndDay23BinarySearchTrees.levelOrder(root);

        // Restore the original standard output
        System.out.flush();
        System.setOut(originalPrintStream);

        // Get the printed level order traversal
        String printedTraversal = outputStream.toString().trim();

        // Validate the printed level order traversal
        String expectedTraversal = "4 2 6 1 3 7";
        assertEquals(expectedTraversal, printedTraversal);
    }

    @Test
    public void testGetHeight() {
        // Create a binary search tree with the following values:
        //       4
        //      / \
        //     2   6
        //    / \   \
        //   1   3   7
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int expectedHeight = 2;  // The height of the tree is 2
        int actualHeight = Day22AndDay23BinarySearchTrees.getHeight(root);
        assertEquals(expectedHeight, actualHeight);
    }

    @Test
    public void testInsert() {
        TreeNode root = null;

        // Insert values 5, 3, 7, 2, 4, 6, 8 into the binary search tree
        root = Day22AndDay23BinarySearchTrees.insert(root, 5);
        root = Day22AndDay23BinarySearchTrees.insert(root, 3);
        root = Day22AndDay23BinarySearchTrees.insert(root, 7);
        root = Day22AndDay23BinarySearchTrees.insert(root, 2);
        root = Day22AndDay23BinarySearchTrees.insert(root, 4);
        root = Day22AndDay23BinarySearchTrees.insert(root, 6);
        root = Day22AndDay23BinarySearchTrees.insert(root, 8);

        // Validate the values and structure of the resulting tree
        assertEquals(5, root.data);
        assertEquals(3, root.left.data);
        assertEquals(2, root.left.left.data);
        assertEquals(4, root.left.right.data);
        assertEquals(7, root.right.data);
        assertEquals(6, root.right.left.data);
        assertEquals(8, root.right.right.data);
    }
}
