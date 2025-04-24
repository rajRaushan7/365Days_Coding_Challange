package Java.Day114;

public class palendromCheck {
    public boolean isPalindrome(String s) {
        int i = 0;
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = cleaned.length() - 1;
        while (i < j) {
            if(cleaned.isEmpty()){
                return true;
            } else if(cleaned.charAt(i) != cleaned.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}


