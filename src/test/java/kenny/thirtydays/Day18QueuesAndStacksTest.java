package kenny.thirtydays;
import org.junit.Assert;
import org.junit.Test;

public class Day18QueuesAndStacksTest {

    @Test
    public void testPalindrome() {
        String input = "racecar";
        boolean expected = true;
        boolean result = isPalindrome(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNonPalindrome() {
        String input = "hello";
        boolean expected = false;
        boolean result = isPalindrome(input);
        Assert.assertEquals(expected, result);
    }

    private boolean isPalindrome(String input) {
        char[] s = input.toCharArray();
        Solution p = new Solution();
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}