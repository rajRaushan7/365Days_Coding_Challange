import java.util.*;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String input = "Swiss";
        input = input.toLowerCase().replaceAll(" ", "");

        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }

        System.out.println("No unique character");
    }
}