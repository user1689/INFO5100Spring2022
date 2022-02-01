package question7;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static boolean ransomNote(String note, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < note.length(); i ++) {
            char c = note.charAt(i);
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (int cnt : map.values()) {
            if (cnt < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String note = "zbczbcKii";
        String magazine = "zzzzccccbbbbKK";
        boolean ans = ransomNote(note, magazine);
        System.out.println(ans);
    }


}
