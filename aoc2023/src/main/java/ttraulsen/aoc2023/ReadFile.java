package ttraulsen.aoc2023;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
  private ReadFile() {
  }

  public static List<String> readFile(String path) {
    List<String> lines = new ArrayList<>();
    String absolutePath = new File("").getAbsolutePath() + path;
    try (BufferedReader reader = new BufferedReader(new FileReader(absolutePath))) {
      String line;
      while ((line = reader.readLine()) != null) {
        lines.add(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lines;
  }
}
