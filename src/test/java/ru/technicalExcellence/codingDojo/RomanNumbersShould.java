package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TODO 100 -> C
 * TODO 500 -> D
 * TODO 1000 -> M
 * TODO 2 -> II
 * TODO 3 -> III
 */
public class RomanNumbersShould {
    private RomanNumbers sut;

    @BeforeEach
    void setUp() {
        sut = new RomanNumbers();
    }

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "5, V",
            "10, X",
            "50, L",
            "100, C",
            "500, D",
            "1000, M"
    })
    void return_roman_when_arabic_numbers_is_given(Integer input, String expected) {
        assertEquals(expected, sut.get(input));

    }

    @Test
    void return_II_then_2_is_given(){
        assertEquals("II", sut.get(2));
    }
}
