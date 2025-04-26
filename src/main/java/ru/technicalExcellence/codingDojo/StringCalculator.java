package ru.technicalExcellence.codingDojo;

public class StringCalculator {
    public Integer add(String value) {
        if (value == null) return 0;
        if (value.startsWith("//;\n")) {
            value = value.substring(4);
        }
        String[] numbers = value.split("[,|\n|;]");
        var sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
