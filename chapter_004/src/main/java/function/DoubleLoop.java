package function;

import java.util.stream.Stream;

public class DoubleLoop {
    public static void main(String[] args) {
        String[] levels = {"level 1", "level 2", "level 3"};
        String[] task = {"task 1", "task 2", "task 3", "task 4"};

        Stream.of(levels)
                .flatMap(level -> Stream.of(task))
                .map(tasks -> levels + " " + tasks)
                .forEach(System.out::println);
    }
}
