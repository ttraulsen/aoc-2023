package ttraulsen.aoc2023.day3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Tests {
    private List<String> getTestInput() {
        List<String> ret = new ArrayList<>();
        ret.add("467..114..");
        ret.add("...*......");
        ret.add("..35..633.");
        ret.add("......#...");
        ret.add("617*......");
        ret.add(".....+.58.");
        ret.add("..592.....");
        ret.add("......755.");
        ret.add("...$.*....");
        ret.add(".664.598..");
        return ret;
    }

    @Test
    @DisplayName("testinput should result in a sum of 4361")
    void testInput() {
        assertEquals(4361, (new Day3Task1(getTestInput())).calculateTask());
    }
}
