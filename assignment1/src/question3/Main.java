package question3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean containsDuplicate(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                return true;
            }
            set.add(c);
        }
        return false;
    }

    public static void main(String[] args) {
        String example = "aba";
        boolean ans = containsDuplicate(example);
        System.out.println(ans);
    }
}
// time complexity O(n)
// space complexity O(n)