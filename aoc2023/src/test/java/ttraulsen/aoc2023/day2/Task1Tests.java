package ttraulsen.aoc2023.day2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Task1Tests {

  @ParameterizedTest
  @CsvSource(value = { "3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green|true",
      "1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue|true",
      "8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red|false",
      "1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red|false",
      "6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green|true" }, delimiter = '|')
  void testSingleGames(String line, boolean expectedResult) {
    assertEquals(expectedResult, (new Day2Task1(new ArrayList<String>())).calculateGame(line),
        () -> line + " should result in " + expectedResult);
  }

  @Test
  @DisplayName("empty line should return false")
  void testEmptyLine() {
    assertEquals(false, (new Day2Task1(null)).calculateGame(""));
  }

  @Test
  @DisplayName("should calculate all games")
  void testAllGames() {
    List<String> lines = new ArrayList<String>();
    lines.add("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green");
    lines.add("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue");
    lines.add("Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red");
    lines.add("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red");
    lines.add("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green");
    Day2Task1 d2 = new Day2Task1(lines);
    assertEquals(8, d2.calculateGames());
  }

}
