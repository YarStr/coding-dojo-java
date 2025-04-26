package ru.technicalExcellence.codingDojo;

public class StringCalculator {
    public Integer add(String value) {
        return value == null ? 0 : Integer.parseInt(value);
    }
}
