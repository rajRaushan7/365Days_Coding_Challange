package Java.Day098;

import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String s1 = "care";
        String s2 = "race";
        anagram a = new anagram();
        System.out.println(a.anagramCheck(s1, s2));
    }


    public boolean anagramCheck(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        // Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}