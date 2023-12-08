package ttraulsen.aoc2023;

import ttraulsen.aoc2023.day1.Day1Task1;
import ttraulsen.aoc2023.day1.Day1Task2;
import ttraulsen.aoc2023.day2.Day2Task1;
import ttraulsen.aoc2023.day2.Day2Task2;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Task d1t1 = new Day1Task1(ReadFile.readFile("/data/Day1/input-day1.txt"));
        System.out.println("Day1 task1: " + d1t1.calculateTask());
        Task d1t2 = new Day1Task2(ReadFile.readFile("/data/Day1/input-day1.txt"));
        System.out.println("Day1 task2: " + d1t2.calculateTask());
        Task d2t1 = new Day2Task1(ReadFile.readFile("/data/Day2/input-day2.txt"));
        System.out.println("Day2 task2: " + d2t1.calculateTask());
        Task d2t2 = new Day2Task2(ReadFile.readFile("/data/Day2/input-day2.txt"));
        System.out.println("Day2 task2: " + d2t2.calculateTask());
    }
}
