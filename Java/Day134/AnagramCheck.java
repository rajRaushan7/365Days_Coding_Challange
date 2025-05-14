import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        s1 = s1.replaceAll(" ", "").toLowerCase();
        s2 = s2.replaceAll(" ", "").toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}