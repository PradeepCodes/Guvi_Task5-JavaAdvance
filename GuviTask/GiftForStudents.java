package GuviTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class GiftForStudents {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Ankit", "Rahul", "Aman", "Neha", "Akash", "Priya", "Arjun", "Sneha", "Aarti", "Kunal");

        List<String> aStudents = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Students receiving gifts (names starting with 'A'):");
        aStudents.forEach(System.out::println);
    }
}
