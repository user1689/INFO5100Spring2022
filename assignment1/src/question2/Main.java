package question2;

public class Main {
    public static boolean uniqueCharacters(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String example = "sdfldij1";
        boolean ans = uniqueCharacters(example);
        System.out.println(ans);
    }
}
// time complexity O(n^2)
// space complexity O(1)
