package Java.Day190;

import java.util.*;

public class SmallestWindowFinder {

    public static void main(String[] args) {
        String text = "this is a test string";
        String pattern = "tist";
        String result = findSmallestWindow(text, pattern);
        System.out.println("Smallest window: " + result);
    }

    public static String findSmallestWindow(String text, String pattern) {
        if (text.length() < pattern.length()) return "No window found";

        int[] patFreq = new int[256];
        int[] windowFreq = new int[256];

        for (char ch : pattern.toCharArray()) {
            patFreq[ch]++;
        }

        int start = 0, startIndex = -1, minLen = Integer.MAX_VALUE;
        int count = 0;

        for (int end = 0; end < text.length(); end++) {
            char endChar = text.charAt(end);
            windowFreq[endChar]++;

            // If current char matches pattern char
            if (patFreq[endChar] != 0 && windowFreq[endChar] <= patFreq[endChar]) {
                count++;
            }

            // When all characters matched
            if (count == pattern.length()) {
                // Minimize the window
                while (patFreq[text.charAt(start)] == 0 || windowFreq[text.charAt(start)] > patFreq[text.charAt(start)]) {
                    if (windowFreq[text.charAt(start)] > patFreq[text.charAt(start)])
                        windowFreq[text.charAt(start)]--;
                    start++;
                }

                int windowLen = end - start + 1;
                if (windowLen < minLen) {
                    minLen = windowLen;
                    startIndex = start;
                }
            }
        }

        return (startIndex == -1) ? "No window found" : text.substring(startIndex, startIndex + minLen);
    }
}
