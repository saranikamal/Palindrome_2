package palindrome;

public class FindPalindrome {

    private Utils utils = new Utils();
    private long calculationNumber = 1;

    /**
     * A method to only check if any given input is palindrome or not.
     *
     * @param input
     * @return
     */
    public boolean isPalindrome(long input) {
        long reversedInput = utils.reverseInput(input);
        if (input == reversedInput)
            return true;
        else return false;
    }

    /**
     * Method to find the first Palindrome after reverse-addition
     * and the number of calculation(s) done to achieve the Palindrome.
     *
     * @param input
     * @return
     */
    public long countCalculations(long input) {
        long reversedInput = utils.reverseInput(input);
        long sum = utils.accumulate(input, reversedInput);
        while (!isPalindrome(sum)) {
            try {
                sum = utils.accumulate(sum, utils.reverseInput(sum));
                calculationNumber++;
            } catch (Exception exception) {
                System.out.println("Number does not have palindrome(is Lychrel), " +
                        "or it is too large for final palindrome calculation!");
                return 0;
            }
        }
        System.out.println("Number " + sum + " is palindrome, and it is achieved after " + calculationNumber
                + " calculation(s)");
        return calculationNumber;
    }
}
