package ttraulsen.aoc2023.day1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Task1Tests {
  @Test
  @DisplayName("day 1 task 1 computations")
  void testEmptyComputation() {
    Day1Task1 d1 = new Day1Task1(null);
    assertEquals(0, d1.computeCalibrationValue(), "uninitialized List should have 0 as calibration value");
  }

  @ParameterizedTest(name = "{0} should return {1}")
  @CsvSource({
      "aaa,         0",
      "a1a,         11",
      "a1b2,        12",
      "a1b2c3,      13",
      "1abc2,       12",
      "pqr3stu8vwx, 38",
      "a1b2c3d4e5f, 15",
      "treb7uchet,  77"
  })
  void testSingleLines(String line, int expectedResult) {
    assertEquals(expectedResult, (new Day1Task1(new ArrayList<String>())).calibrateLine(line),
        () -> line + " should result in " + expectedResult);
  }

  @Test
  @DisplayName("should add all calibration values")
  void testCalibrationValues() {
    List<String> lines = new ArrayList<String>();
    lines.add("1abc2");
    lines.add("pqr3stu8vwx");
    lines.add("a1b2c3d4e5f");
    lines.add("treb7uchet");
    Day1Task1 d1 = new Day1Task1(lines);
    assertEquals(142, d1.computeCalibrationValue(), "these lines should result in 142 as calibration values");
  }
}
