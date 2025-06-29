package Java.Day180;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] words = {
            "bat", "tab", "tap", "pat", "listen", "silent", "enlist", "rat", "tar", "art"
        };

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(word);
        }

        List<List<String>> groups = new ArrayList<>(map.values());

        // Sort words within each group
        for (List<String> group : groups) {
            Collections.sort(group);
        }

        // Sort groups by first word in each group
        groups.sort(Comparator.comparing(group -> group.get(0)));

        for (List<String> group : groups) {
            System.out.println(group);
        }
    }
}
