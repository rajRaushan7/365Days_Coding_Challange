import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int n = s.length();
        int left = 0, right = 0, maxLen = 0, start = 0;

        Set<Character> set = new HashSet<>();

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                if (right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    start = left;
                }
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        System.out.println("Length: " + maxLen + ", Substring: \"" + s.substring(start, start + maxLen) + "\"");
    }
}