package ttraulsen.aoc2023.day1;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day1Task1 extends ttraulsen.aoc2023.Task {
    public Day1Task1(List<String> i) {
        super(i);
    }

    public int computeCalibrationValue() {
        if (input == null) {
            return 0;
        }
        int sum = 0;
        for (String line : input) {
            sum += calibrateLine(line);
        }
        return sum;
    }

    public Integer calibrateLine(String line) {
        Matcher firstDigit = Pattern.compile("\\d").matcher(line);
        Matcher lastDigit = Pattern.compile("\\d").matcher(new StringBuilder(line).reverse().toString());
        if (!firstDigit.find()) {
            return 0;
        }
        lastDigit.find();
        String first = firstDigit.group();
        String last = lastDigit.group();
        return Integer.valueOf(first + last);
    }

    @Override
    public int calculateTask() {
        return this.computeCalibrationValue();
    }
}
