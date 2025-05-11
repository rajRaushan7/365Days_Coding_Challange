// Write a Java program to find the second most frequent character in a given string. Ignore case sensitivity and       exclude any non-alphabetic characters.
package Day131;
import java.util.*;

public class SecondMostFrequentChar {
    public static void main(String[] args) {
        String input = "Success is sweet";
        input = input.toLowerCase().replaceAll("[^a-z]", "");
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        if (list.size() < 2) {
            System.out.println("No second most frequent character.");
        } else {
            System.out.println(list.get(1).getKey());
        }
    }
}