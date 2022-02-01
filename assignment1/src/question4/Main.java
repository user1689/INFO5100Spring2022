package question4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static boolean checkAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> table = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) - 1);
            if (table.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aabcdka";
        String s2 = "bdcaakA";
        boolean ans = checkAnagrams(s1, s2);
        System.out.println(ans);
    }
}
// time complexity O(n)
// space complexity O(26)
