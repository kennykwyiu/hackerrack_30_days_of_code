package kenny.thirtydays;

import org.junit.Test;
import static org.junit.Assert.*;

public class Day22BinarySearchTreesTest {

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
        int actualHeight = Day22BinarySearchTrees.getHeight(root);
        assertEquals(expectedHeight, actualHeight);
    }

    @Test
    public void testInsert() {
        TreeNode root = null;

        // Insert values 5, 3, 7, 2, 4, 6, 8 into the binary search tree
        root = Day22BinarySearchTrees.insert(root, 5);
        root = Day22BinarySearchTrees.insert(root, 3);
        root = Day22BinarySearchTrees.insert(root, 7);
        root = Day22BinarySearchTrees.insert(root, 2);
        root = Day22BinarySearchTrees.insert(root, 4);
        root = Day22BinarySearchTrees.insert(root, 6);
        root = Day22BinarySearchTrees.insert(root, 8);

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
