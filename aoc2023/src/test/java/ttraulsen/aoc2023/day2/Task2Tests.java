package ttraulsen.aoc2023.day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2Tests {

    @ParameterizedTest
    @CsvSource(value = {"Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green|48",
            "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue|12",
            "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red|1560",
            "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red|630",
            "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green|36"}, delimiter = '|')
    void testSingleGames(String line, int expectedResult) {
        assertEquals(expectedResult, (new Day2Task2(new ArrayList<>())).calculateGame(line),
                () -> line + " should result in " + expectedResult);
    }

    @Test
    @DisplayName("empty line should return false")
    void testEmptyLine() {
        assertEquals(0, (new Day2Task2(null)).calculateGame(""));
    }

    @Test
    @DisplayName("should calculate all games")
    void testAllGames() {
        List<String> lines = new ArrayList<>();
        lines.add("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green");
        lines.add("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue");
        lines.add("Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red");
        lines.add("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red");
        lines.add("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green");
        Day2Task2 d2 = new Day2Task2(lines);
        assertEquals(2286, d2.calculateGames());
    }

}
