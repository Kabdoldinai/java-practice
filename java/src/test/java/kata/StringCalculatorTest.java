package kata;

import org.cases.kata.StringCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    void onSetUp() {
        stringCalculator = new StringCalculator();
    }

    @ParameterizedTest
    @CsvSource({
            "'', 0",
            "'1', 1",
            "'2', 2"
    })
    void shouldReturnZeroOrParsedNums(String input, int expected) {
        assertEquals(expected, stringCalculator.add(input));
    }

    @Test
    void shouldReturnSumOfTwoNumbers() {
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    void shouldReturnSumWhenGivenUnknownAmountOfNums() {
        assertEquals(10, stringCalculator.add("1,1,1,1,1,1,1,1,1,1,"));
    }

    @Test
    void shouldIgnoreDelimeters() {
        assertEquals(6, stringCalculator.add("//[**][%%]\\n1**2%%3"));
    }

}
