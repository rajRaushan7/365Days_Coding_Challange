package Java.Day204;
public class RecursivePalindrome {

    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";

        System.out.println(checkPalindrome(input1) ? "It's a palindrome!" : "Not a palindrome.");
        System.out.println(checkPalindrome(input2) ? "It's a palindrome!" : "Not a palindrome.");
    }

    public static boolean checkPalindrome(String s) {
        return isPalindrome(clean(s), 0, clean(s).length() - 1);
    }

    public static String clean(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }
}