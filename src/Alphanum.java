import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Alphanum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Only create once

        while (true) {
            System.out.println("Enter the alphanumeric regex pattern: ");
            String expression = sc.nextLine(); // Take full pattern input

            System.out.println("Enter the string to test: ");
            String input = sc.nextLine(); // Take full string input

            Pattern pattern = Pattern.compile(expression);
            Matcher matcher = pattern.matcher(input);

            boolean isMatch = matcher.matches();
            System.out.println("The result is: " + isMatch);

            System.out.println("Want to exit? [Y/N]");
            String choice = sc.nextLine().trim(); // Remove leading/trailing spaces

            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("You ended it.");
                break;
            }
        }

        sc.close(); // Good practice
    }
}
