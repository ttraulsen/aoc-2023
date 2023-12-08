package ttraulsen.aoc2023;

import java.util.List;

public class Task {
    protected List<String> input;

    public Task(List<String> i) {
        this.setInput(i);
    }

    public void setInput(List<String> i) {
        this.input = i;
    }

    public int calculateTask() {
        return -1;
    }
}
