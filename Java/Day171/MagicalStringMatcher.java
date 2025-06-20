package Java.Day171;

import java.util.*;

public class MagicalStringMatcher {

    public static void main(String[] args) {
        String[] words = {
            "Code123",
            "Magic!",
            "HelloWorld",
            "AAaa",
            "Wow!"
        };

        List<String> magicalStrings = new ArrayList<>();

        for (String word : words) {
            int asciiSum = 0;
            Set<Character> uniqueChars = new HashSet<>();

            for (char ch : word.toCharArray()) {
                asciiSum += (int) ch;
                uniqueChars.add(ch);
            }

            int uniqueCount = uniqueChars.size();

            if (uniqueCount > 0 && asciiSum % uniqueCount == 0) {
                magicalStrings.add(word);
            }
        }

        if (magicalStrings.isEmpty()) {
            System.out.println("No magical strings found.");
        } else {
            Collections.sort(magicalStrings);
            System.out.println("Magical Strings:");
            for (String s : magicalStrings) {
                System.out.println(s);
            }
        }
    }
}