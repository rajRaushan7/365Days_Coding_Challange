package Day133;
import java.util.*;

public class SecondMostFrequentChar {
    public static void main(String[] args) {
        String input = "programming is fun";
        input = input.replaceAll(" ", "").toLowerCase();

        int[] freq = new int[26];
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                freq[c - 'a']++;
            }
        }

        int first = 0, second = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > freq[first]) {
                second = first;
                first = i;
            } else if (freq[i] > freq[second] && i != first) {
                second = i;
            }
        }

        char result = (char) (second + 'a');
        System.out.println(result);
    }
}