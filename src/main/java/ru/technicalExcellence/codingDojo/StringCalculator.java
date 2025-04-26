package ru.technicalExcellence.codingDojo;

public class StringCalculator {
    public Integer add(String value) {
        if (value == null) return 0;
        String[] numbers = value.split(",");
        var sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
