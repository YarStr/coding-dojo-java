package ru.technicalExcellence.codingDojo;

import java.util.Map;

public class RomanNumbers {
    private static final Map<Integer, String> romanArabicaDictonary = Map.of(
            1, "I",
            5, "V",
            10, "X"
    );

    public String get(int number) {
        return romanArabicaDictonary.get(number);
    }
}
