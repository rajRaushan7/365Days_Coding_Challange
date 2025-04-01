/*
Count how many times lowercase vowels occured in a string entered by the user.
*/

package Java.Day091;
import java.util.*;

public class vowelInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int vowel = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowel = vowel + 1;
            }
        }
        System.out.println(vowel);
    }
}
