package palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilsTest {

    private Utils utils = new Utils();

    @Test
    void reverseInput_test() {
        long input1 = 121;
        long input2 = 480;
        assertEquals(utils.reverseInput(input1), 121);
        assertEquals(utils.reverseInput(input2), 84);
    }

    @Test
    void accumulate_test() {
        long input = 121;
        long reversedInput = utils.reverseInput(input);
        assertEquals(242, utils.accumulate(input, reversedInput));
    }
}