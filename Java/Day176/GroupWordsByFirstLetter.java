package Java.Day176;

import java.util.*;

public class GroupWordsByFirstLetter {

    public static void main(String[] args) {
        String[] words = {
            "apple", "Banana", "apricot", "blueberry", "Avocado", "cherry", "cranberry", "banana", null, ""
        };

        Map<Character, List<String>> groups = new TreeMap<>();

        for (String word : words) {
            if (word == null || word.isEmpty()) continue;

            char firstChar = Character.toUpperCase(word.charAt(0));
            groups.putIfAbsent(firstChar, new ArrayList<>());
            groups.get(firstChar).add(word);
        }

        for (Map.Entry<Character, List<String>> entry : groups.entrySet()) {
            List<String> wordList = entry.getValue();
            Collections.sort(wordList);
            System.out.println(entry.getKey() + ": " + wordList);
        }
    }
}