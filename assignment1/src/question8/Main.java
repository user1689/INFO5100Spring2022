package question8;

import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static final Map<String, String> map = Map.of(
            "A", "Excellent",
            "B", "Good",
            "C", "Average",
            "D", "Deficient",
            "F",  "Failing"
    );

    public static String GradeAndMeaning(String s) {
        s = s.toUpperCase();
        return map.get(s);
    }

    public static void main(String[] args) {
        System.out.print("Please enter the grade you got(A/B/C/D/F): ");
        Scanner scanner = new Scanner(System.in);
        String tmp = "";
        if (scanner.hasNext()){
            tmp = scanner.next();
        }
        String ans = GradeAndMeaning(tmp);
        System.out.println("your grade meaning is: " + ans);
    }
}
