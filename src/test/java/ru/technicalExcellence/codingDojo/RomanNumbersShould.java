package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TODO 10 -> X
 * TODO 100 -> C
 * TODO 500 -> D
 * TODO 1000 -> M
 * TODO 2 -> II
 * TODO 3 -> III
 */
public class RomanNumbersShould {
    @Test
    void return_I_when_1_is_given() {
        assertEquals("I", new RomanNumbers().get(1));
    }

    @Test
    void return_V_when_5_is_given() {
        assertEquals("V", new RomanNumbers().get(5));
    }

    @Test
    void return_X_when_10_is_given() {
        assertEquals("X", new RomanNumbers().get(10));
    }
}
