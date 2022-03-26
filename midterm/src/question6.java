import java.util.HashSet;
import java.util.Set;

public class question6 {
    public static int longestSubString(String s) {
        int left = 0;
        int right = 0;
        Set<Character> ss = new HashSet<>();
        int n = s.length();
        int maxLength = 0;
        while (right < n) {
            while(right < n && ss.contains(s.charAt(right))) {
                ss.remove(s.charAt(left));
                left += 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            ss.add(s.charAt(right));
            right += 1;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int ans = longestSubString(s);
        System.out.println(ans);
    }
}
