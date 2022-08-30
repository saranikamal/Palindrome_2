package palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPalindromeTest {

    private FindPalindrome findPalindrome = new FindPalindrome();

    @Test
    void isPalindrome_test() {
        assertTrue(findPalindrome.isPalindrome(121));
        assertTrue(findPalindrome.isPalindrome(66666));
        assertFalse(findPalindrome.isPalindrome(465));
    }

    @Test
    void countNumberOfCalculations_hasPalindrome_test() {
        assertEquals(3, findPalindrome.countCalculations(95));
    }

    @Test
    void countNumberOfCalculations_doesNotHavePalindrome_test() {
        assertEquals(findPalindrome.countCalculations(196), 0);
        assertEquals(findPalindrome.countCalculations(295), 0);
        assertEquals(findPalindrome.countCalculations(790), 0);
    }
}