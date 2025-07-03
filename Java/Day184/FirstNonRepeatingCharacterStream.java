import java.util.*;

public class FirstNonRepeatingCharacterStream {

    public static void main(String[] args) {
        String stream = "aabc";
        printFirstNonRepeating(stream);
    }

    public static void printFirstNonRepeating(String stream) {
        int[] freq = new int[26];
        Queue<Character> queue = new LinkedList<>();

        StringBuilder result = new StringBuilder();

        for (char ch : stream.toCharArray()) {
            freq[ch - 'a']++;
            queue.offer(ch);

            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.poll();
            }

            if (queue.isEmpty()) {
                result.append("-1 ");
            } else {
                result.append(queue.peek()).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}