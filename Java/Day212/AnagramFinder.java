import java.util.*;

public class AnagramFinder {

    public static void main(String[] args) {
        String text = "cbaebabacd";
        String pattern = "abc";

        List<Integer> result = findAnagrams(text, pattern);
        for (int index : result) {
            System.out.println("Anagram found at index: " + index);
        }
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;

            // Keep window size equal to pattern length
            if (i >= p.length()) {
                window[s.charAt(i - p.length()) - 'a']--;
            }

            // Compare frequency arrays
            if (Arrays.equals(window, pCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}


