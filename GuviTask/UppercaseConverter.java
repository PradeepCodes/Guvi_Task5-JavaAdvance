package GuviTask;

import java.util.stream.Stream;

public class UppercaseConverter {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        Stream<String> upperNames = names.map(String::toUpperCase);
        upperNames.forEach(System.out::println);
    }
}
