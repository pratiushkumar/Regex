import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Numbers {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the regex statement: ");
            String regex = scin.nextLine();

            System.out.println("Enter the input to match: ");
            String input = scin.nextLine(); // Use nextLine instead of next()

            Pattern insta = Pattern.compile(regex);
            Matcher match = insta.matcher(input);
            boolean store = match.matches();

            System.out.println("The result is going to be: " + store);

            System.out.println("Do you want to exit? [YES/NO]");
            String choice = scin.nextLine().trim();

            if (choice.equalsIgnoreCase("YES")) {
                System.out.println("That is the exit.");
                break;
            }
        }

        scin.close();
    }
}
