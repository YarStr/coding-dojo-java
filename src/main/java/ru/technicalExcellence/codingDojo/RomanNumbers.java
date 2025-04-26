package ru.technicalExcellence.codingDojo;

import java.util.Map;

public class RomanNumbers {
    private static final Map<Integer, String> romanArabicaDictonary = Map.of(
            1, "I",
            5, "V",
            10, "X",
            50, "L",
            100, "C",
            500, "D",
            1000, "M"

    );

    public String get(int number) {
        if (number >=1 && number < 4) {
            return romanArabicaDictonary.get(1).repeat(number);
        }
        return romanArabicaDictonary.get(number);
    }
}
