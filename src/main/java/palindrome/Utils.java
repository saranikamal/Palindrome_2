package palindrome;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

public class Utils {

    private final long MAX = Long.MAX_VALUE;

    /**
     * Method to get a positive integer number from user
     * @return user input
     */
    public long getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Please enter a positive integer number: ");
            try {
                input = scanner.nextLine();
                if (NumberUtils.isDigits(input) && input.charAt(0) != '-'
                        && NumberUtils.isDigits(input) && Long.parseLong(input) < MAX)
                    break;
            } catch (NumberFormatException exception) {
                System.out.println("Number was too big for calculation, please try again.");
            }
        }
        return Long.parseLong(input);
    }

    /**
     * Method to calculate reverse of the input by specific mathematical calculations.
     * @param input
     * @return
     */
    public long reverseInput(long input) {
        long reversed = 0;
        while (input > 0) {
            long remainder = input % 10;
            reversed = reversed * 10 + remainder;
            input /= 10;
        }
        return reversed;
    }

    /**
     * Method to calculate th accumulation of two numbers. This method throws an exception
     * if the accumulation of the two numbers, overflows long data type maximum value
     * @param input
     * @param reversedInput
     * @return
     */
    public long accumulate(long input, long reversedInput) {
        try {
            long result = Math.addExact(input, reversedInput);
            return result;
        } catch (Exception exception) {
            throw exception;
        }
    }
}
