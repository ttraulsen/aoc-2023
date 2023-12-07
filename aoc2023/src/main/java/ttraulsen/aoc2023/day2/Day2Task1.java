package ttraulsen.aoc2023.day2;

import java.util.List;

public class Day2Task1 {
  private List<String> input;

  public void setInput(List<String> i) {
    this.input = i;
  }

  public Day2Task1(List<String> i) {
    this.setInput(i);
  }

  public boolean calculateGame(String game) {
    if (game.length() < 2)
      return false;
    String[] draws = game.split(";");
    for (String draw : draws) {
      if (!calculateDraw(draw))
        return false;
    }
    return true;
  }

  private boolean calculateDraw(String draw) {
    String[] balls = draw.trim().split(",");
    for (String ball : balls) {
      String[] s = ball.trim().split(" ");
      int number = Integer.parseInt(s[0]);
      switch (s[1]) {
        case "red":
          if (number > 12)
            return false;
          break;
        case "green":
          if (number > 13)
            return false;
          break;
        case "blue":
          if (number > 14)
            return false;
          break;
        default:
          return false;
      }
    }
    return true;
  }

  public int calculateGames() {
    int sum = 0;

    for (String line : input) {
      String[] split = line.split(":");
      if (split.length != 2)
        continue;
      if (this.calculateGame(split[1])) {
        String[] g = split[0].trim().split(" ");
        sum += Integer.parseInt(g[1]);
      }

    }
    return sum;
  }
}
