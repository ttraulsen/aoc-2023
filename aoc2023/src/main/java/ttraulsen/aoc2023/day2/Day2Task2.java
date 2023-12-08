package ttraulsen.aoc2023.day2;

import ttraulsen.aoc2023.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Day2Task2 extends Task {
    public Day2Task2(List<String> i) {
        super(i);
    }

    public int calculateGame(String line) {
        int[] result = new int[3];
        if (line.isEmpty()) return 0;
        List<String> draws = extractDraws(line);
        for (String draw : draws) {
            int[] b = extractBalls(draw);
            IntStream.range(0, b.length).forEach(i -> result[i] = Math.max(result[i], b[i]));
        }
        return result[0] * result[1] * result[2];
    }

    private int[] extractBalls(String draw) {
        int[] ret = new int[3];
        String[] balls = draw.split(",");
        for (String b : balls) {
            String[] s = b.trim().split(" ");

            int number = Integer.parseInt(s[0]);
            switch (s[1]) {
                case "red":
                    ret[0] = number;
                    break;
                case "green":
                    ret[1] = number;
                    break;
                case "blue":
                    ret[2] = number;
                    break;
                default:
                    return new int[]{-1};
            }
        }
        return ret;
    }

    private List<String> extractDraws(String line) {
        List<String> ret = new ArrayList<>();
        String[] s = line.split(":");
        if (s.length != 2) return ret;
        String[] draws = s[1].trim().split(";");
        for (String draw : draws) {
            ret.add(draw.trim());
        }
        return ret;
    }

    public int calculateGames() {
        int sum = 0;
        for (String line : input) {
            sum += this.calculateGame(line);
        }
        return sum;
    }

    @Override
    public int calculateTask() {
        return this.calculateGames();
    }
}
