package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {

    private StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void return_empty_when_null_is_given() {
        assertEquals(0, stringCalculator.add(null));
    }

    @ParameterizedTest
    @CsvSource({"0,0", "1,1"})
    void return_empty_when_empty_is_given(String input, Integer output) {
        assertEquals(output, stringCalculator.add(input));
    }

    @Test
    void return_3_when_1_and_2_is_given() {
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    void return_6_when_1_and_2_and_3_is_given_with_different_delimiters() {
        assertEquals(6, stringCalculator.add("1,2\n3"));
    }

    @Test
    void return_3_when_1_and_2_is_given_with_different_delimiters() {
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
}
