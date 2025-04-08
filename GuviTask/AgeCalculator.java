package GuviTask;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter your birthdate (yyyy-mm-dd): ");
            String input = scanner.nextLine();


            LocalDate birthDate = LocalDate.parse(input);
            LocalDate currentDate = LocalDate.now();

            if (birthDate.isAfter(currentDate)) {
                System.out.println("Birthdate cannot be in the future!");
                return;
            }


            Period age = Period.between(birthDate, currentDate);


            System.out.println("Your age is: " + age.getYears() + " years, " +
                    age.getMonths() + " months, and " +
                    age.getDays() + " days.");
        } catch (Exception e) {
            System.out.println("Invalid input format. Please enter date in yyyy-mm-dd format.");
        } finally {
            scanner.close();
        }
    }
}
