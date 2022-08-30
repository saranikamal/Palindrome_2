import palindrome.FindPalindrome;
import palindrome.Utils;

/**
 * Palindrome_2 project is developed mostly with developed utilising arithmetic
 * and mathematical solutions.
 */
public class Main {

    public static void main(String[] args) {

        FindPalindrome findPalindrome = new FindPalindrome();
        Utils utils = new Utils();
        findPalindrome.countCalculations(utils.getUserInput());
    }
}
