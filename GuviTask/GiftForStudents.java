package GuviTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class GiftForStudents {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Athulya", "Pradeep", "Saranya", "Amsaveni", "Anushka", "Priya", "Santhosh", "Sneha", "Aarti", "Kunal");

        List<String> specialGiftStudents  = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Students receiving gifts (names starting with 'A'):");
        specialGiftStudents.forEach(System.out::println);
    }
}
