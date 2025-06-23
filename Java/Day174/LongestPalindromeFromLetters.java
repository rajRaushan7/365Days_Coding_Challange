package Java.Day174;

import java.util.*;

public class LongestPalindromeFromLetters {

    public static void main(String[] args) {
        String s1 = "abccccdd";
        String s2 = "Aa";

        System.out.println("The length of the longest palindrome is: " + longestPalindrome(s1));
        System.out.println("The length of the longest palindrome is: " + longestPalindrome(s2));
    }

    public static int longestPalindrome(String s) {
        Set<Character> unpaired = new HashSet<>();
        int length = 0;

        for (char c : s.toCharArray()) {
            if (unpaired.contains(c)) {
                length += 2;
                unpaired.remove(c);
            } else {
                unpaired.add(c);
            }
        }

        // If any unpaired character is left, it can be placed in the center
        if (!unpaired.isEmpty()) {
            length += 1;
        }

        return length;
    }
}