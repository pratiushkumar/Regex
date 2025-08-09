import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //String regex = "a";;
        Pattern kainstance  = Pattern.compile("ab*c");
        Matcher match = kainstance.matcher("aaabbbc");

        String matches = String.valueOf(match.matches());
        System.out.println("result is "+matches);

    }
}