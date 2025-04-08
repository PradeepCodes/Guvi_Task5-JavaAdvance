package GuviTask;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStrings {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        List<String> nonEmptyStrings = stringList.stream().filter( s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("Non Empty Strings: "+nonEmptyStrings);
    }
}
