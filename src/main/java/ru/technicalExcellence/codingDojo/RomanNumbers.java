package ru.technicalExcellence.codingDojo;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    private static final Map<Integer, String> romanArabicDictionary = new HashMap<>();

    static {
        romanArabicDictionary.put(1, "I");
        romanArabicDictionary.put(4, "IV");
        romanArabicDictionary.put(5, "V");
        romanArabicDictionary.put(10, "X");
        romanArabicDictionary.put(50, "L");
        romanArabicDictionary.put(100, "C");
        romanArabicDictionary.put(500, "D");
        romanArabicDictionary.put(1000, "M");
        romanArabicDictionary.put(6, "VI");
        romanArabicDictionary.put(7, "VII");
        romanArabicDictionary.put(8, "VIII");
        romanArabicDictionary.put(9, "IX");
    }



    public String get(int number) {
        return number >= 1 && number < 4
                ? romanArabicDictionary.get(1).repeat(number)
                : romanArabicDictionary.get(number);
    }
}
