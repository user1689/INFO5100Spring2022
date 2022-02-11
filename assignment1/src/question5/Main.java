package question5;

public class Main {
    public static boolean checkLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year = 2013;
        boolean ans = checkLeapYear(year);
        System.out.println(ans);
    }
}
