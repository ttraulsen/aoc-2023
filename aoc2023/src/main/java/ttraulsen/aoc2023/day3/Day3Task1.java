package ttraulsen.aoc2023.day3;

import ttraulsen.aoc2023.Task;

import java.util.List;

public class Day3Task1 extends Task {
    private char[][] engineSchematic;

    public Day3Task1(List<String> i) {
        super(i);
        readEngineSchematic();
    }

    private void readEngineSchematic() {
        engineSchematic = new char[input.size()][];
        int i = 0;
        for (String line : input) {
            engineSchematic[i] = line.toCharArray();
            i++;
        }
    }

    private int scanForPartNumbers() {
        int sum = 0;
        for (int i = 0; i < engineSchematic[0].length; i++) {
            int j = 0;
            while (j < engineSchematic.length) {
                if (Character.isDigit(engineSchematic[i][j])) {
                    String number = readNumber(i, j);
                    if (isPartNumber(i, j, number)) {
                        sum += Integer.parseInt(number);
                    }
                    //noinspection ReassignedVariable
                    j += number.length() - 1;
                }
                j++;
            }
        }
        return sum;
    }

    private boolean isPartNumber(int i, int j, String number) {
        for (int k = j; k < j + number.length(); k++) {
            if (marksPartNumber(i, k)) {
                return true;
            }
        }
        return false;
    }

    private boolean marksPartNumber(int x, int y) {
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (x == i && y == j) continue;
                if (isPartMarker(i, j)) return true;
            }
        }
        return false;
    }

    private boolean isPartMarker(int x, int y) {
        if (x < 0 || x >= engineSchematic.length) return false;
        if (y < 0 || y >= engineSchematic[x].length) return false;
        if (Character.isDigit(engineSchematic[x][y])) return false;
        return engineSchematic[x][y] != '.';
    }

    private String readNumber(int i, int j) {
        StringBuilder sb = new StringBuilder();
        int k = j;
        while (Character.isDigit(engineSchematic[i][k])) {
            sb.append(engineSchematic[i][k]);
            k++;
            if (k >= engineSchematic[i].length) break;
        }
        return sb.toString();
    }

    @Override
    public int calculateTask() {
        return this.scanForPartNumbers();
    }
}
