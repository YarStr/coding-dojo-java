package ru.technicalExcellence.codingDojo;

import java.util.Map;

public class RomanNumbers {
    private static Map<Integer, String> romanArabicaDictonary = Map.of(1, "I", 5, "V");

    public String get(int number) {
        return romanArabicaDictonary.get(number);
    }
}
