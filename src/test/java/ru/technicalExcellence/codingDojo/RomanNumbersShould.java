package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TODO 4 -> IV
 * TODO 6 -> VI
 * TODO 7 -> VII
 * TODO 8 -> VIII
 * TODO 9 -> IX
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

    @Test
    void return_III_then_3_is_given(){
        assertEquals("III", sut.get(3));
    }

    @Test
    void return_IV_then_4_is_given(){
        assertEquals("IV", sut.get(4));
    }
}
