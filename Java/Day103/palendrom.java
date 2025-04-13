class palendrom {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                newStr.append(Character.toLowerCase(ch));
            }
        }
        int left = 0;
        int right = newStr.length() - 1;

        while (left < right) {
            if (newStr.charAt(left) != newStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}