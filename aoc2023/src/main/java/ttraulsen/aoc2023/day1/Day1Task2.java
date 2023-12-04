package ttraulsen.aoc2023.day1;

import java.util.List;

public class Day1Task2 extends Day1Task1 {
  public Day1Task2(List<String> i) {
    super(i);
  }

  @Override
  public Integer calibrateLine(String line) {
    String fixedLine = replaceLiterals(line);
    return super.calibrateLine(fixedLine);
  }

  private String replaceLiterals(String line) {
    String fixedLine = replaceLiteral(line, "oneight", "oneeight");
    fixedLine = replaceLiteral(fixedLine, "threeight", "threeeight");
    fixedLine = replaceLiteral(fixedLine, "fiveight", "fiveeeight");
    fixedLine = replaceLiteral(fixedLine, "nineight", "nineeight");
    fixedLine = replaceLiteral(fixedLine, "twone", "twoone");
    fixedLine = replaceLiteral(fixedLine, "eighthree", "eightthree");
    fixedLine = replaceLiteral(fixedLine, "eightwo", "eighttwo");

    fixedLine = replaceLiteral(fixedLine, "one", "1");
    fixedLine = replaceLiteral(fixedLine, "two", "2");
    fixedLine = replaceLiteral(fixedLine, "three", "3");
    fixedLine = replaceLiteral(fixedLine, "four", "4");
    fixedLine = replaceLiteral(fixedLine, "five", "5");
    fixedLine = replaceLiteral(fixedLine, "six", "6");
    fixedLine = replaceLiteral(fixedLine, "seven", "7");
    fixedLine = replaceLiteral(fixedLine, "nine", "9");
    fixedLine = replaceLiteral(fixedLine, "eight", "8");
    return fixedLine;
  }

  private String replaceLiteral(String line, String literal, String number) {
    return line.replaceAll(literal, number);
  }
}
