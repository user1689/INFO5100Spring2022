package question1;

public class Main {

    public static boolean checkPalindrome(String s) {
        int i = 0;
        int j = 0;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i += 1;
            j -= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String example = "aabaa";
        boolean ans = checkPalindrome(example);
        System.out.println(ans);
    }
}
// time complexity O(n)
// space complexity O(1)
